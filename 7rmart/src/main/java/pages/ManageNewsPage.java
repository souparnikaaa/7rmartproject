package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageNewsPage {
public WebDriver driver;
	
	public ManageNewsPage(WebDriver driver) //constructor argument pass
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);	
		
	}
	
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/news/add']")WebElement newbuttonfield;
	@FindBy(xpath="//textarea[@id='news']")WebElement textareafield;
	@FindBy(xpath="//button[text()='Save']")WebElement savebuttonfield;
	@FindBy(xpath="	//h5[text()=' Alert!']")WebElement newsalertbox;
	
	@FindBy(xpath="//a[@onclick='click_button(2)']")WebElement bluesearchbuttonfield;
	@FindBy(xpath="//input[@placeholder='Title']")WebElement newsinputfield;
	@FindBy(xpath="//a[@onclick='click_button(2)']")WebElement redsearchbutton;
	
	
	
	
	public ManageNewsPage clickNewbuttonButtonfield()
	{
		newbuttonfield.click();
		return this;
	}
	
	
	public ManageNewsPage enterTextOntextareafield(String text)
	{
		textareafield.sendKeys(text);
		return this;
	}
	

	public ManageNewsPage clickOnSavebuttonButtonfield()
	{
		savebuttonfield.click();
		return this;
	}
	
	 public boolean verifynewsCreatedAlertIsDisplayed() {
	        boolean alertDisplayed = newsalertbox.isDisplayed();
	        return alertDisplayed;
	    }
	
	 public ManageNewsPage clickOnMainsearchbuttonButtonfield()
		{
		 bluesearchbuttonfield.click();
			return this;
		}
	 
	 public ManageNewsPage enterNewsOnnewsinputfield(String text)
		{
		 newsinputfield.sendKeys(text);
			return this;
		}
	 
	 public ManageNewsPage clickOnNewsSpecificsearchbuttonButtonfield()
		{
		 redsearchbutton.click();
			return this;
		}
	
}
