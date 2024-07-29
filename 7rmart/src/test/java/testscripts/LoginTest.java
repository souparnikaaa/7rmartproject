package testscripts;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import pages.LoginPage;
import pages.ManagepagesPage;
import utilities.ExcelUtility;

public class LoginTest extends Base{

	
	@Test
	public void verifywhetheruserisabletologinwithcorrectusernameandpassword()
	{
	String username=ExcelUtility.getString(1, 0, "LoginPage");
	String password=ExcelUtility.getString(1, 1, "LoginPage");
	
	LoginPage loginpage=new LoginPage(driver);
	loginpage.enterUsernameOnUsernameField(username).enterPasswordOnPasswordField(password).submitButtonField();
	
	boolean adminimage=loginpage.verifyAdminImageIsDisplayed();

	assertTrue(adminimage, "the user is unable to login");
	
	}
	
	
	@Test
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
	
	@Test
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
	
	@Test
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
