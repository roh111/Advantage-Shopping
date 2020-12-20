package Utilities;


import org.openqa.selenium.WebDriver;
import org.testng.Assert;



public class T001_homePageKeys {
	
	public static WebDriver driver;
	

	public static void openBrowser() throws InterruptedException 
	{
		driver=browserEngine.browser();
		Thread.sleep(5000);
	}
	
	

	public static void openUrl() throws InterruptedException 
	{
		driver.get(constantValue.URL);
		System.out.println("Home Page Opened Successfully");
		logCollector.debug("Home page checked successfully");
		Thread.sleep(5000);
	}
	
	
	
	public static void checkTitle()
	{
		String homePageAtitle=driver.getTitle();
		Assert.assertEquals(homePageAtitle, constantValue.homePageEtitle);
		System.out.println("Home Page Title Check Completed Successfully");
   	}
	
	
	
	public static void closeBrowser()
    {
	driver.close();
	System.out.println("Chrome Browser Closed Successfully");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
