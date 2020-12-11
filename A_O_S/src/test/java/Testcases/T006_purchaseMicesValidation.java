package Testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import Utilities.T006_purchaseMiceKeys;
import Utilities.constantValue;
import Utilities.readExcelData;

public class T006_purchaseMicesValidation {
	
	
	
	
	
	
	
	
	
	
	
	
@Test
	
	public static void micesPageValidation() throws IOException, InterruptedException
	
	
	{
		
	
		String Epath= constantValue.excelPath;
	
		
readExcelData.readexcel(Epath,"purchaseMicePage");
		
	
		 for (int i=1; i<=17; i++)
			
		{
			String keys=readExcelData.getcelldata(i, 3);
			
		

			
			if(keys.equals("openBrowser"))
			{
				T006_purchaseMiceKeys.openBrowser();
			}
			
	
			
			else if (keys.equals("openUrl"))
			{
				T006_purchaseMiceKeys.openUrl();
			}
			
			
			else if (keys.equals("clickLoginBT"))
			{
				T006_purchaseMiceKeys.clickLoginBT();
			}
			
			
			else if (keys.equals("sendID"))
			{
				T006_purchaseMiceKeys.sendID();
			}
			
			else if (keys.equals("sendPD"))
			{
				T006_purchaseMiceKeys.sendPD();
			}
			
			else if (keys.equals("clickSginIn"))
			{
				T006_purchaseMiceKeys.clickSginIn();
			}
			
			else if (keys.equals("miceClick"))
			{
				T006_purchaseMiceKeys.miceClick();
			}
			
			else if (keys.equals("clickOnHpMouse"))
			{
				T006_purchaseMiceKeys.clickOnHpMouse();
			}
			
			
			else if (keys.equals("clickOnPlus"))
			{
				T006_purchaseMiceKeys.clickOnPlus();
			}
			
			
			else if (keys.equals("clickOnSave"))
			{			
				T006_purchaseMiceKeys.clickOnSave();
			}
			
			else if (keys.equals("clickOnCart"))
			{
				T006_purchaseMiceKeys.clickOnCart();
			}
			
			else if (keys.equals("clickOnCheckOut"))
			{
				T006_purchaseMiceKeys.clickOnCheckOut();
			}
			
			else if (keys.equals("clickNext"))
			{
				T006_purchaseMiceKeys.clickNext();
			}
			
			else if (keys.equals("clickOnPayA"))
			{
				T006_purchaseMiceKeys.clickOnPayA();
			}
			

			else if (keys.equals("clickDropD"))
			{
				T006_purchaseMiceKeys.clickDropD();
			}
			
			else if (keys.equals("clickLogOut"))
			{
				T006_purchaseMiceKeys.clickLogOut();
			}

		
			else if (keys.equals("closeBrowser"))
			{
				T006_purchaseMiceKeys.closeBrowser();
			}
			
		}
		
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
