package ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.pagefactory.AndroidFindBy;

public class Family_details 
{
	public Family_details(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	@AndroidFindBy(accessibility = "Upload PAN Card")
	private WebElement Uploadpan;
	
	@AndroidFindBy(accessibility  = "Spouse")
	private WebElement spouse_drop;

	@AndroidFindBy(xpath = "//android.widget.EditText[contains(@text, 'First name*')]")
	private WebElement Spousefname_textfield;
	
	@AndroidFindBy(xpath = "//android.widget.EditText[contains(@text, 'Last name*')]")
	private WebElement Spouselname_textfield;
	
	@AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Occupation*\"]/android.view.View")
	private WebElement SpouseDob_icon;
	
	@AndroidFindBy(xpath = "//android.widget.EditText[contains(@text, 'Search')]")
	private WebElement SpouseOccupation_textfield;
	
	@AndroidFindBy(xpath = "//android.widget.EditText[contains(@text, 'Annual Income Enter details NR')]")
	private WebElement SpAnnualincome_textfield;
	
	@AndroidFindBy(xpath = "//android.widget.EditText[contains(@text, 'First name*')]")
	private WebElement Fatherfname_textfield;
	
	@AndroidFindBy(xpath = "//android.widget.EditText[contains(@text, 'Last name*')]")
	private WebElement Fatherlname_textfield;
	
	@AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Occupation*\"]/android.view.View")
	private WebElement FatherDob_icon;
    
	@AndroidFindBy(xpath = "//android.widget.EditText[contains(@text, 'Search')]")
	private WebElement FatherOccupation_textfield;

	
	
}
