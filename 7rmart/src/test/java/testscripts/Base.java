package testscripts;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import constants.Constants;
import utilities.ScreenshotUtility;
import utilities.WaitUtility;

public class Base {
	public WebDriver driver; //web driver is an interface of selenium ,driver is a reference variable,object created
	public ScreenshotUtility screenshotutility;
	public Properties prop;
	public FileInputStream fs;
	
	@BeforeMethod(alwaysRun=true)
	@Parameters("browser")
	public void initializebrowser(String browser) throws Exception
	{
		try 
		{
			prop = new Properties();
			fs = new FileInputStream(Constants.CONFIGFILE);
			prop.load(fs);
		} 
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		}
		
		if(browser.equalsIgnoreCase("chrome")) {
			driver=new ChromeDriver();
			
	}
		else if(browser.equalsIgnoreCase("firefox"))
		{
			driver=new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("safari"))
		{
			driver=new SafariDriver();
			
		}
		
		else
		{
			throw new Exception("browser is not correct");
		}
		
		//loading driver,to intialize browser
		
        driver.get(prop.getProperty("url"));//to launch url from constant file
    
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(WaitUtility.IMPLICITWAIT));//implicit wait
		driver.manage().window().maximize(); //to maximize the window
		}

	@AfterMethod(alwaysRun = true)
	public void browserQuit(ITestResult iTestResult) throws IOException {
		if (iTestResult.getStatus() == ITestResult.FAILURE) {
			screenshotutility = new ScreenshotUtility();
			screenshotutility.getScreenShot(driver, iTestResult.getName());
		}

		driver.quit();
	}

	

}





