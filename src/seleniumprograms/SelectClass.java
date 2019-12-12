package seleniumprograms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SelectClass {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "E:\\softwares\\hashwa\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.toolsqa.com/iframe-practice-page/");
		driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
//		driver.switchTo().frame(1);
////		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[1]/aside[1]/ul/li[5]/a")).click();
//		
//		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,1000)");
//		
//		driver.switchTo().defaultContent();
//		driver.switchTo().frame("IF1");
//		String str = driver.findElement(By.xpath("//div[@id='page']//a[contains(text(),'Skip to content')]")).getText();
//		System.out.println(str);
//		driver.switchTo().defaultContent();

		WebElement ele = driver.findElement(By.xpath("//select[@id='select-demo']"));
		Select sel = new Select(ele);
		sel.selectByIndex(1);
//		driver.quit();
	}

}
