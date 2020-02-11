package interviewPrograms;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.server.handler.GetCurrentUrl;

public class Birlasoft {
	static ChromeOptions opt;
	static WebDriver driver;

	public static void main(String[] args) {
		opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver", "E:\\softwares\\hashwa\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver(opt);

		driver.get("https://www.myntra.com/women-kurtas-kurtis-suits");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		//	driver.findElement(By.xpath("//a[contains(text(),'Women')]")).click();
		//	driver.findElement(By.linkText("Kurtas & Suits")).click();
		String parent = driver.getWindowHandle();
		System.out.println(parent);

		driver.findElement(By.xpath("(//li[@class='product-base'])[1]")).click();
		driver.findElement(By.xpath("(//li[@class='product-base'])[2]")).click();
		driver.findElement(By.xpath("(//li[@class='product-base'])[3]")).click();
		driver.findElement(By.xpath("(//li[@class='product-base'])[4]")).click();

		Set<String> wh = driver.getWindowHandles();
		System.out.println(wh.size());
		System.out.println(wh.contains(parent));

		driver.switchTo().window(parent);
		System.out.println(parent);
		System.out.println("Set values are:   "+wh);

		List<String> list = new ArrayList<String>(wh);

		for (int i = 1; i < list.size(); i++) {
			driver.switchTo().window(list.get(i));
			System.out.println(list.get(i));
			driver.close();
			driver.switchTo().window(parent);
			System.out.println(parent);
		}
	}

}
