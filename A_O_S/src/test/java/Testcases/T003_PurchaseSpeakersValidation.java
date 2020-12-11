package Testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import Utilities.T003_purchaseSpeakersKeys;
import Utilities.constantValue;
import Utilities.readExcelData;

public class T003_PurchaseSpeakersValidation {
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@Test
	
	public static void speakersPageValidation() throws IOException, InterruptedException
	
	
	{
		
	
		String Epath= constantValue.excelPath;
	
		
readExcelData.readexcel(Epath,"purchaseSpeakersPage");
		
	
		 for (int i=1; i<=24; i++)
			
		{
			String keys=readExcelData.getcelldata(i, 3);
			
		

			
			if(keys.equals("openBrowser"))
			{
				T003_purchaseSpeakersKeys.openBrowser();
			}
			
	
			
			else if (keys.equals("openUrl"))
			{
				T003_purchaseSpeakersKeys.openUrl();
			}
			
			
			else if (keys.equals("clickLoginBT"))
			{
				T003_purchaseSpeakersKeys.clickLoginBT();
			}
			
			
			else if (keys.equals("sendID"))
			{
				T003_purchaseSpeakersKeys.sendID();
			}
			
			else if (keys.equals("sendPD"))
			{
				T003_purchaseSpeakersKeys.sendPD();
			}
			
			else if (keys.equals("clickSginIn"))
			{
				T003_purchaseSpeakersKeys.clickSginIn();
			}
			
			else if (keys.equals("speakersClick"))
			{
				T003_purchaseSpeakersKeys.speakersClick();
			}
			
			else if (keys.equals("clickOnBSBSIII"))
			{
				T003_purchaseSpeakersKeys.clickOnBSBSIII();
			}
			
			
			else if (keys.equals("clickOnGray"))
			{
				T003_purchaseSpeakersKeys.clickOnGray();
			}
			
			else if (keys.equals("clickOnPlus"))
			{
				T003_purchaseSpeakersKeys.clickOnPlus();
			}
			
			else if (keys.equals("clickOnSave"))
			{			
				T003_purchaseSpeakersKeys.clickOnSave();
			}
			
			else if (keys.equals("clickOnCart"))
			{
				T003_purchaseSpeakersKeys.clickOnCart();
			}
			
			else if (keys.equals("clickOnCheckOut"))
			{
				T003_purchaseSpeakersKeys.clickOnCheckOut();
			}
			
			else if (keys.equals("clickNext"))
			{
				T003_purchaseSpeakersKeys.clickNext();
			}
			
			else if (keys.equals("masterCard"))
			{
				T003_purchaseSpeakersKeys.masterCard();
			}
			
			else if (keys.equals("sendCardNum"))
			{
				T003_purchaseSpeakersKeys.sendCardNum();
			}
			
			else if (keys.equals("sendCvvNum"))
			{
				T003_purchaseSpeakersKeys.sendCvvNum();
			}
			
			else if (keys.equals("sendM"))
			{
				T003_purchaseSpeakersKeys.sendM();
			}
			
			else if (keys.equals("sendFullName"))
			{
				T003_purchaseSpeakersKeys.sendFullName();
			}
			
			else if (keys.equals("clickOnPay"))
			{
				T003_purchaseSpeakersKeys.clickOnPay();
			}
			

			else if (keys.equals("clickDropD"))
			{
				T003_purchaseSpeakersKeys.clickDropD();
			}
			
			else if (keys.equals("clickLogOut"))
			{
				T003_purchaseSpeakersKeys.clickLogOut();
			}

		
			else if (keys.equals("closeBrowser"))
			{
				T003_purchaseSpeakersKeys.closeBrowser();
			}
			
		}
		
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
