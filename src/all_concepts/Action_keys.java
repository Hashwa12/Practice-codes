package all_concepts;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class Action_keys {

	public static void main(String[] args) throws InterruptedException {
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\aathi\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
	
	Actions action = new Actions(driver);
	
	//enter username
	
	WebElement username=driver.findElement(By.id("identifierId"));
	action.sendKeys(username, "hashwanthrjn").perform();
	action.sendKeys(username, Keys.ENTER).perform();
	Thread.sleep(3000);

	//enter password
	
	WebElement password=driver.findElement(By.xpath("//input[@aria-label='Enter your password']"));
	action.sendKeys(password, "meenaaathith").perform();
	action.sendKeys(password, Keys.ENTER).perform();
	Thread.sleep(3000);
//	
	WebElement icon=driver.findElement(By.xpath("//a[@role='button' and @class='gb_x gb_Ea gb_f']"));
	icon.click();
//	Thread.sleep(3000);
//	
//	WebElement logoff=driver.findElement(By.id("gb_71"));
//	logoff.click();

	
	}

}
/*
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Action_keys {

public static void main(String[] args) throws InterruptedException {
//Set system property to firefox browser
System.setProperty("webdriver.chrome.driver", "C:\\Users\\aathi\\Downloads\\chromedriver_win32\\chromedriver.exe");
//Create reference for firefox driver
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
Actions act=new Actions(driver);
//Open a gmail web page using driver reference
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);//wait for 10sec to load page
driver.get("https://www.gmail.com");
try
{
//find username web element
WebElement username=driver.findElement(By.id("identifierId"));
act.sendKeys(username, "hashwanthrjn").perform();
act.sendKeys(username, Keys.ENTER).perform();
//find password input box
Thread.sleep(3000);
WebElement password=driver.findElement(By.xpath("//input[@aria-label='Enter your password']"));
password.sendKeys("meenaaathith");



WebElement nextbutton=driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/span/span"));
act.moveToElement(nextbutton).sendKeys(Keys.ENTER).perform();
Thread.sleep(15000);
//nextbutton.click();
WebElement send=driver.findElement(By.xpath("/html/body/div[7]/div[3]/div/div[2]/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div/div[1]/div[1]/div/div[5]/div/div/div[2]/span"));
send.click();

WebElement usericon=driver.findElement(By.xpath("/html/body/div[7]/div[3]/div/div[1]/div[4]/header/div[2]/div[3]/div/div[2]/div/a/span"));
//act.moveToElement(usericon).sendKeys(Keys.ENTER).perform();

usericon.click();
act.sendKeys(Keys.TAB).perform();
Thread.sleep(500);
act.sendKeys(Keys.TAB).perform();Thread.sleep(500);
act.sendKeys(Keys.TAB).perform();Thread.sleep(500);
act.sendKeys(Keys.TAB).perform();Thread.sleep(500);
act.sendKeys(Keys.TAB).perform();Thread.sleep(500);
Thread.sleep(500);
act.sendKeys(Keys.ENTER).perform();


driver.close();	
}	
catch(Exception e)
{
driver.close();
}
}

}

*/