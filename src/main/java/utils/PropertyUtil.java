package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;

/**Created class which has get method and takes filename and key as parameters
 * Hashmap  Cache takes String and properties.
 */
public class PropertyUtil {

	private static final Map<String, Properties> CACHE = new ConcurrentHashMap<String, Properties>();
	
	public static String get(String fileName, String key)
	{
		return loadProperties(fileName).getProperty(key);
	}


	private static Properties loadProperties(String fileName) {
		// TODO Auto-generated method stub
		if(CACHE.containsKey(fileName)) {
			return CACHE.get(fileName);
		}
		else {
			InputStream inputStream = PropertyUtil.class.getClassLoader().getResourceAsStream(fileName);
			if(inputStream != null) {
				Properties property = new Properties();
				try {
					property.load(inputStream);
					return property;
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					System.out.println("Unable toload file");
				}
			}
			else {
				System.out.println("file not found");
			}
				
		}
		return new Properties();
	}

}
