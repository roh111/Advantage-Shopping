package Testcases;


	import java.io.IOException;

	import org.testng.annotations.Test;

	import Utilities.T005_purchaseHeadphonesKeys;
	import Utilities.constantValue;
	import Utilities.readExcelData;

	public class T005_purchaseHeadphonesValidation {
		
		
		
		
		
		
		
		
	@Test
		
		public static void headphonesPageValidation() throws IOException, InterruptedException
		
		
		{
			
		
			String Epath= constantValue.excelPath;
		
			
	readExcelData.readexcel(Epath,"purchaseHeadphonesPage");
			
		
			 for (int i=1; i<=17; i++)
				
			{
				String keys=readExcelData.getcelldata(i, 3);
				
			

				
				if(keys.equals("openBrowser"))
				{
					T005_purchaseHeadphonesKeys.openBrowser();
				}
				
		
				
				else if (keys.equals("openUrl"))
				{
					T005_purchaseHeadphonesKeys.openUrl();
				}
				
				
				else if (keys.equals("clickLoginBT"))
				{
					T005_purchaseHeadphonesKeys.clickLoginBT();
				}
				
				
				else if (keys.equals("sendID"))
				{
					T005_purchaseHeadphonesKeys.sendID();
				}
				
				else if (keys.equals("sendPD"))
				{
					T005_purchaseHeadphonesKeys.sendPD();
				}
				
				else if (keys.equals("clickSginIn"))
				{
					T005_purchaseHeadphonesKeys.clickSginIn();
				}
				
				else if (keys.equals("headphonesClick"))
				{
					T005_purchaseHeadphonesKeys.headphonesClick();
				}
				
				else if (keys.equals("clickOnBeatHp"))
				{
					T005_purchaseHeadphonesKeys.clickOnBeatHp();
				}
				
				
				else if (keys.equals("clickOnPlus"))
				{
					T005_purchaseHeadphonesKeys.clickOnPlus();
				}
				
				
				else if (keys.equals("clickOnSave"))
				{			
					T005_purchaseHeadphonesKeys.clickOnSave();
				}
				
				else if (keys.equals("clickOnCart"))
				{
					T005_purchaseHeadphonesKeys.clickOnCart();
				}
				
				else if (keys.equals("clickOnCheckOut"))
				{
					T005_purchaseHeadphonesKeys.clickOnCheckOut();
				}
				
				else if (keys.equals("clickNext"))
				{
					T005_purchaseHeadphonesKeys.clickNext();
				}
				
				else if (keys.equals("clickOnPayA"))
				{
					T005_purchaseHeadphonesKeys.clickOnPayA();
				}
				

				else if (keys.equals("clickDropD"))
				{
					T005_purchaseHeadphonesKeys.clickDropD();
				}
				
				else if (keys.equals("clickLogOut"))
				{
					T005_purchaseHeadphonesKeys.clickLogOut();
				}

			
				else if (keys.equals("closeBrowser"))
				{
					T005_purchaseHeadphonesKeys.closeBrowser();
				}
				
			}
			
			
		}

		
		
		
		
		

	}

