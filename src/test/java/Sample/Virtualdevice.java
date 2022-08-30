package Sample;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class Virtualdevice
{
  @Test
  public void test() throws Throwable
     {
	    DesiredCapabilities dc=new DesiredCapabilities();
	    //dc.setCapability( "automationName", "Appium ");
	    dc.setCapability( "platformName", "Android");
	   dc.setCapability("deviceName","Android Emulator");
	    dc.setCapability("platformVersion","12");
	    URL url=new URL("http://localhost:4723/wd/hub");
	    
	    AndroidDriver<WebElement> driver=new AndroidDriver<WebElement>(url, dc);
	    Thread.sleep(3000);
	    WebElement ele = driver.findElementByXPath("//android.widget.TextView[@content-desc=\"Messages\"]"
	    		+ "");
	    Thread.sleep(3000);
	    ele.click();
	    driver.quit();
     }
}
