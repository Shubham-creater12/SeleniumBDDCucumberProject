package IframeHandelingStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Iframe1 {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();

		driver.get("https://www.letskodeit.com/practice");
		Thread.sleep(1000);
		driver.navigate().refresh();
		
		
		//driver.switchTo().frame("iframe-name");
		
		//driver.switchTo().frame(0);
		
		WebElement Frame = driver.findElement(By.xpath("//iframe[@id='courses-iframe']"));
	
		driver.switchTo().frame(Frame);
		
		WebElement dd = driver.findElement(By.name("categories"));
		Select s = new Select(dd);
		Thread.sleep(1000);
		s.selectByIndex(1);
		Thread.sleep(1000);
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().parentFrame();a
		driver.findElement(By.id("hondacheck")).click();
				
	}

}
