package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GenericUtilities.WebDriverUtility;

public class HomePage 
{
	@FindBy(partialLinkText = "More")
	private WebElement linkMore;
	
	@FindBy(linkText  = "Campaigns")
	private WebElement linkCampaigns;
	
	@FindBy(linkText   = "Products")
	private WebElement linkProducts;
	
	@FindBy(xpath = "//img[@src='themes/softed/images/user.PNG']")
	private WebElement linkSignOut;
	
	@FindBy(linkText = "Sign Out")
	private WebElement linkLogout; 
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public WebElement getLinkMore() {
		return linkMore;
	}
	public WebElement getLinkSignOut() {
		return linkSignOut;
	}
	public WebElement getLinkLogout() {
		return linkLogout;
	}
	//businessLogic
	public void clickMore()
	{
		linkMore.click();
	}
	public void clickCampaigns()
	{
		linkCampaigns.click();
	}
	public void clickProducts()
	{
		linkProducts.click();
	}
	public void mouseHoverSignOut(WebDriver driver)  
	{
		WebDriverUtility wLib= new WebDriverUtility();
		wLib.moveToElement(driver, linkSignOut);
		 
	}
	public void signOut()
	{
		linkLogout.click();
	}
	
}
