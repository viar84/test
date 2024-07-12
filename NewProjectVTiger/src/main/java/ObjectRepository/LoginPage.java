package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
	@FindBy(name = "user_name")
	private WebElement userNameTextField;
	@FindBy(name = "user_password")
	private WebElement passwordTextField;
	@FindBy(id ="submitButton")
	private WebElement submitButton;
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getUserNameTextField() {
		return userNameTextField;
	}

	public WebElement getPasswordTextField() {
		return passwordTextField;
	}

	public WebElement getSubmitButton() {
		return submitButton;
	}
	
	//BusinessLogic
	public void logIntoApp(String userName,String password)
	{
		userNameTextField.sendKeys(userName);
		passwordTextField.sendKeys(password);
		submitButton.click();
	}
	

}
