package testNG;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class UtilClass 
{

	public static int total;
	
public static Object[][] getexceldata() throws Exception {
		
		File src=new File("D:\\Hashwanth\\Programs\\1.Java\\Mine\\Selenium\\TestNG\\Inputs.xlsx");
		FileInputStream fis=new FileInputStream(src);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet=wb.getSheetAt(0);
		total=sheet.getLastRowNum();
//		System.out.println(total);
		
		Object[][] data=new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
//		System.out.println(sheet.getLastRowNum()+"             "+sheet.getRow(0).getLastCellNum());
		
		
		
		
		//iterate the values and store in object array
		for(int i=0;i<sheet.getLastRowNum();i++) {
			for(int j=0;j<sheet.getRow(0).getLastCellNum();j++) {
				data[i][j]=sheet.getRow(i+1).getCell(j).toString();
//				System.out.println(data[i][j]);
			}
		}
		return data;
	}

}
