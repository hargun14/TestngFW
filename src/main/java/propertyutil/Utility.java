package propertyutil;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Utility {
	public Properties prop;
	
	Utility() throws IOException{
		prop=new Properties();
		FileInputStream fis= new FileInputStream("C:\\Users\\DELL\\Desktop\\FW\\TestngFW\\src\\main\\resources\\config.properties");
		prop.load(fis);
	}
	public void getUtil(String name, String value) {
		
		
		
		
		
		
	}
	
	
	

}
