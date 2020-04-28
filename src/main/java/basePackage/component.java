package basepackage;

import org.openqa.selenium.WebElement;

public class component {

	public void click(WebElement element) {
		element.click();
	}

	public void enterText(WebElement element, String data) {
		element.sendKeys(data);
	}

	public void display(WebElement element) {

		element.isDisplayed();
	}

}
