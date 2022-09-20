package ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class Login_page
{
	
	public Login_page(AndroidDriver<MobileElement> driver)
	{
	   PageFactory.initElements(driver, this);
	}
	@AndroidFindBy(xpath  = "//android.widget.EditText[contains(@text, 'Enter Employee ID')]")
	private MobileElement employee_id;
	
	@AndroidFindBy(accessibility = "Login via Password")
	private MobileElement loginvia_password; 
	
	@AndroidFindBy(className = "//android.widget.EditText[contains(@text, 'Enter Password')]")
	private MobileElement password;

	@AndroidFindBy(accessibility = "Login")
	private MobileElement login_btn;

	
	public MobileElement getEmployee_id() {
		return employee_id;
	}


	public MobileElement getLoginvia_password() {
		return loginvia_password;
	}


	public MobileElement getPassword() {
		return password;
	}


	public MobileElement getLogin_btn() {
		return login_btn;
	}


	public void Choicelogin(String empid,String password)
    {
    	getEmployee_id().sendKeys(empid);
    	getLoginvia_password().click();
    	getPassword().sendKeys(password);
    	getLogin_btn().click();
    }
}
