package Com.Pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.Base.Testbase;

public class AmazonHomepage  extends Testbase

{
	
	public AmazonHomepage() throws IOException 
	{
		PageFactory.initElements(driver, this);
	}
	
//	@FindBy(xpath="//input[@name='password']")
//	WebElement Password;
	
	@FindBy(xpath = "//a[@aria-label='Open Menu']")
	WebElement Menu;
	
	
	
//	@FindBy(linkText = "Echo & Alexa")
//	WebElement submenu;
////	
	
	




public void selectitem()
{
	Menu.click();
	
//	Actions actions =new Actions(driver);
//	actions.moveToElement(submenu). click().perform();
//	
	
	
}



}

