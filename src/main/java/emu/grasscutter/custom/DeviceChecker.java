package emu.grasscutter.custom;

public class DeviceChecker {
    public static String getDevice() {
        String os = System.getProperty("os.name").toLowerCase();

        if (os.contains("android")) {
            return "Android";
        } else if (os.contains("windows")) {
            return "Windows";
        } else {
            return "Unknown Device";
        }
    }
}
