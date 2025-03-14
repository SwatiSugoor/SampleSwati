package StepDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class practice {
	static WebDriver driver;
	@Given("User is on login page")
	public void user_is_on_login_page() {
	    driver= new ChromeDriver();
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	     driver.get("https://www.saucedemo.com/v1/");

	}

	@When("User enters valid username and password")
	public void user_enters_valid_username_and_password() {
	   driver.findElement(By.name("user-name")).sendKeys("problem_user");
	   driver.findElement(By.name("password")).sendKeys("secret_sauce");
	    
	}

	@And("Clicks on login Button")
	public void clicks_on_login_button() {
	    driver.findElement(By.id("login-button")).click();
	   
	}

	@Then("User is navigated to Home page")
	public void user_is_navigated_to_home_page() {
	 
	  Assert.assertTrue(driver.findElements(By.xpath("//div[@class='app_logo']")).size() > 0, 
              "User is navigated to Home page");

	}

	@And("Close the browser")
	public void close_the_browser() {
	    driver.close();
	}


}
