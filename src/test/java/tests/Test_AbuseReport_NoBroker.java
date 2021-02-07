package tests;
import java.net.MalformedURLException;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentTest;
import generic.BaseTestClass;
import helper.PropertyHelper;
import pages.HomePage;
import pages.SearchResultPage;
import utility.AndroidUtility;
import utility.Base;
import generic.BaseTestClass;

public class Test_AbuseReport_NoBroker extends BaseTestClass{
	
	//Launching No broker Application
	//ExtentTest report_obj=extent.createTest("Test Case 1", "Abuse Report for No broker");
	AndroidUtility utlity_obj=new AndroidUtility();
	HomePage obj_home=new HomePage();

	BaseTestClass basetc_obj=new BaseTestClass();
	public static ExtentTest test;
	
	@BeforeClass
	public void intializeDriver() throws Exception
	{
		test=extent.createTest("TC001_Verify_abuse_Report_for_Buy_Property").assignDevice("deviceName: Pixel 4 API 28").assignAuthor("Author: Sudhakar").assignCategory("platformName: Android").assignCategory("appPackage: com.nobroker.app").assignCategory("Capability URL: http://127.0.0.1:4723/wd/hub");// create a node	
		utlity_obj.setDesiredCapability();
		test.pass("User is able to launch No broker application successfully");
	}
	
	
	
	@Test
	public void test_abuse() throws Exception
	{	
		//Clicking on continue button to reach home page
		obj_home.ClickContinue();
		
		//Click on Allow button In The Permission Window
		obj_home.ClickAllowPermission();
		obj_home.ClickAllowPermission();
		obj_home.ClickAllowPermission();
		
		//Clicking On The Buy Tab
		obj_home.ClickBuyButton();	
		
		//Validated home page title
		basetc_obj.verifyPageIsDisplayed(HomePage.ttlHome, "World's Largest NoBrokerage Property Site");	
		
		//Clicking On The Search Related Box
		obj_home.ClickSearchHome();
		
		//Validating search page title
		
		
		basetc_obj.verifyPageIsDisplayed(SearchResultPage.lstBoxPlaces, "Search Related Section");
		
		//Search first location from the drop down
		//basetc_obj.inputText(SearchResultPage.edtSearchLocations, PropertyHelper.helperProperty("location1"));
		
		//Select The First Option From The DropDown
		//basetc_obj.tapOnElement(SearchResultPage.lstFirstEntry, "Drop Down List");

		//Search second location from the drop down
		//basetc_obj.inputText(SearchResultPage.edtSearchLocations, PropertyHelper.helperProperty("location2"));

		//Select The Second Option From The DropDown
		//basetc_obj.tapOnElement(SearchResultPage.lstFirstEntry, "Drop Down List");

		//clicking on checkbox with caption Include Nearby Properties
		//SearchResultPage.checkboxmethod();
		//basetc_obj.tapOnElement(SearchResultPage.chkIncludeNearByProperties, "Include nearby properties");

		
		
		
		
		
		
		//Thread.sleep(3000);
		//obj_home.selectdropdown();
		//handleAlert();
		
		//Select two localities from Search Box bar
		//basetc_obj.verifyPageIsDisplayed(SearchResultPage.txtPropertyStatus, "Property Status");	
		//SearchResultPage.enterText(PropertyHelper.helperProperty("location1"));
		//obj_home.selectdropdown(PropertyHelper.helperProperty("location1"));
		//obj_home.enterText(PropertyHelper.helperProperty("location2"));
		//obj_home.selectdropdown(PropertyHelper.helperProperty("location2"));
				
		//Click on the checkbox "Include nearby properties
		//SearchResultPage.checkboxmethod();
		
		//select 2 bhk and 3 bhk from from the number of bedroom sections
		
	
		//Click on search related button
		
		//Scroll down on the Property listing page and click on the 4th property.
		
		
		//Scroll down to till end and click on “Wrong Info” which comes under ‘Report what was’t correct in this property’.
		
		//Select all check-boxes in “What’s wrong” section and click on Report .
		
		//Change 3BHK to 4+BHK from ‘whats is the correct configuration’ section in “Suggest an Edit” page.
		
		
		//click on the “save changes” button and verify the successful message “Thank you for the Feedback”.
	}
	
	
	@AfterClass
	public void ClosingDriver() throws MalformedURLException
	{
		//driver.close();
		//driver.quit();
		test.pass("Driver got terminated successfully");
		
	}
	
	
	
}
