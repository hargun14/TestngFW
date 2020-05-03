package pageobject;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	public WebDriver driver;
	//public String Passwords;
	//public String Usernames;

	public LoginPage(WebDriver driver) throws IOException {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@id='user_email']")
	private WebElement email;

	@FindBy(xpath = "//input[@type='submit' and @value='Log In']")
	private WebElement button;

	@FindBy(xpath = "//input[@id='user_password']")
	private WebElement password;
 
	@FindBy(xpath="//div[@class='alert alert-danger']")
	private WebElement errormessage;
	
	
	public void dologin(String user, String pass) {
		System.out.println(user+" - " + pass);
		email.sendKeys(user);
		password.sendKeys(pass);
		button.click();
		}

	public void errorlogin(String Invalidname, String Invalidpass) {
		System.out.println(Invalidname+" - " + Invalidpass);
		email.sendKeys(Invalidname);
		password.sendKeys(Invalidname);
		button.click();
	    errormessage.isDisplayed();
		}

	
	
	
	public void gettitle() {

		String Title = driver.getTitle();
		System.out.println(Title);

	}

}
