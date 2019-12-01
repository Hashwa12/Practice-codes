package all_concepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail_1 {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\softwares\\hashwa\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://accounts.google.com/ServiceLogin/signinchooser?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys("hashwanthrjn");//enter user id
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/span/span")).click();//click next
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input")).sendKeys("meenaaathith");//enter password
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/span/span")).click();//click next
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@id=\":148\"]/div/div")).click();//Click compose mail
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@id=\":19v\"]")).sendKeys("divyaskmu@gmail.com");//enter user id
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        /*
        driver.findElement(By.xpath("//*[@id=\":1a4\"]")).sendKeys("divyaskmu@gmail.com");//Enter recipient mail id
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@id=\":19m\"]")).sendKeys("Testing selenium");//Enter subject
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@id=\":1ar\"]")).sendKeys("Hello. This works fine. Keep going :-)");//Type message
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@id=\":19c\"]")).click();//Click send
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@id=\":1a4\"]")).sendKeys("divyaskmu@gmail.com");//enter recipient user id
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@id=\":19m\"]")).sendKeys("Testing selenium");//enter the subject
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@id=\":1ar\"]")).sendKeys("Hello. This works fine. Keep going :-)");//enter message
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@id=\":19c\"]")).click();//click send mail
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);*/
	}

}
