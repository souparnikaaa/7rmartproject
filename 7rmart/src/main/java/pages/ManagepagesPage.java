package pages;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.PageUtility;
import utilities.WaitUtility;

public class ManagepagesPage  {
public WebDriver driver;
	
	public ManagepagesPage(WebDriver driver) //constructor argument pass
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);	
		
	}
	
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/pages/add']")WebElement newbutton;
	@FindBy(xpath="//input[@placeholder='Enter the Title']")private WebElement tittlefield;
	@FindBy(xpath="//div[@role='textbox']")private WebElement Descriptionfield;
	@FindBy(xpath="//input[@placeholder='Enter Page Name']")private WebElement Pagefield;
	@FindBy(xpath="//input[@id='main_img']")private WebElement imagefield;
	@FindBy(xpath="//button[@name='create']")private WebElement savebutton;
    @FindBy(xpath="//a[@href='javascript:void(0)']")private WebElement searchbutton;
	@FindBy(xpath="//input[@placeholder='Title']")private WebElement searchtittlefield;
	@FindBy(xpath="//button[@name='Search']")private WebElement searchredbutton;
	@FindBy(xpath="//a[text()='Reset']")private WebElement resetbutton;
	
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/pages/delete?del=1493&page_ad=1']")private WebElement deletebutton;
	
		public ManagepagesPage clicknewbuttonButtonfield()
	{
		newbutton.click();
		
	return this;
	}

	public ManagepagesPage entertittleOntittlefield(String tittle)
	{
		tittlefield.sendKeys(tittle);
		
	return this;
	}

	
	public ManagepagesPage enterDescriptionOnDescriptionfield(String description)
	{
		Descriptionfield.sendKeys(description);
		
	return this;
	}


	public ManagepagesPage enterPageOnPagefield(String page)
	{
		Pagefield.sendKeys(page);
		
	return this;
	}


	
	public ManagepagesPage uploadImageOnimagefield(String filePath)
	{
		 
		 imagefield.sendKeys(filePath);
	        return this;
	}

	
	
	public ManagepagesPage clicksaveButtonField()
	{   
		PageUtility pageutility=new PageUtility();
		pageutility.forceClickUsingJavaScriptExecutor(driver, savebutton);

	return this;
	}


	
	
	public ManagepagesPage mainsearchButtonfield()
	{
		searchbutton.click();
		
	return this;
	}

	
	public ManagepagesPage searchTittleOnSeaarchtittlefield(String tittle)
	{
		searchtittlefield.sendKeys(tittle);
		
	return this;
	}
	

	public ManagepagesPage listSpecificsearchButtonfield()
	{
		searchredbutton.click();
		
	return this;
	}
	
	
	
	public ManagepagesPage searchResetButtonfield()
	{
		resetbutton.click();
		
	return this;
	}
	

	
	public ManagepagesPage deleteButtonfield()
	{
		
		deletebutton.click();
		Alert alert = driver.switchTo().alert();
        alert.accept();
		
	return this;
	}
	

	
}
