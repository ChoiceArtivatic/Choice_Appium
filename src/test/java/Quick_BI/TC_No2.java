package Quick_BI;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import Genericutility.BaseClass;

public class TC_No2 extends BaseClass
{
	 @Test
	 public void CheckandverifyQuickBIscreen() throws InterruptedException
	 {
		 WebDriverWait wait=new WebDriverWait(driver, 20);
		 WebElement bi = driver.findElementByAccessibilityId("Quick BI");
		 bi.click();
		
		 WebElement ret = driver.findElementByAccessibilityId("Retail"); 
		 WebElement gb = driver.findElementByAccessibilityId("Group Business");
    	 Assert.assertEquals(ret.isDisplayed(),true);
    	 Assert.assertEquals(gb.isDisplayed(),true);
	 }
}
