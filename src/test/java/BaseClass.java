import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BaseClass {

   WebDriver driver;

    @Test
    public void LaunchWeb() throws InterruptedException {

         driver = new ChromeDriver();

         driver.get("https://www.saucedemo.com/");





    }


}
