package DEMOQAFramework.DEMOQAFramework;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Com.Base.Testbase;
import Com.Pages.AmazonSigninpage;
import Com.Pages.LoginPage;

public class AmazonSignTestcase  extends Testbase

{
	AmazonSigninpage signinpage;
	

	@BeforeMethod
	public void setup() throws IOException 
	{
		initialise();
		signinpage = new AmazonSigninpage();
	}

	@Test
	public void Signin()
	{
		signinpage.usersignin();
		signinpage.validatetitle();
		}
}
