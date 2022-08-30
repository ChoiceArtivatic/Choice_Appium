package Sample;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class Realdevice
{	
  @Test
  public void test() throws Throwable
     {
	    DesiredCapabilities dc=new DesiredCapabilities();
	    dc.setCapability( "automationName", "Appium");
	    dc.setCapability( "platformName", "Android");
	    dc.setCapability("platformVersion","9");
	    dc.setCapability("udid","J9F4C18211002998");
	    //dc.setCapability("app","D:\\Softwares/Choice-UAT-release-v1.0.33.apk");
	    dc.setCapability("appPackage","com.miochoice.sales.dev");
	    dc.setCapability("appActivity","com.miochoice.sales.MainActivity");
	    URL url=new URL("http://localhost:4723/wd/hub");
	    AndroidDriver<WebElement> driver=new AndroidDriver<WebElement>(url,dc);
	    Thread.sleep(3000);
	    WebElement empid = driver.findElement(By.xpath("//android.widget.EditText[contains(@text, 'Enter Employee ID')]"));
	    Thread.sleep(3000);
	    empid.click();
	    empid.sendKeys("30006135");
	    driver.findElementByAccessibilityId("Login via Password").click();
	    WebElement pass = driver.findElement(By.xpath("//android.widget.EditText[contains(@text, 'Enter Password')]"));
	    pass.click();
	    pass.sendKeys("Choice@123456");
	    driver.hideKeyboard();
	    Thread.sleep(3000);
	    driver.findElementByAccessibilityId("Login").click();
	    
     }
}
