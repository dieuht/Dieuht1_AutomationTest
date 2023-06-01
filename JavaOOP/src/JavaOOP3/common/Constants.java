package JavaOOP3.common;

public class Constants {
    static String browser = "http://123.com";
    static boolean report;
    static boolean headless;
    public Constants(String browser, boolean report, boolean headless){
        this.browser = browser;
        this.report = report;
        this.headless = headless;
    }

    public static String getBrowser() {
        return browser;
    }

    public static boolean isReport() {
        return report;
    }

    public static boolean isHeadless() {
        return headless;
    }

    public static void setBrowser(String browser) {
        Constants.browser = browser;
    }

    public static void setReport(boolean report) {
        Constants.report = report;
    }

    public static void setHeadless(boolean headless) {
        Constants.headless = headless;
    }
}
