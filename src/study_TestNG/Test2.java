package study_TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test2 {
  @Test
  public void TestCase1() 
  {
	  
//	  WebDriver driver = new ChromeDriver();
//		
//		driver.manage().window().maximize();
//		
//		driver.get("https://www.redbus.in/");
		
	
		
		System.out.println("Hii , TC is Running");
		Reporter.log("Hii < Tc is Failed" , true);

  }
}
