package howToTakeScreenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class TakingSS {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.tutorialspoint.com/selenium/practice/login.php");
		
	String RanStr = RandomString.make(3);
		
		System.out.println(RanStr);
		File Temp = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

		File desLocation = new File("E:\\Workspaces\\Screenshot\\pic"+RanStr+".png");
		
		FileHandler.copy(Temp, desLocation);
	}

}
