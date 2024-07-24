package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import dev.failsafe.internal.util.Assert;
import utilities.PageUtility;

import static org.testng.Assert.assertTrue;

public class LoginPage {

	public WebDriver driver;
	
	public LoginPage(WebDriver driver) //constructor argument pass
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);	
		
	}
	
	@FindBy(xpath="//input[@placeholder='Username']") WebElement usernamefield;
	
	@FindBy(xpath="//input[@placeholder='Password']") WebElement passwordfield;

	@FindBy(xpath="//button[@type='submit']") WebElement submitbuttton;
	
	@FindBy(xpath="//img[@src='https://groceryapp.uniqassosiates.com/public/assets/admin/dist/img/avatar5.png']") WebElement admin;
	
	@FindBy(xpath="//i[@class='icon fas fa-ban']") WebElement alertbox;
	
	
	public LoginPage enterUsernameOnUsernameField(String username)
	{
		usernamefield.sendKeys(username);
		
	return this;
	}
	
	
	public LoginPage enterPasswordOnPasswordField(String password)
	{
		
		passwordfield.sendKeys(password);
		return this;
	}
	

	public void submitButtonField()
	{
		
		submitbuttton.click();
	}
	
	 public boolean verifyAdminImageIsDisplayed() {
	        boolean adminImageDisplayed = admin.isDisplayed();
	        return adminImageDisplayed;
	    }
	 
	 
	 public boolean verifyAlertIsDisplayed() {
	        boolean alertDisplayed = alertbox.isDisplayed();
	        return alertDisplayed;
	    }
	 
	 //PageUtility pageutility=new PageUtility(); code for utility
		//PageUtility.selectavalueUsingByvisibletext(visiblityby,test data); //code for utility
	  
	
}


