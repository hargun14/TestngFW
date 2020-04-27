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


import basePackage.baseclass;
import pageObject.HomePage;

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
		
		//driver=initalizedriver();
		//driver.get(prop.getProperty("URL"));
		HomePage home= new HomePage(driver);
		home.getLogin();
		//driver.close();
		}
		
    @AfterTest
    
    public void closeTest() {
    	System.out.println("Browser closing");
    	driver.close();
    	
    	
    }

		
	
	
}
