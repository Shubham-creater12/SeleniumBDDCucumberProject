package handeling_Alert_PopUp;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ALert1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		
		driver.manage().window().maximize();
		
		driver.get("https://www.letskodeit.com/practice");
		Thread.sleep(1000);
		driver.findElement(By.id("alertbtn")).click();
		
		Alert alt = driver.switchTo().alert();
		//Thread.sleep(1000);
		//alt.sendKeys("Rahul");
		Thread.sleep(1000);
		System.out.println(alt.getText());
		Thread.sleep(1000);
		alt.accept();
		//alt.dismiss();
		
		
		
		

	}

}
