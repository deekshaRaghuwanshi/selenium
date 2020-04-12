package practiceprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import io.netty.util.internal.ThreadExecutorMap;

public class YahooToGmail {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver","/Users/vikram.b/UI_Automation/chromedriver");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		// launch yahoo site
		driver.get("https://mail.yahoo.com/");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a/span[text()='Sign in']")).click();
		Thread.sleep(6000);
		driver.findElement(By.id("login-username")).sendKeys("bairivikram",Keys.ENTER);	
		Thread.sleep(6000);
		driver.findElement(By.id("login-passwd")).sendKeys("Goud@1992",Keys.ENTER);
	
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[text()='Compose']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@role='combobox'])[2]")).sendKeys("selenium0004@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Subject']")).sendKeys("Wishes");
		driver.findElement(By.xpath("//div[@aria-label='Message body']/div")).sendKeys("Hi SDET");
		driver.findElement(By.xpath("//button/span[text()='Send']")).click();
		System.out.println("Successful sent mail");
		
		
		driver.close();
		
		
		
	
	}

}
