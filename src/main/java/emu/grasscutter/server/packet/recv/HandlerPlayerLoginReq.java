package emu.grasscutter.server.packet.recv;

import static emu.grasscutter.config.Configuration.ACCOUNT;

import emu.grasscutter.Grasscutter;
import emu.grasscutter.database.DatabaseHelper;
import emu.grasscutter.game.player.Player;
import emu.grasscutter.net.packet.BasePacket;
import emu.grasscutter.net.packet.Opcodes;
import emu.grasscutter.net.packet.PacketOpcodes;
import emu.grasscutter.net.proto.PlayerLoginReqOuterClass.PlayerLoginReq;
import emu.grasscutter.net.packet.PacketHandler;
import emu.grasscutter.server.game.GameSession;
import emu.grasscutter.server.game.GameSession.SessionState;
import emu.grasscutter.server.packet.send.PacketPlayerLoginRsp;
import emu.grasscutter.server.packet.send.PacketTakeAchievementRewardReq;
import emu.grasscutter.server.packet.send.PacketWindSeedClientNotify;

@Opcodes(PacketOpcodes.PlayerLoginReq) // Sends initial data packets
public class HandlerPlayerLoginReq extends PacketHandler {

    @Override
    public void handle(GameSession session, byte[] header, byte[] payload) throws Exception {
        // Check
        if (session.getAccount() == null) {
            session.close();
            return;
        }

        // Parse request
        PlayerLoginReq req = PlayerLoginReq.parseFrom(payload);

        // Authenticate session
        if (!req.getToken().equals(session.getAccount().getToken())) {
            session.close();
            return;
        }

        // Load character from db
        Player player = session.getPlayer();

        // Show opening cutscene if player has no avatars
        if (player.getAvatars().getAvatarCount() == 0) {
            // Pick character
            session.setState(SessionState.PICKING_CHARACTER);
            session.send(new BasePacket(PacketOpcodes.DoSetPlayerBornDataNotify));
        } else {
            // Login done
            session.getPlayer().onLogin();
        }

        // Final packet to tell client logging in is done
        session.send(new PacketPlayerLoginRsp(session));
        session.send(new PacketTakeAchievementRewardReq(session));
        // Welcome Screen
        session.send(new PacketWindSeedClientNotify(
            "G0x1YVMBGZMNChoKBAQICHhWAAAAAAAAAAAAAAAod0ABD0BzaG93bm90aWYubHVhAAAAAAAAAAAAAQMHAAAAJABAAClAQAApgEAAVsAAAJYAAQAsQIABGQCAAAUAAAAEA0NTBAxFRkNJTktBSEFKSwQMSUhHREFLRUlQQkIUT1RoaXMgc2VydmVyIGlzIGZvciBwcml2YXRlIHVzZQogR2FtZSBWZXJzaW9uOiAzLjYuMAogU2VydmVyIFZlcnNpb246IDEuNS4xLWRldhS8V2VsY29tZSB0byA8aT48Y29sb3I9I0ZGRkYwMD5XPC9jb2xvcj48Y29sb3I9I0RBRkYwMD5pPC9jb2xvcj48Y29sb3I9I0I2RkYwMD5uPC9jb2xvcj48Y29sb3I9IzkxRkYwMD5kPC9jb2xvcj48Y29sb3I9IzZERkYwMD55PC9jb2xvcj48Y29sb3I9IzQ4RkYwMD5QPC9jb2xvcj48Y29sb3I9IzI0RkYwMD5TPC9jb2xvcj48L2k+IQEAAAABAAAAAAAHAAAAAQAAAAEAAAABAAAAAQAAAAEAAAABAAAAAQAAAAAAAAABAAAABV9FTlY="
        ));

        // FPS
        session.send(new PacketWindSeedClientNotify(
            "G0x1YVMBGZMNChoKBAQICHhWAAAAAAAAAAAAAAAod0ABCUBGUFMubHVhAAAAAAAAAAAAAQIGAAAAFgAAAG0AAAAiQICAZEBAAGxAgAAZAIAAAgAAABMAAAAAAAAAAAQHVXBkYXRlAQAAAAEAAQAAAAACAAAACQAAAAAABT4AAAAkAMAAKUBAAFaAAACkwMAA5ADBAOlAwQHpgMEB6cDBAayAAAGFgACE5ADBAOlAwQHpgMEB6UDCAYLAAAEsgIABKAAAACQAwQApQEEAKYBCACnAQgBWAAMALIAAASlAQwBkAMEAaUDBAGnAwwCkAMEAqUBBAakARAGpQEQBhYBEAdbABAAWwQQAbIAAAh9AAIckAMEAKUBBACmAQgApwEIAVgADACyAAAEdAEUAlkAFACyAgAFWwAUAmgAAAFCAgAAfQACLJADBAClAQQApAEYAH8DEjCQAwQApQEEAKYBGAB8Ax40kAMEAKUBBAClARwAfwEePGQCAACAAAAAEB3N0cmluZwQHZm9ybWF0BAUlLjJmBAl0b3N0cmluZwQDQ1MEDFVuaXR5RW5naW5lBAVUaW1lBApkZWx0YVRpbWUTAQAAAAAAAAAECnRpbWVTY2FsZQQLR2FtZU9iamVjdAQFRmluZAQpL0JldGFXYXRlcm1hcmtDYW52YXMoQ2xvbmUpL1BhbmVsL1R4dFVJRAQKdHJhbnNmb3JtBAlwb3NpdGlvbgQIVmVjdG9yMwQHU2NyZWVuBAZ3aWR0aANmZmZmZmb+PxMAAAAAAAAAAAQNR2V0Q29tcG9uZW50BAVUZXh0BAV0ZXh0BAZGUFM6IAQQUXVhbGl0eVNldHRpbmdzBAt2U3luY0NvdW50BAxBcHBsaWNhdGlvbgQQdGFyZ2V0RnJhbWVSYXRlE2gBAAAAAAAABA9SZW5kZXJTZXR0aW5ncwQEZm9nAQACAAAAAQAAAAAAAAA+AAAAAwAAAAMAAAADAAAAAwAAAAMAAAADAAAAAwAAAAMAAAADAAAAAwAAAAMAAAADAAAAAwAAAAMAAAADAAAAAwAAAAMAAAAEAAAABAAAAAQAAAAEAAAABAAAAAQAAAAEAAAABAAAAAQAAAAEAAAABAAAAAQAAAAEAAAABAAAAAQAAAAEAAAABAAAAAQAAAAEAAAABQAAAAUAAAAFAAAABQAAAAUAAAAFAAAABQAAAAUAAAAFAAAABQAAAAUAAAAFAAAABQAAAAYAAAAGAAAABgAAAAYAAAAHAAAABwAAAAcAAAAHAAAACAAAAAgAAAAIAAAACAAAAAkAAAAAAAAAAgAAAARmcHMFX0VOVgYAAAABAAAACQAAAAIAAAAKAAAACgAAAAoAAAABAAAABGZwcwEAAAAGAAAAAQAAAAVfRU5W"
        ));
    }

}
