package automationproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class launch
{
WebDriver driver;
@Test
public void Lanching_the  Browser()
{
System.setProperty("webdriver.chrome.driver","C:\\Users\\jenith.silviya\\Downloads\\chromedriver_win32\\chromedriver.exe");
WebDriverManager.chromedriver().setup();
driver=new ChromeDriver();
driver.get("https://mobileworld.azurewebsites.net/");
driver.manage().window().maximize();


}
}
