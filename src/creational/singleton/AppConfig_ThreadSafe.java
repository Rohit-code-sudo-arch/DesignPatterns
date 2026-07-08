package creational.singleton;

public class AppConfig_ThreadSafe {

    private AppConfig_ThreadSafe() {}

    private static class SingletonHelper {
        private static final AppConfig_ThreadSafe INSTANCE = new AppConfig_ThreadSafe();
    }

    public static AppConfig_ThreadSafe getInstance() {
        return SingletonHelper.INSTANCE;
    }

    public static void main(String[] args) {
        AppConfig appConfig1 = AppConfig.getAppConfig();
        AppConfig appConfig2 = AppConfig.getAppConfig();
        System.out.println(appConfig1 == appConfig2);
        System.out.println(appConfig1.hashCode());
        System.out.println(appConfig2.hashCode());
    }
}

