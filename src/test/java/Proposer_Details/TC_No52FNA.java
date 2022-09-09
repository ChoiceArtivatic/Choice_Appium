package Proposer_Details;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import Genericutility.BaseClass;
import io.appium.java_client.MobileElement;

public class TC_No52FNA  extends BaseClass
{
   @Test
   public void CheckandverifyAnnualSavingField()
   {	
	  driver.findElementByAccessibilityId("NB Login").click();
	  driver.findElementByAccessibilityId("Start New Application").click();
	  MobileElement existlead =(MobileElement) driver.findElement(By.xpath("//android.widget.RadioButton[1]"));
	  existlead.click();
	  driver.findElementByAccessibilityId("Continue").click();
	 
	  driver.hideKeyboard();
	 	  
	  WebElement ae = driver.findElement(By.xpath("//android.widget.EditText[contains(@text, 'Annual Expense Enter details INR')]"));  
	  ae.sendKeys("100000");
	  
	  WebElement  ai= driver.findElement(By.xpath("//android.widget.EditText[contains(@text, 'Annual Income Enter details INR')]"));  
	  ai.sendKeys("560000");
	  
	  WebElement as = driver.findElement(By.xpath("//android.widget.EditText[contains(@text, 'Annual saving* Enter details INR')]"));
           String text = as.getText();	  
           Assert.assertEquals(text, "460000");
   }
}