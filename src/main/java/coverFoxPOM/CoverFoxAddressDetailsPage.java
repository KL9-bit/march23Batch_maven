package coverFoxPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class CoverFoxAddressDetailsPage {
	//step1-->WebElement=Date Member
	@FindBy(className = "mp-input-text") 
	private WebElement pinCodeField;
	
	@FindBy(id = "want-expert")
	private WebElement moblieNumberField;
	
	@FindBy(className = "next-btn")
	private WebElement continueButton;
	
	//step2-->Constructor
    public CoverFoxAddressDetailsPage(WebDriver driver)
    {
    	PageFactory.initElements(driver, this);
    }
//step3-->Method
       
    public void enterPincode(String pinCodeValue) 
    { Reporter.log("entering pin code",true);
    	pinCodeField.sendKeys(pinCodeValue);
    }
    
    public void EnterMoblieNumber(String moblieNumber)
    {
    	Reporter.log("entering moblie number",true);
    	moblieNumberField.sendKeys(moblieNumber);
    }
    
    public void clickOncontinueButton()
    {
    	Reporter.log("Clicking on next button",true);
     	continueButton.click();
    }
    
	
}