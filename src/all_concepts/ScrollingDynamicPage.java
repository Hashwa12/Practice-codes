package all_concepts;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingDynamicPage {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "E:\\softwares\\hashwa\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.cricbuzz.com/cricket-schedule/upcoming-series/all");

		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		try {
		    long lastHeight=((Number)js.executeScript("return document.body.scrollHeight")).longValue();
		    while (true) {
		        js.executeScript("window.scrollBy(0,2000)","");
		        Thread.sleep(2000);

		        long newHeight = ((Number)js.executeScript("return document.body.scrollHeight")).longValue();
		        if (newHeight == lastHeight) {
		            break;
		        }
		        lastHeight = newHeight;
		    }
		} catch (InterruptedException e) {
		    e.printStackTrace();
		}
		
		System.out.println("Scrolling completed...");

	}

}
