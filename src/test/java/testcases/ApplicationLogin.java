package testcases;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

import components.BaseClass;
import components.Component;
import pageobject.HomePage;
import pageobject.LoginPage;
import utils.PropertyUtil;

//@Listeners(customlistners.Listeners.class)
public class ApplicationLogin extends BaseClass {
	public Properties data = new Properties();
	String Username;
	String Passwords;
	String Invalidname;
	String Invalidpass;

	@BeforeTest
	public void openpage() throws IOException {
		driver = initalizedriver();
		System.out.println(PropertyUtil.get("config.properties", "URL"));
		driver.get(PropertyUtil.get("config.properties", "URL"));
		System.out.println("Launching Website");
	}

	@Test(enabled = true)
	public void validlogin() throws IOException {
		HomePage home = new HomePage(driver);
		LoginPage login = new LoginPage(driver);
		System.out.println("Launching Login page for the user");
		System.out.println(PropertyUtil.get("dataFile.properties", "Username"));
		System.out.println(PropertyUtil.get("dataFile.properties", "Password"));
		String user = PropertyUtil.get("dataFile.properties", "Username");
		String pass = PropertyUtil.get("dataFile.properties", "Password");
		System.out.println("landed to maine page and clicked on login button");
		login.dologin(user, pass);
		System.out.println("Enter email, password and clicked button");
		System.out.println("login done using Email");
		login.gettitle();
	}

	@Test(enabled = false)
	public void invalidlogin() throws IOException {
		HomePage home = new HomePage(driver);
		home.getlogin();
		LoginPage login = new LoginPage(driver);
		System.out.println("Launching Login page for the user");
		System.out.println(PropertyUtil.get("dataFile.properties", "Invalidname"));
		System.out.println(PropertyUtil.get("dataFile.properties", "Invalidpass"));
		String Invalidname = PropertyUtil.get("dataFile.properties", "Invalidname");
		String Invalidpass = PropertyUtil.get("dataFile.properties", "Invalidpass");
		String Invalidname1 = data.getProperty("Invalidname");
		String Invalidpass1 = data.getProperty("Invalidpass");
		login.errorlogin(Invalidname1, Invalidpass1);

	}

	@AfterTest
	public void closeTest() {
		System.out.println("Browser closing");
		driver.close();
	}

}
