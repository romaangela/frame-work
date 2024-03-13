package Com.Pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.Base.Testbase;

public class AmazonSigninpage extends Testbase {
	
	
	
	@FindBy(xpath= "//input[@id='ap_email']")
	WebElement Mailid;
	
	
	@FindBy(xpath="//input[@name='password']")
	WebElement Password;
	
	
	@FindBy(xpath="//input[@id='signInSubmit']")
	WebElement Signinbutn;
	

//create the constructor by passing the name of the class
	
public AmazonSigninpage() throws IOException 
{
	PageFactory.initElements(driver, this);
}

public void usersignin() 

{
	Mailid.sendKeys("romaangela46@gmail.com");
	Password.sendKeys("Ammurachel@2020");
	Signinbutn.click();
}

public void validatetitle() 

{
	String titlename= driver.getTitle();
	System.out.println(titlename);
}

}




