package google.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class ReadConfigFile {

	public static FileInputStream readFile(String file) throws FileNotFoundException 
	{
		return new FileInputStream(new File(file));
	}
	
	public static Map<String, String> readProperties(){
		
		Properties prop = new Properties();
		try {
			prop.load(readFile("C:\\Users\\Arif\\eclipse project\\google.AutomateWithMaven\\Utility\\util.properties"));
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
		
			e.printStackTrace();
		}
		
		Map<String, String> properties = new HashMap<String, String>();
		
		Enumeration<Object> KeyValues = prop.keys();
		while (KeyValues.hasMoreElements()) {
			String key = (String) KeyValues.nextElement();
			String value = prop.getProperty(key);
			properties.put(key, System.getProperty(key, value));
		}
		
		return properties;
	}
}
