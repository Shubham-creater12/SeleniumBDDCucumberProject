package study_WebElement_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeys_Study {

	
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.letskodeit.com/practice");
		
		WebElement TextBox1 = driver.findElement(By.xpath("//input[@id='autosuggest']"));
		Thread.sleep(1000);
		TextBox1.sendKeys("Software Testing");
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='enter-name']")).sendKeys("Java");
		
		
		TextBox1.clear();
		
		Thread.sleep(1000);
		driver.get("https://www.amazon.in/");
		Thread.sleep(1000);
		WebElement SerachBox = driver.findElement(By.xpath("//input[@type='text']"));
		
		Thread.sleep(1000);
		SerachBox.sendKeys("Iphone15");
		Thread.sleep(1000);
		
		SerachBox.clear();
	}
}
