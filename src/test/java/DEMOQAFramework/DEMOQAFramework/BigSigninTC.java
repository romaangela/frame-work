package DEMOQAFramework.DEMOQAFramework;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Com.Base.Testbase;
import Com.Pages.AmazonSigninpage;
import Com.Pages.BigSigninpage;

public class BigSigninTC  extends Testbase
{
	BigSigninpage Bigsigninpage;
	
	
	@BeforeMethod
	public void setup() throws IOException 
	{
		initialise();
		Bigsigninpage = new BigSigninpage();
	}

	@Test
	public void Loginuser()
	{
		Bigsigninpage.validatesignin();
		Bigsigninpage.validatelogo();
		
	
}
}
