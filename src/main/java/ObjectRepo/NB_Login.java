package ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class NB_Login
{
	public NB_Login(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	@AndroidFindBy(accessibility = "Start New Application")
	private MobileElement startnewApplication;
	
	@FindBy(xpath  = "//android.widget.EditText[contains(@text, 'Search by Lead ID, LA name Search')]")
	private MobileElement searchbyLead;
	
	@AndroidFindBy(xpath =  "//android.widget.RadioButton[1]")
	private MobileElement NewLead_radiobutton;
	
	@AndroidFindBy(xpath = "//android.widget.RadioButton[2]")
	private MobileElement ExistingLead_radiobutton;

	@AndroidFindBy(accessibility  = "Continue")
	private MobileElement Continue_button;

	public WebElement getStartnewApplication() {
		return startnewApplication;
	}

	public WebElement getSearchbyLead() {
		return searchbyLead;
	}

	public WebElement getNewLead_radiobutton() {
		return NewLead_radiobutton;
	}

	public WebElement getExistingLead_radiobutton() {
		return ExistingLead_radiobutton;
	}

	public WebElement getContinue_button() {
		return Continue_button;
	}
	
	


}
