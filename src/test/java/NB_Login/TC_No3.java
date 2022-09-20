package NB_Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import Genericutility.BaseClass;
import io.appium.java_client.MobileElement;

public class TC_No3 extends BaseClass
{
	 @Test
	   public void CheckandverifyNBloginScreen() throws Throwable
	   {
		   Thread.sleep(3000);
		  //Click on Nb login icon and navigate to start new application
		  driver.findElementByAccessibilityId("NB Login").click();
		  
		  WebElement ele = driver.findElement(By.xpath("//android.widget.EditText[contains(@text, 'Search by Lead ID, LA name Search')]"));
		  ele.click();
		  ele.sendKeys("202");
		   

}}
