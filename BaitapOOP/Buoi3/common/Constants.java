package BaitapOOP.Buoi3.common;

public class Constants {
    public static String browser = "Chrome";
    public static boolean report = true;
    public static boolean headless = false;

    public static String getBrowser() {
        return browser;
    }

    public static void setBrowser(String browser) {
        Constants.browser = browser;
    }

    public static boolean isReport() {
        return report;
    }

    public static void setReport(boolean report) {
        Constants.report = report;
    }

    public static boolean isHeadless() {
        return headless;
    }

    public static void setHeadless(boolean headless) {
        Constants.headless = headless;
    }
}
