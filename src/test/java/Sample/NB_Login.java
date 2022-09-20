package Sample;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Genericutility.BaseClass;
import ObjectRepo.Homepage;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;

public class NB_Login extends BaseClass
{
  @Test
  public void Tc420() throws Throwable
  {
	  Thread.sleep(3000);
		//Click on QuickBi icon navigate to QuickBi page
		WebDriverWait wait=new WebDriverWait(driver, 20);
		WebElement bi = driver.findElementByAccessibilityId("Quick BI");
		bi.click();
      
		//Click on retail and navigate to product page details
		WebElement ret = driver.findElementByAccessibilityId("Retail"); 
		ret.click();	 

		//select Jeevan Nivesh Plan
		driver.findElementByAccessibilityId("Jeevan Nivesh Plan").click();

		//Navigate to next page
		driver.findElementByAccessibilityId("Next").click();

		//Select options from all dropdowns
		driver.findElement(By.xpath("//android.widget.ImageView[@index='1']")).click();
		driver.findElementByAccessibilityId("10").click();

		driver.findElement(By.xpath("//android.widget.ImageView[@index='3']")).click();
		driver.findElementByAccessibilityId("5").click();

		driver.findElement(By.xpath("//android.widget.ImageView[@index='5']")).click();
		driver.findElementByAccessibilityId("Annual").click();

		driver.findElement(By.xpath("//android.widget.ImageView[@index='7']")).click();
		driver.findElementByAccessibilityId("Yes").click();

		driver.findElement(By.xpath("//android.widget.ImageView[@index='9']")).click();
		driver.findElementByAccessibilityId("Yes").click();

		driver.findElement(By.xpath("//android.widget.ImageView[@index='11']")).click();
		driver.findElementByAccessibilityId("Endowment").click();

		MobileElement element = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
				"new UiScrollable(new UiSelector().scrollable(true))" +
				".scrollIntoView(new UiSelector().textContains(\"Enter Sum Assured\"))"));

		driver.findElement(By.xpath("//android.widget.ImageView[@index='7']")).click();
		driver.findElementByAccessibilityId("Yes").click();

		//Enter the sum value 
		WebElement sum = driver.findElement(By.xpath("//android.widget.EditText[@text='Enter Sum Assured']"));
		sum.click();
		sum.sendKeys("350000");
		driver.hideKeyboard();

		Thread.sleep(2000);
		//Navigate to next page
		driver.findElement(By.xpath("//android.widget.Button[starts-with(@content-desc,'Next')]")).click();

		////navigate to LA details page
		//driver.findElementByAccessibilityId("skip").click();
		
		driver.findElementByAccessibilityId("Life Assured").click();
		
		//Switch to Native_App
       /* Set<String> contextNames = driver.getContextHandles();
        for (String strContextName : contextNames) {
            if (strContextName.contains("NATIVE_APP")) {
                driver.context("NATIVE_APP");
                break;
            }}*/
             
		 driver.findElement(By.xpath("//android.widget.ImageView[@index='2']")).click();
  }   
}
