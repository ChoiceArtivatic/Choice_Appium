package Proposer_Details;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import Genericutility.BaseClass;
import io.appium.java_client.MobileElement;

public class TC_No31FNA extends BaseClass
{
   @Test
   public void CheckandverifyFirstnameFieldasmandatory()
   {
	      //Navigate to Nb login 
	       driver.findElementByAccessibilityId("NB Login").click();
	       
	      //Click on start new application button and navigate to NB login page
		  driver.findElementByAccessibilityId("Start New Application").click();
		  MobileElement existlead =(MobileElement) driver.findElement(By.xpath("//android.widget.RadioButton[1]"));
		  existlead.click();
		  driver.findElementByAccessibilityId("Continue").click();
		 
		  //Enter firstname and verify firstname textfield is mandatory filed
		  WebElement fn = driver.findElementByXPath("//android.widget.EditText[contains(@text, 'First name*')]");
		  wLib.explicitwait(driver, fn);
		  fn.click();
		  fn.sendKeys("12345s@##");
		  
		  //Verify the textfield it should not accept 
		  String text = fn.getText();
		  Assert.assertEquals(" ", text);		

   }
}
