package tests.mobile;


import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class BaseClass_Mobile {

    @Test
    public void launchApp() throws MalformedURLException {

        UiAutomator2Options options = new UiAutomator2Options();

        options.setDeviceName("Pixel3");
        options.setApp("src/resources/ApiDemos-debug.apk");
        options.setPlatformName("Android");
        options.setCapability("noReset",true);


        AndroidDriver androidDriver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"),options);

        System.out.println("App Installed : ");



    }

}
