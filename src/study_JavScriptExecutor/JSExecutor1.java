package study_JavScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSExecutor1 {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.letskodeit.com/practice");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		//js.executeScript
		
		WebElement radio1 = driver.findElement(By.id("benzradio"));
		Thread.sleep(1000);
		js.executeScript("arguments[0].click();",radio1);

		Thread.sleep(1000);
		
		WebElement text1 = driver.findElement(By.xpath("//*[@id=\"autosuggest\"]"));
	
		js.executeScript("arguments[0].value='Pune';",text1);
	
	}

}
