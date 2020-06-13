package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import components.Component;

public class ShopPage extends Component{
	
	public WebDriver driver;

	public ShopPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//img[@itemprop='logo']")
	private WebElement logo;
	
	@FindBy(xpath="//button[@class='moe-chrome-style-notification-btn moe-btn-allow moe-allow-class']")
	private WebElement allow;
	
	@FindBy(xpath="//a[ contains (text(),'Daily Essentials')]")		
    private WebElement Daily;
	
	public void validlogo() {
		
		logo.isDisplayed();
		allow.click();
		}

	public void Essentials() {	
	Component.Mousehover(driver, Daily);
		
	}
	
	
	
	
}




