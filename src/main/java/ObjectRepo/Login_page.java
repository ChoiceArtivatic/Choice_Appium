package ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.pagefactory.AndroidFindBy;

public class Login_page
{
	
	public Login_page(WebDriver driver)
	{
	   PageFactory.initElements(driver, this);
	}
	@FindBy(xpath  = "android.widget.EditText")
	private WebElement employee_id;
	
	@AndroidFindBy(accessibility = "Login via Password")
	private WebElement loginvia_password; 
	
	@FindBy(className = "android.widget.EditText")
	private WebElement password;

	@FindBy(className = "android.widget.Button")
	private WebElement login_btn;

	
	public WebElement getPassword() 
	{
		return password;
	}
	
	public WebElement getEmployee_id()
	{     
		return employee_id;
	}
	
	public WebElement getLoginvia_password() 
	{
		return loginvia_password;
	}
		
    public WebElement getLogin_btn() 
    {
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
