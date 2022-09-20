package Sample;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Genericutility.BaseClass;
import ObjectRepo.Homepage;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;

public class Demo extends BaseClass
{

	@Test
	public void Test() throws Throwable
	{
		Thread.sleep(3000);
		Homepage hp=new Homepage(driver);
		hp.getQuickBi().click();
		//driver.findElementByAccessibilityId("Quick BI").click();
		driver.findElementByAccessibilityId("Retail").click();
		Thread.sleep(10000);
		MobileElement element = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
		        "new UiScrollable(new UiSelector().scrollable(true))" +
		         ".scrollIntoView(new UiSelector().textContains(\"Smart Goals Plan\"))"));
		WebDriverWait wait=new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOf(element));
		element.click();

	}
}
