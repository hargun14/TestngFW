package testcases;
import java.io.IOException;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import basepackage.baseclass;
import pageobject.HomePage;
import pageobject.LoginPage;

public class ApplicationLoginPage extends baseclass{
	
	
	public static Logger log=LogManager.getLogger(	ApplicationLoginPage	.class.getName());
	
	@BeforeTest
	
	public void openpage() throws IOException {
		driver=initalizedriver();
		driver.get(prop.getProperty("URL"));
		System.out.println("Launching Website");
		}
	
	@Test
	public void navigatehomepage() throws IOException {
		
		HomePage home= new HomePage(driver);
		home.getlogin();
		}
		
	
	
	
	
	
	
    @AfterTest
    
    public void closeTest() {
    	System.out.println("Browser closing");
    	driver.close();
    	
    	
    }

		
	
	
}
