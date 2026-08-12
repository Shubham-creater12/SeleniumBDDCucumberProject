package study_Of_Actions_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class STudy_Drag_And_Drop {

	public static void main(String[] args) throws InterruptedException 
	{
WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/droppable");
		
		WebElement drg = driver.findElement(By.id("draggable"));
		
		WebElement drp = driver.findElement(By.id("droppable"));
		
		Actions act = new Actions(driver);
		
		Thread.sleep(5000);
	//	act.dragAndDrop(drg, drp).build().perform();
		
		act.clickAndHold(drg).moveToElement(drp).release().build().perform();

	}

}
