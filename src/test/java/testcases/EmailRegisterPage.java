package testcases;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import basePackage.baseclass;
import pageObject.HomePage;
import pageObject.LoginPage;

public class EmailRegisterPage extends baseclass {
	
	@BeforeTest
	
	public void openpage() throws IOException {
		driver=initalizedriver();
		driver.get(prop.getProperty("URL"));
		System.out.println("Launching Website");
	}
	
	@Test
	
	public void Register() throws IOException {
		//driver=initalizedriver();
		//driver.get(prop.getProperty("URL"));
		HomePage home= new HomePage(driver);
		home.getLogin();
		System.out.println("landed to maine page and clicked on login button");
		LoginPage login=new LoginPage(driver);
		login.getcredentials();
		
		
		
		
		
		
		System.out.println("Enter email, password and clicked button");
		System.out.println("login done using Email");
		login.gettitle();
		}
	
	
	@Test
	public void Title() throws IOException {
		LoginPage login=new LoginPage(driver);
		login.gettitle();
	}
	
	
	
    @AfterTest
    
    public void closeTest() {
    	System.out.println("Browser closing");
    	driver.quit();
	
       }}
