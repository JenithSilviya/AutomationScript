import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class KeyBoardAction {
    public static void main(String[] args) throws InterruptedException {
      //  System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://the-internet.herokuapp.com/key_presses");
       Actions Act=new Actions(driver);
       Act.sendKeys(Keys.ENTER).click();

       driver.quit();
    }
}