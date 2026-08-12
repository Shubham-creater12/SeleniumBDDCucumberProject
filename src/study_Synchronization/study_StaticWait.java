package study_Synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class study_StaticWait {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver  = new ChromeDriver();
		Thread.sleep(3000);
		driver.get("https://www.letskodeit.com/practice");

		driver.manage().timeouts().implicitlyWait(Duration.ofHours(3));
		//Thread.sleep(10000);
		driver.findElement(By.id("hondacheck")).click();
	}

}
