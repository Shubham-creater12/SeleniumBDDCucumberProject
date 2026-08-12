package SetSizeNPosition;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetPosition {

	public static void main(String[] args) throws InterruptedException {

		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.letskodeit.com/practice");
		
		
		Thread.sleep(1000);
		System.out.println(driver.manage().window().getPosition());
		
		Point p = new Point(700, 500);
		
		driver.manage().window().setPosition(p);
		
		

	}

}
