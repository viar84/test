
package GenericUtilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import ObjectRepository.LoginPage;
public class BaseClass
{
	public JavaUtility jLib = new JavaUtility();
	public FileUtility fLib = new FileUtility();
	public ExcelUtility eLib = new ExcelUtility();
	public WebDriverUtility wUtil = new WebDriverUtility();
	public WebDriver driver = null;
	@BeforeSuite
	public void BeforeSuite()
	{
		System.out.println("Establish Connection with server");
		
	}
	@BeforeTest
	public void BeforeTest()
	{
		System.out.println("Establish Connection with db");
	}
	@BeforeClass
	public void BeforeClass() throws Throwable
	{
		String browser = fLib.getPropertyValue("browser");
		if(browser.equalsIgnoreCase("chrome"))
		{
		  driver=new ChromeDriver();
		}
		else
			driver = new EdgeDriver();
		 
		wUtil.maximizeWindow(driver);
		
	}
	
	@BeforeMethod
	public void BeforeMethod() throws Throwable
	{
		String url = fLib.getPropertyValue("url");
		String userName = fLib.getPropertyValue("username");
		String password = fLib.getPropertyValue("password");
		driver.get(url);
		wUtil.waitForPageLoad(driver);
		LoginPage login = new LoginPage(driver);
		login.logIntoApp(userName, password);
	}
	@ AfterMethod
	public void AfterMethod()
	{
		 driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']")).click()  ;
		 driver.findElement(By.linkText("Sign Out")).click();
	}
	@AfterClass
	public void AfterClass()
	{
		driver.quit();
	}
	@AfterTest
	public void AfterTest()
	{
		System.out.println("Disconnect Connection with db");
	}
	@AfterSuite
	public void AfterSuite()
	{
		System.out.println("Disconnect Connection with server");
	}

}
