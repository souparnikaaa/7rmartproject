package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.PageUtility;
import utilities.WaitUtility;

public class CategoryPage {
public WebDriver driver;
	
	public CategoryPage(WebDriver driver) //constructor argument pass
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);	
		
	}

	
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/Category/add']")private WebElement newbutton;
	
	@FindBy(xpath="//input[@placeholder='Enter the Category']")private WebElement categoryfield;
	
	@FindBy(xpath="//li[@id='134-selectable']")private WebElement selectgroupfield;
	
	@FindBy(xpath="//input[@id='main_img']")private WebElement imageuploadfield;
	
	@FindBy(xpath="(//input[@value='yes'])[1]")private WebElement topmenuyesradiobutton;
	
	@FindBy(xpath="(//input[@value='no'])[1]")private WebElement topmenunoradiobutton;
	
	@FindBy(xpath="(//input[@value='yes'])[2]")private WebElement leftmenuyesradiobutton;

	@FindBy(xpath="(//input[@value='no'])[2]")private WebElement leftmenunoradiobutton;
			
	@FindBy(xpath="//button[text()='Save']")private WebElement savebuttonfield;
	
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")private WebElement succsessalertmessage;
	
	
	
	
	public CategoryPage clickOnNewButton()
	{
		newbutton.click();
		return this;
	}
	
	
	public CategoryPage enterCategoryOnCategoryField(String category)
	{
		categoryfield.sendKeys(category);
		return this;
	}
	
	
	public CategoryPage selectTheDiscount()
	{
		
			selectgroupfield.click();
			return this;
	}
	
	
	public 	CategoryPage uploadImageField(String filepath) 
	{
			
		imageuploadfield.sendKeys(filepath);
		return this;
			
	}
	
	public 	CategoryPage clickTopMenuRadioButton()
	{
		PageUtility pageutility=new PageUtility();
		pageutility.radioButton(driver, topmenuyesradiobutton, topmenunoradiobutton);
		

		return this;
	}
	
	
	public 	CategoryPage clickLeftMenuRadioButton()
	{   
		PageUtility pageutility=new PageUtility();
		pageutility.radioButton(driver, leftmenuyesradiobutton, leftmenunoradiobutton);
		
		return this;
	}


	public CategoryPage clickOnSaveButton()
	{
		WaitUtility waitutility=new WaitUtility();
		waitutility.waitUntilElementToBeClickable(driver, savebuttonfield);
		savebuttonfield.click();
		return this;
	}
	
	 public boolean verifyAlertIsDisplayedForCategory() {
	        boolean alertDisplayed = succsessalertmessage.isDisplayed();
	        return alertDisplayed;
	}
	
	 
	 
	 
	
}
