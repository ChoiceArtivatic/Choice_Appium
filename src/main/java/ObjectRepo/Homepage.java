package ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.pagefactory.AndroidFindBy;

public class Homepage 
{
	public Homepage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	@AndroidFindBy(xpath = "//android.widget.ImageView[contains(@text, 'NB Login')]")
	private WebElement NB_Login;
	
	@AndroidFindBy(xpath ="Quick BI")
	private WebElement QuickBi;
	
	@AndroidFindBy(accessibility = "Generate Application no")
	private WebElement GenerateApplication_num;

	@AndroidFindBy(accessibility = "Group Business login")
	private WebElement GroupBusiness_Login;
	
	@AndroidFindBy(accessibility = "Gyandhara")
	private WebElement Gyandhara;
	
	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ImageView[1]")
	private WebElement Hamburger_Icon;
	
	@AndroidFindBy(accessibility  = "Lead Management")
	private WebElement LeadManagement;
	
	@AndroidFindBy(accessibility = "Track Application")
	private WebElement TrackApplication;
	
	@AndroidFindBy(accessibility =  "Logout")
	private WebElement Logout;

	@AndroidFindBy(accessibility = "Amaresha Amaresha")
	private WebElement MyProfile;

	public WebElement getNB_Login() 
	{
		return NB_Login;
	}

	public WebElement getQuickBi()
	{
		return QuickBi;
	}

	public WebElement getGenerateApplication_num() 
	{
		return GenerateApplication_num;
	}

	public WebElement getGroupBusiness_Login()
	{
		return GroupBusiness_Login;
	}

	public WebElement getGyandhara()
	{
		return Gyandhara;
	}

	public WebElement getHamburger_Icon() {
		return Hamburger_Icon;
	}

	public WebElement getLeadManagement() {
		return LeadManagement;
	}

	public WebElement getTrackApplication() {
		return TrackApplication;
	}

	public WebElement getLogout() {
		return Logout;
	}

	public WebElement getMyProfile() {
		return MyProfile;
	}
	
}
