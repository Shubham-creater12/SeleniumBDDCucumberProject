package study_WebElement_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabledStuydy {

	public static void main(String[] args) {
WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://auth.discoveryplus.in/login");
		
		WebElement submitBtn = driver.findElement(By.xpath("//button[@type='submit']"));
		
		System.out.println(submitBtn.isEnabled());
		
		
		driver.findElement(By.xpath("//input[@id='mobileNumber']")).sendKeys("6725272726");
		System.out.println(submitBtn.isEnabled());
	
	}

}
