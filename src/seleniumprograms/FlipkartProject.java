package seleniumprograms;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.interactions.ClickAction;

public class FlipkartProject {

	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) throws InterruptedException, Exception
	{
		System.setProperty("webdriver.chrome.driver", "E:\\softwares\\hashwa\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        
        driver.get("https://www.flipkart.com/");
        
        driver.manage().window().maximize();
        
        Actions action = new Actions(driver);
        
        File src = new File("D:\\Hashwanth\\Programs\\1.Java\\Mine\\Selenium\\Flipkart\\Mobile.xlsx");
		
		FileInputStream fis = new FileInputStream(src);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		XSSFSheet Sheet1 = wb.getSheetAt(0);
		
		FileOutputStream fout = new FileOutputStream(src);
		Sheet1.createRow(0).createCell(0).setCellValue("S.No");
		Sheet1.getRow(0).createCell(1).setCellValue("Model Name");
		Sheet1.getRow(0).createCell(2).setCellValue("Price");
		Sheet1.getRow(0).createCell(3).setCellValue("Discount");
		Sheet1.getRow(0).createCell(4).setCellValue("Description");
        
        
//*******************************ENTER USER-ID
        driver.findElement(By.xpath("//input[@class='_2zrpKA _1dBPDZ']")).sendKeys("8122103121");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        
//*******************************ENTER PASSWORD
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Flipkart@1234");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        
        action.sendKeys(Keys.ENTER).perform();
        Thread.sleep(3000);
        
//*******************************CLICK ELECTRONICS TAB
        WebElement ele = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/ul/li[1]/span"));
        action.moveToElement(ele).perform();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        
//******************************CLICK REALME in MOBILE SECTION
        driver.findElement(By.xpath("//a[@title='Realme']")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        
//***************************GET TOTAL MODELS 
        List<WebElement> ModelsList = driver.findElements(By.xpath("//div[@class='_3wU53n']"));
        int TotalModels=ModelsList.size();
        System.out.println("Total Models in this page is :"+TotalModels);
        

//****************************GET MODEL NAME
        String BeforemodelXpath="(//div[@class='_3wU53n'])[";
        String AftermodelXpath="]";
        
//****************************GET MODEL PRICE
        String BeforeModelPrice = "(//div[@class='_1vC4OE _2rQ-NK'])[";
       // String BeforeModelPrice = "(//div[@class='_1vC4OE _2rQ-NK'])
        String AfterModelPrice = "]";

        for(int i=1;i<=TotalModels;i++)
        {
        	int cell=0;
        	String click=BeforemodelXpath+i+AftermodelXpath;
        	String Model = driver.findElement(By.xpath(click)).getText();
        	String FinalModelPrice = BeforeModelPrice+i+AfterModelPrice;
        	String Price = driver.findElement(By.xpath(FinalModelPrice)).getText();
        	//System.out.println(i+"\t"+Model+"\t"+Price);
        	
        		Sheet1.createRow(i).createCell(cell).setCellValue(i);
        		cell++;
				Sheet1.getRow(i).createCell(cell).setCellValue(Model);
				cell++;
				Sheet1.getRow(i).createCell(cell).setCellValue(Price);
				cell++;
			
			driver.findElement(By.xpath(click)).click();
        	//Thread.sleep(3000);
        	
//**************************SWITCH TO NEXT WINDOW        	
        	
        	String parentTab = driver.getWindowHandle();
        	
        	Set<String> childTab = driver.getWindowHandles();
        	
        	for (String Tab : childTab) {
        		if(!(childTab.equals(parentTab)))
        		{
        			driver.switchTo().window(Tab);
        		}
			}
        	
//*************************GET PRODUCT DESCRIPTION                     	
        	Thread.sleep(5000);
//        	driver.findElement(By.xpath("//button[@class='_2AkmmA _12Zoxi']")).click();
  //      	Thread.sleep(3000);
            List<WebElement> descriptionRows=driver.findElements(By.xpath("((//div[@class=\"bhgxx2 col-12-12\"])[12]/div)"));
            int rows=descriptionRows.size();
            System.out.println(rows);
            Thread.sleep(3000);
                        
            List<WebElement> discountCount = driver.findElements(By.xpath("//div[@class='_1uv9Cb']//div"));
            int discCount = discountCount.size();
            driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
            if(discCount>1)
            {
            	String discount = driver.findElement(By.xpath("//div[@class='_1uv9Cb']//div[@class='VGWI6T _1iCvwn']/span")).getText();
				Sheet1.getRow(i).createCell(cell).setCellValue(discount);
				cell++;
			}
            else {
            	String Nodiscount = "Nil";
				Sheet1.getRow(i).createCell(cell).setCellValue(Nodiscount);
				cell++;
			}
            
            if(rows>1)
            {
            	driver.findElement(By.xpath("//button[@class='_2AkmmA _12Zoxi']")).click();
            	driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
            	String desTitleXpath1="(//div[@class='_2THx53'])[";
                String desTitleXpath2="]";
                String desXpath1="(//div[@class='_1aK10F']//p)[";
                String desXpath2="]";
                
                for(int x=1;x<rows;x++)
                {
                	String desTitleXpathfinal = desTitleXpath1+x+desTitleXpath2;
                	String desXpathFinal = desXpath1+x+desXpath2;
                	String descriptionTitle = driver.findElement(By.xpath(desTitleXpathfinal)).getText();
                	driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
                	String description = driver.findElement(By.xpath(desXpathFinal)).getText();
                	driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
                	String FinalDescription = descriptionTitle+":- "+description;
                	Sheet1.getRow(i).createCell(cell).setCellValue(FinalDescription);
                	cell++;
                }
                
            }
            else {
            	Sheet1.getRow(i).createCell(cell).setCellValue("Nil");
            	cell++;
            }
            
          System.out.println("\n\n\n");
            driver.close();
            
            //Set<String> childTab = driver.getWindowHandles();
//********************************SWITCH TO MAIN WINDOW        	
        	for (String Tab : childTab) {
        		//if(!(childTab.equals(parentTab)))
        		{
        			driver.switchTo().window(Tab);
        			break;
        		}
			}
        	Thread.sleep(3000);
            
//          ArrayList<String> tabs = new ArrayList<>(childTab);
//            
//          driver.switchTo().window(tabs.get(0));
//          Thread.sleep(3000);
            }
        wb.write(fout);
		wb.close();
		driver.quit();
  	}

        }
