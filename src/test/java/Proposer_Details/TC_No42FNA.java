package Proposer_Details;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import Genericutility.BaseClass;
import io.appium.java_client.MobileElement;

public class TC_No42FNA  extends BaseClass
{
   @Test
   public void checkandverifyDOBismandatory()
   {	
	  driver.findElementByAccessibilityId("NB Login").click();
	  driver.findElementByAccessibilityId("Start New Application").click();
	  MobileElement existlead =(MobileElement) driver.findElement(By.xpath("//android.widget.RadioButton[1]"));
	  existlead.click();
	  driver.findElementByAccessibilityId("Continue").click();
	 
	  driver.hideKeyboard();
	  
	  driver.findElementByAccessibilityId("Gender Male").click();
   	  

	  
	  
	  

}
}