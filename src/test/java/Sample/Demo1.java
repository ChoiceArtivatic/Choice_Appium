package Sample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.testng.annotations.Test;

import Genericutility.BaseClass;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;

public class Demo1 extends BaseClass
{
  @Test
  public void test() throws InterruptedException
  {
	  Thread.sleep(3000);
	  driver.findElementByAccessibilityId("NB Login").click();
	  driver.findElementByAccessibilityId("Start New Application").click();
	  MobileElement newlead =(MobileElement) driver.findElement(By.xpath("//android.widget.RadioButton[1]"));
	  newlead.click();
	  driver.findElementByAccessibilityId("Continue").click();
	 
	  driver.hideKeyboard(); 
	  WebElement fn = driver.findElementByXPath("//android.widget.EditText[contains(@text, 'First name*')]");
	  wLib.explicitwait(driver, fn);
	  fn.click();
	  fn.sendKeys("Amaresha");
	
      WebElement ln = driver.
	  findElementByXPath("//android.widget.EditText[contains(@text, 'Last name*')]");
	  ln.click(); ln.sendKeys("utkur");
	  driver.hideKeyboard();
	  
	  driver.findElement(By.xpath("//android.widget.ImageView[starts-with(@content-desc,'Current')]")).click();
	  
	  driver.findElementByAccessibilityId("ANDHRA PRADESH").click();
		
	  MobileElement ele= (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
		  "new UiScrollable(new UiSelector().scrollable(false))" +
		  ".scrollIntoView(new UiSelector().textContains(\"Planned\"))"));
		//  ele.click();
		 
		  WebElement p=driver.findElement(By.xpath("//android.widget.EditText[starts-with(@text,'Planned')]"));
		  p.click();
		  p.sendKeys("56");


	  MobileElement element = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
		        "new UiScrollable(new UiSelector().scrollable(false))" +
		         ".scrollIntoView(new UiSelector().textContains(\"Total life cover based on future income*\"))"));
	  
	  

	 // WebElement text = driver.findElement(By.xpath("//android.widget.EditText[contains(@text, 'Planned retirement age* Enter details')]"));  
	  //JavascriptExecutor js=(JavascriptExecutor)driver;
	 // js.executeScript("window.scrollBy(0,750)"); 
	  
	
     
		 
  }
}
