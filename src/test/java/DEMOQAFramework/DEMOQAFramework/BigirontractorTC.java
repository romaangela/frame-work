/**
 * 
 */
package DEMOQAFramework.DEMOQAFramework;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Com.Base.Testbase;
import Com.Pages.BigSigninpage;
import Com.Pages.BigironHomepage;
import Com.Pages.Bigirontractorpage;

/**
 * @author Roma.angela
 *
 */
public class BigirontractorTC  extends Testbase
{
	
	//create the object of the pages which needs to run the current page
	BigSigninpage signinpage;
	BigironHomepage Bigironhomepg;
	
	//current page object creation
	Bigirontractorpage tractorpage;
	
	@BeforeMethod
	public void setup() throws IOException 
	{
		initialise();
		//create the object of the page which needs to run the current page
		signinpage=new BigSigninpage();
		Bigironhomepg=new BigironHomepage();
		//current page object creation
		tractorpage=new Bigirontractorpage();
		
	}
		
		@Test
		public void Itemselection() throws IOException, InterruptedException
		{
			
			
			//run the methods from different class
			
			signinpage.validatesignin();
			Thread.sleep(3000);
			Bigironhomepg.verifysearch();
			Thread.sleep(3000);
			//tractorpage.verifyitemcount();
			Thread.sleep(3000);
			tractorpage.verifyitemname();
			
			
			
			
			
			
			
			
		}
	
	

}
