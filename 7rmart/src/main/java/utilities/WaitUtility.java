package utilities;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitUtility {

	public static final long EXPLICITWAIT=10;
	public static final long IMPLICITWAIT=10;//check in base class
	
	private long timeoutInSeconds;
    private long pollingSeconds;
	private WebDriver driver;

	
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

  

    // Wait for an element to be present in the DOM
    public WebElement waitForElementToBePresent(WebDriver driver,By element) 
    {
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(EXPLICITWAIT));
        return wait.until(ExpectedConditions.presenceOfElementLocated(element));
    }

    // Wait for an element to be invisible
    public void waitForElementToBeInvisible(WebDriver driver,By element)
    {
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(EXPLICITWAIT));
         wait.until(ExpectedConditions.invisibilityOfElementLocated(element));
    }

  //fluent wait
    public void FluentWaitUtility(WebDriver driver, long timeoutInSeconds, long pollingSeconds) {
        this.driver = driver;
        this.timeoutInSeconds = timeoutInSeconds;
        this.pollingSeconds = pollingSeconds;
    }
	
  

    public WebElement fluentWaitForElementToBeClickable(By locator,WebElement element) 
    {
        Wait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(timeoutInSeconds))
                .pollingEvery(Duration.ofSeconds(pollingSeconds))
                .ignoring(NoSuchElementException.class);

        return  fluentWait.until(ExpectedConditions.elementToBeClickable(element));
       

    }
	
    public WebElement fluentWaitForElementToBeVisible(By locator,By element) 
    {
        Wait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(timeoutInSeconds))
                .pollingEvery(Duration.ofSeconds(pollingSeconds))
                .ignoring(NoSuchElementException.class);

        return  fluentWait.until(ExpectedConditions.visibilityOfElementLocated(element));
       

    }
    
    public WebElement fluentWaitForElementToBePresent(By locator,By element) 
    {
        Wait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(timeoutInSeconds))
                .pollingEvery(Duration.ofSeconds(pollingSeconds))
                .ignoring(NoSuchElementException.class);

        return   fluentWait.until(ExpectedConditions.presenceOfElementLocated(element));
       

    }
    
   
 
	
}
