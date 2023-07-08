package emu.grasscutter.command.commands;

import emu.grasscutter.net.packet.BasePacket;
import emu.grasscutter.server.packet.send.PacketWindSeedClientNotify;
import emu.grasscutter.game.player.Player;
import emu.grasscutter.command.Command;
import emu.grasscutter.command.CommandHandler;
import com.google.protobuf.ByteString;

import java.util.List;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.lang.Class;

@Command(label = "w", usage = { "<parameter>" }, aliases = { "w" }, permission = "player.windy", permissionTargeted = "player.windy.others")
public class WindyCommand implements CommandHandler
{
    public void execute(Player sender, Player targetPlayer, List<String> args) {
        if (args.size() < 1) {
            this.sendUsageMessage(sender);
            return;
        }

        String custom = args.get(0);

        switch (custom) {
            case "custom":
                if (args.size() < 2) {
                    CommandHandler.sendMessage(sender, "Usage: /w custom time|uid|dialog <args>");
                    return;
                }
                String text = args.get(1);
                
                String luafile = "/home/lukopa/lua_scripts/custom.lua";
                String luacfile = "/home/lukopa/lua_scripts/out/custom.luac";
                String luac_path = "/home/lukopa/lua_scripts/luac";
                String path_lua = "/home/lukopa/lua_scripts/";
                byte[] code;
                switch (text) {
                    case "time":
                        if (args.size() < 3) {
                            CommandHandler.sendMessage(sender, "Usage: /w custom time <args>");
                            return;
                        }
                    String timescale = args.get(2);
                    String scripttime = """
                        CS.UnityEngine.Time.timeScale = """ + timescale + """
                    """;
                    ProcessBuilder c = new ProcessBuilder(luac_path, "-o", luacfile, luafile);
                    try {
                        FileWriter w_lua = new FileWriter(luafile);
                        w_lua.write(scripttime);
                        w_lua.close();
                        c.directory(new File(path_lua));
                        Process compile = c.start();
                        compile.waitFor();
                    } catch (Exception exc) {
                        throw new RuntimeException(exc);
                    }
                    try {
                        Path path = Path.of(luacfile);
                        code = Files.readAllBytes(path);
                        targetPlayer.sendPacket(new PacketWindSeedClientNotify(luacfile));
                    }
                    catch (IOException exc) {
                        throw new RuntimeException(exc);
                    }
                    CommandHandler.sendMessage(sender, "Timescale set to " + timescale + "!");
                    break;
                }
                break;
            default:
                String luafile1 = "/home/lukopa/lua_scripts/errDialog.lua";
                String luacfile1 = "/home/lukopa/lua_scripts/out/errDialog.luac";
                String luac_path1 = "/home/lukopa/lua_scripts/luac";
                String path_lua1 = "/home/lukopa/lua_scripts/";                
                String path_file = "/sdcard/Windy/" + custom + ".luac";
                String errDialog = """
                   CS.PHEKCDLBLOL.DOHFCAOCLPB(""" + "\"" + custom + ".luac not found" + "\"" + ",\"Error while reading Luac!\")" + 
                    """
                    
                    """;
                ProcessBuilder c = new ProcessBuilder(luac_path1, "-o", luacfile1, luafile1);
            try {
                FileWriter w_lua = new FileWriter(luafile1);
                w_lua.write(errDialog);
                w_lua.close();
                c.directory(new File(path_lua1));
                Process compile = c.start();
                compile.waitFor();
            } catch (Exception exc) {
                throw new RuntimeException(exc);
            }            
            try {
                byte[] data = Files.readAllBytes(new File(path_file).toPath());
                ByteString byteString = ByteString.copyFrom(data);
                targetPlayer.sendPacket(new PacketWindSeedClientNotify(path_file));
                CommandHandler.sendMessage(sender, "Windy Winnies!");                
            } catch (FileNotFoundException exc) {
                try{
                    Path path = Path.of(luacfile1);
                    code = Files.readAllBytes(path);
                    targetPlayer.sendPacket(new PacketWindSeedClientNotify(luacfile1));
                } catch (IOException err){
                    throw new RuntimeException(err);
                }
            } catch (IOException e) {
                try{
                    Path path = Path.of(luacfile1);
                    code = Files.readAllBytes(path);
                    targetPlayer.sendPacket(new PacketWindSeedClientNotify(luacfile1));
                } catch (IOException er){
                    throw new RuntimeException(er);
                }
                throw new RuntimeException(e);                         
            }          
            break;                
        }
    }
}