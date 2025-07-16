import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import javax.lang.model.element.Element;
import java.util.concurrent.TimeUnit;

public class Dropdown {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver =new ChromeDriver();
        driver.get("https://www.facebook.com/login/");
        driver.manage().window().maximize();
        //Thread.sleep(3000);
       // driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//div[@id='login_link']/a[2]")).click();
        //Thread.sleep(3000);
        WebElement Year= driver.findElement(By.id("year"));
        Select select = new Select(Year);
        System.out.println(select.isMultiple());
    }
}
