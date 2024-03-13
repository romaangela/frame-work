package DEMOQAFramework.DEMOQAFramework;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Com.Base.Testbase;
import Com.Pages.LoginPage;

public class LoginTestcases  extends Testbase
{
	LoginPage loginPage;



@BeforeMethod
public void setup() throws IOException 
{
	initialise();
	loginPage = new LoginPage();
}

@Test
public void LoginTest()
{
	loginPage.Loginsite();
	loginPage.validatetitle();
	
}
}


