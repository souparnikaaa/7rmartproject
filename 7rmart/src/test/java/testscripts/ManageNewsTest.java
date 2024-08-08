package testscripts;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import static org.testng.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.ManageNewsPage;
import utilities.ExcelUtility;

public class ManageNewsTest extends Base {

	@Test(groups= {"regression"},retryAnalyzer=retry.Retry.class,description="this testcase is using to verify Whether The User Is Able To Add The News")

	public void verifyWhetherTheUserIsAbleToAddTheNews()
	{
		String username=ExcelUtility.getString(1, 0, "LoginPage");
		String password=ExcelUtility.getString(1, 1, "LoginPage");
		String text=ExcelUtility.getString(1, 0, "NewsPage");
		String url=ExcelUtility.getString(1, 0, "UrlName");
		
		
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterUsernameOnUsernameField(username).enterPasswordOnPasswordField(password).submitButtonField();
		loginpage.navigatetoapage(url);
		
		ManageNewsPage managenewspage=new ManageNewsPage(driver);
		managenewspage.clickNewbuttonButtonfield().enterTextOntextareafield(text).clickOnSavebuttonButtonfield();
		
		boolean alertwindow=managenewspage.verifynewsCreatedAlertIsDisplayed();
		assertTrue(alertwindow, "the user didnt enter any news");
		
	}
	
	
	
	
	@Test(groups= {"smoke"},retryAnalyzer=retry.Retry.class,description="this testcase is using to verify Whether The User Is Able To Search The News") 
	public void verifyWhetherTheUserIsAbleToSearchTheNews()
	{
		String username=ExcelUtility.getString(1, 0, "LoginPage");
		String password=ExcelUtility.getString(1, 1, "LoginPage");
		String text=ExcelUtility.getString(1, 0, "NewsPage");
		String url=ExcelUtility.getString(1, 0, "UrlName");
		
		
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterUsernameOnUsernameField(username).enterPasswordOnPasswordField(password).submitButtonField();
		loginpage.navigatetoapage(url);
		ManageNewsPage managenewspage=new ManageNewsPage(driver);
		managenewspage.clickOnMainsearchbuttonButtonfield().enterNewsOnnewsinputfield(text).clickOnNewsSpecificsearchbuttonButtonfield();
	
		
		boolean isSearchSuccessful = managenewspage.isSearchResultDisplayedInTable(text);
        assertTrue(isSearchSuccessful, "The search for news containing '" + text + "' did not return expected results.");
    }
		
	
	@Test(retryAnalyzer=retry.Retry.class,description="this testcase is using to verify Whether The User Is Able To Delete The News")
	public void verifyWhetherTheUserIsAbleToDeleteTheNews()
	{
		String username=ExcelUtility.getString(1, 0, "LoginPage");
		String password=ExcelUtility.getString(1, 1, "LoginPage");
		String text=ExcelUtility.getString(1, 0, "NewsPage");
		String url=ExcelUtility.getString(1, 0, "UrlName");
		
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterUsernameOnUsernameField(username).enterPasswordOnPasswordField(password).submitButtonField();
		loginpage.navigatetoapage(url);
		
		ManageNewsPage managenewspage=new ManageNewsPage(driver);
		managenewspage.clickDeleteButton(text);
		
	
		boolean alertwindow=managenewspage.verifySuccessAlertIsDisplayed();
		assertTrue(alertwindow, "the user is unable to search the news" );
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	
	
}
