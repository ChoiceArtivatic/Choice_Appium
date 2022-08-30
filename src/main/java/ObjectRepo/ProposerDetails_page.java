package ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.pagefactory.AndroidFindBy;

public class ProposerDetails_page 
{
	public ProposerDetails_page(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	@AndroidFindBy(accessibility = "Upload PAN Card")
	private WebElement uploadpan_icon;
	
	@AndroidFindBy(accessibility = "Mr")
	private WebElement Mr_radio_icon;

	@AndroidFindBy(accessibility = "Mrs")
	private WebElement Mrsradio_icon;

	@AndroidFindBy(accessibility = "Master")
	private WebElement Masterradio_icon;
	
	@AndroidFindBy(accessibility = "Miss")
	private WebElement Misssradio_icon;
	
	@AndroidFindBy(xpath = "//android.widget.EditText[contains(@text, 'First name*')]")
	private WebElement Firstname_textfield;
	
	@AndroidFindBy(xpath = "//android.widget.EditText[contains(@text, 'Last name*')]")
	private WebElement Lastname_textfield;
	
	@AndroidFindBy(accessibility = "Gender Male")
	private WebElement GenderMale_icon;

	@AndroidFindBy(accessibility ="Gender Transgender")
	private WebElement GenderTransgender_icon;

	@AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Gender*\"]/android.view.View")
	private WebElement DOb_icon;
	
	@AndroidFindBy(xpath = "Current residential state* Select Options KARNATAKA")
	private WebElement currentresidentialstate_dropdown;
	
	@AndroidFindBy(xpath = "//android.widget.EditText[contains(@text, 'Planned retirement age* Enter details')]")
	private WebElement PlannedRetireAge_textfield;
	
	@AndroidFindBy(xpath = "//android.widget.EditText[contains(@text, 'Annual Income Enter details INR')]")
	private WebElement Annualncome_textfield;

	@AndroidFindBy(xpath = "//android.widget.EditText[contains(@text, 'Annual saving* Enter details INR')]")
	private WebElement Annualsaving_textfield;
	
	@AndroidFindBy(xpath = "//android.widget.EditText[contains(@text, 'Total life cover based on future income* Enter details INR')]")
	private WebElement Totallifecover_textfield;
	
	@AndroidFindBy(xpath = "//android.widget.EditText[contains(@text, 'Current liabilities (loans/mortgages etc)* Enter details')]")
	private WebElement Currentliabilities_textfield;
	
	@AndroidFindBy(xpath = "//android.widget.EditText[contains(@text, 'Total SA of existing life insurance policies* Enter details')]")
	private WebElement TotalSAoflife_textfield;
	
	@AndroidFindBy(accessibility  = "Next")
	private WebElement Next_btn;

	public WebElement getUploadpan_icon() {
		return uploadpan_icon;
	}

	public WebElement getMr_radio_icon() {
		return Mr_radio_icon;
	}

	public WebElement getMrsradio_icon() {
		return Mrsradio_icon;
	}

	public WebElement getMasterradio_icon() {
		return Masterradio_icon;
	}

	public WebElement getMisssradio_icon() {
		return Misssradio_icon;
	}

	public WebElement getFirstname_textfield() {
		return Firstname_textfield;
	}

	public WebElement getLastname_textfield() {
		return Lastname_textfield;
	}

	public WebElement getGenderMale_icon() {
		return GenderMale_icon;
	}

	public WebElement getGenderTransgender_icon() {
		return GenderTransgender_icon;
	}

	public WebElement getDOb_icon() {
		return DOb_icon;
	}

	public WebElement getCurrentresidentialstate_dropdown() {
		return currentresidentialstate_dropdown;
	}

	public WebElement getPlannedRetireAge_textfield() {
		return PlannedRetireAge_textfield;
	}

	public WebElement getAnnualncome_textfield() {
		return Annualncome_textfield;
	}

	public WebElement getAnnualsaving_textfield() {
		return Annualsaving_textfield;
	}

	public WebElement getTotallifecover_textfield() {
		return Totallifecover_textfield;
	}

	public WebElement getCurrentliabilities_textfield() {
		return Currentliabilities_textfield;
	}

	public WebElement getTotalSAoflife_textfield() {
		return TotalSAoflife_textfield;
	}

	public WebElement getNext_btn() {
		return Next_btn;
	}
		
	
}
