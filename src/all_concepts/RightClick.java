package all_concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\softwares\\hashwa\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        
        driver.get("https://jqueryui.com/droppable/");
        
        driver.manage().window().maximize();
        
        Actions action = new Actions(driver);
        
        WebElement source = driver.findElement(By.xpath("//a[contains(text(),'About')]"));
        
        action.contextClick(source).build().perform();
        
	}

}
