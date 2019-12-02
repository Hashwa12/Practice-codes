package seleniumprograms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class gmail {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\softwares\\hashwa\\Drivers\\chromedriver.exe");//Locate path from local system
        WebDriver driver = new ChromeDriver();//create object
        //home page of gmail
        driver.get("https://accounts.google.com/ServiceLogin/signinchooser?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
        driver.manage().window().maximize();//maximizing window
        driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys("hashwanthrjn");//enter user id
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/span/span")).click();//click next
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input")).sendKeys("meenaaathith");//enter password
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/span/span")).click();//click next
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@id=\"gb\"]/div[2]/div[3]/div/div[2]/div/a")).click();//click profile icon 
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@id=\"gb_71\"]")).click();//click sign out button
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        driver.quit();//quit entire Chrome 
	}

}
