package styudy_test_Suite;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class SuiteKeyWords2 {
	@Test(groups = "Reg")
	public void TCW() 
	{
		Reporter.log("TC W is Running", true);
	}
	@Test(groups = "San")
	public void TCG()
	{
		Reporter.log("TC G is Running", true);
	}
	@Test
	public void TCM() 
	{
	
		Reporter.log("TC M is Running", true);
	}
	@Test(groups = "Reg")
	public void TCT() {
		Reporter.log("TC T is Running", true);
	}
	@Test(groups = "San")
	public void TCK () 
	{
	
		Reporter.log("TC K is Running", true);
	}
	@Test(groups = "Reg")
	public void TCQ() {
		Reporter.log("TC Q is Running", true);
	}
}
