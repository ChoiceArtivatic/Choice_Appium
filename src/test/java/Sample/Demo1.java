package Sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Genericutility.BaseClass;
import io.appium.java_client.MobileElement;

public class Demo1 extends BaseClass
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
      
	  WebElement source = (MobileElement) driver.findElementsByAccessibilityId("SomeAccessibilityID");
	  WebElement target = (MobileElement) driver.findElementsByAccessibilityId("SomeOtherAccessibilityID");

		/*
		 * Point source = dragMe.getCenter(); Point target =
		 * driver.findElementByAccessibilityId("dropzone").getCenter(); PointerInput
		 * finger = new PointerInput(PointerInput.Kind.TOUCH, "finger"); Sequence
		 * dragNDrop = new Sequence(finger, 1);
		 * dragNDrop.addAction(finger.createPointerMove(Duration.ofMillis(0),
		 * PointerInput.Origin.viewport(), source.x, source.y));
		 * dragNDrop.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.
		 * asArg()));
		 * dragNDrop.addAction(finger.createPointerMove(Duration.ofMillis(700),
		 * PointerInput.Origin.viewport(),target.x, target.y));
		 * dragNDrop.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.
		 * asArg())); driver.perform(Arrays.asList(dragNDrop));
		 */


  }
}
