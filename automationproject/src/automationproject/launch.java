package automationproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class launch
{

@Test 
public void launch
{
System.setProperty("webdriver.chrome.driver","C:\\Users\\jenith.silviya\\Downloads\\chromedriver_win32\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://mobileworld.azurewebsites.net/");
driver.manage().window().maximize();


}
}
