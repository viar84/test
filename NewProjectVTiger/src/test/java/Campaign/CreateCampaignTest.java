package Campaign;

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
import ObjectRepository.HomePage;
import ObjectRepository.LoginPage;

public class CreateCampaignTest extends BaseClass {

	@Test
	public void  CreateCampaignTest() throws Throwable
	{ 
		 
	    String campName =  eLib.getExcelData("Campaign", 0, 0)+jLib.getRandomNo();
	    CreateCampaignPage camp = new CreateCampaignPage(driver);
	    HomePage home = new HomePage(driver);
	    
	    home.clickMore();
	    home.clickCampaigns();
	    camp.clickCreateCampaign();
	    camp.saveCampaign(campName);
	    Thread.sleep(2000);
	   
	    // home.mouseHoverSignOut(driver);
	     //Thread.sleep(2000);
	    // home.signOut();
	   // driver.quit();


	}

}
