package Quick_BI;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import Genericutility.BaseClass;
import ObjectRepo.Homepage;
import io.appium.java_client.MobileElement;

public class TC_No1 extends BaseClass
{
 @Test
 public void CheckandverifyQuickBIoptionathomescreen() throws InterruptedException
 {
	 Thread.sleep(3000);	
	WebElement bi = driver.findElementByAccessibilityId("Quick BI");
	 	 Assert.assertEquals(bi.isDisplayed(),true);
 }
}
