package study_Of_Actions_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class STudy_Double_Click {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/buttons");
		
		WebElement dblclk = driver.findElement(By.id("doubleClickBtn"));

		
		Actions act =  new Actions(driver);
		Thread.sleep(2000);
		//act.doubleClick(dblclk).perform();
		act.moveToElement(dblclk).doubleClick().perform();
		Thread.sleep(2000);
		WebElement rightClk = driver.findElement(By.id("rightClickBtn"));
		
		//act.contextClick(rightClk).perform();
		act.moveToElement(rightClk).contextClick().perform();
		
	}

}
