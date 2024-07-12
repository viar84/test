package Product;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.Random;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import GenericUtilities.BaseClass;
import GenericUtilities.ExcelUtility;
import GenericUtilities.FileUtility;
import GenericUtilities.JavaUtility;
import GenericUtilities.WebDriverUtility;
import ObjectRepository.CreateCampaignPage;
import ObjectRepository.CreateProductPage;
import ObjectRepository.HomePage;
import ObjectRepository.LoginPage;

public class CreateProductTest extends BaseClass {

	@Test
	public  void CreateProductTest() throws Throwable 
	{
		 
	    String prodName =  eLib.getExcelData("Product", 0, 0)+jLib.getRandomNo();
	    
	    HomePage home = new HomePage(driver);
	    CreateProductPage prod = new CreateProductPage(driver);
	    home.clickProducts();
	    prod.clickCreateProduct();
	    prod.saveProduct(prodName);
	    Thread.sleep(2000);
	    
	   

	}

}
