package Constants;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class AppUtils {
	
	public static WebDriver driver;
	public static String url="http://orangehrm.qedgetech.com";
	
	@BeforeTest
	public static void LaunchApp() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(url);
		
		
		
	}
	@AfterTest
	
	public static void AppClose() {
		driver.close();
	}
	
		
	
	

}
