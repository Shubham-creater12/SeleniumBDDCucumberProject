package study_TestNG_Keywords;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependsOnMethodStudy {

	@Test
	public void TCF() 
	{
		Reporter.log("TC F is Running", true);
	}
	@Test
	public void TCD()
	{
		Reporter.log("TC D is Running", true);
	}
	@Test
	public void TCB() 
	{
		Assert.fail();
		Reporter.log("TC B is Running", true);
	}
	@Test(dependsOnMethods = "TCB")
	public void TCA() {
		Reporter.log("TC A is Running", true);
	}
	@Test
	public void TCE () 
	{
	
		Reporter.log("TC E is Running", true);
	}
	@Test
	public void TCC() {
		Reporter.log("TC C is Running", true);
	}

}
