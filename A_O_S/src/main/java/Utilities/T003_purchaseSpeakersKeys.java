package Utilities;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;


public class T003_purchaseSpeakersKeys {
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
		
		
	public static void speakersClick() throws InterruptedException
	{
		driver.findElement(webEL.speakersClick).click();
		Thread.sleep(5000);
	}
	
	
	public static void clickOnBSBSIII() throws InterruptedException
	{
		driver.findElement(webEL.clickOnBSBSIII).click();
		Thread.sleep(5000);
	}
	
	public static void clickOnGray()
	{
		driver.findElement(webEL.clickOnGray).click();
	}
	
	public static void clickOnPlus()
	{
		driver.findElement(webEL.clickOnPlus).click();
	}
	
	
	public static void clickOnSave() throws InterruptedException
	{
		driver.findElement(webEL.clickOnSave).click();
		Thread.sleep(5000);
	}
	
	public static void clickOnCart()
	{
		driver.findElement(webEL.clickOnCart).click();
	}
	
	public static void clickOnCheckOut() throws InterruptedException
	{
		driver.findElement(webEL.clickOnCheckOut).click();
		Thread.sleep(5000);
	}
	
	
	
	public static void clickNext()
	{
		driver.findElement(webEL.clickNext).click();
	}
	
	
	public static void masterCard()
	{
		driver.findElement(webEL.masterCard).click();
	}
	
	
	public static void sendCardNum() throws InterruptedException
	{
		driver.findElement(webEL.bankNum).sendKeys(constantValue.bankNum);
		Thread.sleep(5000);
	}
	
	
	public static void sendCvvNum() throws InterruptedException
	{
		driver.findElement(webEL.bankCvv).sendKeys(constantValue.bankCvv);
		Thread.sleep(5000);
	}
	
	
	
	public static void sendM()
	{
		new Select (driver.findElement(webEL.bankExpireM)).selectByVisibleText(constantValue.bankExpireMM);
	}
	
	
	public static void sendY()
	{
		new Select (driver.findElement(webEL.bankExpireY)).selectByVisibleText(constantValue.bankExpireYYYY);
	}
	
	
	public static void sendFullName() throws InterruptedException
	{
		driver.findElement(webEL.bankFullName).sendKeys(constantValue.bankFName);
		Thread.sleep(3000);
	}
	
	
	public static void clickOnPay()
	{
		driver.findElement(webEL.clickOnPay).click();
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
