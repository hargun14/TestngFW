package basePackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class baseclass {

	public  WebDriver driver;
    public Properties prop;
    public String 	urlName;
	
	public WebDriver initalizedriver() throws IOException {
		
	prop=new Properties();
	FileInputStream fis= new FileInputStream("C:\\Users\\DELL\\Desktop\\Project\\HARGUNQA\\src\\main\\java\\basePackage\\Driver");
	prop.load(fis);
	String browserName=prop.getProperty("browser");
	String 	urlName=prop.getProperty("URL");
	System.out.println(browserName);
	//String drivername=System.getProperty("user.dir");
	//System.out.println(drivername);

	if(browserName.equals("chrome"))
	{
		
		// System.setProperty("webdriver.chrome.driver",drivername+"\\DRIVER\\chromedriver.exe");
		 System.setProperty("webdriver.chrome.driver","C:\\Driver\\chromedriver.exe");
		driver= new ChromeDriver();
		//driver.get("URL");
		
			//execute in chrome driver
		
	}
	else if (browserName.equals("firefox"))
	{
		 driver= new FirefoxDriver();
		//firefox code
	}
	else if (browserName.equals("IE"))
	{
//		IE code
	}

	driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	return driver;
	
	}}