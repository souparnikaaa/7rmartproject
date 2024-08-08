package testscripts;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import pages.CategoryPage;
import pages.LoginPage;
import utilities.ExcelUtility;

public class CategoryTest extends Base {

	@Test(groups= {"regression"},retryAnalyzer=retry.Retry.class,description="this testcase is using to verify Whether The User Is Able To Add The Category ")
	
	public void verifyWhetherTheUserIsAbleToAddTheCategory()

	{
		String username=ExcelUtility.getString(1, 0, "LoginPage");
		String password=ExcelUtility.getString(1, 1, "LoginPage");
		String url=ExcelUtility.getString(3, 0, "UrlName");
		String category="paperr";
	
		String filepath=ExcelUtility.getString(1, 0, "ImageUrl");
		
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterUsernameOnUsernameField(username).enterPasswordOnPasswordField(password).submitButtonField();
		loginpage.navigatetoapage(url);
		
		
		CategoryPage categorypage=new CategoryPage(driver);
		categorypage.clickOnNewButton().enterCategoryOnCategoryField(category).selectTheDiscount()
		.uploadImageField(filepath).clickTopMenuRadioButton().clickLeftMenuRadioButton().clickOnSaveButton();
		
		boolean alertwindow=categorypage.verifyAlertIsDisplayedForCategory();
		assertTrue(alertwindow, "the user did not enter the details correctly: failed to add category" );
		
	}
	
	

	
	
}






