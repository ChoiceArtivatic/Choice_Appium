package NB_Login;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import Genericutility.BaseClass;
import io.appium.java_client.MobileElement;

public class TC_No2 extends BaseClass
{
	 @Test
	   public void CheckandverifyNBloginScreen()
	   {
		  //Check and verify Nb login screen
		   driver.findElementByAccessibilityId("NB Login").click();
		   WebElement sele =driver.findElementByAccessibilityId("Start New Application");
		   System.out.println(sele.getText());
		  //Assert.assertEquals(sele.getText(),"Start New Application");
		   
}}
