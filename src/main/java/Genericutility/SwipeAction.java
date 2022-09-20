package Genericutility;

import org.openqa.selenium.WebElement;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class SwipeAction 
{
   public void scrollusingtext(AndroidDriver<WebElement> driver,String text)
   {
	   MobileElement element = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
				"new UiScrollable(new UiSelector().scrollable(true))" +
				".scrollIntoView(new UiSelector().textContains(\""+text+"+\"))"));
   }
   
   
   public void scrollusingdescription(AndroidDriver<WebElement> driver,String text)
   {
	   MobileElement element = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
				"new UiScrollable(new UiSelector().scrollable(true))" +
				".scrollIntoView(new UiSelector().description(\""+text+"+\"))"));
   }
}
