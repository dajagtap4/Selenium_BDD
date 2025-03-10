package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage_PF {

	@FindBy(id = "username")
	WebElement text_username;
	
	@FindBy(id = "password")
	WebElement text_password;
	
	@FindBy(id = "submit")
	WebElement btn_login;
	
	WebDriver driver;
	
	public loginPage_PF(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void enterUsername(String username) {
		text_username.sendKeys(username);
	}
	
	public void enterPassword(String password) {
		text_password.sendKeys(password);
	}
	
	public void loginButton() {
		btn_login.click();
	}
}
