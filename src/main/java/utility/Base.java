package utility;
import java.net.URL;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import helper.ExtentReportsDemo;
import io.appium.java_client.AppiumDriver;

public class Base extends ExtentReportsDemo{
	public static AppiumDriver<WebElement> driver;
	public static DesiredCapabilities caps;
	public static URL url;
	public static WebDriverWait wait;
}
