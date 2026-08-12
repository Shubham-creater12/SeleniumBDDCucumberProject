package neoStoxWithDDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NeoStox_Sign_In_Page 
{

	
	@FindBy(xpath = "//*[@id=\"txt_mobilenumber\"]") private WebElement MobNumFiels;
	
	@FindBy(xpath = "//*[@id=\"frmsubmit\"]") private WebElement MobileNumSubButton;
	
	
	public NeoStox_Sign_In_Page(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	public void EnterMobNum(String Mob) 
	{
		MobNumFiels.sendKeys(Mob);
	}
	
	public void ClickOnMobNumSubButton() 
	{
		MobileNumSubButton.click();
	}
}
