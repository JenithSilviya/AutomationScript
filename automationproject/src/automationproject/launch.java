package automationproject;

public class launch
{
WebDriver driver;
@Test public void Launching_the Browser()
{
System.setProperty("webdriver.chrome.driver","C:\\Users\\jenith.silviya\\Downloads\\chromedriver_win32\\chromedriver.exe");
driver=new ChromeDriver();
driver.get("https://mobileworld.azurewebsites.net/");
driver.manage().window().maximize();


}
}
