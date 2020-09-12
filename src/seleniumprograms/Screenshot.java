package seleniumprograms;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Screenshot {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "E:\\softwares\\hashwa\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		SimpleDateFormat date = new SimpleDateFormat("hh:mm:ss");
		date.setTimeZone(TimeZone.getTimeZone("GMT"));
		String str = date.format(new Date()).replaceAll(":", "_");
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File des = new File(System.getProperty("user.dir") + "/screenshots/" + str + ".png");
		
		Files.copy(src, des);
	}
}
