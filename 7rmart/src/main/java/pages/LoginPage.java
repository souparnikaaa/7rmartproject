package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.PageUtility;
import utilities.WaitUtility;

public class LoginPage {

	public WebDriver driver;
	
	public LoginPage(WebDriver driver) //constructor argument pass
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);	
		
	}
	
	@FindBy(xpath="//input[@placeholder='Username']")private WebElement usernamefield;
	
	@FindBy(xpath="//input[@placeholder='Password']")private WebElement passwordfield;

	@FindBy(xpath="//button[@type='submit']")private WebElement submitbuttton;
	
	@FindBy(xpath="//img[@src='https://groceryapp.uniqassosiates.com/public/assets/admin/dist/img/avatar5.png']")private WebElement admin;
	
	@FindBy(xpath="//i[@class='icon fas fa-ban']")private WebElement alertbox;
	
	
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
	

	public LoginPage submitButtonField()
	{
		WaitUtility waitutility=new WaitUtility();
		waitutility.waitUntilElementToBeClickable(driver, submitbuttton);
		submitbuttton.click();
		return this;
		
	}
	
	 public boolean verifyAdminImageIsDisplayed() {
	        boolean adminImageDisplayed = admin.isDisplayed();
	        return adminImageDisplayed;
	 }
	 
	 
	 public boolean verifyAlertIsDisplayed() {
	        boolean alertDisplayed = alertbox.isDisplayed();
	        return alertDisplayed;
	  }
	 
	 
	 public LoginPage navigatetoapage(String url)
	  {
			PageUtility pageUtility=new PageUtility();
			pageUtility.navigatetoanotherpage(driver, url);	
		return this;
	  }
	 
	 
	  
	
}


