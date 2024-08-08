package testscripts;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import pages.LoginPage;
import pages.SubCategoryPage;
import utilities.ExcelUtility;
import utilities.RandomUtility;

public class SubCategoryTest extends Base
{
	
		
		@Test(groups= {"regression"},retryAnalyzer=retry.Retry.class,description="this testcase is using to verify Whether The User Is Able To Add The SubCategory")
		public void verifyWhetherTheUserIsAbleToAddTheSubCategory()
		{
		String username=ExcelUtility.getString(1, 0, "LoginPage");
		String password=ExcelUtility.getString(1, 1, "LoginPage");
		String url=ExcelUtility.getString(4, 0, "UrlName");
		//String subcategory=ExcelUtility.getString(5, 0, "SubCategoryPage");
		
		RandomUtility randomutility=new RandomUtility();
		String subcategory=randomutility.generateSubcategoryName();
		
		String filepath=ExcelUtility.getString(1, 0, "ImageUrl");
		
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterUsernameOnUsernameField(username).enterPasswordOnPasswordField(password).submitButtonField();
		loginpage.navigatetoapage(url);
		
		
		SubCategoryPage subcategorypage=new SubCategoryPage(driver);
		subcategorypage.clickOnNewButton().selectCategoryFromDropdown().enterSubCategory(subcategory)
		.uploadImage(filepath).clicksaveButton();
		
		boolean alertwindow=subcategorypage.verifyAlertIsDisplayedForCategory();
		assertTrue(alertwindow, "the user did not enter the details correctly: failed to add subcategory" );
		}
		
		@Test(groups= {"smoke"},retryAnalyzer=retry.Retry.class,description="this testcase is using to verify Whether The User Is Able To Add The SubCategory for duplicate SubCategory")
		public void verifyWhetherTheUserIsAbleToAddTheSubCategoryforduplicateSubCategory()
		{
		String username=ExcelUtility.getString(1, 0, "LoginPage");
		String password=ExcelUtility.getString(1, 1, "LoginPage");
		String url=ExcelUtility.getString(4, 0, "UrlName");
		String subcategory=ExcelUtility.getString(3, 0, "SubCategoryPage");
		String filepath=ExcelUtility.getString(1, 0, "ImageUrl");
		
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterUsernameOnUsernameField(username).enterPasswordOnPasswordField(password).submitButtonField();
		loginpage.navigatetoapage(url);
		
		
		SubCategoryPage subcategorypage=new SubCategoryPage(driver);
		subcategorypage.clickOnNewButton().selectCategoryFromDropdown().enterSubCategory(subcategory)
		.uploadImage(filepath).clicksaveButton();
		
		boolean alertwindow=subcategorypage.verifySubCategoryalreadyexistsAlertIsDisplayedforduplicateSubCategory();
		assertTrue(alertwindow, "the subcategory is added" );
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}
