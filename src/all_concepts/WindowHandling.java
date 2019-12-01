package all_concepts;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class WindowHandling {

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\softwares\\hashwa\\Drivers\\chromedriver(2).exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.naukri.com/");
		String parent = driver.getWindowHandle();
		Set<String> set = driver.getWindowHandles();
		
		Iterator<String> itr = set.iterator();
		
		while (itr.hasNext())
		{
			String child = itr.next();
			if(!parent.equals(child))
			{
				driver.switchTo().window(child);
				driver.close();
			}
		}
		driver.switchTo().window(parent);
		
		try {
			Alert alert = driver.switchTo().alert();
			alert.dismiss();
		} catch (Exception NoAlertPresentException) {
			// TODO Auto-generated catch block
			NoAlertPresentException.printStackTrace();
		}
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("E:\\softwares\\hashwa\\Drivers\\1.jpeg");
		Files.copy(source, destination);
		
		
		driver.quit();
	}

}
