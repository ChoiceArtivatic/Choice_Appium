package Genericutility;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.android.AndroidDriver;
  /**
  * This class contains all the Webdriver action methods
  */

public class Webdriverutility 
{
	/**
	 * wait for an element in particular page/dom
	 * @param driver
	 */
     	public void implicitwait(AndroidDriver<WebElement> driver)
	{
         driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);		
	}
	/**
	 * 
	 * @param 
	 *This method use for an element wait until the expected condition 
	 */
     	public void explicitwait(AndroidDriver<WebElement> driver,WebElement ele)
     	{
     		WebDriverWait wait=new WebDriverWait(driver,20);
     		wait.until(ExpectedConditions.visibilityOf(ele));
     	}
     	
     	/**
     	 * This method is used for handle dropdown using visibletext
     	 */
     	public void selectByvisibletext(WebElement ele,String text)
     	{
     		Select sel=new Select(ele);
     		sel.selectByVisibleText(text);
     	}
     	
     	/**
     	 * This method is used for handle dropdown using index
     	 */
     	public void selectByvisibletext(WebElement ele,int index)
     	{
     		Select sel=new Select(ele);
     		sel.selectByIndex(index);
     	}
     	
     	/**
     	 * This method used for mouseover action using action class
     	 */
     	public void mouseovertoelement(WebDriver driver,WebElement ele)
     	{
         Actions act=new Actions(driver);
         act.moveToElement(ele);
     	}
      
     	/**
     	 * This method used for Right click action
     	 */
     	public void rightclickaction(WebDriver driver,WebElement ele)
     	{
         Actions act=new Actions(driver);
         act.contextClick(ele);
     	}
     	
     	/**
     	 * This method used for double click action
     	 */
     	public void doubleclickaction(WebDriver driver,WebElement ele)
     	{
         Actions act=new Actions(driver);
         act.doubleClick(ele);
     	}
     	
     	/**
     	 * This method contains alert pop up accept
     	 */
        public void alertaccept(WebDriver driver)
        {
        	driver.switchTo().alert().accept();
        }

        /**
     	 * This method contains alert popup accept
     	 */
        public void alertdismiss(WebDriver driver)
        {
        	driver.switchTo().alert().dismiss();
        }
       
        /**
         * This method used for switching between Childwindows
         */
        public void switchtowindow(WebDriver driver,String Expectedtitle)
        {
        	Set<String> ids = driver.getWindowHandles();
        	Iterator<String> it = ids.iterator();
        	while(it.hasNext())
        	{
        		String cid = it.next();
        		String acttitle=driver.switchTo().window(cid).getTitle();
        		if(acttitle.contains(Expectedtitle))
        		{
        			break;
        		}
        	}
        }
}
