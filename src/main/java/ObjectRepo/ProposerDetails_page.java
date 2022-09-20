package ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class ProposerDetails_page 
{
	public ProposerDetails_page(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	@AndroidFindBy(accessibility = "Upload PAN Card")
	private MobileElement uploadpan_icon;
	
	@AndroidFindBy(accessibility = "Mr")
	private MobileElement Mr_radio_icon;

	@AndroidFindBy(accessibility = "Mrs")
	private MobileElement Mrsradio_icon;

	@AndroidFindBy(accessibility = "Master")
	private MobileElement Masterradio_icon;
	
	@AndroidFindBy(accessibility = "Miss")
	private MobileElement Misssradio_icon;
	
	@AndroidFindBy(xpath = "//android.widget.EditText[contains(@text, 'First name*')]")
	private MobileElement Firstname_textfield;
	
	@AndroidFindBy(xpath = "//android.widget.EditText[contains(@text, 'Last name*')]")
	private MobileElement Lastname_textfield;
	
	@AndroidFindBy(accessibility = "Gender Male")
	private MobileElement GenderMale_icon;

	@AndroidFindBy(accessibility ="Gender Transgender")
	private MobileElement GenderTransgender_icon;

	@AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Gender*\"]/android.view.View")
	private MobileElement DOb_icon;
	
	@AndroidFindBy(xpath = "Current residential state* Select Options KARNATAKA")
	private MobileElement currentresidentialstate_dropdown;
	
	@AndroidFindBy(xpath = "//android.widget.EditText[contains(@text, 'Planned retirement age* Enter details')]")
	private MobileElement PlannedRetireAge_textfield;
	
	@AndroidFindBy(xpath = "//android.widget.EditText[contains(@text, 'Annual Income Enter details INR')]")
	private MobileElement Annualncome_textfield;

	@AndroidFindBy(xpath = "//android.widget.EditText[contains(@text, 'Annual saving* Enter details INR')]")
	private MobileElement Annualsaving_textfield;
	
	@AndroidFindBy(xpath = "//android.widget.EditText[contains(@text, 'Total life cover based on future income* Enter details INR')]")
	private MobileElement Totallifecover_textfield;
	
	@AndroidFindBy(xpath = "//android.widget.EditText[contains(@text, 'Current liabilities (loans/mortgages etc)* Enter details')]")
	private MobileElement Currentliabilities_textfield;
	
	@AndroidFindBy(xpath = "//android.widget.EditText[contains(@text, 'Total SA of existing life insurance policies* Enter details')]")
	private MobileElement TotalSAoflife_textfield;
	
	@AndroidFindBy(accessibility  = "Next")
	private MobileElement Next_btn;

	public MobileElement getUploadpan_icon() {
		return uploadpan_icon;
	}

	public MobileElement getMr_radio_icon() {
		return Mr_radio_icon;
	}

	public MobileElement getMrsradio_icon() {
		return Mrsradio_icon;
	}

	public MobileElement getMasterradio_icon() {
		return Masterradio_icon;
	}

	public MobileElement getMisssradio_icon() {
		return Misssradio_icon;
	}

	public MobileElement getFirstname_textfield() {
		return Firstname_textfield;
	}

	public MobileElement getLastname_textfield() {
		return Lastname_textfield;
	}

	public MobileElement getGenderMale_icon() {
		return GenderMale_icon;
	}

	public MobileElement getGenderTransgender_icon() {
		return GenderTransgender_icon;
	}

	public MobileElement getDOb_icon() {
		return DOb_icon;
	}

	public MobileElement getCurrentresidentialstate_dropdown() {
		return currentresidentialstate_dropdown;
	}

	public MobileElement getPlannedRetireAge_textfield() {
		return PlannedRetireAge_textfield;
	}

	public MobileElement getAnnualncome_textfield() {
		return Annualncome_textfield;
	}

	public MobileElement getAnnualsaving_textfield() {
		return Annualsaving_textfield;
	}

	public MobileElement getTotallifecover_textfield() {
		return Totallifecover_textfield;
	}

	public MobileElement getCurrentliabilities_textfield() {
		return Currentliabilities_textfield;
	}

	public MobileElement getTotalSAoflife_textfield() {
		return TotalSAoflife_textfield;
	}

	public MobileElement getNext_btn() {
		return Next_btn;
	}

		
}
