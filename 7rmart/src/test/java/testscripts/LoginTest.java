package testscripts;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import pages.LoginPage;
import pages.ManagepagesPage;

public class LoginTest extends Base{

	
	@Test
	public void verifywhetheruserisabletologinwithcorrectusernameandpassword()
	{
	String username="admin";
	String password="admin";
	
	LoginPage loginpage=new LoginPage(driver);
	loginpage.enterUsernameOnUsernameField(username).enterPasswordOnPasswordField(password).submitButtonField();
	loginpage.enterPasswordOnPasswordField(password);
	loginpage.submitButtonField();
	
	boolean adminimage=loginpage.verifyAdminImageIsDisplayed();

	assertTrue(adminimage, "the user is unable to login");
	
	}
	
	
	@Test
	public void verifywhetheruserisabletologinwithwrongusernameandcorrectpassword()
	{
	String username="sou";
	String password="admin";
	
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
	String username="admin";
	String password="abc";
	
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
	String username="sou";
	String password="abc";
	
	LoginPage loginpage=new LoginPage(driver);
	loginpage.enterUsernameOnUsernameField(username);
	loginpage.enterPasswordOnPasswordField(password);
	loginpage.submitButtonField();
	
	boolean alertwindow=loginpage.verifyAlertIsDisplayed();
	assertTrue(alertwindow, "the user with wrong password and wrong username" );

	}
	
	
	
}
