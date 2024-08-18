package coverFoxPOM;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class CoverFoxResultPage {
	@FindBy(xpath = "//div[contains(text(),'Health Insurance Plans')]") private WebElement resultText;
	
	@FindBy(className = "plan-card-container") private List<WebElement> banners;
	
	@FindBy(xpath = "//div[text()='Sort Plans']") private WebElement sortPlanFilter;
	
	public CoverFoxResultPage (WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	public void validateBanners() 
	{ Reporter.log("getting string results",true);
		String[] ar = resultText.getText().split(" ");
		int result = Integer.parseInt(ar[0]);
		Reporter.log("getting total banners",true);
		if(result==banners.size())
		{
			System.out.println("Result is mathing with banners, TC is passed");
		}else {
			System.out.println("Result is not mathing with banners, TC is failed");
		}	
	}
	
	public int getPlanNumbersFromString()
	{
		 String ar[]=resultText.getText().split(" ");
		 Reporter.log("getting getPlanNumbersFromString",true);
		int result = Integer.parseInt(ar[0]);
		
	return result;	
	}
	
	public int getPlanNumbersFromBanners()
	{
		Reporter.log("getPlanNumbersFromBanners",true);
		int bannerSize =banners.size();
      return bannerSize;		
		
	}

	public boolean sortPlanFilterIsDisplayed()
	{Reporter.log("checking sortPlanFilterIsDisplayed",true);
		boolean result= sortPlanFilter.isDisplayed();
		return result;	
		
	}
}