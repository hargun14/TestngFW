package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basePackage.component;

public class HomePage extends component {

	public WebDriver driver;
	//global variable
	// to give life to this driver , I will create its constructor and 
	//pass driver parameter in it so that it will come from homepage
	// run it on chromedriver class
  public HomePage(WebDriver driver){
	 this.driver=driver;
	 PageFactory.initElements(driver,this);
	  
   }
	@FindBy(xpath="//div[@class='container-fluid']//nav/ul/li[4]")
	private WebElement Login;
	
	
	public void getLogin() {
		click(Login);
		
	}
	
}