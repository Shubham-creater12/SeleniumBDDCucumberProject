package neoStoxWithDDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NeoStox_Password_Page {

	@FindBy(xpath = "//*[@id=\"accessPinModel_accsspin\"]") private WebElement PasswordFiled;


	@FindBy(xpath = "//*[@id=\"frmsubmit\"]") private WebElement SubmitPassordButton;
	
	public NeoStox_Password_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	public void EnterPassword(String PW) 
	{
		PasswordFiled.sendKeys(PW);
	}
	
	public void ClickOnPasSubmitButton() 
	{
		SubmitPassordButton.click();
	}
}
