package Proposer_Details;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import Genericutility.BaseClass;
import io.appium.java_client.MobileElement;

public class TC_No35FNA extends BaseClass
{
   @Test
   public void CheckandverifyLastnameFieldasmandatory()
   {
	      //Navigate to Nb login 
	       driver.findElementByAccessibilityId("NB Login").click();
	       
	      //Click on start new application button and navigate to NB login page
		  driver.findElementByAccessibilityId("Start New Application").click();
		  MobileElement existlead =(MobileElement) driver.findElement(By.xpath("//android.widget.RadioButton[1]"));
		  existlead.click();
		  driver.findElementByAccessibilityId("Continue").click();
		 
		  //Enter lastname and verify lastname textfield is mandatory filed
		  WebElement ln = driver.findElementByXPath("//android.widget.EditText[contains(@text, 'Last name*')]");
		  wLib.explicitwait(driver, ln);
		  ln.click();
		  String act = ln.getText();
		  Assert.assertEquals("First name*", act);


   }
   }
