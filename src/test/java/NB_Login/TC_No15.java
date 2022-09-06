package NB_Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import Genericutility.BaseClass;
import io.appium.java_client.MobileElement;

public class TC_No15 extends BaseClass
{
	 @Test
	   public void CheckandverifyNBloginScreen() throws Throwable
	   {
		  
	      Thread.sleep(3000);
		  driver.findElementByAccessibilityId("NB Login").click();
		  driver.findElementByAccessibilityId("Start New Application").click();
		  MobileElement newlead =(MobileElement) driver.findElement(By.xpath("//android.widget.RadioButton[1]"));
		  Assert.assertEquals(newlead.isDisplayed(), true);
		  MobileElement existlead =(MobileElement) driver.findElement(By.xpath("//android.widget.RadioButton[2]"));
		  Assert.assertEquals(existlead.isDisplayed(), true);		  
		 
}}
