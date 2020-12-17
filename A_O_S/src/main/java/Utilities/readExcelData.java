package Utilities;

	import java.io.FileInputStream;
	import java.io.IOException;

	import org.apache.poi.xssf.usermodel.XSSFCell;
	import org.apache.poi.xssf.usermodel.XSSFRow;
	import org.apache.poi.xssf.usermodel.XSSFSheet;
	import org.apache.poi.xssf.usermodel.XSSFWorkbook;
	import org.openqa.selenium.WebDriver;

	public class readExcelData {
		
			public static WebDriver driver;
			public static XSSFWorkbook workbook;
			public static XSSFSheet worksheet;
			public static XSSFRow row;
			public static XSSFCell cell;
			
			
			
			public static String readexcel(String path, String SheetName) throws IOException
			
			{

			FileInputStream roh=new FileInputStream (path);
			
			workbook=new XSSFWorkbook(roh);
			
			worksheet=workbook.getSheet(SheetName);
			return SheetName;
			}
			
			
			public static String getcelldata(int rownum, int colnum)
			
			{
			cell=worksheet.getRow(rownum).getCell(colnum);
			String celldata=cell.getStringCellValue();
			return celldata;
			}
			
	
		
		
		
		
		
		
		
		
		



}
