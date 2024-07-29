package utilities;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class PageUtility {

	
	 public void navigatetoanotherpage(WebDriver driver,String url)
	 {
		 driver.navigate().to(url);
	 }
	
	 
	public String getAttribute(WebElement element, String attributeName) {
        return element.getAttribute(attributeName);
    }
	
	
	
	public void selectavalueUsingByvisibletext(WebElement element,String text)
	
	{
		Select select=new Select(element);
		select.selectByVisibleText(text);
		
				
	}

    public void selectByIndex(WebElement element, int index) {
        Select select = new Select(element);
        select.selectByIndex(index);
    }

    public void selectByValue(WebElement element, String value) {
        Select select = new Select(element);
        select.selectByValue(value);
    }
	
	
    public void rightClickElement(WebDriver driver,WebElement element) {
     
		Actions actions = new Actions(driver);
        actions.contextClick(element).perform();
    }
	
    
    public void clickElement(WebDriver driver,WebElement element) {
        
		Actions actions = new Actions(driver);
        actions.click(element).perform();
    }
    
    
    
	
    public void  scrollToBottom(WebDriver driver)
    {
    	
		JavascriptExecutor js = (JavascriptExecutor) driver;
    	js.executeScript("window.scrollBy(0,250)", "");
    }
    
    
    
    public void  scrollToTop(WebDriver driver)
    {
    	
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,-250)", "");
    }
    
    public void  scrollToEndOfPage(WebDriver driver)
    {
    	
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
    }
    
    
	
	
}












//PageUtility pageutility=new PageUtility(); code for utility in page class
		//PageUtility.selectavalueUsingByvisibletext(visiblityby,test data); //code for utility in page class