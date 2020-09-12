package seleniumprograms;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver",
				"E:\\softwares\\hashwa\\Drivers\\chromedriver_win32(2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		List<WebElement> list = driver.findElements(By.tagName("a"));
		for(WebElement e : list)
		{
			String ele = e.getAttribute("href");
			verifyLink(ele);
		}
	}
	
	public static void verifyLink(String s) throws IOException {
		URL url = new URL(s);
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		conn.setConnectTimeout(3000);
		conn.connect();
		if((conn.getResponseCode()==200))
		{
			System.out.println("OK"+s+" - "+conn.getResponseMessage());
		}
		else if(conn.getResponseCode()==HttpURLConnection.HTTP_NOT_FOUND)
			System.out.println("NOT OK"+s+" - "+conn.getResponseMessage());
	}

}
