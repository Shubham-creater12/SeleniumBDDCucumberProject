package study_TestNG_Assertions;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Class1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	@Test
	public void Test1()
	{
		String ActualUN= "Baman";
		String ExpUN="Baman";
		
//		

		Assert.assertEquals(ActualUN,ExpUN);
		Reporter.log("Ver 1 is Running",true);
		
		int a = 100;
		int b = 50;
		
		Assert.assertNotEquals(a, b);
		Reporter.log("Ver 2 is Running ",true);
		
		boolean sta = false;
		Assert.assertTrue(sta);
		Reporter.log("Ver 3 is Running", true);
		
		boolean sta2 = false;
		Assert.assertFalse(sta2);
		Reporter.log("Ver 4 is Running", true);
		
		String name =null;
		Assert.assertNull(name);
		Reporter.log("Ver 5 is running",true);
		
		String name2 ="Pune";
		Assert.assertNotNull(name2);
		Reporter.log("Ver 6 is running",true);
		
		//Assert.fail();
		
	}

	@Test
	public void Test2()
	{
		
//		

		
		boolean sta = true;
		Assert.assertTrue(sta);
		Reporter.log("Ver 7 is Running", true);
		
		boolean sta2 = false;
		Assert.assertFalse(sta2);
		Reporter.log("Ver 8 is Running", true);
		
		String name =null;
		Assert.assertNull(name);
		Reporter.log("Ver 9 is running",true);
		
		String name2 ="Pune";
		Assert.assertNotNull(name2);
		Reporter.log("Ver 10 is running",true);
		
		//Assert.fail();
		
	}
}
