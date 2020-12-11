package Testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import Utilities.T007_searchOptionKeys;
import Utilities.constantValue;
import Utilities.readExcelData;

public class T007_searchOptionsValidation {
	
	
	
	@Test
public static void searchPageValidation() throws IOException, InterruptedException
	
	
	{
		
	
		String Epath= constantValue.excelPath;
	
		
readExcelData.readexcel(Epath,"searchPage");
		
	
		 for (int i=1; i<=16; i++)
			
		{
			String keys=readExcelData.getcelldata(i, 3);
			
		

			
			if(keys.equals("openBrowser"))
			{
				T007_searchOptionKeys.openBrowser();
			}
			
	
			
			else if (keys.equals("openUrl"))
			{
				T007_searchOptionKeys.openUrl();
			}
			
			
			else if (keys.equals("clickOnSearch"))
			{
				T007_searchOptionKeys.clickOnSearch();
			}
			
			
			else if (keys.equals("clickOnSearch1"))
			{
				T007_searchOptionKeys.clickOnSearch1();
			}
			
			else if (keys.equals("loptopOpt"))
			{
				T007_searchOptionKeys.loptopOpt();
			}
			
			else if (keys.equals("headphonesOpt"))
			{
				T007_searchOptionKeys.headphonesOpt();
			}
			
			else if (keys.equals("tabletsOpt"))
			{
				T007_searchOptionKeys.tabletsOpt();
			}
			
			else if (keys.equals("speakersOpt"))
			{
				T007_searchOptionKeys.speakersOpt();
			}
			
			
			else if (keys.equals("micesOpt"))
			{
				T007_searchOptionKeys.micesOpt();
			}
			
			
			else if (keys.equals("priceRange"))
			{			
				T007_searchOptionKeys.priceRange();
			}
			
			else if (keys.equals("clearOpt"))
			{
				T007_searchOptionKeys.clearOpt();
			}
			
			else if (keys.equals("searchBar"))
			{
				T007_searchOptionKeys.searchBar();
			}
			
			else if (keys.equals("searchBar1"))
			{
				T007_searchOptionKeys.searchBar1();
			}
			
			else if (keys.equals("clickOnSearch2"))
			{
				T007_searchOptionKeys.clickOnSearch2();
			}
			

			else if (keys.equals("clickOnCross"))
			{
				T007_searchOptionKeys.clickOnCross();
			}
			
		
			else if (keys.equals("closeBrowser"))
			{
				T007_searchOptionKeys.closeBrowser();
			}
			
		}
		
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
