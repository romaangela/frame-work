package Com.Pages;

import java.io.IOException;

import org.apache.hc.core5.util.Asserts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import Com.Base.Testbase;

public class BigSigninpage extends Testbase 
{
@FindBy(name="UserName")
    WebElement username;
	
	@FindBy(name="Password")
    WebElement password;
	
	@FindBy(xpath = "//button[text()='Sign In']")
    WebElement signinbutton;
	
	//img[@alt='bigiron']

	@FindBy(xpath = "//img[@alt='bigiron']")
    WebElement Bigironlogo;

public BigSigninpage() throws IOException 
{
	PageFactory.initElements(driver, this);
}

public void validatesignin()
{
	username.sendKeys("Admin");
	password.sendKeys("Te$tpa$$w0rd");
	signinbutton.click();
}

public Boolean validatelogo()
{
	 Boolean value= Bigironlogo.isDisplayed();
	return value;
	 
	
}
}
