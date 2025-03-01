package helpers;

public class ConfigManager {
    private static final String SELENOID_URL = System.getProperty("selenoidUrl");
    private static final String CREDENTIALS_USR = System.getProperty("username");
    private static final String CREDENTIALS_PSW = System.getProperty("password");
    private static final String BROWSER = System.getProperty("browser", "chrome");
    private static final String BROWSER_VERSION = System.getProperty("version", "latest");
    private static final String SCREEN_RESOLUTION = System.getProperty("resolution", "1920x1080");
    private static final boolean ENABLE_VNC = Boolean.parseBoolean(System.getProperty("enableVNC", "true"));
    private static final boolean ENABLE_VIDEO = Boolean.parseBoolean(System.getProperty("enableVideo", "true"));

    static {
        System.out.println("selenoidUser = " + CREDENTIALS_USR);
        System.out.println("selenoidPassword = " + CREDENTIALS_PSW);
    }

    public static String getSelenoidUrl() {
        return "https://" + CREDENTIALS_USR + ":" + CREDENTIALS_PSW + "@" + SELENOID_URL + "/wd/hub";
    }

    public static String getBrowser() {
        return BROWSER;
    }

    public static String getBrowserVersion() {
        return BROWSER_VERSION;
    }

    public static String getScreenResolution() {
        return SCREEN_RESOLUTION;
    }

    public static boolean isEnableVNC() {
        return ENABLE_VNC;
    }

    public static boolean isEnableVideo() {
        return ENABLE_VIDEO;
    }

}
