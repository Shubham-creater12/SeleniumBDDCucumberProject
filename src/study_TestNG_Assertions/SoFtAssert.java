package study_TestNG_Assertions;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoFtAssert {

	SoftAssert soft = new SoftAssert();
	@Test
	public void Test1()
	{
		
		
		String ActualUN= "Baman";
		String ExpUN="Baman";
		
//		

		soft.assertEquals(ActualUN,ExpUN);
		Reporter.log("Ver 1 is Running",true);
		
		int a = 100;
		int b = 100;
		
		soft.assertNotEquals(a, b);
		Reporter.log("Ver 2 is Running ",true);
		
		boolean sta = false;
		soft.assertFalse(sta);
		Reporter.log("Ver 3 is Running", true);
		
		boolean sta2 = false;
		soft.assertFalse(sta2);
		Reporter.log("Ver 4 is Running", true);
		
		String name =null;
		soft.assertNull(name);
		Reporter.log("Ver 5 is running",true);
		
		String name2 ="Pune";
		soft.assertNotNull(name2);
		Reporter.log("Ver 6 is running",true);
		
		//Assert.fail();
		
		soft.assertAll();
		
		
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
