package DEMOQAFramework.DEMOQAFramework;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Com.Base.Testbase;
import Com.Pages.BigSigninpage;
import Com.Pages.BigironHomepage;

public class BigironHomeTC1  extends Testbase
{
	//create the object of the pages which is required to run the current page
	BigSigninpage signinpage;
	//current page object creation
	BigironHomepage Bigironhomepg;
	
	@BeforeMethod
	public void setup() throws IOException 
	{
		initialise();
		//create the object of the page which is required to run the current page
		signinpage= new  BigSigninpage();
		//currentpage object creation
		Bigironhomepg = new BigironHomepage();
	}
	
	@Test
	public void Itemsearch()
	
	{
		signinpage.validatesignin();
		Bigironhomepg.verifysearch();
	}
	

	

}
