package DEMOQAFramework.DEMOQAFramework;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Com.Base.Testbase;
import Com.Pages.AmazonHomepage;
import Com.Pages.AmazonSigninpage;

public class AmazonHomepageTestcase   extends Testbase
{
	//create the object of the previous page class and read the properties to the present class/page
	
	
	AmazonSigninpage signinpage;
	AmazonHomepage homepage;
	
	@BeforeMethod
	public void setup() throws IOException 
	{
		initialise();
		homepage = new AmazonHomepage();
	}

	@Test
	public void selectlink()
	{
		signinpage.usersignin();
		signinpage.validatetitle();
		homepage.selectitem();
	}
}
