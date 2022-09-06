package NB_Login;

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
	       driver.findElementByAccessibilityId("NB Login").click();
		  driver.findElementByAccessibilityId("Start New Application").click();
		  MobileElement existlead =(MobileElement) driver.findElement(By.xpath("//android.widget.RadioButton[1]"));
		  existlead.click();
		  driver.findElementByAccessibilityId("Continue").click();
		 
		  WebElement fn = driver.findElementByXPath("//android.widget.EditText[contains(@text, 'First name*')]");
		  wLib.explicitwait(driver, fn);
		  fn.click();
		  String act = fn.getText();
		  Assert.assertEquals("First name*", act);
		  fn.sendKeys("amareshaamamamamanamamananammanbaaababahjebbfbnffhffbfbbfdbfbfh");
		  System.out.println(fn.getText());
			

   }
}
