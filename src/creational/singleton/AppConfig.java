package creational.singleton;

public class AppConfig {

    private static AppConfig appConfig = null;

    private  AppConfig() {}

   public static AppConfig getAppConfig() {
        if (null == appConfig) {
            appConfig = new AppConfig();
        }
        return appConfig;

    }

}

class MainAppConfig {

    static void main(String[] args) {
     AppConfig appConfig1 = AppConfig.getAppConfig();
     AppConfig appConfig2 = AppConfig.getAppConfig();
     System.out.println(appConfig1 == appConfig2);
    }

}


