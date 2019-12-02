package seleniumprograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTables {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\softwares\\hashwa\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        
        driver.get("https://www.livechennai.com/gold_silverrate.asp");
        
        driver.manage().window().maximize();
        
//***********************GET ROW COUNT
        List<WebElement> rows = driver.findElements(By.xpath("/html/body/div[2]/div[1]/table/tbody/tr/td/div[2]/table[1]/tbody/tr"));
        int rowsnumber = rows.size();
        System.out.println("Total rows in this table is : " + rowsnumber);
        
//*********************GET COLUMN COUNT      
        List<WebElement> cols = rows.get(3).findElements(By.tagName("td"));
        int columnNumber = cols.size();
        System.out.println("Total columns in this table is : " + columnNumber+"\n");
        
        String firstxpath = "/html/body/div[2]/div[1]/table/tbody/tr/td/div[2]/table[1]/tbody/tr[";
        String secondxpath = "]/td[";
        String thirdxpath = "]/font";
        String headerfirst = "/html/body/div[2]/div[1]/table/tbody/tr/td/div[2]/table[1]/tbody/tr[1]/td[";
        String headersecond = "]/span";
        String header1first = "/html/body/div[2]/div[1]/table/tbody/tr/td/div[2]/table[1]/tbody/tr[2]/td[";
        String header1second = "]/span";
        
//***************************PRINT FIRST HEADER ROW OF TABLE        
        for(int i=1;i<4;i++)
        {
        	String headerfinal = headerfirst+i+headersecond;
        	WebElement headerElement = driver.findElement(By.xpath(headerfinal));
        	switch (i) {
        	//case 1: System.out.print("");
			case 2: System.out.print(" \t\t");			}
        	System.out.print(" "+headerElement.getText());
        	System.out.print("\t");
        }

        System.out.println("");        

//*************************PRINT SECOND HEADER ROW OF TABLE        
        for(int i=1;i<5;i++)
        {
        	String header1final = header1first+i+header1second;
        	WebElement header1Element = driver.findElement(By.xpath(header1final));
        	switch (i)
        	{
        		case 1: System.out.print(" \t\t\t");
        	}
        	System.out.print("  "+header1Element.getText());
        	System.out.print("\t");
        }
        
        System.out.println("");
        
//**************************PRINT ALL ELEMENTS IN BODY OF THE TABLE              
        for(int i=3;i<=rowsnumber;i++)
        {
        	for(int j=1;j<=5;j++)
        	{
        		String actualxpath1 = firstxpath+i+secondxpath+j+thirdxpath;
                WebElement element1 = driver.findElement(By.xpath(actualxpath1));
                System.out.print(element1.getText());
                System.out.print("\t");
             }
        	System.out.println("");
        }
        driver.quit();
	}
}
