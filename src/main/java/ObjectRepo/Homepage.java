package ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class Homepage 
{
	public Homepage(MobileDriver<WebElement> driver)
	{
		PageFactory.initElements(driver,this);
	}
	@AndroidFindBy(xpath = "//android.widget.ImageView[contains(@text, 'NB Login')]")
	private MobileElement NB_Login;
	
	@AndroidFindBy(accessibility  ="Quick BI")
	private MobileElement QuickBi;
	
	@AndroidFindBy(accessibility = "Generate Application no")
	private MobileElement GenerateApplication_num;

	@AndroidFindBy(accessibility = "Group Business login")
	private MobileElement GroupBusiness_Login;
	
	@AndroidFindBy(accessibility = "Gyandhara")
	private MobileElement Gyandhara;
	
	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ImageView[1]")
	private MobileElement Hamburger_Icon;
	
	@AndroidFindBy(accessibility  = "Lead Management")
	private MobileElement LeadManagement;
	
	@AndroidFindBy(accessibility = "Track Application")
	private MobileElement TrackApplication;
	
	@AndroidFindBy(accessibility =  "Logout")
	private MobileElement Logout;

	@AndroidFindBy(accessibility = "Amaresha Amaresha")
	private MobileElement MyProfile;

	public MobileElement getNB_Login() {
		return NB_Login;
	}

	public MobileElement getQuickBi() {
		return QuickBi;
	}

	public MobileElement getGenerateApplication_num() {
		return GenerateApplication_num;
	}

	public MobileElement getGroupBusiness_Login() {
		return GroupBusiness_Login;
	}

	public MobileElement getGyandhara() {
		return Gyandhara;
	}

	public MobileElement getHamburger_Icon() {
		return Hamburger_Icon;
	}

	public MobileElement getLeadManagement() {
		return LeadManagement;
	}

	public MobileElement getTrackApplication() {
		return TrackApplication;
	}

	public MobileElement getLogout() {
		return Logout;
	}

	public MobileElement getMyProfile() {
		return MyProfile;
	}

	
}
