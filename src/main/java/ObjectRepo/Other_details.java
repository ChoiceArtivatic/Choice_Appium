package ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.pagefactory.AndroidFindBy;

public class Other_details 
{
	public Other_details(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	@AndroidFindBy(xpath = "//android.widget.EditText[contains(@text, 'Agreed risk cover')]")
	private WebElement Agreedriskcover_textfield;
	
	@AndroidFindBy(xpath = "//android.widget.EditText[contains(@text, 'Any other info Enter details')]")
	private WebElement Anyotherinfo_textfield;
	
	@AndroidFindBy(accessibility  = "Next")
	private WebElement Next_btn;

	public WebElement getAgreedriskcover_textfield() {
		return Agreedriskcover_textfield;
	}

	public WebElement getAnyotherinfo_textfield() {
		return Anyotherinfo_textfield;
	}

	public WebElement getNext_btn() {
		return Next_btn;
	}
    
	

}
