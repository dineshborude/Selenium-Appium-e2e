package tests.mobile;


import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.GeneralServerFlag;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class BaseClass_Mobile {

    @Test
    public void launchApp() throws MalformedURLException {
        AppiumDriverLocalService service;

        AppiumServiceBuilder builder = new AppiumServiceBuilder();
        builder.withIPAddress("127.0.0.1");
        builder.usingAnyFreePort();
        service = AppiumDriverLocalService.buildService(builder);
        service.start();

        UiAutomator2Options options = new UiAutomator2Options();

        options.setDeviceName("Pixel3");
        options.setApp(System.getProperty("user.dir") +"/src/resources/ApiDemos-debug.apk");

        AndroidDriver driver = new AndroidDriver(service,options);

//        AndroidDriver androidDriver = new AndroidDriver(new URL("http://127.0.0.1:4723"),options);

        System.out.println("App Installed : "+driver.isAppInstalled("io.appium.android.apis"));

    }

}
