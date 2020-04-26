package mainfeatures;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FireFox {

	
	public static void main(String[] args) throws InterruptedException {
		//Set path for driver exe 
				System.setProperty("webdriver.gecho.driver", "geckodriver.exe");
				WebDriver driver=new FirefoxDriver();
				driver.manage().window().maximize();
				driver.manage().deleteAllCookies();
				//Invoke the URL
				driver.get("https://homeonline.com");
				//Click on Action icon
				driver.findElement(By.xpath("//div[@class='oteher-navbar']/following-sibling::div/span/a")).click();
				//Click on Sign up link
				driver.findElement(By.xpath("//a[text()=' Sign Up ']")).click();
				// Switch to Frame
				driver.switchTo().frame(driver.findElement(By.id("cal-signup")));
				Thread.sleep(5000);
				WebDriverWait wait = new WebDriverWait(driver, 20);
				wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("Phone"))));
				//Enter Mobile number
		        driver.findElement(By.id("Phone")).sendKeys("9827457470");
		        Thread.sleep(5000);
		        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//button[text()='Continue']"))));
				driver.findElement(By.xpath("//button[text()='Continue']")).click();
				//Enter otp number
				driver.findElement(By.id("otpNum")).sendKeys("2727");
				Thread.sleep(5000);
				driver.findElement(By.xpath("(//button[text()='Continue'])[2]")).click();
				Thread.sleep(5000);
				driver.switchTo().defaultContent();
				WebElement cancelbutton;
				
			
		        cancelbutton=driver.findElement(By.xpath("(//button[@id='close-popup-btn']"));
		        Actions act=new Actions(driver);
		        act.moveToElement(cancelbutton);
		        act.build();
		        act.perform();

	}

}
