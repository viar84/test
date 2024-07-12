package GenericUtilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class FileUtility 
{
public String  getPropertyValue(String key) throws Throwable
{

	FileInputStream fis = new FileInputStream("./src/test/resources/CommonData.properties");
	Properties prop = new Properties();
	prop.load(fis);	
	String value = prop.getProperty(key);
	return value;
	
}
}
