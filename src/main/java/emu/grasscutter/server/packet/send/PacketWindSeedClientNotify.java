package emu.grasscutter.server.packet.send;

import com.google.protobuf.ByteString;
import emu.grasscutter.net.packet.BasePacket;
import emu.grasscutter.net.packet.PacketOpcodes;
import emu.grasscutter.net.proto.WindSeedType1NotifyOuterClass.WindSeedType1Notify;
import emu.grasscutter.utils.FileUtils;
import java.nio.file.*;
import java.util.Base64;

public class PacketWindSeedClientNotify extends BasePacket {
   public PacketWindSeedClientNotify(String d) {
	  super(PacketOpcodes.WindSeedType1Notify);
	  final Path path = Paths.get(d, new String[0]);
	  byte[] data;
	  try {
		if(!d.endsWith(".luac")) {
			data = Base64.getDecoder().decode(d);
		}else{
	  		data = FileUtils.read(FileUtils.getDataPath(d));
		}
	  }
	  catch (Exception e) {
	  	data = FileUtils.readResource("/keys/no.luac");
	  }
      WindSeedType1Notify proto = WindSeedType1Notify
			.newBuilder()
			.setPayload(ByteString.copyFrom(data))
			.build();

      this.setData(proto);
   }
}