package NB_Login;

import java.util.List;

import org.apache.bcel.generic.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.testng.Assert;
import org.testng.annotations.Test;

import Genericutility.BaseClass;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;

public class TC_No24FNA extends BaseClass
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
		 
		  WebElement fn = driver.findElementByXPath("//android.widget.EditText[contains(@text, 'First name*')]");
		  wLib.explicitwait(driver, fn);
		  fn.click();
		  fn.sendKeys("Amaresha");
			
	      WebElement ln = driver.
		  findElementByXPath("//android.widget.EditText[contains(@text, 'Last name*')]");
		  ln.click(); ln.sendKeys("utkur");
		  driver.hideKeyboard();
		  
		  driver.findElementByAccessibilityId("Gender Male").click();
		  List<WebElement> list = driver.findElements(By.xpath("//android.view.View[@index='1']"));
		  
		  list.get(4).click();
		  //
		  //driver.findElementByAccessibilityId("Current residential state* Select Options Select Options").click();
		  //driver.findElementByXPath("//*[contains(@text,'Views')]").click();

		 // driver.findelementbya("new UiScrollable(new    UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"WebView\").instance(0))").click();
		  
		 // WebElement element=driver.findElement(By.xpath("//android.widget.EditText[contains(@text, 'Total SA of existing life insurance policies* Enter details')]"));
		 //TouchActions action = new TouchActions(driver);
		 //action.scroll(element, 10, 100);
		 //action.perform();


		  
		 //  WebElement ele = driver.findElementByAccessibilityId("Gender");
		 
		 // org.openqa.selenium.support.ui.Select sel=new org.openqa.selenium.support.ui.Select(ele);
		 //sel.selectByVisibleText("Transgender");
		  
		 }}
