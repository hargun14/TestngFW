package testcases;



import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import components.BaseClass;
import pageobject.ArticlePage;
import pageobject.HomePage;
import utils.PropertyUtil;

public class ApplicationArticle extends BaseClass {

private static Logger logger=LogManager.getLogger(ApplicationArticle.class);
	@BeforeTest
	
	public void openpage() throws IOException {
		driver=initalizedriver();
		System.out.println(PropertyUtil.get("config.properties", "URL"));
		driver.get(PropertyUtil.get("config.properties", "URL"));
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
	logger.info("test case passed");
  }

	
	
	
	
	
	
}