package seleniumprograms;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWrite {

	public static void main(String[] args) throws Exception
	{
		File src = new File("D:\\Hashwanth\\Programs\\1.Java\\Mine\\Selenium\\Flipkart\\Mobile.xlsx");
		
		FileInputStream fis = new FileInputStream(src);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		XSSFSheet Sheet1 = wb.getSheetAt(0);
		
		Sheet1.createRow(0).createCell(0).setCellValue("Flipkart Project");
		//Sheet1.getRow(0).createCell(1).setCellValue("Flipkart@1234");
		
		FileOutputStream fout = new FileOutputStream(src);
		wb.write(fout);
		wb.close();
	}

}
