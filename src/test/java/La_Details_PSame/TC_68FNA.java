package La_Details_PSame;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import Genericutility.BaseClass;
import io.appium.java_client.MobileElement;

public class TC_68FNA extends BaseClass
{
	@Test
	public void CheckandverifyLAissameasProposerCheckbox()
	{
	  driver.findElementByAccessibilityId("NB Login").click();
	  driver.findElementByAccessibilityId("Start New Application").click();
	  MobileElement newlead =(MobileElement) driver.findElement(By.xpath("//android.widget.RadioButton[1]"));
	  newlead.click();
	  driver.findElementByAccessibilityId("Continue").click();
	 
	  driver.hideKeyboard(); 
	  WebElement fn = driver.findElementByXPath("//android.widget.EditText[contains(@text, 'First name*')]");
	  //wLib.explicitwait(driver, fn);
	  fn.click();
	  fn.sendKeys("Amaresha");
		
      WebElement ln = driver.
	  findElementByXPath("//android.widget.EditText[contains(@text, 'Last name*')]");
	  ln.click(); ln.sendKeys("utkur");
	  driver.hideKeyboard();
	  
	  //driver.findElement(By.xpath("//android.widget.ImageView[@content-desc='Gender Male']")).click();
	  
	  List<WebElement> list = driver.findElements(By.xpath("//android.view.View[@index='1']"));
	  list.get(4).click();

	  driver.findElementByAccessibilityId("Select year").click();
	  driver.findElementByAccessibilityId("2009").click();
	  driver.findElementByAccessibilityId("2, Wednesday, September 2, 2009").click();
	  driver.findElementByAccessibilityId("OK").click();
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
      
      WebElement tae = driver.findElement(By.xpath("//android.widget.EditText[contains(@text, 'Total SA of existing life insurance policies* Enter details')]"));
      tae.sendKeys("2");
      
      driver.findElementByAccessibilityId("Next").click();
      
      WebElement check = driver.findElementByClassName("android.widget.CheckBox");
      Assert.assertEquals(true, check.isDisplayed());
      
	}
      
}