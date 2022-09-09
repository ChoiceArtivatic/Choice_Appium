package Proposer_Details;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import Genericutility.BaseClass;
import io.appium.java_client.MobileElement;

public class TC_No39FNA  extends BaseClass
{
   @Test
   public void checkandverifyDOBismandatory()
   {	
	 driver.findElementByAccessibilityId("NB Login").click();
	  driver.findElementByAccessibilityId("Start New Application").click();
	  MobileElement existlead =(MobileElement) driver.findElement(By.xpath("//android.widget.RadioButton[1]"));
	  existlead.click();
	  driver.findElementByAccessibilityId("Continue").click();
	 
	  WebElement fn = driver.findElementByXPath("//android.widget.EditText[contains(@text, 'First name*')]");
	  wLib.explicitwait(driver, fn);
	  fn.click();
	  fn.sendKeys("Amaresha");
		
      WebElement ln = driver.
	  findElementByXPath("//android.widget.EditText[contains(@text, 'Last name*')]");
	  ln.click(); ln.sendKeys("utkur");
	  driver.hideKeyboard();
	  
	  driver.findElementByAccessibilityId("Gender Male").click();
	  List<WebElement> list = driver.findElements(By.xpath("//android.view.View[@index='1']"));
	  
	  boolean act = list.get(4).isDisplayed();
	  
	  Assert.assertEquals(act,"true");
	  
	  
	  

}
}