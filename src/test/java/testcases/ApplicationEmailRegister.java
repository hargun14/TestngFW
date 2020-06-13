package testcases;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import components.BaseClass;
import pageobject.HomePage;
import pageobject.LoginPage;
import utils.PropertyUtil;

public class ApplicationEmailRegister extends BaseClass {

	
	@BeforeTest

	public void openpage() throws IOException {
		driver=initalizedriver();
		System.out.println(PropertyUtil.get("config.properties", "URL"));
		System.out.println("Launching Website");
		driver.get(PropertyUtil.get("config.properties", "URL"));
	}

	@Test

	public void Register() throws IOException {
		
		HomePage home = new HomePage(driver);
	    home.getlogin();
	    System.out.println("user clicks on login button on homepage");
	    System.out.println(PropertyUtil.get("dataFile.properties", "Username"));
	    System.out.println(PropertyUtil.get("dataFile.properties", "Password"));
	    System.out.println("user reads the username ans password from propertyfiles");
		String user = PropertyUtil.get("dataFile.properties", "Username");
		String pass =PropertyUtil.get("dataFile.properties", "Password");
		LoginPage login = new LoginPage(driver);
		System.out.println(" user landed to the login page and enter credentials");
		login.dologin(user, pass);
		System.out.println("Enter email, password and clicked button");
		System.out.println("login done using Email");
		login.gettitle();
		
	}

	@Test(enabled=false)
	public void Title() throws IOException {
		LoginPage login = new LoginPage(driver);
		login.gettitle();
		
	}

	@AfterTest

	public void closeTest() {
		System.out.println("Browser closing");
		driver.quit();

	}
}
