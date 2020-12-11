package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class browserEngine {
	public static WebDriver driver;
	
	
	
	public static WebDriver browser()
	{
	System.setProperty("webdriver.chrome.driver","C:\\Project001\\A_O_S\\drivers\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	System.out.println("Chrome Browser Opened Successfully");
	return driver;
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
