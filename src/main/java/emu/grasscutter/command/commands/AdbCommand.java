package emu.grasscutter.command.commands;

import emu.grasscutter.Grasscutter;
import emu.grasscutter.net.packet.BasePacket;
import emu.grasscutter.game.player.Player;
import emu.grasscutter.command.Command;
import emu.grasscutter.command.CommandHandler;
import com.google.protobuf.ByteString;
import static emu.grasscutter.utils.lang.Language.translate;

import java.util.List;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.lang.Class;
import java.util.List;

@Command(
    label = "adb",
    aliases = {"adb"},
    usage = {"<args>"},
    permission = "server.adb", 
    targetRequirement = Command.TargetRequirement.NONE
    )
public final class AdbCommand implements CommandHandler {
    @Override
    public void execute(Player sender, Player targetPlayer, List<String> args) {
        if(args.size() < 1) {
            this.sendUsageMessage(sender);
            return;
        }

        String a_start = args.get(0);

        switch(a_start) {

            case "server":
                if (args.size() < 2) {
                    CommandHandler.sendMessage(sender, "Usage: /adb server <args>");
                    return;
                }

                String text = args.get(1);

                String adbfile = "adb";
                switch(text) {
                    case "cmd":
                        if (args.size() < 3) {
                            CommandHandler.sendMessage(sender,"Usage: /adb server cmd <args>");
                            return;
                        }
                        String cmd = args.get(2);
                        cmd = String.join(" ", args.subList(2, args.size()));
                        ProcessBuilder c = new ProcessBuilder(adbfile, cmd);
                        try {
                            Process compile = c.start();
                            InputStream output = compile.getInputStream();
                            byte[] buffer = new byte[1024];
                            int bytesRead;
                            while ((bytesRead = output.read(buffer)) != -1) {
                                CommandHandler.sendMessage(sender, "Output: " + new String(buffer, 0, bytesRead));
                                Grasscutter.getLogger().info(new String(buffer, 0, bytesRead));
                            }
                            output.close();
                            compile.waitFor();
                        } catch (Exception exc) {
                            throw new RuntimeException(exc);
                        }
                        CommandHandler.sendMessage(sender,"adb command executed: " + cmd);
                        break;

                    case "exc":
                        if (args.size() < 3) {
                            CommandHandler.sendMessage(sender,"Usage: /adb server exc <args>");
                            return;
                        }
                        String shell = args.get(2);
                        shell = String.join(" ", args.subList(2, args.size()));
                        ProcessBuilder cd = new ProcessBuilder(adbfile, "shell", shell);
                        try {
                            Process compile = cd.start();
                            InputStream output = compile.getInputStream();
                            byte[] buffer = new byte[1024];
                            int bytesRead;
                            while ((bytesRead = output.read(buffer)) != -1) {
                                CommandHandler.sendMessage(sender, "Output: " + new String(buffer, 0, bytesRead));
                                Grasscutter.getLogger().info(new String(buffer, 0, bytesRead));
                            }
                            output.close();
                            compile.waitFor();
                        } catch (Exception exc) {
                            throw new RuntimeException(exc);
                        }
                        CommandHandler.sendMessage(sender,"adb Shell command executed: " + shell);
                        break;                        
                }
                break;

            default:
                CommandHandler.sendMessage(sender,"Usage: /adb server <args>");
                break;
        }
    }
}
