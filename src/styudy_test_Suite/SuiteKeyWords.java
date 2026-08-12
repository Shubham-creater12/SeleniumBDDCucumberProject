package styudy_test_Suite;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class SuiteKeyWords {
	@Test(groups = "San")
	public void TCF() 
	{
		Reporter.log("TC F is Running", true);
	}
	@Test(groups = "Reg")
	public void TCD()
	{
		Reporter.log("TC D is Running", true);
	}
	@Test(groups = "San")
	public void TCB() 
	{
	
		Reporter.log("TC B is Running", true);
	}
	@Test(groups = "Reg")
	public void TCA() {
		Reporter.log("TC A is Running", true);
	}
	@Test
	public void TCE () 
	{
	
		Reporter.log("TC E is Running", true);
	}
	@Test(groups = "Reg")
	public void TCC() {
		Reporter.log("TC C is Running", true);
	}
}
