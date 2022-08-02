package automationproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Login extends launch
{
	@Test
    (dependsOnMethods= {"launching_the_Browser"})
	public void Signup_for_mobile() {
	WebElement Signin=driver.findElement(By.xpath("//button[text()='SIGN IN']"));
	Signin.click();
	WebElement Signup=driver.findElement(By.xpath("//a[text()='sign up']"));
	Signup.click();
	WebElement firstname=driver.findElement(By.xpath("//input[@id='myName']"));
	firstname.sendKeys("jenith");
	WebElement Lastname=driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
	Lastname.sendKeys("silviya");
	WebElement Email=driver.findElement(By.xpath("//inpuy[text()='Email']"));
	Email.sendKeys("jenithsilviya@gmail.com");
	WebElement password=driver.findElement(By.xpath("//input[@type='Password']"));
	password.sendKeys("jenith@123");
	WebElement Phone_number=driver.findElement(By.xpath("input[@type='number']"));
	Phone_number.sendKeys("7397339290");
	driver.findElement(By.xpath("//input[@type='radio']"));
	WebElement bio_story=driver.findElement(By.xpath("//textarea[@placeholder='Short Bio']"));
	bio_story.sendKeys("Jenith is new joiner in qualitest");
	driver.findElement(By.xpath("//input[@type='date']")).click();
	
	
	}	
}
