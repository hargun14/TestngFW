package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basepackage.component;

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
	private WebElement login;
	@FindBy(xpath="//span[contains(text(),'Register')]")
	private WebElement register;
	@FindBy(xpath="//ul[@class='nav navbar-nav navbar-right']//li[1]")
	private WebElement homelink;
	@FindBy(xpath="//ul[@class='nav navbar-nav navbar-right']//li[2]")
	private WebElement courselink;
	@FindBy(xpath="//ul[@class='nav navbar-nav navbar-right']//li[3]")
	private WebElement videoslink;
	@FindBy(xpath="//ul[@class='nav navbar-nav navbar-right']//li[4]")
	private WebElement interviewguidelink;
	@FindBy(xpath="//ul[@class='nav navbar-nav navbar-right']//li[5]")
	private WebElement practicelink;
	@FindBy(xpath="//ul[@class='nav navbar-nav navbar-right']//li[6]")
	private WebElement bloglink;
	@FindBy(xpath="//ul[@class='nav navbar-nav navbar-right']//li[6]")
	private WebElement aboutlink;
	@FindBy(xpath="//ul[@class='nav navbar-nav navbar-right']//li[6]")
	private WebElement contactlink;
	@FindBy(xpath="//ul[@class='navigation clearfix']/child::li[7]")
	private WebElement optionarticle;
	
	public void getlogin() {
		click(login);
	}
	public void clickregister() {
		click(register);
	}
	public void clickhomelink() {
		click(homelink);
	}
	public void homeclick() {
		click(homelink);
	}
	
	public void clickarticle() {
		click(optionarticle);
	}
	
	public void clickpracticelink() {
		click(practicelink);
	}
}