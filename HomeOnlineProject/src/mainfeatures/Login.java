package mainfeatures;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login {
    public static WebDriverWait wait; 
	public static void main(String[] args) throws InterruptedException {
			//Create prefs map to store all preferences 
			Map<String, Object> prefs = new HashMap<String, Object>();
			//Put this into prefs map to switch off browser notification
			prefs.put("profile.default_content_setting_values.notifications", 2);
			//Create chrome options to set this prefs
			ChromeOptions options = new ChromeOptions();
			options.setExperimentalOption("prefs", prefs);

			//Set path for driver exe 
			System.setProperty("webdriver.chrome.driver", "E:/Automation/JarFiles/chromedriver_win32/chromedriver.exe");
			WebDriver driver=new ChromeDriver(options);
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
			//Invoke the URL
			driver.get("https://homeonline.com");
			//Click on Action icon
			driver.findElement(By.xpath("//div[@class='oteher-navbar']/following-sibling::div/span/a")).click();
			//Click on Login link
			driver.findElement(By.xpath("//a[text()='Login']")).click();
			// Switch to Frame
			driver.switchTo().frame(0);
			//driver.switchTo().frame(driver.findElement(By.id("cal-signup")));
			Thread.sleep(5000);
			//Enter the email into the text field
			driver.findElement(By.id("userPhone")).sendKeys("corwin.dell@gmail.com");
			Thread.sleep(5000);
			driver.findElement(By.xpath("(//button[text()='Continue'])[5]")).click();
			//Enter password into the text field
			driver.findElement(By.id("userPassword")).sendKeys("dbcl@2019");
			Thread.sleep(5000);
	        driver.findElement(By.xpath("(//button[text()='Sign In'])[1]")).click();
			Thread.sleep(5000);
			driver.switchTo().defaultContent();
			wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//button[@id='close-popup-btn']"))));
			driver.findElement(By.xpath("//button[@id='close-popup-btn']")).click();








		}

	}


