package study_Of_Actions_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollByActionsClass {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://en.wikipedia.org/wiki/India");
		
		Actions act = new Actions(driver);
		Thread.sleep(1000);
		act.scrollByAmount(0, 500).perform();
		Thread.sleep(1000);
		//act.scrollByAmount(0, 1000000000).perform();
		
		
		WebElement ancientIndia = driver.findElement(By.xpath("//h3[text()='Ancient India']"));
		Thread.sleep(1000);
		System.out.println(ancientIndia.getText());
		
		act.scrollToElement(ancientIndia).perform();
	}

}
