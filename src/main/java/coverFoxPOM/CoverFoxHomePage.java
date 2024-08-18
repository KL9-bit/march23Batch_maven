package coverFoxPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class CoverFoxHomePage {
	
    //webElement-->Data Members(D.M.)/variables=>we take web element as D.M./variables
	//how to get data member / web element.
	@FindBy(xpath = "//div[text()='Male']") 
	private WebElement maleButton;
	
	//constructor-->we use constructor for analyze those D.M./variables .
	public CoverFoxHomePage(WebDriver driver) 
	{
	PageFactory.initElements(driver, this);	
		
	}
	
	//methods-->we use methods for do actions on those D.M./variables
	public void clickOnGenderButton()
	{
		Reporter.log("Clicking on gender button",true);
		maleButton.click();	
	}
}
