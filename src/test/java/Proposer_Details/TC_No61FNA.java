package Proposer_Details;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import Genericutility.BaseClass;
import io.appium.java_client.MobileElement;

public class TC_No61FNA extends BaseClass
{
	 @Test
	   public void CheckandverifyTotallifecoverbasedonfutureincomeField()
	   {	
		  driver.findElementByAccessibilityId("NB Login").click();
		  driver.findElementByAccessibilityId("Start New Application").click();
		  MobileElement existlead =(MobileElement) driver.findElement(By.xpath("//android.widget.RadioButton[1]"));
		  existlead.click();
		  driver.findElementByAccessibilityId("Continue").click();
		 
		  driver.hideKeyboard();
		 	  
		  driver.findElement(By.xpath("//android.widget.EditText[contains(@text, 'Planned retirement age* Enter details')]")).sendKeys("58");
		  WebElement ae = driver.findElement(By.xpath("//android.widget.EditText[contains(@text, 'Annual Expense Enter details INR')]"));  
		  ae.sendKeys("100000");
		  
		  WebElement  ai= driver.findElement(By.xpath("//android.widget.EditText[contains(@text, 'Annual Income Enter details INR')]"));  
		  ai.sendKeys("560000");
		  
		  WebElement tlc= driver.findElement(By.xpath("//android.widget.EditText[contains(@text, 'Total life cover based on future income* Enter details INR')]"));
	      String text = tlc.getText();	  
	      Assert.assertEquals(text, "460000");
	      WebElement cl = driver.findElement(By.xpath("//android.widget.EditText[contains(@text, 'Current liabilities (loans/mortgages etc)* Enter details')]"));
	      cl.sendKeys("5700");
	   }

}
