package utilities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitUtility {

	public static final long EXPLICITWAIT=10;
	public static final long IMPLICITWAIT=10;//check in base class
	
	public void waitUntilElementToBeClickable(WebDriver driver,WebElement element)
	{
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(EXPLICITWAIT));
		 wait.until(ExpectedConditions.elementToBeClickable(element));
		   
	}
	
	
	// Wait for an element to be visible
    public void  waitForElementToBeVisible(WebDriver driver,By element) 
    {
    	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(EXPLICITWAIT));
         wait.until(ExpectedConditions.visibilityOfElementLocated(element));
    }

    // Wait for an element to be clickable
    public void  waitForElementToBeClickable(WebDriver driver,By element) 
    {
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(EXPLICITWAIT));
    	wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    // Wait for an element to be present in the DOM
    public void waitForElementToBePresent(WebDriver driver,By element) 
    {
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(EXPLICITWAIT));
         wait.until(ExpectedConditions.presenceOfElementLocated(element));
    }

    // Wait for an element to be invisible
    public void waitForElementToBeInvisible(WebDriver driver,By element)
    {
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(EXPLICITWAIT));
         wait.until(ExpectedConditions.invisibilityOfElementLocated(element));
    }

	
	
	
	
	
	
}
