package utilities;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebElement;

public class FileUploadUtility {

	
public void FileUploadUtility(WebElement element,String filePath)
	
	{
	StringSelection ss = new StringSelection(filePath); 
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null); 
		
		try { 
        Robot robot = new Robot(); 
        robot.delay(250); 


        robot.keyPress(KeyEvent.VK_ENTER); 
        robot.keyRelease(KeyEvent.VK_ENTER); 

        // Mac typically uses COMMAND key instead of CONTROL for paste 
       robot.keyPress(KeyEvent.VK_META); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_META); 


        
        robot.keyPress(KeyEvent.VK_ENTER); 
        robot.delay(90); 
        robot.keyRelease(KeyEvent.VK_ENTER); 
    } catch (Exception e) { 
        e.printStackTrace(); 
    } 
		
				
	}
	
	
	
	
	
}
