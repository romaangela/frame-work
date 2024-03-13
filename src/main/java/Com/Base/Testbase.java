package Com.Base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testbase {
	
	public static WebDriver driver;
	
	public static Properties prop = new Properties();
	
	public void Base() throws IOException 
	
	{
		
		FileInputStream fis=new FileInputStream("D:\\Seleniumworkspace\\DEMOQAFramework\\src\\main\\java\\Com\\configuration\\config.properties");
		prop.load(fis);
	}
	
	public static  void initialise() throws IOException
	{
		 
		new Testbase().Base();
		
		WebDriverManager.firefoxdriver().setup();
		 driver = new FirefoxDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 //driver.get("https://letcode.in/");
		 
		 
		 String url = prop.getProperty("URL");
        driver.get(url);	
        
      //String broswername=prop.getProperty("broswer");
		
		 
//		 if(broswername.equals("chrome"))
//		 {
//			 System.setProperty("webdriver.chrome.driver","D://chromedriver_win32 (3)//chromedriver.exe"); 
//			 driver = new ChromeDriver();
//			 driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
//			 
//		 }
//		 
//		 else if(broswername.equals("Firefox"))
//		 {
//		 System.setProperty("webDriver.gecko.driver", "D://geckodriver-v0.31.0-win64//geckodriver.exe");
		 
		 
		 	 
		
}
}

