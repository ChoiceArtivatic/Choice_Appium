package NB_Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import Genericutility.BaseClass;
import io.appium.java_client.MobileElement;

public class TC_No21FNA extends BaseClass
{
	 @Test
	   public void CheckandverifyNBloginScreen() throws Throwable
	   {
		  
	      Thread.sleep(3000);
		  driver.findElementByAccessibilityId("NB Login").click();
		  driver.findElementByAccessibilityId("Start New Application").click();
		  MobileElement existlead =(MobileElement) driver.findElement(By.xpath("//android.widget.RadioButton[1]"));
		  existlead.click();
		  driver.findElementByAccessibilityId("Continue").click();
		  
		 //Verify proposer page  
		// driver.findElementByAccessibilityId("Proposer details").click();
		 ////android.view.View[@content-desc="LA details"]/android.view.View[1]/android.view.View/android.widget.ImageView[2]
		 
		 //Verify LA detials page
		// driver.findElementByAccessibilityId("LA details").click();
		 driver.findElement(By.xpath("//android.view.View[@content-desc=\"LA details\"]/android.view.View[1]/android.view.View/android.widget.ImageView[2]")).click();
		
		 
		 //Verify Suitability matrix page
		// driver.findElement(By.xpath("//android.widget.ImageView[@content-desc='Suitability matrix']")).click();
		 		 
		 //Verify other details page
		 //driver.findElement(By.xpath("//android.view.View[@content-desc=\"Other details\"]/android.view.View[1]/android.view.View/android.widget.ImageView[4]")).click();
		 		 
}}
