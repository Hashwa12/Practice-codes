package seleniumprograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenImage {

	public static void main(String[] args) {

		 System.setProperty("webdriver.chrome.driver", "E:\\softwares\\hashwa\\Drivers\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("http://www.leafground.com/pages/Image.html");
			
			List<WebElement> links = driver.findElements(By.tagName("img"));

	}

}
