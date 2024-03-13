package Com.Pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.Base.Testbase;

public class BigironHomepage  extends Testbase
{
	public BigironHomepage() throws IOException 
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@type='search']")
    WebElement searchtext;
	
	@FindBy(xpath="//i[@class='fa fa-lg fa-search header-search-icon']")
	WebElement searchbutton;
	
	public void verifysearch()
	{
		searchtext.sendKeys("Tractors");
		searchbutton.click();
	}
	
	

}
