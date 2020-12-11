package Testcases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Utilities.T001_homePageKeys;
import Utilities.constantValue;
import Utilities.readExcelData;

public class T001_homePageValidation {

	
	
	
public static WebDriver driver;
	
	@Test
	
	public static void homePageValidation() throws IOException, InterruptedException
	
	
	{
		
	
		String Epath= constantValue.excelPath;
	
		
readExcelData.readexcel(Epath,"homePage");
		
	
		 for (int i=1; i<=4; i++)
			
		{
			String keys=readExcelData.getcelldata(i, 3);
			
		

			
			if(keys.equals("openBrowser"))
			{
				T001_homePageKeys.openBrowser();
			}
			
	
			
			else if (keys.equals("openUrl"))
			{
				T001_homePageKeys.openUrl();
			}
			
			
			else if (keys.equals("checkTitle"))
			{
				T001_homePageKeys.checkTitle();
			}
			
			
			
			else if (keys.equals("closeBrowser"))
			{
				T001_homePageKeys.closeBrowser();
			}
			
		}
		
		
	}

}
	
	
	
	
	
	

