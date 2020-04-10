package constants;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AppUtils {
	
	
	public  static WebDriver driver;
	public static String url="http://orangehrm.qedgetech.com";
	
	public static void launchApp(){
		System.setProperty("webdriver.chrome.driver","Chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(url);
		
	}
	public static void closeApp(){
		driver.close();
	}
}
