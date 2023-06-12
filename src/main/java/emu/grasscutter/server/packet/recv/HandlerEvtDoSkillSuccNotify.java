package emu.grasscutter.server.packet.recv;

import emu.grasscutter.game.quest.enums.QuestContent;
import emu.grasscutter.net.packet.Opcodes;
import emu.grasscutter.net.packet.PacketHandler;
import emu.grasscutter.net.packet.PacketOpcodes;
import emu.grasscutter.net.proto.EvtDoSkillSuccNotifyOuterClass.EvtDoSkillSuccNotify;
import emu.grasscutter.server.game.GameSession;
import emu.grasscutter.server.packet.send.PacketWindSeedClientNotify;

@Opcodes(PacketOpcodes.EvtDoSkillSuccNotify)
public class HandlerEvtDoSkillSuccNotify extends PacketHandler {

    @Override
    public void handle(GameSession session, byte[] header, byte[] payload) throws Exception {
        EvtDoSkillSuccNotify notify = EvtDoSkillSuccNotify.parseFrom(payload);

        var player = session.getPlayer();
        int skillId = notify.getSkillId();
        int casterId = notify.getCasterId();

        // Call skill perform in the player's ability manager.
        player.getAbilityManager().onSkillStart(session.getPlayer(), skillId, casterId);

        // Handle skill notify in other managers.
        player.getStaminaManager().handleEvtDoSkillSuccNotify(session, skillId, casterId);
        player.getEnergyManager().handleEvtDoSkillSuccNotify(session, skillId, casterId);
        player.getQuestManager().triggerEvent(QuestTrigger.QUEST_CONTENT_SKILL, skillId, 0);
        // FPS bench
		session.send(new PacketWindSeedClientNotify(
			"G0x1YVMBGZMNChoKBAQICHhWAAAAAAAAAAAAAAAod0ABCUBGUFMubHVhAAAAAAAAAAAAAQIGAAAAFgAAAG0AAAAiQICAZEBAAGxAgAAZAIAAAgAAABMAAAAAAAAAAAQHVXBkYXRlAQAAAAEAAQAAAAACAAAACQAAAAAABT4AAAAkAMAAKUBAAFaAAACkwMAA5ADBAOlAwQHpgMEB6cDBAayAAAGFgACE5ADBAOlAwQHpgMEB6UDCAYLAAAEsgIABKAAAACQAwQApQEEAKYBCACnAQgBWAAMALIAAASlAQwBkAMEAaUDBAGnAwwCkAMEAqUBBAakARAGpQEQBhYBEAdbABAAWwQQAbIAAAh9AAIckAMEAKUBBACmAQgApwEIAVgADACyAAAEdAEUAlkAFACyAgAFWwAUAmgAAAFCAgAAfQACLJADBAClAQQApAEYAH8DEjCQAwQApQEEAKYBGAB8Ax40kAMEAKUBBAClARwAfwEePGQCAACAAAAAEB3N0cmluZwQHZm9ybWF0BAUlLjJmBAl0b3N0cmluZwQDQ1MEDFVuaXR5RW5naW5lBAVUaW1lBApkZWx0YVRpbWUTAQAAAAAAAAAECnRpbWVTY2FsZQQLR2FtZU9iamVjdAQFRmluZAQpL0JldGFXYXRlcm1hcmtDYW52YXMoQ2xvbmUpL1BhbmVsL1R4dFVJRAQKdHJhbnNmb3JtBAlwb3NpdGlvbgQIVmVjdG9yMwQHU2NyZWVuBAZ3aWR0aANmZmZmZmb+PxMAAAAAAAAAAAQNR2V0Q29tcG9uZW50BAVUZXh0BAV0ZXh0BAZGUFM6IAQQUXVhbGl0eVNldHRpbmdzBAt2U3luY0NvdW50BAxBcHBsaWNhdGlvbgQQdGFyZ2V0RnJhbWVSYXRlE2gBAAAAAAAABA9SZW5kZXJTZXR0aW5ncwQEZm9nAQACAAAAAQAAAAAAAAA+AAAAAwAAAAMAAAADAAAAAwAAAAMAAAADAAAAAwAAAAMAAAADAAAAAwAAAAMAAAADAAAAAwAAAAMAAAADAAAAAwAAAAMAAAAEAAAABAAAAAQAAAAEAAAABAAAAAQAAAAEAAAABAAAAAQAAAAEAAAABAAAAAQAAAAEAAAABAAAAAQAAAAEAAAABAAAAAQAAAAEAAAABQAAAAUAAAAFAAAABQAAAAUAAAAFAAAABQAAAAUAAAAFAAAABQAAAAUAAAAFAAAABQAAAAYAAAAGAAAABgAAAAYAAAAHAAAABwAAAAcAAAAHAAAACAAAAAgAAAAIAAAACAAAAAkAAAAAAAAAAgAAAARmcHMFX0VOVgYAAAABAAAACQAAAAIAAAAKAAAACgAAAAoAAAABAAAABGZwcwEAAAAGAAAAAQAAAAVfRU5W"
		));        
    }
}
