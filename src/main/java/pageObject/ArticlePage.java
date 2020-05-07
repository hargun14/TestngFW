package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import components.Component;

public class ArticlePage extends Component {

	public WebDriver driver;

	public ArticlePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//h3[ text()='Categories']")
	private WebElement header;

	@FindBy(xpath = "//li[@class='cat-item cat-item-13']")
	private WebElement listSelenium;

	public void listselect() {
		System.out.println(header.getText());
	}

	public void selectseleniumoption() {
		click(listSelenium);
		System.out.println("option selected is selenium");

	}

}
