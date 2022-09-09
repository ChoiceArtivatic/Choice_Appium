package NB_Login;

import org.apache.bcel.generic.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import Genericutility.BaseClass;
import io.appium.java_client.MobileElement;

public class TC_No25FNA extends BaseClass
{
	 @Test
	   public void CheckandverifyNBloginScreen() throws Throwable
	   {
	  
	      Thread.sleep(3000);
	      
	      //Navigate to NB login page
		  driver.findElementByAccessibilityId("NB Login").click();
		  
		  //Navigate to start new application page
		  driver.findElementByAccessibilityId("Start New Application").click();
		  
		  //Select new lead and click on continue,navigate to FNA details page
		  MobileElement existlead =(MobileElement) driver.findElement(By.xpath("//android.widget.RadioButton[1]"));
		  existlead.click();
		  driver.findElementByAccessibilityId("Continue").click();
		 
		  //Navigate to upload pancard page
		 driver.findElementByAccessibilityId("Upload PAN Card").click();
		 
		 driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]")).click();
		 driver.findElement(By.xpath("")).click(); 
	   }}
