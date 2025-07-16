
import dev.failsafe.internal.util.Assert;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.Assert.assertTrue;

import java.util.Locale;

public class Demo extends Xpath

{

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();

        driver.get("https://www.amazon.in/");
        System.out.println("Page title: " + driver.getTitle());

        WebElement Search = driver.findElement(By.xpath(SEARCH_BOX));
        Search.sendKeys("laptop");


        WebElement SearchButton= driver.findElement(By.id(SEARCH_BUTTON));


        WebElement Productpage= driver.findElement(By.xpath(PRODUCT_PAGE));
        assertTrue("Product page is not visible",Productpage.isDisplayed());

        driver.quit();
    }
    }
