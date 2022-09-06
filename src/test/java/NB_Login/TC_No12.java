package NB_Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import Genericutility.BaseClass;
import io.appium.java_client.MobileElement;

public class TC_No12 extends BaseClass
{
	 @Test
	   public void CheckandverifyNBloginScreen() throws Throwable
	   {
	      Thread.sleep(3000);
		  driver.findElementByAccessibilityId("NB Login").click();
		  driver.findElementByAccessibilityId("Start New Application").click();
		  MobileElement ele = (MobileElement)driver.findElementByAccessibilityId("New lead");
		  ele.click();
		  String text = ele.getText();
		  System.out.println(text);
		 
}}
