package testscripts;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import utilities.WaitUtility;

public class Base {
	public WebDriver driver; //web driver is an interface of selenium ,driver is a reference variable,object created
	
	@BeforeMethod
	public void initializebrowser()
	{
		driver=new ChromeDriver();//loading driver,to intialize browser
		
     driver.get("https://groceryapp.uniqassosiates.com/admin ");//to launch url
    
     
   
     
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(WaitUtility.IMPLICITWAIT));//implicit wait
		driver.manage().window().maximize(); //to maximize the window
		}
	@AfterMethod
	public void driverquitnclose() {
		//driver.close(); //to close main window
		
		driver.quit();//to close all windows
	}

	

}





