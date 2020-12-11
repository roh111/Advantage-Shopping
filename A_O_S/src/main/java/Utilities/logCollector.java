package Utilities;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

public class logCollector {

	
	
	
public static WebDriver driver;
	
	static Logger log=Logger.getLogger(logCollector.class.getName());
	
	
	public static void info(String message)
	
	{
		log.info(message);
	}
	
	public static void debug(String message)
	{
		log.debug(message);
	}
	
	public static void warn(String message)
	{
		log.warn(message);
	}
	
	public static void error(String message)
	{
		log.error(message);
	}
	
	public static void fatal(String message)
	{
		log.fatal(message);
	}

}
	
	
	

