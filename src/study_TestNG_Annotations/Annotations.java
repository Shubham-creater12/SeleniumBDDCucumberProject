package study_TestNG_Annotations;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations {
  @Test
  public void TC1() 
  {
	  
	  Reporter.log("Validate The Username" , true);
  }
  @BeforeMethod
  public void LogInToNeostox() {
	  Reporter.log("Logging In To Neostox" ,true);
  }
  @BeforeClass
  public void OpenURL()
  {
	  Reporter.log("Opening URL ",true);
  }
  @AfterMethod
  public void LogOutFromNeostox() {
	  Reporter.log("Logging Out " , true);
  }
  @AfterClass
  public void CloseTheBrowser() 
  {
	  Reporter.log("Closing The Browser", true);
  }
  
}
