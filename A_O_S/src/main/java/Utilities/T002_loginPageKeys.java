package Utilities;


	import org.openqa.selenium.WebDriver;

	public class T002_loginPageKeys {
	public static WebDriver driver;
		
		
		

		public static void openBrowser() throws InterruptedException 
		{
			driver=browserEngine.browser();
			Thread.sleep(5000);
		}
		
		
		
		public static void openUrl() throws InterruptedException 
		{
			driver.get(constantValue.URL);
			Thread.sleep(5000);
		}
		
		
		
		public static void clickLoginBT() 
		{
			driver.findElement(webEL.clickLoginBT).click();
		}
		
		
		
		
		
		public static void sendID() throws InterruptedException 
		{
			driver.findElement(webEL.sendID).sendKeys(constantValue.ID);
			Thread.sleep(5000);
		}
		
		
		
		public static void sendPD() 
		{
		    driver.findElement(webEL.sendPD).sendKeys(constantValue.PWD);
		}
		
		
		
		public static void clickSginIn() 
		{
		    driver.findElement(webEL.clickSginIN).click();
		}
			
			
		
		
		public static void clickDropD() 
			
		{
			driver.findElement(webEL.clickDropD).click();
		}
			
			
			
			
		public static void clickLogOut() 
		{
			driver.findElement(webEL.clickLogOut).click();
		}
		
		
		public static void closeBrowser()
		{
			driver.close();
		}

}
