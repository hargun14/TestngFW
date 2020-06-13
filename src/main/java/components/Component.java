package components;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import enumcomponent.VerificationProperties;
import utils.PropertyUtil;

import java.io.IOException;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

/**
 * Component class contains common method which is used in all test cases
 *
 */
public class Component extends BaseClass {
	
	//public String delay;

	public void click(WebElement element) {
		element.click();
	}

	public void enterText(WebElement element, String data) {
		element.sendKeys(data);
	}

	public long getImplicitlyWait() throws IOException {
		String implicitlyWait = PropertyUtil.get("config.properties", "delay");
		if (implicitlyWait != null)
			return Long.parseLong(implicitlyWait);
		else
			throw new RuntimeException("implicitlyWait not specified in the Configuration.properties file.");
	}

	public static void scrollTo(WebDriver driver, WebElement element) {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
	}

	public static String captureScreenshot(WebDriver driver) {
		String fileName = "";
		try {
			String screenShotsLocation = "C:\\Users\\DELL\\Desktop\\FW\\TestngFW\\reports"
					+ "";

			fileName = "screenshot1.png";
			File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(source, new File(screenShotsLocation + "\\" + fileName));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return fileName;
	}
	
	public static void capturescreenshot(WebDriver driver) throws IOException {
		
		TakesScreenshot ts= (TakesScreenshot)driver;
		
		File screenshotFile = ts.getScreenshotAs(OutputType.FILE);	
		//String path=System.getProperty("user.dir");
		String destinationFile=System.getProperty("user.dir")+"\\reports\\"+"screenshot.png";
		FileUtils.copyFile(screenshotFile, new File(destinationFile));
		
	}

	public void verifyElement(WebElement element, VerificationProperties property, String expected) {
		switch (property) {
		case DISPLAYED:
			Assert.assertEquals(Boolean.toString(element.isDisplayed()), expected);
		}
	}

	
	public void workWindow( WebDriver driver) {
		Set<String> ids = driver.getWindowHandles();
		Iterator<String> its = ids.iterator();
		String parentid = its.next();
		System.out.println( parentid);
		String childid = its.next();
		System.out.println( childid);
		driver.switchTo().window(childid);
		System.out.println(driver.getTitle());
	}

	
	public static void Alerts(WebDriver driver) {
		
		try {
		Alert alert = driver.switchTo().alert();
		alert.getText();
		System.out.println(alert.getText());
		alert.accept();
		}
		catch(Exception e) {
		}
		
	}
	

	public static void Mousehover(WebDriver driver,WebElement element) {
		
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();
		
		
	}
		
		
		
		
	
	
	
	
}
