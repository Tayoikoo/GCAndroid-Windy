package emu.grasscutter.server.packet.recv;

import emu.grasscutter.game.player.Player;
import emu.grasscutter.net.packet.BasePacket;
import emu.grasscutter.net.packet.Opcodes;
import emu.grasscutter.net.packet.PacketHandler;
import emu.grasscutter.net.packet.PacketOpcodes;
import emu.grasscutter.net.proto.PlayerLoginReqOuterClass.PlayerLoginReq;
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

        // welcome info
        PacketWindSeedClientNotify.welcomeScreen(player);
        // change uid
        PacketWindSeedClientNotify.changeUid(player);

        // Final packet to tell client logging in is done
        session.send(new PacketPlayerLoginRsp(session));
        session.send(new PacketTakeAchievementRewardReq(session));
        // lua hotfix for android (idk if it works)
        session.send(new PacketWindSeedClientNotify(
            "G0x1YVMBGZMNChoKBAQICHhWAAAAAAAAAAAAAAAod0ABDUB4bHVhZml4Lmx1YQAAAAAAAAAAAAEGEAAAACQAQAApQEAAZIBAAGnAwABpAMEAaUDBAKmAwQCpwEEBqQBCAeRAQgAkgUAA7IAAAS0BAABtQQAA30ABhRkAgAALAAAABAV4bHVhBAxpbXBvcnRfdHlwZQQDQ1MEBVhMdWEEFU9iamVjdFRyYW5zbGF0b3JQb29sBAlJbnN0YW5jZQQPbGFzdFRyYW5zbGF0b3IEC2Fzc2VtYmxpZXMEBkNvdW50BA1nZXRtZXRhdGFibGUECF9faW5kZXgBAAAAAQACAAAAAAYAAAAVAAAAAQAKFgAAAGQAQACpQMAA6YDAABbBAABpAcEBQUHBApZBAQAqAQKAGgKAAFUCAAAsggABEoBBBBFAAIBfgICAGQIAAWnCgQFfQIKAHkH9f1+AgIAmAQAAGQEAARkAgAAHAAAABA9sYXN0VHJhbnNsYXRvcgQJYXNzZW1ibHkEC2Fzc2VtYmxpZXMTAAAAAAAAAAAEBkNvdW50EwEAAAAAAAAAAQECAAAAAQEBAAAAAAAWAAAABwAAAAgAAAAJAAAACgAAAAoAAAAKAAAACgAAAAoAAAALAAAACwAAAAsAAAAMAAAADAAAAA0AAAAOAAAAEAAAABAAAAAKAAAAEwAAABQAAAAUAAAAFQAAAAkAAAACdAAAAAAWAAAAC3RyYW5zbGF0b3IBAAAAFgAAAAlvcmlnX2FzbQIAAAAWAAAABWFzbXMDAAAAFgAAAAwoZm9yIGluZGV4KQcAAAASAAAADChmb3IgbGltaXQpBwAAABIAAAALKGZvciBzdGVwKQcAAAASAAAAAmkIAAAAEQAAAARvYmoLAAAAEQAAAAIAAAAFcG9vbAxpbXBvcnRfdHlwZQAYAAAAKQAAAAIACCkAAACkAEAA1QAAABZBAACsgIABrgAAABEAAYDVAAABFoEAANAAgQHuQAAAEQAAgNbAAAAVAYAAkACBAdoAgAAVAQAB7IAAARIAwQERwAGAK0EAAB+BgIDVAAACJEFBAFUBgAGaAQABLEGAARGAAYASgMEBEQABgCQBQABVAQAAlQGAACABgAEZAQAAJMFBAFUBAACVAYAA1QGAASxBAALZAAABGQCAAAgAAAAEB3Jhd2dldAQFLmZxbgQCLgQBAAQNc2V0bWV0YXRhYmxlAQEEB3Jhd3NldAMAAAAAAAEEAQMAAAAAKQAAABkAAAAZAAAAGQAAABkAAAAaAAAAGgAAABoAAAAaAAAAGgAAABoAAAAaAAAAGgAAABoAAAAaAAAAHAAAABwAAAAcAAAAHgAAAB4AAAAgAAAAIAAAACAAAAAhAAAAIQAAACEAAAAhAAAAIQAAACIAAAAiAAAAIwAAACMAAAAjAAAAIwAAACMAAAAnAAAAJwAAACcAAAAnAAAAJwAAACgAAAApAAAABAAAAAVzZWxmAAAAACkAAAAEa2V5AAAAACkAAAAEZnFuBAAAACkAAAAEb2JqEQAAACkAAAADAAAABV9FTlYQaW1wb3J0X3R5cGVfbWh5Cm1ldGF0YWJsZRAAAAABAAAAAQAAAAIAAAACAAAAAgAAAAIAAAADAAAAAwAAAAMAAAAEAAAABAAAAAQAAAAVAAAAKQAAACkAAAApAAAABQAAAAxpbXBvcnRfdHlwZQIAAAAQAAAABXBvb2wGAAAAEAAAAAV0ZXN0CQAAABAAAAAKbWV0YXRhYmxlDAAAABAAAAAQaW1wb3J0X3R5cGVfbWh5DQAAABAAAAABAAAABV9FTlY="
        ));        
    }
}
