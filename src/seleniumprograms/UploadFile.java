package seleniumprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFile {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\softwares\\hashwa\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://softwaretestingplace.blogspot.com/2015/10/sample-web-page-to-test.html");
		
		WebElement ele = driver.findElement(By.xpath("//input[@id='uploadfile']"));
		
		ele.sendKeys("D:\\Hashwanth\\Programs\\1.Java\\Mine\\Test.txt");

	}

}
