package seleniumprograms;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsHandling {

	public static void main(String[] args) throws InterruptedException {
		
		 System.setProperty("webdriver.chrome.driver", "E:\\softwares\\hashwa\\Drivers\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("http://www.leafground.com/pages/Alert.html");
			
			driver.findElement(By.xpath("//button[contains(text(),'Alert Box')]")).click();
			
			Alert alert = driver.switchTo().alert();
			Thread.sleep(1000);
			alert.accept();
			
			driver.findElement(By.xpath("//button[contains(text(),'Confirm Box')]")).click();
			driver.switchTo().alert();
			Thread.sleep(1000);
			alert.dismiss();
			
			driver.findElement(By.xpath("//button[contains(text(),'Prompt Box')]")).click();
			driver.switchTo().alert();
			Thread.sleep(1000);
			alert.sendKeys("Hashwanth");
			Thread.sleep(1000);
			alert.accept();
			
	}

}
