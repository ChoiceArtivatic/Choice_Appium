package Proposer_Details;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import Genericutility.BaseClass;
import io.appium.java_client.MobileElement;

public class TC_No28FNA extends BaseClass
{
   @Test
   public void CheckandverifyFirstnameFieldasmandatory()
   {
	      //Click on Nb login icon and navigate to start new application  
	      driver.findElementByAccessibilityId("NB Login").click();
		  driver.findElementByAccessibilityId("Start New Application").click();
		  
		  //Select new lead and navigate to NB login page
		  MobileElement existlead =(MobileElement) driver.findElement(By.xpath("//android.widget.RadioButton[1]"));
		  existlead.click();
		  driver.findElementByAccessibilityId("Continue").click();
		 
		  //Enter Firstname and check wheather textfield accepting 25 alphabets
		  WebElement fn = driver.findElementByXPath("//android.widget.EditText[contains(@text, 'First name*')]");
		  wLib.explicitwait(driver, fn);
		  fn.click();
		  String act = fn.getText();
		  Assert.assertEquals("First name*", act);
		  fn.sendKeys("amareshaamamamamanamamananammanbaaababahjebbfbnffhffbfbbfdbfbfh");
		  System.out.println(fn.getText());
			

   }
}
