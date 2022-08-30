package ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.pagefactory.AndroidFindBy;

public class NB_StartNewApplication
{
	public NB_StartNewApplication(WebDriver driver) 
	{
		PageFactory.initElements(driver,this);	
	}

	@AndroidFindBy(accessibility = "FNA")
	private WebElement FNA_btn;

	@AndroidFindBy(accessibility = "BI")
	private WebElement BI_btn;

	@AndroidFindBy(accessibility = "Proposal")
	private WebElement proposal_btn;

	public WebElement getFNA_btn() {
		return FNA_btn;
	}

	public WebElement getBI_btn() {
		return BI_btn;
	}

	public WebElement getProposal_btn() {
		return proposal_btn;
	}

}
