package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import components.Component;
import projectenum.VerificationProperties;

public class PracticePage extends Component {

	public WebDriver driver;

	public PracticePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//h1[text()='Practice Page']")
	private WebElement header;
	@FindBy(xpath = "//legend[ text()='Dropdown Example']")
	private WebElement dropdownheader;
	@FindBy(xpath = "//select[@id='dropdown-class-example']")
	private WebElement dropdown;
	@FindBy(xpath="//legend[ text()='Checkbox Example']")
	private WebElement checkboxheader;
	@FindBy (xpath="//input[@id='checkBoxOption1']")
	private WebElement checkbox1;

	public void validateheader() {
		verifyElement(header, VerificationProperties.DISPLAYED, "true");
		System.out.println("Validated header of Practice page");
		
	}
		
    public void dropdownselect() {
		Select s = new Select(dropdown);
		s.selectByValue("option2");
		WebElement option = s.getFirstSelectedOption();
		option.getText();
		System.out.println("select option output is"  +"   " + option.getText());
	}

    public void checkbox1() {
    checkbox1.click();
    String checkboxoption=checkbox1.getText();
    System.out.println("checkboxoption method is called"       +""+checkboxoption);
    	
    }
    
    
    
    
    
    
    
    	
    }
    
    
    
    
    
    
    
    
    
    

