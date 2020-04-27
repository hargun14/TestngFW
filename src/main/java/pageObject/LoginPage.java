package pageObject;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public WebDriver driver;
	public Properties prop;
	public String 	Passwords;
	public String 	Username;
	
	

    public LoginPage(WebDriver driver) throws IOException{
    	prop=new Properties();
    	FileInputStream fis= new FileInputStream("C:\\Users\\DELL\\Desktop\\Project\\HARGUNQA\\src\\test\\resources\\DataFile");
    	prop.load(fis);
    	prop.getProperty("Username");
    	prop.getProperty("Passwords");
	  this.driver=driver;
	  PageFactory.initElements(driver,this);
	  
  }
  
 @FindBy(xpath="//input[@id='user_email']")
  private WebElement email;
  
 @FindBy(xpath="//input[@type='submit' and @value='Log In']")
 private WebElement button;		
  
 @FindBy(xpath="//*[@class='form-control input-hg' and @id='user_password'] ")
  private WebElement password;

  
  
  public void getcredentials() {
	  email.sendKeys(prop.getProperty("Username"));
	  password.sendKeys(prop.getProperty("Passwords"));
	  button.click();
	  }
  
  
public void gettitle() {
	
	String Title=driver.getTitle();
	System.out.println(Title);
	
}
	  

	
} 
	  
	  
	  
