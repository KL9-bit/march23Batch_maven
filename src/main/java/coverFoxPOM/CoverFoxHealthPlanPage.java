package coverFoxPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class CoverFoxHealthPlanPage {
	//step1-->WebElement=Date Member
	@FindBy(className = "next-btn") 
	private WebElement next_btn;
	
	//step2-->Constructor
    public CoverFoxHealthPlanPage(WebDriver driver)
    {
    	PageFactory.initElements(driver, this);
    	
    }

//step3-->Method
    public void clickOnNextButton()
    {
    	Reporter.log("Clicking on next button",true);
    	next_btn.click();
    }
    
	
}