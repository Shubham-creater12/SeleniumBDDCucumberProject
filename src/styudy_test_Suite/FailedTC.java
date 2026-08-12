package styudy_test_Suite;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class FailedTC {
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
	
		Reporter.log("TC B is Running", true);
	}
	@Test
	public void TCA() 
	{
		
		
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
	@Test
	public void TCW() 
	{
		Reporter.log("TC W is Running", true);
	}
	@Test
	public void TCG()
	{
		
		Reporter.log("TC G is Running", true);
	}
	@Test
	public void TCM() 
	{
	
		Reporter.log("TC M is Running", true);
	}
	@Test
	public void TCT() {
		
		Reporter.log("TC T is Running", true);
	}
	@Test
	public void TCK () 
	{
	
		Reporter.log("TC K is Running", true);
	}
	@Test
	public void TCQ() {
		
		Reporter.log("TC Q is Running", true);
	}
}
