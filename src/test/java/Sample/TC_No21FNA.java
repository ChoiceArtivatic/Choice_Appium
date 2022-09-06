package Sample;

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
		 driver.findElement(By.xpath("//android.view.View[@content-desc=\"LA details\"]/android.view.View[1]/android.view.View/android.widget.ImageView[1]")).click();
		 WebElement proposer=driver.findElement(By.xpath("//android.widget.ImageView[contains(@text, 'Proposer details')]"));
		 //proposer.click();
		// Assert.assertEquals(proposer.isDisplayed(), true);
		 
		 //Verify LA detials page
		 driver.findElement(By.xpath("//android.view.View[@content-desc=\"LA details\"]/android.view.View[1]/android.view.View/android.widget.ImageView[2]")).click();
		 WebElement La=driver.findElement(By.xpath("//android.widget.ImageView[contains(@text, 'LA details')]"));
		// La.click();
		 //Assert.assertEquals(La.isDisplayed(), true);
		 
		 //Verify Suitability matrix page
		 driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Suitability matrix\"]/android.view.View[1]/android.view.View/android.widget.ImageView[3]")).click();
		 WebElement sm=driver.findElement(By.xpath("//android.widget.ImageView[contains(@text, 'Suitability matrix')]"));
		 //sm.click();
		 //Assert.assertEquals(sm.isDisplayed(), true);
		 
		 //Verify other details page
		 driver.findElement(By.xpath("//android.view.View[@content-desc=\"Other details\"]/android.view.View[1]/android.view.View/android.widget.ImageView[4]")).click();
		 WebElement od=driver.findElement(By.xpath("//android.widget.ImageView[contains(@text, 'Other details')]"));
		 //od.click();
		 //Assert.assertEquals(od.isDisplayed(), true);	

		 
}}
