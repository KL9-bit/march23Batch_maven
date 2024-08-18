package coverFoxPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

public class CoverFoxMemberDetailsPage {
	//step1-->WebElement=Date Member
	@FindBy(name = "You") 
	private WebElement ageDropDown;
	@FindBy(className = "next-btn") 
	private WebElement next_btn;
	
	
	//step2-->Constructor
    public CoverFoxMemberDetailsPage(WebDriver driver)
    {
    	PageFactory.initElements(driver, this);
    	
    }

//step3-->Method
    public void handleAgeDropDown(String age)
    {
    	Reporter.log("Handeling dropdown",true);
    	Select s= new Select(ageDropDown);
    	s.selectByValue(age+"y");
    }
    public void clickOnNextButton()
    {
    	Reporter.log("Clicking on next button",true);
    	next_btn.click();
    }
}