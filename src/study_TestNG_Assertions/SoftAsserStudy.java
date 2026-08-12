package study_TestNG_Assertions;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAsserStudy
{
	
	SoftAssert soft = new SoftAssert();
  @Test
  public void f() 
  {
	  String ACtName="Suraj";
	  String ExpName="Suraj";
	  
//	  if(ACtName.equals(ExpName))
//	  {
//		  Reporter.log("TC is Passed ",true);
//	  }
//	  else {
//		  Reporter.log("TC is Failed",true);
//	  }
	  
	  soft.assertEquals(ACtName,ExpName , "Exp and Act Are not matching , TC is Failed");
	  Reporter.log("Ver1 is Passed ", true);
	  
	  int a = 100;
	  int b = 100;
	  soft.assertNotEquals(a, b );
	  Reporter.log("Ver2 is Passed ",true);
	  
	  boolean sta1 = true;
	  soft.assertTrue(sta1);
	  Reporter.log("Ver 3 is Passed ",true);
	  boolean sta2 = false;
	  soft.assertFalse(sta2);
	  Reporter.log("Ver 4 is Passed" , true);
	  
	  String city = null;
	  soft.assertNull(city);
	  Reporter.log("Ver 5 is Passed",true);
	  
	 // Assert.fail();
	  
	  soft.assertAll();
  }
}
