package StepDefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import PageObjects.loginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class POMLoginStepsDefinition {
	private static final String username = null;
   WebDriver driver;
	loginPage login;
	
	@Given("User is on the login page")
	public void user_is_on_the_login_page() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.saucedemo.com/v1/");
	}

	@When("User enters valid {string} and {string}")
	//public void user_enters_valid_username_and_password()
	public void user_enters_valid(String username, String password) throws InterruptedException {
		
		login = new loginPage(driver);
		login.enterUsername(username);
		login.enterPassword(password);
		
	    
	/*   driver.findElement(By.id("user-name")).sendKeys(username);
	   driver.findElement(By.id("password")).sendKeys(password); */
	}

	@And("User clicks on login button")
	public void user_clicks_on_login_button() {
	    // Write code here that turns the phrase above into concrete actions
		login.clickLogin();
		//driver.findElement(By.id("login-button")).click();
	}

	@Then("User navigates to homepage")
	public void user_navigates_to_homepage() {
	    // Write code here that turns the phrase above into concrete actions
		login.isLogoDisplayed();
		
	//	Assert.assertTrue(driver.findElements(By.xpath("//div[@class='app_logo']")).size()>0); 
	}

	@And("Close the browser")
	public void close_the_browser() {
	    // Write code here that turns the phrase above into concrete actions
	    driver.close();
	}


}



