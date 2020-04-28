package testcases;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import basepackage.baseclass;
import pageobject.ArticlePage;
import pageobject.HomePage;

public class ApplicatioArticlePage extends baseclass {
	

	@BeforeTest
	
	public void openpage() throws IOException {
		driver=initalizedriver();
		driver.get(prop.getProperty("URL"));
		System.out.println("Launching Website");
		HomePage home=new HomePage(driver);
		System.out.println("Landed to main page of Website");
		home.clickhomelink();
		System.out.println("Clicked on homelink");
		home.clickarticle();
		System.out.println(" Reached articles page");
		}
	
	
	@Test
	
	public void pagedisplay() {
		ArticlePage article= new ArticlePage(driver);
		System.out.println(" Validate Articles page");
		article.listselect();
		article.selectseleniumoption();
		System.out.println("New Page will open");
		
	
		
		
	
	}
}
