package StepDefinations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageFactory.loginPage_PF;

public class Username_Pass_Login_PF_with_Hooks {
	WebDriver driver = null;
	loginPage_PF login;

	@Before
	public void browserSetup() {
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		driver.manage().window().maximize();
	}
	
	@After
	public void tearDown() {
		
		driver.close();
	}

	@Given("browser is open by user")
	public void browser_is_open_by_user() {
		System.out.println("Browser is open 111");

	}

	@When("user is on login page page")
	public void user_is_on_login_page_page() {
		System.out.println("user is on login page page 222");
		driver.get("https://practicetestautomation.com/practice-test-login/");
	}

	@And("^user entered (.*) and (.*)$")
	public void user_entered_username_and_password(String username, String password) throws InterruptedException {
//		driver.findElement(By.id("username")).sendKeys(username);
//		driver.findElement(By.id("password")).sendKeys(password);

		login = new loginPage_PF(driver);

		Thread.sleep(2000);
		login.enterUsername(username);
		login.enterPassword(password);

	}

	@And("user click login button")
	public void user_click_login_button() throws InterruptedException {
//		driver.findElement(By.id("submit")).click();
		Thread.sleep(2000);
		login.loginButton();
	}

	@Then("user navigated to homepage")
	public void user_navigated_to_homepage() throws InterruptedException {
		// driver.findElement(By.xpath("//h1[text()='Logged In
		// Successfully']")).isDisplayed();
	
	}
}
