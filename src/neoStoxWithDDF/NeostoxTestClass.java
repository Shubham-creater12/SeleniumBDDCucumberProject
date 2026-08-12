package neoStoxWithDDF;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NeostoxTestClass 
{
	WebDriver driver ;
	File myfile ;
	Sheet MySheet;
	Neostox_Home_Page home ;
	NeoStox_Sign_In_Page sign ;
	NeoStox_Password_Page pass ;
	Neostox_DashBoard_Page dash ;
  @Test
  public void ValidateUsername() throws InterruptedException 
  {
	   dash = new Neostox_DashBoard_Page(driver);
		
	   driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(10));
		
		dash.HandelPopUps(driver);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(5));
		
		String ExpUsername = MySheet.getRow(0).getCell(2).getStringCellValue();
		dash.ValidateUsername(ExpUsername);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(10));
	  
  }
  @BeforeClass
  public void OpenUrl() throws EncryptedDocumentException, IOException 
  {
	   driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		 myfile = new File("E:\\ExcelSheets\\Batch_1.30To3.30.xlsx");
		
		 MySheet = WorkbookFactory.create(myfile).getSheet("NeostoxData");
		
		
		
		driver.get("https://neostox.com/");
  }
  
  @BeforeMethod
  public void SigIntoNeostox() throws InterruptedException 
  {
	  home = new Neostox_Home_Page(driver);
		
		home.ClickOnSignInButton();
		
		sign = new NeoStox_Sign_In_Page(driver);
		
		String Mob = MySheet.getRow(0).getCell(0).getStringCellValue();
		sign.EnterMobNum(Mob);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(10));
		
		sign.ClickOnMobNumSubButton();
		
		 pass = new NeoStox_Password_Page(driver);
		
		String PW = MySheet.getRow(0).getCell(1).getStringCellValue();
		pass.EnterPassword(PW);
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(10));
		
		pass.ClickOnPasSubmitButton();
		
  }
  @AfterMethod
  public void LogOutFromNeostox() throws InterruptedException 
  {
	  dash = new Neostox_DashBoard_Page(driver);
	  dash.LogOutFromNeostox();
  }
  @AfterClass
  public void CloseBrowser() 
  {
	  driver.close();
  }
}
