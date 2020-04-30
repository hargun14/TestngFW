package basepackage;

import org.openqa.selenium.WebElement;
import org.testng.Assert;

import projectenum.VerificationProperties;

public class Component {

	public void click(WebElement element) {
		element.click();
	}

	public void enterText(WebElement element, String data) {
		element.sendKeys(data);
	}

	public void display(WebElement element) {

		element.isDisplayed();
	}
	
	public void verifyElement(WebElement element, VerificationProperties property, String expected) {
		switch(property){
			case DISPLAYED:
				Assert.assertEquals(Boolean.toString(element.isDisplayed()), expected);
			}
	}

	
	
	
	
}
