package handeling_Alert_PopUp;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandekingChildBrowserPopUp {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.letskodeit.com/practice");
		
		Thread.sleep(1000);
		
		driver.findElement(By.id("openwindow")).click();
		Thread.sleep(1000);
		
	//String IdOfHomepge = driver.getWindowHandle();
	
	Set<String> IdsOfAllPages = driver.getWindowHandles();
	
	
	Iterator<String> it = IdsOfAllPages.iterator();
	
	
//	while(it.hasNext()) 
//	{
//		System.out.println(it.next());
//	}
	
	//System.out.println(it.next());
	String IdOfHome = it.next();
	String IdOfChiledPage = it.next();
	
	
	driver.switchTo().window(IdOfChiledPage);
	Thread.sleep(3000);
	
		driver.findElement(By.xpath("//input[@id='search']")).sendKeys("Testing");

		driver.close();
		Thread.sleep(3000);
		
		
		
		driver.switchTo().window(IdOfHome);
		Thread.sleep(1000);
		driver.findElement(By.id("bmwcheck")).click();
	}

}
