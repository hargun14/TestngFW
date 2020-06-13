package testcases;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import components.BaseClass;
import components.Component;
import pageobject.ShopPage;
import utils.PropertyUtil;

public class ShopcluesHome extends BaseClass  {

	
	@BeforeTest

	public void openpage() throws IOException {
		
		initalizedriver();
		System.out.println(PropertyUtil.get("config.properties", "URL2"));
		System.out.println("Launching Website");
		driver.get(PropertyUtil.get("config.properties", "URL2"));
	}

	
	@Test
	public void validatehome() {
	ShopPage shop= new ShopPage(driver);
	shop.validlogo();
	shop.Essentials();
	System.out.println("testcase passed");
	driver.close();
		
		
		
	}
}
