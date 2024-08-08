package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.FileUploadUtility;
import utilities.PageUtility;

public class SubCategoryPage {
public WebDriver driver;
//public String filePath;

	public SubCategoryPage(WebDriver driver) //constructor argument pass
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);	
		
	}

	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/Subcategory/add']")private WebElement newbutton;
	@FindBy(xpath="//select[@id='cat_id']")private WebElement categoryfield;
	@FindBy(xpath="//input[@placeholder='Enter the Subcategory']")private WebElement subcategoryfield;
	@FindBy(xpath="//input[@id='main_img']")private WebElement imageuploadfield;
	@FindBy(xpath="//button[text()='Save']")private WebElement savebutton;
	@FindBy(xpath="//i[@class='icon fas fa-check']")private WebElement successalertmessage;
	
	@FindBy(xpath="//i[@class='icon fas fa-ban']")private WebElement subcategoryallreadyexistalert;
	public SubCategoryPage clickOnNewButton()
	{
		newbutton.click();
		return this;
	}
	
	public SubCategoryPage selectCategoryFromDropdown()
	{
		
		PageUtility pageutility=new PageUtility();
		pageutility.selectByValue(categoryfield, "167");
		return this;
	}
	
	public SubCategoryPage enterSubCategory(String subcategory)
	{
		subcategoryfield.sendKeys(subcategory);
		return this;
	}
	
	
	public SubCategoryPage uploadImage(String filePath)
	{
		FileUploadUtility fileuploadutility=new FileUploadUtility();
		fileuploadutility.fileuploadUtilityUsingSendkeys(imageuploadfield,filePath);
		
		return this;
	}
	
	
	public SubCategoryPage clicksaveButton()
	{
		savebutton.click();
		return this;
	}
	
	
	 public boolean verifyAlertIsDisplayedForCategory() {
	        boolean alertDisplayed = successalertmessage.isDisplayed();
	        return alertDisplayed;
	    }
	
	 public boolean verifySubCategoryalreadyexistsAlertIsDisplayedforduplicateSubCategory() {
	        boolean alertDisplayed = subcategoryallreadyexistalert.isDisplayed();
	        return alertDisplayed;
	    }
	
	
	
	
}
