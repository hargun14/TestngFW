package testcases;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import components.BaseClass;
import pageobject.HomePage;
import pageobject.PracticePage;
import utils.PropertyUtil;

public class ApplicationPractice extends BaseClass{

@BeforeTest
	
	public void openpage() throws IOException {
		driver=initalizedriver();
		System.out.println(PropertyUtil.get("config.properties", "URL"));
		driver.get(PropertyUtil.get("config.properties", "URL"));
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
		practice.checkbox1();
	    System.out.println("passed test case");
	
}
}


