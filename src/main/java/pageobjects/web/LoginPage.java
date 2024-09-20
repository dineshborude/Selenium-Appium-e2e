package pageobjects.web;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    WebDriver driver;

    @FindBy(className = "login_logo")
    WebElement logoText;

    @FindBy(id = "user-name")
    WebElement userName;

    @FindBy(id = "password")
    WebElement passWord;

    @FindBy(id = "login-button")
    WebElement loginButton;

    @FindBy(className = "item_4_img_link")
    WebElement bag;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void enterUserName(String username) {
        userName.sendKeys(username);
    }

    public void enterPassword(String password) {
        passWord.sendKeys(password);
    }

    public void clickLogin() {
        loginButton.click();
    }

    public void assertBag() {
        bag.isDisplayed();
    }
}
