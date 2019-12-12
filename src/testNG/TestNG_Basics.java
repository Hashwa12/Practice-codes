package testNG;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.junit.internal.runners.statements.Fail;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.internal.thread.ThreadTimeoutException;

@Listeners(testNG.ListenersTestNG.class)

public class TestNG_Basics 
{
	
//	WebDriver driver;
//	@BeforeMethod
//	public void SetUp()
//	{
//		System.setProperty("webdriver.chrome.driver", "E:\\softwares\\hashwa\\Drivers\\chromedriver.exe");
//		driver = new ChromeDriver();
//		driver.get("https://reg.ebay.com/reg/PartialReg?usage=2943&ru=&rv4=1");
//		driver.manage().deleteAllCookies();
//		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//	}
	
//	@DataProvider
//	public Object[][] getdata() throws Exception
//	{
//		Object[][] data = UtilClass.getexceldata();
////		System.out.println("dataprovider values      "+data[0]);
//		return data;
//	}
		
	
	
//	@Test(dataProvider = "getdata",priority = 2)
//	public void ebayUserPassword(String firstname, String lastname, String email, String password)
//	{
//		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys(firstname);
//		
//		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys(lastname);
//		
//		driver.findElement(By.xpath("//input[@name='email']")).sendKeys(email);
//		
//		driver.findElement(By.xpath("//input[@name='PASSWORD']")).sendKeys(password);
//		
//		System.out.println(firstname+"       "+lastname+"      "+email+"         "+password);
//	}
//	
	@Test(priority = 1)
	public void skiptest()
	{
		System.out.println("I wanna skip this test");
		throw new SkipException("This method is not ready yet!!!");
	}
	
	@Test(priority = 3)
	public void print()
	{
		System.out.println("I wanna print this test");
//		throw new SkipException("This method is not ready yet!!!");
	}
	
	@Test(priority = 0)
	public void Fail()
	{
		assertEquals(false, true, "Expected not achieved");
	}
	
	
//	@AfterMethod
//	public void teardown()
//	{
//		driver.quit();
//	}
}
