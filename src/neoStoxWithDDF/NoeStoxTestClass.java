package neoStoxWithDDF;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NoeStoxTestClass {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException
	{
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		File myfile = new File("E:\\ExcelSheets\\Batch_1.30To3.30.xlsx");
		
		Sheet MySheet = WorkbookFactory.create(myfile).getSheet("NeostoxData");
		
		
		
		driver.get("https://neostox.com/");
		
		Neostox_Home_Page home = new Neostox_Home_Page(driver);
		
		home.ClickOnSignInButton();
		NeoStox_Sign_In_Page sign = new NeoStox_Sign_In_Page(driver);
		
		String Mob = MySheet.getRow(0).getCell(0).getStringCellValue();
		sign.EnterMobNum(Mob);
		
		Thread.sleep(1000);
		
		sign.ClickOnMobNumSubButton();
		
		NeoStox_Password_Page pass = new NeoStox_Password_Page(driver);
		
		String PW = MySheet.getRow(0).getCell(1).getStringCellValue();
		pass.EnterPassword(PW);
		Thread.sleep(1000);
		
		pass.ClickOnPasSubmitButton();
		
		Neostox_DashBoard_Page dash = new Neostox_DashBoard_Page(driver);
		
		Thread.sleep(25000);
		
		dash.HandelPopUps(driver);
		
		Thread.sleep(1000);
		
		String ExpUsername = MySheet.getRow(0).getCell(2).getStringCellValue();
		dash.ValidateUsername(ExpUsername);
		
		Thread.sleep(1000);
		
		dash.LogOutFromNeostox();
		
		
		driver.close();
		
		
		
		
		

	}

}
