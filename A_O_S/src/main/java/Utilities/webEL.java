package Utilities;


	import org.openqa.selenium.By;

	public class webEL {
		
		
		
		
		// Overall elements which we need for all test cases
		
		public static By clickOnPlus=      By.xpath("//*[@id=\'productProperties\']/div[2]/e-sec-plus-minus/div/div[3]");
		public static By clickOnSave=      By.name("save_to_cart");
		public static By clickOnCart=      By.id("menuCart");
		public static By clickOnCheckOut=  By.name("check_out_btn");
		public static By clickNext=        By.id("next_btn");
		public static By masterCard=       By.name("masterCredit");
		public static By bankNum=          By.name("card_number");
		public static By bankCvv=          By.xpath("//*[@id=\'paymentMethod\']/div/div[4]/sec-form/div[1]/sec-view[2]/div/input");
		public static By bankExpireM=      By.name("mmListbox");
		public static By bankExpireY=      By.name("yyyyListbox");
		public static By bankFullName=     By.name("cardholder_name");
		public static By clickOnPay=       By.xpath("//*[@id=\'pay_now_btn_ManualPayment\']");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//T001_homePageValidation
		
		
		
		
		
		
		
		
		//Note: we used the below login components for all of our test classes except home page which we do not need it.
		//T002_login/logoutPageValidation
		
		public static By clickLoginBT=     By.id("menuUser");
		public static By sendID =          By.name("username");
		public static By sendPD =          By.name("password");
		public static By clickSginIN=      By.xpath("//*[@id=\'sign_in_btnundefined\']");
		public static By clickDropD=       By.id("menuUserLink");
		public static By clickLogOut=      By.xpath("//*[@id=\'loginMiniTitle\']/label[3]");
		
		
		
		
		
		
		//T003_Purchase Speakers Validation
		
		public static By speakersClick=    By.id("speakersImg");
		public static By clickOnBSBSIII=   By.xpath("//*[@id=\'20\']");
		public static By clickOnGray=      By.id("rabbit");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//T004_purchaseTabletsValidation
		public static By tabletsClick= By.id("tabletsImg");
		public static By clickOnHpElPad= By.xpath("//*[@id=\'16\']");
		//public static By clickOnPlus= By.xpath("//*[@id=\"productProperties\"]/div[2]/e-sec-plus-minus/div/div[3]");
		public static By clickOnPayA= By.name("pay_now_btn_MasterCredit");

		
		
		
		
		
		
		//T005_purchaseHeadphonesValidation
		public static By headphonesClick= By.id("headphonesImg");
		public static By clickOnBeatHp= By.xpath("//*[@id=\'15\']");
		
		
		
		
		
		
		
		//T006_purchaseMiceValidation
		public static By miceClick= By.id("miceImg");
		public static By clickOnHpMouse= By.xpath("//*[@id=\'30\']");
		
		
		
		
		
		
		
		
		
	    //T007_searchOptionValidation
		public static By clickOnSearch=    By.id("menuSearch");
		public static By loptopOpt=        By.xpath("//*[@id='mobileSlide']/ul/li[1]/div/div[1]/div/input");
		public static By headPhonesOpt=    By.xpath("//*[@id='mobileSlide']/ul/li[1]/div/div[2]/div/input");
		public static By tabletsOpt=       By.xpath("//*[@id='mobileSlide']/ul/li[1]/div/div[3]/div/input");
		public static By speakersOpt=      By.xpath("//*[@id='mobileSlide']/ul/li[1]/div/div[4]/div/input");
		public static By micesOpt=         By.xpath("//*[@id='mobileSlide']/ul/li[1]/div/div[5]/div/input");
		public static By priceRange=       By.xpath("//*[@id='slider']/div");
		public static By clearOpt=         By.xpath("//*[@id='mobileSlide']/label/label");
		public static By searchBar=        By.id("autoComplete");
		public static By clickOnCross=     By.xpath("//*[@id=\'search\']/div/div/img");
		
	
}
