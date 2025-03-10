package StepDefinations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.loginPage;

public class username_pass_Login_POM {
//	WebDriver driver = null;
//	loginPage loginpage;
//
//	@Given("browser is open by user")
//	public void browser_is_open_by_user() {
//		System.out.println("Browser is Opening");
//
//		WebDriverManager.edgedriver().setup();
//		driver = new EdgeDriver();
//		driver.manage().window().maximize();
//	}
//
//	@When("user is on login page page")
//	public void user_is_on_login_page_page() {
//		driver.get("https://practicetestautomation.com/practice-test-login/");
//	}
//
//	@And("^user entered (.*) and (.*)$")
//	public void user_entered_username_and_password(String username, String password) {
//
//		loginpage = new loginPage(driver);
//
//		loginpage.enterUsername(username);
//		loginpage.enterPassword(password);
//
////		driver.findElement(By.id("username")).sendKeys(username);
////		driver.findElement(By.id("password")).sendKeys(password);
//	}
//
//	@And("user click login button")
//	public void user_click_login_button() {
//
//		loginpage.clickSubmitbtn();
////		driver.findElement(By.id("submit")).click();
//	}
//
//	@Then("user navigated to homepage")
//	public void user_navigated_to_homepage() throws InterruptedException {
//		// driver.findElement(By.xpath("//h1[text()='Logged In
//		// Successfully']")).isDisplayed();
//		loginpage.verifyUserLogin();
//
//		Thread.sleep(2000);
//		driver.close();
//	}

}
