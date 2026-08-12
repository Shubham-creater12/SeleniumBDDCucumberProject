package study_WebElement_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Click_Study {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.letskodeit.com/practice");
		
		driver.findElement(By.xpath("//input[@id='hondaradio']")).click();

		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='btn-style class1']")).click();
	
		
		WebElement text = driver.findElement(By.xpath("//h1[text()='Practice Page']"));
	
		
		System.out.println(text.getText());
		
		Thread.sleep(1000);
		
		System.out.println(driver.findElement(By.xpath("//table[@name='courses']")).getText());
	}

}
