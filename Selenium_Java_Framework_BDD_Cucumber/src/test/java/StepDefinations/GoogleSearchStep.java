package StepDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearchStep {
	WebDriver driver = null;

	@Given("Browser is open")
	public void browser_is_open() {
		System.out.println("Browser is open 111");
		
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		driver.manage().window().maximize();
	}

	@And("user is on google search page")
	public void user_is_on_google_search_page() {
		System.out.println("user is on google search page 222");
		
		
		driver.get("https://www.google.co.in/");
		
	}

	@When("user enter text in serach box")
	public void user_enter_text_in_serach_box() {
		System.out.println("user enter text in serach box 333");
		
		//driver.findElement(By.name("q")).sendKeys("Automation step by step");
	}

	@And("hit enter")
	public void hit_enter() {
		System.out.println("hit enter 444");
	}

	@Then("user is navigated to result page")
	public void user_is_navigated_to_result_page() {
		System.out.println("user is navigated to result page 555");
	}
}
