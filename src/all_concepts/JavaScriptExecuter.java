package all_concepts;

import java.io.File;
import java.util.logging.FileHandler;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecuter {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "E:\\softwares\\hashwa\\Drivers\\chromedriver(2).exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://accounts.google.com/ServiceLogin/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=AddSession");
		
		driver.findElement(By.name("identifier")).sendKeys("hashwanthrjn");
		
		WebElement nextB1 = driver.findElement(By.xpath("//span[contains(text(),'Next')]"));
		
//		**************JAVASCRIPTEXECUTOR BORDER***************
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].style.border='3px solid red'", nextB1);
//		*************SCREENSHOT***********************
//		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//		FileHandler.copy(src,new File("E:\\softwares\\hashwa\\Drivers\\1.png"));
//		*************GENERATE ALERT************************
		js.executeScript("alert('problem occured')");
		Thread.sleep(3000);
//		***************ALERT HANDLING*********************
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
		Thread.sleep(3000);
//		*************CLICK USING JS**************************
		js.executeScript("arguments[0].click();", nextB1);
//		*************REFRESH USING JS*************************
		Thread.sleep(3000);
		js.executeScript("history.go(0)");
//		**************SCROLL********************
		Thread.sleep(3000);
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	}
}
