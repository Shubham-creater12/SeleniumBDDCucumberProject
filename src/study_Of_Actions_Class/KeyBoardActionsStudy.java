package study_Of_Actions_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardActionsStudy {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.letskodeit.com/practice");
		
		WebElement dd = driver.findElement(By.id("carselect"));
		
		Actions act = new Actions(driver);
		
		act.click(dd).perform();
		
		Thread.sleep(2000);
		
//		act.sendKeys(Keys.ARROW_DOWN).perform();
//		
//		Thread.sleep(2000);
//		act.sendKeys(Keys.ARROW_DOWN).perform();
		
		for(int i = 1;i<=2;i++) {
			act.sendKeys(Keys.ARROW_DOWN).perform();
			Thread.sleep(1000);
		}
		
		act.sendKeys(Keys.ENTER).perform();

	}

}
