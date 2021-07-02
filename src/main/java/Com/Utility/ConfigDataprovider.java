package Com.Utility;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigDataprovider {
	
	Properties pro;
	public ConfigDataprovider()
	{
		File src = new File("./Configration/Config.properties");
		try {
			FileInputStream fis =new FileInputStream(src);
		    pro = new Properties();
			pro.load(fis);
			
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
	}
	
	public String getBrowser()
	{
		return pro.getProperty("Browser");
		
	}
	
	public String getURL()
	{
		return pro.getProperty("URL");
	}

	
	

}
