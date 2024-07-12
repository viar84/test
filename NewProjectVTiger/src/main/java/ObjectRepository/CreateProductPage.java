package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateProductPage 
{
	
	@FindBy(name ="productname")
	private WebElement prodNameTextField;
	
	@FindBy(xpath ="//img[@alt='Create Product...']")
	private WebElement createProduct;
	
	@FindBy(xpath ="//input[@title='Save [Alt+S]']")
	private WebElement buttonSave;
	
	
	public CreateProductPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}


	public WebElement getProdName() {
		return prodNameTextField;
	}


	public WebElement getCreateProduct() {
		return createProduct;
	}


	public WebElement getButtonSave() {
		return buttonSave;
	}
	
	public void clickCreateProduct()
	{
		createProduct.click();
	}
	
	public void saveProduct(String prodName)
	{
		prodNameTextField.sendKeys(prodName);
		buttonSave.click();
	}
}
