package styudy_test_Suite;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestCase1 {
  @Test
  public void Tc1() throws InterruptedException 
  {
	  WebDriver driver = new ChromeDriver();
	  
	  driver.manage().window().maximize();
	  
	  driver.get("https://www.redbus.in/");
	  
	  Thread.sleep(5000);
  }
}
