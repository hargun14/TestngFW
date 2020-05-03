package testcases;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import components.BaseClass;
import pageobject.HomePage;
import pageobject.LoginPage;

public class ApplicationEmailRegister extends BaseClass {

	public Properties data;

	@BeforeTest

	public void openpage() throws IOException {
		driver = initalizedriver();
		driver.get(prop.getProperty("URL"));
		System.out.println("Launching Website");
	}

	@Test

	public void Register() throws IOException {
		// driver=initalizedriver();
		// driver.get(prop.getProperty("URL"));
		HomePage home = new HomePage(driver);
	    home.getlogin();
		data = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\DELL\\Desktop\\Project\\HARGUNQA\\src\\test\\resources\\DataFile");
		data.load(fis);
		String user = data.getProperty("Username");
		String pass = data.getProperty("Password");
		System.out.println("landed to maine page and clicked on login button");
		LoginPage login = new LoginPage(driver);
		System.out.println(user);
		System.out.println(pass);
		login.dologin(user, pass);
		System.out.println("Enter email, password and clicked button");
		System.out.println("login done using Email");
		login.gettitle();
	}

	@Test
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