package Sample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.testng.annotations.Test;

import Genericutility.BaseClass;
import io.appium.java_client.MobileElement;

public class Sample1 extends BaseClass
{
  @Test
  
  public void test()
  {
	  driver.findElementByAccessibilityId("NB Login").click();
	  driver.findElementByAccessibilityId("Start New Application").click();
	  MobileElement newlead =(MobileElement) driver.findElement(By.xpath("//android.widget.RadioButton[1]"));
	  newlead.click();
	  driver.findElementByAccessibilityId("Continue").click();
	 
	  driver.hideKeyboard(); 
	  WebElement fn = driver.findElementByXPath("//android.widget.EditText[contains(@text, 'First name*')]");
	  wLib.explicitwait(driver, fn);
	  fn.click();
	  fn.sendKeys("Amaresha");
		
      WebElement ln = driver.
	  findElementByXPath("//android.widget.EditText[contains(@text, 'Last name*')]");
	  ln.click(); ln.sendKeys("utkur");
	  driver.hideKeyboard();
	  List<WebElement> list = driver.findElements(By.xpath("//android.view.View[@index='1']"));
	  list.get(4).click();

	  driver.findElementByAccessibilityId("Select year").click();
	  driver.findElementByAccessibilityId("2009").click();
	  driver.findElementByAccessibilityId("2, Wednesday, September 2, 2009").click();
	  driver.findElementByAccessibilityId("OK").click();
	  driver.hideKeyboard();
	  
	  WebElement  ai= driver.findElement(By.xpath("//android.widget.EditText[contains(@text, 'Annual Income Enter details INR')]"));  
	  
}}