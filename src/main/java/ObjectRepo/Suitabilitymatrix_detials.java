package ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class Suitabilitymatrix_detials 
{
	public Suitabilitymatrix_detials(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	@AndroidFindBy(accessibility =  "Future goal* Select Options")
	private MobileElement Futuregoal_drop;
	
	@AndroidFindBy(xpath =  "//android.view.View[@content-desc=\"Risk cover need*\"]/android.widget.EditText")
	private MobileElement Riskcover_textfield;
	
	@AndroidFindBy(xpath =  "//android.widget.EditText[contains(@text, 'Current Assets* Enter details')]")
	private MobileElement Currentasset_textfield;

	@AndroidFindBy(xpath =  "//android.widget.EditText[contains(@text, 'Time to Goal* Select Options')]")
	private MobileElement Timetogoal_drop;

	@AndroidFindBy(accessibility  = "Add Goal")
	private MobileElement Addgoal;
	
	@AndroidFindBy(accessibility  = "Next")
	private MobileElement Next_btn;

	public MobileElement getFuturegoal_drop() {
		return Futuregoal_drop;
	}

	public MobileElement getRiskcover_textfield() {
		return Riskcover_textfield;
	}

	public MobileElement getCurrentasset_textfield() {
		return Currentasset_textfield;
	}

	public MobileElement getTimetogoal_drop() {
		return Timetogoal_drop;
	}

	public MobileElement getAddgoal() {
		return Addgoal;
	}

	public MobileElement getNext_btn() {
		return Next_btn;
	}

		
}
