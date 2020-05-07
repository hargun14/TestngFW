package components;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import utils.PropertyUtil;

public class BaseClass {

	public  WebDriver driver;
    public String urlName;
    public String browserName;
	
	/**
	 * Method loads driver from config file and gets browser name.
	 * helps to launch the browser present in config file
	 */
	public WebDriver initalizedriver() throws IOException {
		
		String browserName=PropertyUtil.get("config.properties", "browser");
	    String 	urlName=PropertyUtil.get("config.properties", "URL");
		System.out.println(browserName);
		Component comp =new Component();
		if(browserName.equals("chrome"))
		{//System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Desktop\\FW\\TestngFW\\src\\main\\resources\\Drivers\\chromedriver.exe");
		  System.setProperty("webdriver.chrome.driver","C:\\Driver\\chromedriver.exe");
		  driver= new ChromeDriver();

		}
		else if (browserName.equals("firefox"))
		{
			 driver= new FirefoxDriver();
		}
		else if (browserName.equals("IE"))
		{
            
		}
		driver.manage().timeouts().implicitlyWait( comp.getImplicitlyWait(), TimeUnit.SECONDS);
		return driver;
	
	}


		
	}