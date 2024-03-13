/**
 * 
 */
package Com.Pages;

import java.io.IOException;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.Base.Testbase;

/**
 * @author Roma.angela
 *
 */
public class Bigirontractorpage  extends Testbase
{
	
	public Bigirontractorpage() throws IOException 
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//span[@class='lots-sold-count']")
    WebElement itemcount;
	
	@FindBy(xpath="//img[@alt='2012 Case IH 315 Magnum Custom Tractor ']")
	WebElement itemname;
	
	
	public void verifyitemcount()

	{
		 Dimension count=itemcount.getSize();
		 
	}
	
	public void verifyitemname()
	{
		
//		JavascriptExecutor js1 = (JavascriptExecutor) driver;
//		js1.executeScript("window.scrollBy(0,500)", "");
//		
		itemname.click();
		System.out.println(itemname.getText());
	}

}
