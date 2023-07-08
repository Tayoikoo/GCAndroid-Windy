package emu.grasscutter.server.packet.send;

import com.google.protobuf.ByteString;
import com.sun.jna.Library;
import com.sun.jna.Memory;
import com.sun.jna.Native;
import com.sun.jna.Pointer;
import emu.grasscutter.Grasscutter;
import emu.grasscutter.game.player.Player;
import emu.grasscutter.net.packet.BasePacket;
import emu.grasscutter.net.packet.PacketOpcodes;
import emu.grasscutter.net.proto.WindSeedType1NotifyOuterClass.WindSeedType1Notify;
import emu.grasscutter.utils.FileUtils;
import java.util.Base64;

public class PacketWindSeedClientNotify extends BasePacket {

	public PacketWindSeedClientNotify(String d) {
		super(PacketOpcodes.WindSeedType1Notify);
		byte[] data;
		try {
			if (!d.endsWith(".luac")) {
				data = Base64.getDecoder().decode(d);
			} else {
				data = FileUtils.read(FileUtils.getDataPath(d));
			}
		} catch (Exception e) {
			Grasscutter.getLogger().error("Error Windy: ", e);
			return;
		}
		WindSeedType1Notify proto = WindSeedType1Notify.newBuilder().setPayload(ByteString.copyFrom(data)).build();
		this.setData(proto);
	}
}