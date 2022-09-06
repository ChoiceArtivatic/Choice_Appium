package NB_Login;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import Genericutility.BaseClass;
import io.appium.java_client.MobileElement;

public class TC_No1 extends BaseClass
{
   @Test
   public void VerifyNBLoginicon()
   {
	   MobileElement ele =(MobileElement) driver.findElementByAccessibilityId("NB Login");
	   String actual = ele.getText();
	   System.out.println(actual);
	   Assert.assertEquals("NB Login","NB Login");

   }
}
