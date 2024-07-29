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
	
	@FindBy(xpath="//input[@placeholder='Enter the Title']")WebElement tittlefield;
	@FindBy(xpath="//div[@role='textbox']")WebElement Descriptionfield;
	@FindBy(xpath="//input[@placeholder='Enter Page Name']")WebElement Pagefield;
	@FindBy(xpath="//input[@id='main_img']")WebElement imagefield;
	@FindBy(xpath="//button[text()='Save']")WebElement savebutton;
	
	@FindBy(xpath="//a[@href='javascript:void(0)']")WebElement searchbutton;
	@FindBy(xpath="//input[@placeholder='Title']")WebElement searchtittlefield;
	@FindBy(xpath="//button[@name='Search']")WebElement searchredbutton;
	@FindBy(xpath="//a[text()='Reset']")WebElement resetbutton;
	
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/pages/delete?del=1493&page_ad=1']")WebElement deletebutton;
	
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
		
		savebutton.click();
		
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
