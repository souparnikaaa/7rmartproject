package testscripts;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.ManagepagesPage;

public class ManageepagesTest extends Base {

	@Test
	public void verifyWhetherTheUserIsAbleToAddTheList()
	{
		String username="admin";
		String password="admin";
		String url="https://groceryapp.uniqassosiates.com/admin/list-page";
		
		String tittle="rose";
		String description="A rose is either a woody perennial flowering plant of the genus Rosa in the family";
		String page="rose page";
		String filePath = "/Users/souparnikak/Downloads/roseflower.jpeg"; 
		
		
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterUsernameOnUsernameField(username).enterPasswordOnPasswordField(password).submitButtonField();
		loginpage.navigatetoapage(url);
		
		ManagepagesPage managepage=new ManagepagesPage(driver);
managepage.clicknewbuttonButtonfield().entertittleOntittlefield(tittle).enterDescriptionOnDescriptionfield(description).enterPageOnPagefield(page).uploadImageOnimagefield(filePath).clicksaveButtonField();
		
	
		
	}
	@Test
	public void verifyWhetherTheUserIsAbleToSearchTheList()
	{
		String username="admin";
		String password="admin";
		String url="https://groceryapp.uniqassosiates.com/admin/list-page";
		String tittle="Preethi";
		
		
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterUsernameOnUsernameField(username).enterPasswordOnPasswordField(password).submitButtonField();
		loginpage.navigatetoapage(url);
		
		ManagepagesPage managepage=new ManagepagesPage(driver);
		managepage.mainsearchButtonfield().searchTittleOnSeaarchtittlefield(tittle).listSpecificsearchButtonfield().searchResetButtonfield();
		
	}
	
	
	
	@Test
	public void verifyWhetherTheUserIsAbleToDeleteTheList()
	{
		String username="admin";
		String password="admin";
		String url="https://groceryapp.uniqassosiates.com/admin/list-page";
		
		
		
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterUsernameOnUsernameField(username).enterPasswordOnPasswordField(password).submitButtonField();
		loginpage.navigatetoapage(url);
		
		ManagepagesPage managepage=new ManagepagesPage(driver);
		managepage.deleteButtonfield();
		
	}
	
	
	
}
