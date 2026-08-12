package study_JavScriptExecutor;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JsExecutor2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en.wikipedia.org/wiki/India");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
Object Title = js.executeScript("return document.title;");
		
		System.out.println(Title);
		Thread.sleep(1000);
		WebElement ele1 = driver.findElement(By.xpath("//*[@id=\"Medieval_India\"]"));

		js.executeScript("arguments[0].scrollIntoView(true)",ele1);
		
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,900)");
		Thread.sleep(2000);
		js.executeScript("history.go(0)");
		
		
		
	}

}
