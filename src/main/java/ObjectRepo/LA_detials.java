package ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class LA_detials 
{
	public LA_detials(AndroidDriver<MobileElement> driver)
	{
		PageFactory.initElements(driver,this);
	}

	@AndroidFindBy(className = "android.widget.CheckBox")
	private MobileElement LAissameasproposer_check;
	

	@AndroidFindBy(accessibility  = "Next")
	private MobileElement Next_btn;


	public WebElement getLAissameasproposer_check() {
		return LAissameasproposer_check;
	}


	public WebElement getNext_btn() {
		return Next_btn;
	}
	
	
}
