package Utilities;

import org.openqa.selenium.WebDriver;

public class T007_searchOptionKeys {
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
	
	
	
		
		public static void clickOnSearch() throws InterruptedException
		{
		driver.findElement(webEL.clickOnSearch).click();
		Thread.sleep(3000);
		}
		
		
		public static void clickOnSearch1() throws InterruptedException
		{
		driver.findElement(webEL.clickOnSearch).click();
		Thread.sleep(3000);
		}
		
		
		public static void loptopOpt() throws InterruptedException
		{
		driver.findElement(webEL.loptopOpt).click();
		Thread.sleep(2000);
		}
		
		
		public static void headphonesOpt() throws InterruptedException
		{
		driver.findElement(webEL.headPhonesOpt).click();
		Thread.sleep(2000);
		}
		
		
		public static void tabletsOpt() throws InterruptedException
		{
		driver.findElement(webEL.tabletsOpt).click();
		Thread.sleep(2000);
		}
		
		
		public static void speakersOpt() throws InterruptedException
		{
		driver.findElement(webEL.speakersOpt).click();
		Thread.sleep(2000);
		}
		
		
		public static void micesOpt() throws InterruptedException
		{
		driver.findElement(webEL.micesOpt).click();
		Thread.sleep(2000);
		}
		
		
		
		public static void priceRange() throws InterruptedException
		{
		driver.findElement(webEL.priceRange).click();
		Thread.sleep(2000);
		}
		
		
		public static void clearOpt() throws InterruptedException
		{
		driver.findElement(webEL.clearOpt).click();
		Thread.sleep(3000);
		}
		
		
		public static void searchBar()
		{
		driver.findElement(webEL.searchBar).click();
		}
		
		public static void searchBar1() throws InterruptedException
		{
		driver.findElement(webEL.searchBar).sendKeys(constantValue.LP);
		Thread.sleep(3000);
		}
		
		public static void clickOnSearch2() throws InterruptedException
		{
		driver.findElement(webEL.clickOnSearch).click();
		Thread.sleep(3000);
		}
		
		public static void clickOnCross() throws InterruptedException
		{
		driver.findElement(webEL.clickOnCross).click();
		Thread.sleep(3000);
		System.out.println("T007_Search Page validated Successfully");
		logCollector.debug("T007_Search Page validated Successfully");
		}
		
		
		
		public static void closeBrowser()
		{	
		driver.close();
		}
	
}
	
