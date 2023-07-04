package emu.grasscutter.custom;

public class DeviceChecker {
    public static String getDevice() {
        String os = System.getProperty("os.name").toLowerCase();

        if (os.contains("android")) {
            return "Android";
        } else if (os.contains("windows")) {
            return "Windows";
        } else if (os.contains("linux") || os.contains("ubuntu")) {
            return "Linux";
        } else if (os.contains("windows") || os.contains("os x") || os.contains("darwin")) {
            return "macOS";
        }

        return "Unknown Device";
    }
}
