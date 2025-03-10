package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginPage {
	WebDriver driver;
	By txt_username = By.id("username");
	By txt_password = By.id("password");
	By btn_login = By.id("submit");
	By verify_login = By.xpath("//h1[text()='Logged In Successfully']");

	public loginPage(WebDriver driver) {
		this.driver = driver;
		System.out.println(driver.getCurrentUrl());
	}
	public void enterUsername(String username) {
		driver.findElement(txt_username).sendKeys(username);
	}
	
	public void enterPassword(String password) {
		driver.findElement(txt_password).sendKeys(password);
	}
	
	public void clickSubmitbtn() {
		driver.findElement(btn_login).click();
	}
	
	public void verifyUserLogin() {
		driver.findElement(verify_login).isDisplayed();
	}
}
