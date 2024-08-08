package pages;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
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
	
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/news/add']")private WebElement newbuttonfield;
	@FindBy(xpath="//textarea[@id='news']")private WebElement textareafield;
	@FindBy(xpath="//button[text()='Save']")private WebElement savebuttonfield;
	@FindBy(xpath="	//h5[text()=' Alert!']")private WebElement newsalertbox;
	@FindBy(xpath="//a[@onclick='click_button(2)']")private WebElement bluesearchbuttonfield;
	@FindBy(xpath="//input[@placeholder='Title']")private WebElement newsinputfield;
	@FindBy(xpath="//button[@name='Search']")private WebElement redsearchbutton;
	@FindBy(xpath="	//li[@class='page-item active'or@class='page-item']")private List <WebElement> paginationfield;
	@FindBy(xpath="	//tbody/tr")private List <WebElement> rowfield;
	@FindBy(xpath="	//tbody/tr[1]/td[1]")private WebElement firstcellofnews;
	@FindBy(xpath="	//tbody/tr[1]/td[2]/a[2]/i[1]")private WebElement deletebutton;
	@FindBy(xpath="	//h5[normalize-space()='Alert!']")private WebElement newssuccessalert;
	

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
	 
	 public boolean isSearchResultDisplayedInTable(String text) {
		
	String firstcellvalue=firstcellofnews.getText();
	boolean status=false;
			
	if(firstcellvalue.equals(text))
	{
		 status=true;
		
	}
	return status;
		 
	}
	 
	 public ManageNewsPage clickDeleteButton(String text)
	 {
		 int pagesize=paginationfield.size();
		 int rowsize=rowfield.size();
		 int flag=0;
		 
		 for (int i=1;i<=pagesize;i++) 
		 {
			 if(i>1) 
			 {
				 WebElement pagenumber=driver.findElement(By.xpath("//a[normalize-space()="+i+"]"));
				 pagenumber.click();
			 }
			 
		 
			 for (int j=1;j<=rowsize;j++)
			 {
				 WebElement newsvalue=driver.findElement(By.xpath("//tbody/tr["+j+"]/td[1]"));
				 
				 String actualnewsvalue =newsvalue.getText();
				 
				 if(text.equals(actualnewsvalue))
				 {
					 WebElement deletebutton=driver.findElement(By.xpath("//tbody/tr["+j+"]/td[2]/a[2]/i[1]"));
					 deletebutton.click();
					 flag=1; 
					 break;
				 }
				 
			 }
			if(flag==1) 
			{
				break;
			}
	 }
		 Alert alert = driver.switchTo().alert();
	        alert.accept();
		 return this;
		 
	 }
	 
	 
	 public boolean verifySuccessAlertIsDisplayed() {
	        boolean alertDisplayed = newssuccessalert.isDisplayed();
	        return alertDisplayed;
	    }
	 
 
	
}
