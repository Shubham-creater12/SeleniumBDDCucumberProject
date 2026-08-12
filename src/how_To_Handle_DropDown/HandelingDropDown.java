package how_To_Handle_DropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandelingDropDown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
	driver.get("https://www.letskodeit.com/practice");
//		Thread.sleep(1000);
//		WebElement DD = driver.findElement(By.xpath("//select[@id='carselect']"));
//
//		Thread.sleep(1000);
//		Select s = new Select(DD);
//		
//		s.selectByVisibleText("Honda");
//		Thread.sleep(1000);
//		s.selectByIndex(1);
//		Thread.sleep(1000);
//		
//		s.selectByValue("bmw");
		
		
		
		//System.out.println(s.isMultiple());
		
		WebElement DD2 = driver.findElement(By.xpath("//select[@name='multiple-select-example']"));
	
	//	System.out.println(s.isMultiple());
		
		Select s2 = new Select(DD2);
		
		System.out.println(s2.isMultiple());
		
		Thread.sleep(1000);
		s2.selectByIndex(2);
		Thread.sleep(1000);
		s2.selectByVisibleText("Orange");
		Thread.sleep(1000);
		s2.selectByValue("apple");
		Thread.sleep(1000);
//		s2.deselectByVisibleText("Orange");
//		Thread.sleep(1000);
//		s2.deselectByVisibleText("Peach");
//		Thread.sleep(1000);
//		
//		s2.deselectByValue("apple");
		
		//s2.deselectAll();
		Thread.sleep(1000);
		s2.selectByVisibleText("Apple");
	}

}
