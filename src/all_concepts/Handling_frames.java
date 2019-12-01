package all_concepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Handling_frames {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\softwares\\hashwa\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        
        driver.get("http://mrbool.com/");
        
        Actions action=new Actions(driver);
        driver.manage().window().maximize();
         
        action.moveToElement(driver.findElement(By.className("menulink"))).build().perform();
       // Thread.sleep(3000);
       driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.findElement(By.xpath("//ul[@class='submenu']//li//a[contains(text(),'Articles')]")).click();
		/*
		 * driver.get("https://www.flipkart.com"); driver.manage().window().maximize();
		 * driver.findElement(By.xpath("//input[@class='_2zrpKA _1dBPDZ']")).sendKeys(
		 * "8122103121");
		 * driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		 * driver.findElement(By.xpath("//input[@class='_2zrpKA _3v41xv _1dBPDZ']")).
		 * sendKeys("Flipkart@1234");
		 * driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		 * 
		 * Actions action = new Actions(driver); action.sendKeys(Keys.ENTER).perform();
		 * driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		 * 
		 * action.moveToElement(driver.findElement(By.
		 * xpath("//li[@class='Wbt_B2 _1YVU3_']//span[contains(text(),'Men')]"))).build(
		 * ).perform();
		 */   	}

}
