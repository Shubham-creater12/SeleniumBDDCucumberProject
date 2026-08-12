package OrangeHRMWIthPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangeHRMLogInPage 
{

	@FindBy(xpath = "//input[@name='username']") private WebElement UserName;

	@FindBy(xpath = "//input[@name='password']") private WebElement PasswordFiled;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button") private WebElement LogInButton;
	
	
	public OrangeHRMLogInPage(WebDriver driver) 
	{
		PageFactory.initElements(driver ,this);
	}
	
	
	public void EnteringUsername(String UN) 
	{
		UserName.sendKeys(UN);
	}
	
	public void EnterPassWord(String PW) 
	{
		PasswordFiled.sendKeys(PW);
	}
	
	public void ClickOnLogInButton() 
	{
		LogInButton.click();
	}

}
