package practiceprograms;

import java.util.Scanner;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class CrowserBrowser {

	public static void main(String[] args) throws Exception{

		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Browser Name");
		 String bn =sc.nextLine();
		 RemoteWebDriver driver;
		 if(bn.equalsIgnoreCase("chrome"))
		 {
			 System.setProperty("webdriver.chrome.driver", "/Users/vikram.b/UI_Automation/chromedriver");
			 driver= new ChromeDriver();
		 }
		 else if(bn.equalsIgnoreCase("firefox"))
		 {
			 System.setProperty("webdriver.gecko.driver","/Users/vikram.b/UI_Automation/geckodriver");
				driver = new FirefoxDriver();
		 }
		 else 
		 {
			 System.setProperty("webdriver.safari.driver", "/usr/bin/safaridriver");
				driver = new SafariDriver();
		 }
		 
		 driver.get("https://stage-cms.crm-secure.com/");
		 driver.manage().window().maximize();
		 Thread.sleep(5000);
		 String title=driver.getTitle();
		 System.out.println(title);
		 driver.close();

	}

}
