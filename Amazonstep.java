package StepDefination;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertTrue;

public class Amazonstep {
    WebDriver driver;

    @Given("I launch the Amazon website")
    public void i_launch_the_amazon_website() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();  // <-- assign to class-level field
        driver.manage().window().maximize();
        driver.get("https://www.amazon.in/");
    }

    @When("I enter {string} in the search box")
    public void i_enter_in_the_search_box(String string) {
        WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
        search.sendKeys(string);
    }

    @When("I click the search button")
    public void i_click_the_search_button() {
        WebElement searchButton = driver.findElement(By.id("nav-search-submit-button"));
        searchButton.click();
    }

    @Then("I should see search results")
    public void i_should_see_search_results() {
        WebElement Productpage= driver.findElement(By.xpath("//div[@id='search']"));
        assertTrue("Product page is not visible",Productpage.isDisplayed());

        driver.quit();
    }
}
