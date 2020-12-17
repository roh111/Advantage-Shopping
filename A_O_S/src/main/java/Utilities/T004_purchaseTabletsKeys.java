package Utilities;


	import org.openqa.selenium.WebDriver;

	public class T004_purchaseTabletsKeys {
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
		    
		    
		    
		    
		public static void tabletsClick() throws InterruptedException
		{
		    driver.findElement(webEL.tabletsClick).click();
		    Thread.sleep(5000);
		}   
		
		
		    
		public static void clickOnElpad() throws InterruptedException
		{
		    driver.findElement(webEL.clickOnHpElPad).click();
		    Thread.sleep(3000);
		}   
		    
		
		    
		    
		public static void clickOnPlus() throws InterruptedException
		{
		    driver.findElement(webEL.clickOnPlus).click();
		    Thread.sleep(2000);
		}   
		    
		 
		
		
		public static void clickOnPlus1() throws InterruptedException
		{
		    driver.findElement(webEL.clickOnPlus).click();
		    Thread.sleep(2000);
		}
		
			
			
		    

		public static void clickOnPlus2()
		{
		    driver.findElement(webEL.clickOnPlus).click();
		}
		    
		    
		public static void clickOnSave()
		{
		    driver.findElement(webEL.clickOnSave).click();
		}   
		    
		    
		    
		public static void clickOnCart() throws InterruptedException
		{
		    driver.findElement(webEL.clickOnCart).click();
		    Thread.sleep(3000);
		}   
		    
		    
		public static void clickOnCheckOut() throws InterruptedException
		{
		    driver.findElement(webEL.clickOnCheckOut).click();
		    Thread.sleep(3000);
		}   
		    
		    
		public static void clickNext() throws InterruptedException
		{
		    driver.findElement(webEL.clickNext).click();
		    Thread.sleep(3000);
		}
		
		
		
		    
		public static void clickOnPayA() throws InterruptedException
		{
		    driver.findElement(webEL.clickOnPayA).click();
		    Thread.sleep(5000);
		}   
		    
		    
		
		public static void clickDropD()

		{
			driver.findElement(webEL.clickDropD).click();
		}		
			
			
		public static void clickLogOut() throws InterruptedException
		{
			driver.findElement(webEL.clickLogOut).click();
			Thread.sleep(5000);
		}	
			
			
			
			
		public static void closeBrowser()
		{
			driver.close();
		}   
		    


		

}
