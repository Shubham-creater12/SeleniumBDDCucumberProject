package study_Of_Actions_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Study_Mouse_Actions {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.letskodeit.com/practice");
		//driver.findElement(By.xpath("//*[@id=\"hondacheck\"]")).click();
	
		WebElement check1 = driver.findElement(By.xpath("//*[@id=\"hondacheck\"]"));
		Actions act = new Actions(driver);
		
	//	act.click(check1).perform();
		
		act.moveToElement(check1).click().perform();
	
	
	}

}
