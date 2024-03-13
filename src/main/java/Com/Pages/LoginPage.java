package Com.Pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.Base.Testbase;

public class LoginPage  extends Testbase

{
	
	@FindBy(xpath= "//a[text()='Sign up']")
	WebElement signupbutton;


	@FindBy(xpath="//input [@id='name']")
	WebElement Username;

	@FindBy(xpath = "//input [@id='email']")
	WebElement Emailid;

	@FindBy(xpath = "//input [@type='password']")
	WebElement Password;
	
	@FindBy(xpath = "//input [@type='checkbox']")
	WebElement Checkbox;

	@FindBy(xpath = "//button [text()='SIGN UP']")
	WebElement Signinbutton;



public LoginPage() throws IOException 
{
	PageFactory.initElements(driver, this);
}

public void Loginsite()
{
	signupbutton.click();
	Username.sendKeys("abhi");
	Emailid.sendKeys("abhi123@gmail.com");
	Password.sendKeys("abhi123");
	Checkbox.click();
	Signinbutton.click();
	
}
 public void validatetitle()
{
String titlename =driver.getTitle();
System.out.println(titlename);

 }
}


