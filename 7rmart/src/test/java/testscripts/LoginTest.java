package testscripts;

import org.testng.annotations.Test;


import static org.testng.Assert.assertTrue;

import pages.LoginPage;
import utilities.ExcelUtility;

public class LoginTest extends Base{

	
	@Test(groups= {"regression"},retryAnalyzer=retry.Retry.class,description="this testcase is using to verify whether user is able to login with correct username and password ")
	public void verifywhetheruserisabletologinwithcorrectusernameandpassword()
	{
	String username=ExcelUtility.getString(1, 0, "LoginPage");
	String password=ExcelUtility.getString(1, 1, "LoginPage");
	
	LoginPage loginpage=new LoginPage(driver);
	loginpage.enterUsernameOnUsernameField(username).enterPasswordOnPasswordField(password).submitButtonField();
	
	boolean adminimage=loginpage.verifyAdminImageIsDisplayed();

	assertTrue(adminimage, "the user is unable to login");
	
	}
	
	
	@Test(groups= {"smoke"},retryAnalyzer=retry.Retry.class,description="this testcase is using to verify whether user is able to login with wrong username and correct password")
	public void verifywhetheruserisabletologinwithwrongusernameandcorrectpassword()
	{
	String username=ExcelUtility.getString(1, 2, "LoginPage");
	String password=ExcelUtility.getString(1, 1, "LoginPage");
	
	LoginPage loginpage=new LoginPage(driver);
	loginpage.enterUsernameOnUsernameField(username);
	loginpage.enterPasswordOnPasswordField(password);
	loginpage.submitButtonField();
	
	boolean alertwindow=loginpage.verifyAlertIsDisplayed();
	assertTrue(alertwindow, "the user with wrong username and correctpassword ");

	}
	
	@Test(retryAnalyzer=retry.Retry.class,description="this testcase is using to verify whether user is able to login with wrong password and correct username ")
	public void verifywhetheruserisabletologinwithwrongpasswordandcorrectusername()
	{
	String username=ExcelUtility.getString(1, 0, "LoginPage");
	String password=ExcelUtility.getString(1, 3, "LoginPage");
	
	LoginPage loginpage=new LoginPage(driver);
	loginpage.enterUsernameOnUsernameField(username);
	loginpage.enterPasswordOnPasswordField(password);
	loginpage.submitButtonField();
	
	boolean alertwindow=loginpage.verifyAlertIsDisplayed();
	assertTrue(alertwindow, "the user with wrong password and correctusername ");

	}
	
	@Test(retryAnalyzer=retry.Retry.class,description="this testcase is using to verify whether user is able to login with wrong username and wrong password")
	public void verifywhetheruserisabletologinwithwrongusernameandwrongpassword()
	{
	String username=ExcelUtility.getString(1, 2, "LoginPage");
	String password=ExcelUtility.getString(1, 3, "LoginPage");
	
	LoginPage loginpage=new LoginPage(driver);
	loginpage.enterUsernameOnUsernameField(username);
	loginpage.enterPasswordOnPasswordField(password);
	loginpage.submitButtonField();
	
	boolean alertwindow=loginpage.verifyAlertIsDisplayed();
	assertTrue(alertwindow, "the user with wrong password and wrong username" );

	}
	
	
	
}
