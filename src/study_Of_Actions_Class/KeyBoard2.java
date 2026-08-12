package study_Of_Actions_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoard2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.letskodeit.com/practice");
		Thread.sleep(1000);
		Actions act = new Actions(driver);
		
		WebElement text1 = driver.findElement(By.xpath("//*[@id=\"autosuggest\"]"));
		Thread.sleep(1000);
		
		//text1.sendKeys("Pune");
		
		act.keyDown(text1, Keys.SHIFT).sendKeys("p").keyUp(Keys.SHIFT).sendKeys("une").perform();
		
		WebElement text2 = driver.findElement(By.xpath("//*[@id=\"name\"]"));
		Thread.sleep(1000);
		act.keyDown(text2, Keys.SHIFT).sendKeys("s").keyUp(Keys.SHIFT).sendKeys("oftware").sendKeys(Keys.SPACE).keyDown(Keys.SHIFT).sendKeys("t").keyUp(Keys.SHIFT).sendKeys("esting").build().perform();
	
	}

}
