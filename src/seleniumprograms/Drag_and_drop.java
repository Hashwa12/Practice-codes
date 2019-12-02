package seleniumprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_and_drop {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\softwares\\hashwa\\Drivers\\chromedriver(2).exe");
        WebDriver driver = new ChromeDriver();
        
        driver.get("https://jqueryui.com/droppable/");
        
        driver.manage().window().maximize();
        
        driver.switchTo().frame(0);
        
        WebElement sElement = driver.findElement(By.id("draggable"));
        
        WebElement Destination = driver.findElement(By.id("droppable"));
        
        Actions actions = new Actions(driver);
        
//        actions.clickAndHold(sElement).moveToElement(Destination).release().build().perform();

        actions.dragAndDrop(sElement, Destination).build().perform();
	}

}
