package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basepackage.component;

public class PracticePage extends component {

	public WebDriver driver;
	
	public PracticePage(WebDriver driver){
		this.driver=driver;
		 PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//h1[text()='Practice Page']")
	private WebElement header;
	@FindBy(xpath="//legend[ text()='Dropdown Example']")
	private WebElement dropdownheader;
	@FindBy(xpath="//select[@id='dropdown-class-example']")
	private WebElement dropdown;
	
	public void validateheader() {
		
		header.isDisplayed();
		System.out.println(header.getText());
	
	}
	
	
	public void dropdownselect() {
		dropdownheader.isDisplayed();
		System.out.println(dropdown.getText());
		dropdown.click();
	}
	
	
		
		
	

	
	
	
	
	
	
}
