package ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Sample 
{

	   public Sample(WebDriver driver)
	   {
		   PageFactory.initElements(driver,this);
	   }
	   
	   @FindBy(xpath = "//android.widget.EditText[contains(@text, 'Search by Lead ID, LA name Search')]")
	   private WebElement searchbylead_link;

	public WebElement getSearchbylead_link() {
		return searchbylead_link;
	}
	   
	   
	   
}
