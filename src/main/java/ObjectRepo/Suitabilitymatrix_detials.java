package ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.pagefactory.AndroidFindBy;

public class Suitabilitymatrix_detials 
{
	public Suitabilitymatrix_detials(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	@AndroidFindBy(accessibility =  "Future goal* Select Options")
	private WebElement Futuregoal_drop;
	
	@AndroidFindBy(xpath =  "//android.view.View[@content-desc=\"Risk cover need*\"]/android.widget.EditText")
	private WebElement Riskcover_textfield;
	
	@AndroidFindBy(xpath =  "//android.widget.EditText[contains(@text, 'Current Assets* Enter details')]")
	private WebElement Currentasset_textfield;

	@AndroidFindBy(xpath =  "//android.widget.EditText[contains(@text, 'Time to Goal* Select Options')]")
	private WebElement Timetogoal_drop;

	@AndroidFindBy(accessibility  = "Add Goal")
	private WebElement Addgoal;
	
	@AndroidFindBy(accessibility  = "Next")
	private WebElement Next_btn;

	public WebElement getFuturegoal_drop() {
		return Futuregoal_drop;
	}

	public WebElement getRiskcover_textfield() {
		return Riskcover_textfield;
	}

	public WebElement getCurrentasset_textfield() {
		return Currentasset_textfield;
	}

	public WebElement getTimetogoal_drop() {
		return Timetogoal_drop;
	}

	public WebElement getAddgoal() {
		return Addgoal;
	}

	public WebElement getNext_btn() {
		return Next_btn;
	}
	 
	
}
