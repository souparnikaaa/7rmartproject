package testscripts;

import org.testng.annotations.Test;
import pages.LoginPage;
import pages.ManagepagesPage;
import utilities.ExcelUtility;

public class ManageepagesTest extends Base {

	@Test(groups= {"regression"},retryAnalyzer=retry.Retry.class,description="this testcase is using to verify Whether The User Is Able To Add The List")
	public void verifyWhetherTheUserIsAbleToAddTheList()
	{
		String username=ExcelUtility.getString(1, 0, "LoginPage");
		String password=ExcelUtility.getString(1, 1, "LoginPage");
		String url=ExcelUtility.getString(2, 0, "UrlName");
		
		String tittle=ExcelUtility.getString(1, 0, "ListPage");
		String description=ExcelUtility.getString(1, 1, "ListPage");
		String page=ExcelUtility.getString(1, 2, "ListPage");
		String filePath =ExcelUtility.getString(1, 3, "ListPage");
		
	
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterUsernameOnUsernameField(username).enterPasswordOnPasswordField(password).submitButtonField();
		loginpage.navigatetoapage(url);
		
		ManagepagesPage managepage=new ManagepagesPage(driver);
        managepage.clicknewbuttonButtonfield().entertittleOntittlefield(tittle).enterDescriptionOnDescriptionfield(description).enterPageOnPagefield(page).uploadImageOnimagefield(filePath).clicksaveButtonField();
		
	
		
	}
	@Test(groups= {"smoke"},retryAnalyzer=retry.Retry.class,description="this testcase is using to verify Whether The User Is Able To Search The List")
	public void verifyWhetherTheUserIsAbleToSearchTheList()
	{
		String username=ExcelUtility.getString(1, 0, "LoginPage");
		String password=ExcelUtility.getString(1, 1, "LoginPage");
		String url=ExcelUtility.getString(2, 0, "UrlName");
		String tittle=ExcelUtility.getString(2, 0, "ListPage");
		
		
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterUsernameOnUsernameField(username).enterPasswordOnPasswordField(password).submitButtonField();
		loginpage.navigatetoapage(url);
		
		ManagepagesPage managepage=new ManagepagesPage(driver);
		managepage.mainsearchButtonfield().searchTittleOnSeaarchtittlefield(tittle).listSpecificsearchButtonfield().searchResetButtonfield();
		
	}
	
	
	
	@Test(retryAnalyzer=retry.Retry.class,description="this testcase is using to verify Whether The User Is Able To Delete The List")
	public void verifyWhetherTheUserIsAbleToDeleteTheList()
	{
		String username=ExcelUtility.getString(1, 0, "LoginPage");
		String password=ExcelUtility.getString(1, 1, "LoginPage");
		String url=ExcelUtility.getString(2, 0, "UrlName");
		
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterUsernameOnUsernameField(username).enterPasswordOnPasswordField(password).submitButtonField();
		loginpage.navigatetoapage(url);
		
		ManagepagesPage managepage=new ManagepagesPage(driver);
		managepage.deleteButtonfield();
		
	}
	
	
	
}
