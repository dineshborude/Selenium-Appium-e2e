package tests.web;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pageobjects.web.LoginPage;
import utilities.ConfigReader;


public class TC_01_Login {

    WebDriver driver;

    @Test(dataProvider = "loginCredentials")
    public void login(String testType, String username, String password) throws InterruptedException {

        // Initialize the WebDriver
        driver = new ChromeDriver();

        // Get base URL from properties file
        String baseUrl = ConfigReader.getProperty("baseUrl");

        // Navigate to the base URL
        driver.get(baseUrl);

        // Initialize the LoginPage object after the URL is loaded
        LoginPage loginPage = new LoginPage(driver);
        System.out.println("Running test: " +testType);


        // Perform login using credentials from DataProvider
        loginPage.enterUserName(username);
        loginPage.enterPassword(password);
        loginPage.clickLogin();
        Thread.sleep(5000);
//        loginPage.assertBag();

        // Add necessary validation or assertions after login
        System.out.println("Login attempted with username: " + username + " and password: " + password);

        // Close the driver after the test
        driver.quit();
    }

    // DataProvider method
    @DataProvider(name = "loginCredentials")
    public Object[][] getCredentials() {
        return new Object[][] {
                { ConfigReader.getProperty("testType1"), ConfigReader.getProperty("username1"), ConfigReader.getProperty("password1") },
                { ConfigReader.getProperty("testType2"), ConfigReader.getProperty("username2"), ConfigReader.getProperty("password2") },
                { ConfigReader.getProperty("testType3"), ConfigReader.getProperty("username3"), ConfigReader.getProperty("password3") }
        };
    }

}
