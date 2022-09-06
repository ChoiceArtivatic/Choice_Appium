package Sample;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Genericutility.BaseClass;
import ObjectRepo.Homepage;

public class NB_Login extends BaseClass
{
  @Test
  public void Tc420() throws Throwable
  {
	 //Homepage hp=new Homepage(driver);
	 //hp.getNB_Login().click();
	  Thread.sleep(5000);
	  driver.findElementByAccessibilityId("NB Login").click();
	  driver.findElementByAccessibilityId("Start New Application").click();
	  driver.findElementByAccessibilityId("Continue").click();
	  WebElement fn = driver.findElementByXPath("//android.widget.EditText[contains(@text, 'First name*')]");
	  wLib.explicitwait(driver, fn);
	  fn.click();
	  fn.sendKeys("Amaresha");
		
		  WebElement ln = driver.
		  findElementByXPath("//android.widget.EditText[contains(@text, 'Last name*')]");
		  ln.click(); ln.sendKeys("utkur");
		  //driver.findElementByAccessibilityId("Proposal").click();
	  
  }   
}
