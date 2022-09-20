package Quick_BI_LA_Equals_PR;


import java.io.File;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import Genericutility.BaseClass;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;

public class Secure_Bhavishya_Plan extends BaseClass
{
	@Test
	public void Secure() throws InterruptedException
	{
		//Click on QuickBi icon navigate to QuickBi page
		WebDriverWait wait=new WebDriverWait(driver, 20);
		WebElement bi = driver.findElementByAccessibilityId("Quick BI");
		bi.click();
        
		//Click on retail and navigate to product page details
		WebElement ret = driver.findElementByAccessibilityId("Retail"); 
		ret.click();	 

		//select Jeevan Nivesh Plan
		driver.findElementByAccessibilityId("Secure Bhavishya Plan").click();

		//Navigate to next page
		driver.findElementByAccessibilityId("Next").click();

		//Select options from all dropdowns
		driver.findElement(By.xpath("//android.widget.ImageView[@index='1']")).click();
		driver.findElementByAccessibilityId("10").click();

		driver.findElement(By.xpath("//android.widget.ImageView[@index='3']")).click();
		driver.findElementByAccessibilityId("5").click();

		driver.findElement(By.xpath("//android.widget.ImageView[@index='5']")).click();
		driver.findElementByAccessibilityId("Annual").click();

		driver.findElement(By.xpath("//android.widget.ImageView[@index='7']")).click();
		driver.findElementByAccessibilityId("Yes").click();

		driver.findElement(By.xpath("//android.widget.ImageView[@index='9']")).click();
		driver.findElementByAccessibilityId("ECS").click();

		driver.findElement(By.xpath("//android.widget.ImageView[@index='11']")).click();
		driver.findElementByAccessibilityId("Yearly").click();

		MobileElement element = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
				"new UiScrollable(new UiSelector().scrollable(true))" +
				".scrollIntoView(new UiSelector().textContains(\"Enter Modal Premium\"))"));

		
		//Enter the Amount To be Annuitized value 
		WebElement sum = driver.findElement(By.xpath("//android.widget.EditText[@text='Enter Amount To Be Annuitized']"));
		sum.click();
		sum.sendKeys("550000");
		driver.hideKeyboard();

		//Enter Amount To Be Annuitized Other Insurer
	    WebElement Insurer = driver.findElement(By.xpath("//android.widget.EditText[@text='Enter Amount To Be Annuitized Other Insurer']"));
		Insurer.click();
		Insurer.sendKeys("350000");
		driver.hideKeyboard();
		
		driver.findElement(By.xpath("(//android.widget.ImageView[starts-with(@content-desc,'Select Options')])[1]")).click();
		driver.findElementByAccessibilityId("Immediate Life Annuity (Single Life)").click();

		driver.findElement(By.xpath("(//android.widget.ImageView[starts-with(@content-desc,'Select Options')])[2]")).click();
		driver.findElementByAccessibilityId("Yes").click();
		
		//Enter Modal Premium
	    WebElement mp = driver.findElement(By.xpath("//android.widget.EditText[@text='Enter Modal Premium']"));
		mp.click();
		mp.sendKeys("350000");
		driver.hideKeyboard();
		
		driver.findElement(By.xpath("(//android.widget.ImageView[starts-with(@content-desc,'Select Options')])[3]")).click();
		MobileElement fund = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
				"new UiScrollable(new UiSelector().scrollable(true))" +
				".scrollIntoView(new UiSelector().description(\"100\"))"));
		fund.click();

		//driver.findElementByAccessibilityId("Yes").click();

		Thread.sleep(2000);
		//Navigate to next page
		driver.findElement(By.xpath("//android.widget.Button[starts-with(@content-desc,'Next')]")).click();

		////navigate to LA details page
		driver.findElementByAccessibilityId("skip").click();

		//Enter LA details 
		WebElement fn = driver.findElementByXPath("//android.widget.EditText[contains(@text, 'First name*')]");
		wLib.explicitwait(driver, fn);
		fn.click();
		fn.sendKeys("Amaresha");
		driver.hideKeyboard(); 
		WebElement ln = driver.findElementByXPath("//android.widget.EditText[contains(@text, 'Last name*')]");
		ln.click(); ln.sendKeys("utkur");
		driver.hideKeyboard(); 	  
		driver.findElement(By.xpath("//android.view.View[@index='4']")).click();
		driver.findElementByAccessibilityId("Select year").click();
		MobileElement ele1 = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
				"new UiScrollable(new UiSelector().scrollable(true))" +
				".scrollIntoView(new UiSelector().description(\"2000\"))"));
		ele1.click();
		driver.findElementByAccessibilityId("6, Wednesday, September 6, 2000").click();
		driver.findElementByAccessibilityId("OK").click();
		driver.hideKeyboard();
		MobileElement ele = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
				"new UiScrollable(new UiSelector().scrollable(true))" +
				".scrollIntoView(new UiSelector().textContains(\"Enter Mobile number\"))"));
		ele.click();
		Thread.sleep(2000);
		ele.sendKeys("8722153357");

		//Click on Next and navigate to proposer page details
		driver.findElement(By.xpath("//android.widget.Button[starts-with(@content-desc,'Next')]")).click();

		//Enter the Proposer details
        driver.findElement(By.className("android.widget.CheckBox")).click();
        driver.findElement(By.xpath("//android.widget.Button[starts-with(@content-desc,'Next')]")).click();

        //Enter Other details and click on next button
        driver.findElement(By.xpath("//android.widget.ImageView[@index='2']")).click();
		driver.findElementByAccessibilityId("HSBC Bank").click();
		driver.findElement(By.xpath("//android.widget.ImageView[@index='4']")).click();
	    driver.findElementByAccessibilityId("Mr Jatin  Nandwani 1061").click();
	    driver.findElement(By.xpath("//android.widget.ImageView[@index='6']")).click();
	    driver.findElementByAccessibilityId("Branch Walk-In").click();
	    driver.findElement(By.xpath("//android.widget.ImageView[@index='8']")).click();
	    driver.findElementByAccessibilityId("Driving license (SAP)").click();
	    driver.findElement(By.xpath("//android.widget.ImageView[@index='10']")).click();
	    driver.findElementByAccessibilityId("Business Owner/Self Employed").click();
	    
	    MobileElement el = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
				"new UiScrollable(new UiSelector().scrollable(true))" +
				".scrollIntoView(new UiSelector().textContains(\"HO -Gurgaon, Processing Hub\"))"));


        WebElement now = driver.findElement(By.xpath("//android.widget.EditText[contains(@text, 'Search')]"));
        now.click();
        now.sendKeys("Scrap");
        driver.findElementByAccessibilityId("Scrap Fitter / Dealers / Business").click();

        driver.findElement(By.xpath("(//android.widget.ImageView[@index='7'])[1]")).click();
        driver.findElementByAccessibilityId("INDIA").click();
	   
	    driver.findElement(By.xpath("//android.widget.ImageView[starts-with(@content-desc,'Select Options')]")).click();
	    MobileElement country = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
				"new UiScrollable(new UiSelector().scrollable(true))" +
				".scrollIntoView(new UiSelector().textContains(\"HO -Gurgaon, Processing Hub\"))"));
	    


	}
}
