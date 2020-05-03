package testcases;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

import components.BaseClass;
import components.Component;
import pageobject.HomePage;
import pageobject.LoginPage;
//@Listeners(customlistners.Listeners.class)
public class ApplicationLogin extends BaseClass {
	public Properties data = new Properties();
	String Username;
	String Passwords;
	String Invalidname;
	String Invalidpass;
	
	@BeforeTest
	public void openpage() throws IOException {
		driver = initalizedriver();
		FileInputStream file = 
				new FileInputStream("C:\\Users\\DELL\\Desktop\\FW\\TestngFW\\src\\test\\resources\\DataFile.properties");
		data.load(file);
		driver.get(prop.getProperty("URL"));
		System.out.println("Launching Website");
		//data = new Properties();
	}

	@Test(enabled=true)
	public void validlogin() throws IOException { 
		HomePage home = new HomePage(driver);
		//home.getlogin();
		LoginPage login = new LoginPage(driver);
		System.out.println("Launching Login page for the user");	
		String user= data.getProperty("Username");
		String pass1= data.getProperty("Passwords");
		System.out.println(data.containsKey("value"));
		System.out.println(data.getProperty("Username"));
		System.out.println(data.getProperty("value"));
	    System.out.println(data.getProperty("Invalidname"));
	    System.out.println(data.getProperty("Invalidpass"));
		//login.dologin(user, pass1);
		//login.gettitle();
		
		}
	
	@Test(enabled=false)
	public void invalidlogin() throws IOException{
		HomePage home = new HomePage(driver);
		home.getlogin();
		LoginPage login = new LoginPage(driver);
		System.out.println("Launching Login page for the user");	
		data = new Properties();
		FileInputStream file = new FileInputStream("C:\\Users\\DELL\\Desktop\\Project\\HARGUNQA\\src\\test\\resources\\DataFile");
		data.load(file);
		try{System.out.println("Invalid login");
		String Invalidname1= data.getProperty("Invalidname");
		String Invalidpass1= data.getProperty("Invalidpass");
		System.out.println(data.getProperty("Invalidname"));
		System.out.println(data.getProperty("Invalidpass"));
		login.errorlogin(Invalidname1, Invalidpass1);
		System.out.println("passed invalid");
}
	catch (Throwable t){
		Component comp=new Component();
	comp.capturescreenshot();	
	}
	}
		
		
	
	@AfterTest
	public void closeTest() {
		System.out.println("Browser closing");
		driver.close();
	}

}
