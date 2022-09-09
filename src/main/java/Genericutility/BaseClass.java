package Genericutility;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.android.AndroidDriver;

public class BaseClass
{
	public MobileDriver<WebElement> driver;
	public Webdriverutility wLib=new Webdriverutility();
   @BeforeClass
   public void LaunchApp() throws Throwable
   {
	   DesiredCapabilities dc=new DesiredCapabilities();
	    dc.setCapability( "automationName", "Appium");
	    dc.setCapability( "platformName", "Android");
	    dc.setCapability("platformVersion","9");
	    dc.setCapability("udid","J9F4C18211002998");
	    //dc.setCapability("app","D:\\Softwares/Choice-UAT-release-v1.0.33.apk");
	    dc.setCapability("appPackage","com.miochoice.sales.dev");
	    dc.setCapability("appActivity","com.miochoice.sales.MainActivity");
	    dc.setCapability("autoGrantPermissions","true");
	    dc.setCapability("waitForIdleTimeout",20);
	    //capabilities.setCapability("waitForIdleTimeout", 0);
	    URL url=new URL("http://localhost:4723/wd/hub");
	    driver=new AndroidDriver<WebElement>(url,dc);
	    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	  
	   
	    //Login to Insure App using Employee Id and password
	    WebElement empid = driver.findElement(By.xpath("//android.widget.EditText[contains(@text, 'Enter Employee ID')]"));
	    empid.click();
	    empid.sendKeys("30000420");
	    driver.findElementByAccessibilityId("Login via Password").click();
	    WebElement pass = driver.findElement(By.xpath("//android.widget.EditText[contains(@text, 'Enter Password')]"));
	    pass.click();
	    pass.sendKeys("Choice@30000420");
	    driver.hideKeyboard();
	    driver.findElementByAccessibilityId("Login").click();

   }
   
   //@AfterClass
   //public void ClosetheApp()
   {
	 //  driver.quit();
   }
}
