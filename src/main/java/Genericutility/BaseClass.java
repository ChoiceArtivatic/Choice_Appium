package Genericutility;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.appium.java_client.android.AndroidDriver;

public class BaseClass
{
	 AndroidDriver<WebElement> driver;
   @BeforeClass
   public void LaunchApp() throws Throwable
   {
	   DesiredCapabilities dc=new DesiredCapabilities();
	    dc.setCapability( "automationName", "Appium");
	    dc.setCapability( "platformName", "Android");
	   // dc.setCapability("deviceName","Amar");
	    dc.setCapability("platformVersion","9");
	    dc.setCapability("udid","J9F4C18211002998");
	    dc.setCapability("app","D:\\Softwares/CHOICE_SDK_18.apk");
	   //dc.setCapability("appPackage","com.miochoice.sales.dev");
	   // dc.setCapability("appActivity","com.miochoice.sales.MainActivity");
	    URL url=new URL("http://localhost:4723/wd/hub");
	    driver=new AndroidDriver<WebElement>(url, dc);
	    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
   }
   
   @AfterClass
   public void ClosetheApp()
   {
	   driver.quit();
   }
}
