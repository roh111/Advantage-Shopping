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
		
		
		
		public static void clickSginIn() throws InterruptedException 
		{
		    driver.findElement(webEL.clickSginIN).click();
		    Thread.sleep(3000);
		}
			
			
		
		
		public static void clickDropD() throws InterruptedException 
			
		{
			driver.findElement(webEL.clickDropD).click();
			Thread.sleep(3000);
		}
			
			
			
			
		public static void clickLogOut() 
		{
			driver.findElement(webEL.clickLogOut).click();
		}
		
		
		public static void closeBrowser()
		{
			//driver.close();
		}

}
