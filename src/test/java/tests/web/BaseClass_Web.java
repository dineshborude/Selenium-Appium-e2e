package tests.web;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class BaseClass_Web {

    WebDriver webdriver;

    @Test
    public void launchWebApp() {

        webdriver = new ChromeDriver();

        webdriver.get("https://www.google.com");


    }

}
