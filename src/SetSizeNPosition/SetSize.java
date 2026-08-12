package SetSizeNPosition;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetSize {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.letskodeit.com/practice");
		
		Dimension DefaultSize = driver.manage().window().getSize();
		
		System.out.println(DefaultSize);
		Thread.sleep(1000);
		Dimension FinalSize = new Dimension(2000, 8000);
		
		driver.manage().window().setSize(FinalSize);

	}

}
