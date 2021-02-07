package utility;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.aventstack.extentreports.ExtentTest;

import io.appium.java_client.AppiumDriver;
import helper.PropertyHelper;

public class AndroidUtility extends Base {
	ExtentTest test;
public void setDesiredCapability() throws Exception
{
	//test=extent.createTest("TC001_Verify_abuse_Report_for_Buy_Property");// create a node
	caps=new DesiredCapabilities();
	caps.setCapability("deviceName", PropertyHelper.helperProperty("deviceName"));
	caps.setCapability("udid", PropertyHelper.helperProperty("udid"));
	caps.setCapability("platformName", PropertyHelper.helperProperty("platformName"));
	caps.setCapability("appPackage", PropertyHelper.helperProperty("appPackage"));
	caps.setCapability("automationName", PropertyHelper.helperProperty("automationName"));
	caps.setCapability("appActivity", PropertyHelper.helperProperty("appActivity"));
	//caps.setCapability("autoAcceptAlerts", true);
	//caps.setCapability("autoDismissAlerts", true);
	url=new URL(PropertyHelper.helperProperty("CAPABILITY_URL"));
	driver=new AppiumDriver<WebElement>(url,caps);
	//test.pass("User is able to launch No broker application successfully");
}

public void closeDriver() throws MalformedURLException
{
	driver.close();
	driver.quit();
	//test.pass("User is able to close driver successfully");
}

}
