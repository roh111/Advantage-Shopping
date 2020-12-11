package Testcases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;


import Utilities.T002_loginPageKeys;
import Utilities.constantValue;
import Utilities.readExcelData;

public class T002_loginPageValidation {
	
	
	
	
	
	
public static WebDriver driver;
	
	@Test
	
	public static void loginPageValidation() throws IOException, InterruptedException
	
	
	{
		
	
		String Epath= constantValue.excelPath;
	
		
readExcelData.readexcel(Epath,"loginPage");
		
	
		 for (int i=1; i<=9; i++)
			
		{
			String keys=readExcelData.getcelldata(i, 3);
			
		

			
			if(keys.equals("openBrowser"))
			{
				T002_loginPageKeys.openBrowser();
			}
			
	
			
			else if (keys.equals("openUrl"))
			{
				T002_loginPageKeys.openUrl();
			}
			
			
			else if (keys.equals("clickLoginBT"))
			{
				T002_loginPageKeys.clickLoginBT();
			}
			
			
			else if (keys.equals("sendID"))
			{
				T002_loginPageKeys.sendID();
			}
			
			else if (keys.equals("sendPD"))
			{
				T002_loginPageKeys.sendPD();
			}
			
			else if (keys.equals("clickSginIn"))
			{
				T002_loginPageKeys.clickSginIn();
			}
			
			else if (keys.equals("clickDropD"))
			{
				T002_loginPageKeys.clickDropD();
			}
			
			else if (keys.equals("clickLogOut"))
			{
				T002_loginPageKeys.clickLogOut();
			}

		
			else if (keys.equals("closeBrowser"))
			{
				T002_loginPageKeys.closeBrowser();
			}
			
		}
		
		
	}

}
	
	
	
	
