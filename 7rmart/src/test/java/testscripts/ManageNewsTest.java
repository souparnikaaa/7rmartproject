package testscripts;

import static org.testng.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.ManageNewsPage;

public class ManageNewsTest extends Base {

	@Test

	public void verifyWhetherTheUserIsAbleToAddTheNews()
	{
		String username="admin";
		String password="admin";
		String text="newsone";
		String url="https://groceryapp.uniqassosiates.com/admin/list-news";
		
		
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterUsernameOnUsernameField(username).enterPasswordOnPasswordField(password).submitButtonField();
		loginpage.navigatetoapage(url);
		
		ManageNewsPage managenewspage=new ManageNewsPage(driver);
		managenewspage.clickNewbuttonButtonfield().enterTextOntextareafield(text).clickOnSavebuttonButtonfield();
		
		boolean alertwindow=managenewspage.verifynewsCreatedAlertIsDisplayed();
		assertTrue(alertwindow, "the user didnt enter any news");
		
	}
	
	@Test
	public void verifyWhetherTheUserIsAbleToSearchTheNews()
	{
		String username="admin";
		String password="admin";
		String text="newsone";
		String url="https://groceryapp.uniqassosiates.com/admin/list-news";
		
		
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterUsernameOnUsernameField(username).enterPasswordOnPasswordField(password).submitButtonField();
		loginpage.navigatetoapage(url);
		ManageNewsPage managenewspage=new ManageNewsPage(driver);
		managenewspage.clickOnMainsearchbuttonButtonfield().enterNewsOnnewsinputfield(text).clickOnNewsSpecificsearchbuttonButtonfield();
	
		
	}
	
	
	
	
}
