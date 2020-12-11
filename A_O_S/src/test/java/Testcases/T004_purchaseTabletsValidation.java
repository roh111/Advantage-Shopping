package Testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import Utilities.T004_purchaseTabletsKeys;
import Utilities.constantValue;
import Utilities.readExcelData;

public class T004_purchaseTabletsValidation {

	
	
	
	
@Test
	
	public static void tabletsPageValidation() throws IOException, InterruptedException
	
	
	{
		
	
		String Epath= constantValue.excelPath;
	
		
readExcelData.readexcel(Epath,"purchaseTabletsPage");
		
	
		 for (int i=1; i<=19; i++)
			
		{
			String keys=readExcelData.getcelldata(i, 3);
			
		

			
			if(keys.equals("openBrowser"))
			{
				T004_purchaseTabletsKeys.openBrowser();
			}
			
	
			
			else if (keys.equals("openUrl"))
			{
				T004_purchaseTabletsKeys.openUrl();
			}
			
			
			else if (keys.equals("clickLoginBT"))
			{
				T004_purchaseTabletsKeys.clickLoginBT();
			}
			
			
			else if (keys.equals("sendID"))
			{
				T004_purchaseTabletsKeys.sendID();
			}
			
			else if (keys.equals("sendPD"))
			{
				T004_purchaseTabletsKeys.sendPD();
			}
			
			else if (keys.equals("clickSginIn"))
			{
				T004_purchaseTabletsKeys.clickSginIn();
			}
			
			else if (keys.equals("tabletsClick"))
			{
				T004_purchaseTabletsKeys.tabletsClick();
			}
			
			else if (keys.equals("clickOnElpad"))
			{
				T004_purchaseTabletsKeys.clickOnElpad();
			}
			
			
			else if (keys.equals("clickOnPlus"))
			{
				T004_purchaseTabletsKeys.clickOnPlus();
			}
			
			else if (keys.equals("clickOnPlus1"))
			{
				T004_purchaseTabletsKeys.clickOnPlus1();
			}
			
			else if (keys.equals("clickOnPlus2"))
			{
				T004_purchaseTabletsKeys.clickOnPlus2();
			}
			
			
			else if (keys.equals("clickOnSave"))
			{			
				T004_purchaseTabletsKeys.clickOnSave();
			}
			
			else if (keys.equals("clickOnCart"))
			{
				T004_purchaseTabletsKeys.clickOnCart();
			}
			
			else if (keys.equals("clickOnCheckOut"))
			{
				T004_purchaseTabletsKeys.clickOnCheckOut();
			}
			
			else if (keys.equals("clickNext"))
			{
				T004_purchaseTabletsKeys.clickNext();
			}
			
			else if (keys.equals("clickOnPayA"))
			{
				T004_purchaseTabletsKeys.clickOnPayA();
			}
			

			else if (keys.equals("clickDropD"))
			{
				T004_purchaseTabletsKeys.clickDropD();
			}
			
			else if (keys.equals("clickLogOut"))
			{
				T004_purchaseTabletsKeys.clickLogOut();
			}

		
			else if (keys.equals("closeBrowser"))
			{
				T004_purchaseTabletsKeys.closeBrowser();
			}
			
		}
		
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
