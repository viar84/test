package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateCampaignPage 
{
	@FindBy(name ="campaignname")
	private WebElement campNametextField;
	
	@FindBy(xpath ="//img[@alt='Create Campaign...']")
	private WebElement createCampaign;
	
	@FindBy(xpath ="//input[@title='Save [Alt+S]']")
	private WebElement buttonSave;
	
	public CreateCampaignPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getCampName() {
		return campNametextField;
	}

	public WebElement getCreateCampaign() {
		return createCampaign;
	}

	public WebElement getButtonSave() {
		return buttonSave;
	}
	
	public void clickCreateCampaign()
	{
		createCampaign.click();
	}
	public void saveCampaign(String campName)
	{
		campNametextField.sendKeys(campName);
		buttonSave.click();
	}
	

}
