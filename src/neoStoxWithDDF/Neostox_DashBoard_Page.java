package neoStoxWithDDF;

import java.sql.Driver;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Neostox_DashBoard_Page 
{

	@FindBy(xpath = "(//a[text()='OK'])[2]") private WebElement popup1;
	
	@FindBy(xpath = "//a[@class='btn btn-success']") private WebElement Popup2;
	
	
	@FindBy(xpath = "//*[@id=\"navbarDropdown\"]") private WebElement Username;
	
	@FindBy(xpath = "//*[@id=\"lnk_logout\"]/span[2]") private WebElement LogOutButton;
	
	
	public Neostox_DashBoard_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void HandelPopUps(WebDriver driver) throws InterruptedException 
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(10));
	
		popup1.click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(10));
		
		Popup2.click();
		
	}
	
	public void ValidateUsername(String ExpUsername) 
	{
		
		
		String ActUsername = Username.getText();
		
		if(ExpUsername.equals(ActUsername)) {
			System.out.println("TC is Passed");
		}
		else {
			System.out.println("TC is Failde");
		}
		
	}
	
	public void LogOutFromNeostox() throws InterruptedException 
	{
		Username.click();
		Thread.sleep(1000);
		LogOutButton.click();
		
		
	}
	
	
}
