package components;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import enumcomponent.VerificationProperties;

import java.io.IOException;
import java.util.Properties;

public class Component {
	public WebDriver driver;
	public Properties prop;
	public String delay;

	public void click(WebElement element) {
		element.click();
		System.out.println("hi");
	}

	public void enterText(WebElement element, String data) {
		element.sendKeys(data);
	}

	public long getImplicitlyWait() throws IOException {
		prop = new Properties();
		FileInputStream fis = new FileInputStream(
				"C:\\Users\\DELL\\Desktop\\FW\\TestngFW\\src\\main\\resources\\config.properties");
		prop.load(fis);
		String implicitlyWait = prop.getProperty("delay");
		if (implicitlyWait != null)
			return Long.parseLong(implicitlyWait);
		else
			throw new RuntimeException("implicitlyWait not specified in the Configuration.properties file.");
	}

	public static void scrollTo(WebDriver driver, WebElement element) {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
	}

	public void capturescreenshot() throws IOException {
		File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshotFile, new File("C:\\Screenshot"));
	}

	public void verifyElement(WebElement element, VerificationProperties property, String expected) {
		switch (property) {
		case DISPLAYED:
			Assert.assertEquals(Boolean.toString(element.isDisplayed()), expected);
		}
	}

}
