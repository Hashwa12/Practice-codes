package seleniumprograms;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RobotClass {

	static WebDriver driver;
	public static void main(String[] args) throws AWTException, InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "E:\\softwares\\hashwa\\Drivers\\chromedriver_win32(2)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https:/google.com");
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("window.open()");
		js.executeScript("window.open()");
		js.executeScript("window.open()");
		
		Robot robo = new Robot();
		robo.keyPress(KeyEvent.VK_CONTROL);
		robo.keyPress(KeyEvent.VK_2);
		robo.keyRelease(KeyEvent.VK_2);
		robo.keyPress(KeyEvent.VK_W);
	}

}
