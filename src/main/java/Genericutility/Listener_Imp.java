package Genericutility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener_Imp implements ITestListener
{
  public void OnTestFailure(ITestResult result) throws Throwable
  { 
	 String name=result.getMethod().getMethodName();
	 EventFiringWebDriver ed=new EventFiringWebDriver(null);
	 File src = ed.getScreenshotAs(OutputType.FILE);
	 File dst=new File("./screenshots"+name+".png");
	 FileUtils.copyFile(src, dst);
  }
}
