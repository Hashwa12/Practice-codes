package seleniumprograms;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReadWrite {

	public static void main(String[] args) throws Exception
	{
//		File src = new File("D:\\Hashwanth\\Programs\\1.Java\\Mine\\Selenium\\readWrite\\Selenium_read_write.xlsx");
//		
//		FileInputStream fis = new FileInputStream(src);
//		
//		@SuppressWarnings("resource")
//		XSSFWorkbook wb = new XSSFWorkbook(fis);
//		
//		XSSFSheet Sheet1 = wb.getSheetAt(0);
//		
//		int length = Sheet1.getLastRowNum();
//		int first = Sheet1.getFirstRowNum();
//		System.out.println(length+"      next is    "+first);
//		for (int j=0, i = first; i <= length; i++)
//		{
//			if(j==0)
//			{
//				String data0 = Sheet1.getRow(i).getCell(j).getStringCellValue();	
//				System.out.print(data0);
//				j=1;
//			}
//			System.out.print("\t");
//			if(j==1) {
//				String data0 = Sheet1.getRow(i).getCell(j).getStringCellValue();	
//				System.out.println(data0);
//				j=0;
//			}
//			
//		}
////		wb.close();
		File src = new File("D:\\Hashwanth\\Programs\\1.Java\\Mine\\Selenium\\Flipkart\\POM\\Read\\Login.xlsx");
		FileInputStream fip = new FileInputStream(src);
		@SuppressWarnings("resource")
		XSSFWorkbook wb = new XSSFWorkbook(fip);
		XSSFSheet sheet1 = wb.getSheetAt(0);
		DataFormatter formatter = new DataFormatter();
		String val = formatter.formatCellValue(sheet1.getRow(0).getCell(1));
		System.out.println(val);
	}

}
