package NB_Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import Genericutility.BaseClass;
import ObjectRepo.Sample;
import io.appium.java_client.MobileElement;

public class TC_No3 extends BaseClass
{
	 @Test
	   public void CheckandverifyNBloginScreen() throws Throwable
	   {
		   Thread.sleep(3000);
		  driver.findElementByAccessibilityId("NB Login").click();
		  Sample s=new Sample(driver);
		// WebElement ele=s.getSearchbylead_link();
		 //ele.click();
		 //ele.sendKeys("123s");
		  
		  WebElement ele = driver.findElement(By.xpath("//android.widget.EditText[contains(@text, 'Search by Lead ID, LA name Search')]"));
		  ele.click();
		  ele.sendKeys("202");
		   

}}
