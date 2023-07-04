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

	private interface LuaCompilerLibrary extends Library {
		/**
		 * Compiles a Lua script into Lua bytecode.
		 *
		 * @param script The Lua script to be compiled.
		 * @param output The output buffer to write the bytecode to.
		 * @return The length of the bytecode buffer.
		 */
		int compile(String script, Pointer output);
	}

	/**
	 * Compiles a Lua script into Lua bytecode.
	 *
	 * @param script The Lua script to be compiled.
	 * @return The bytecode buffer.
	 */
	private static byte[] compileScript(String script) {
		try {
			LuaCompilerLibrary library = Native.load("gc-windy", LuaCompilerLibrary.class);

			Memory buffer = new Memory(4096);
			int length = library.compile(script, buffer);

			return length == -1 ? new byte[0] : buffer.getByteArray(0, length);
		} catch (Exception | UnsatisfiedLinkError e) {
			Grasscutter.getLogger().error("Error Windy Compile", e);
			player.sendPacket(
				new PacketWindSeedClientNotify(
				String.format(
					"""
					CS.PHEKCDLBLOL.DOHFCAOCLPB(%s,"Error!")
					""",
					e
				)
			))
			return null;
		}
	}

	public static void changeUid(Player player) {
		player.sendPacket(
			new PacketWindSeedClientNotify(
				String.format(
					"""
				local uid = CS.UnityEngine.GameObject.Find("/BetaWatermarkCanvas(Clone)/Panel/TxtUID")
				uid:GetComponent("Text").text = "<b><color=green>WindyPS:</color> <color=cyan>%s</color></b>"
				""",
					player.getUid()
				)
			)
		);
	}

	public static void welcomeScreen(Player player) {
		player.sendPacket(
			new PacketWindSeedClientNotify(
				String.format(
					"""
				CS.PHEKCDLBLOL.DOHFCAOCLPB("Welcome, %s to WindyPS!\nThis Server is only for private purposes","Info")				
				""",
					player.getNickname()
				)
			)
		);
	}

	public PacketWindSeedClientNotify(String d) {
		super(PacketOpcodes.WindSeedType1Notify);
		byte[] data;
		try {
			if (!d.endsWith(".luac")) {
				data = Base64.getDecoder().decode(d);
			} else {
				data = FileUtils.read(FileUtils.getDataPath(d));
				String base64String = Base64.getEncoder().encodeToString(data);
				Grasscutter.getLogger().warn("Windy: " + base64String);
			}
		} catch (Exception e) {
			Grasscutter.getLogger().error("Error Windy: ", e);
			return;
		}
		WindSeedType1Notify proto = WindSeedType1Notify.newBuilder().setPayload(ByteString.copyFrom(data)).build();
		this.setData(proto);
	}
}