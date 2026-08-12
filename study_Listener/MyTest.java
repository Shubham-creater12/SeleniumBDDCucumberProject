package study_Listener;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class MyTest {
  @Test
  public void TC1() 
  {
	  Reporter.log("TC 1 is running",true);
  }
  @Test
  public void TC4() 
  {
	  Reporter.log("TC 4 is running",true);
  }
  @Test
  public void TC2() 
  {
	  Reporter.log("TC 2 is running",true);
  }
  @Test
  public void TC3() 
  {
	  Reporter.log("TC 3 is running",true);
  }
}
