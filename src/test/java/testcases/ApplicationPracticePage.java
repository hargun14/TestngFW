package testcases;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import basepackage.baseclass;
import pageobject.HomePage;
import pageobject.PracticePage;

public class ApplicationPracticePage extends baseclass{

@BeforeTest
	
	public void openpage() throws IOException {
		driver=initalizedriver();
		driver.get(prop.getProperty("URL"));
		System.out.println("Launching Website");
		HomePage home= new HomePage(driver);
		System.out.println("landed to homepage");
		home.clickpracticelink();
		System.out.println("landed to practicepage");
}
	@Test
	public void Verifyheader() throws IOException {
		PracticePage practice= new PracticePage(driver);
		practice.validateheader();
		practice.dropdownselect();
		
		
	}
	
	
	
	
	
}
