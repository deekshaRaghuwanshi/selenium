package practiceprograms;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

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
		// do login into yahoo
		driver.findElement(By.id("login-username")).sendKeys("bairivikram",Keys.ENTER);	
		Thread.sleep(6000);
		driver.findElement(By.id("login-passwd")).sendKeys("Goud@1992",Keys.ENTER);
		// compose email to gmail
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[text()='Compose']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@role='combobox'])[2]")).sendKeys("selenium0004@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Subject']")).sendKeys("Wishes");
		driver.findElement(By.xpath("//div[@aria-label='Message body']/div")).sendKeys("Hi SDET");
		driver.findElement(By.xpath("//button/span[text()='Send']")).click();
		System.out.println("Successful sent mail");
		//switch to new tab in current browser
		driver.switchTo().newWindow(WindowType.TAB);
		Set<String> s = driver.getWindowHandles();
		ArrayList<String> l =new ArrayList<String>(s);
		driver.switchTo().window(l.get(1));
		driver.get("https://www.gmail.com/");
		Thread.sleep(5000);
		//Do login
		driver.findElement(By.id("identifierId")).sendKeys("selenium0004",Keys.ENTER);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@name='password']")).sendKeys("Selenium@321",Keys.ENTER);
		Thread.sleep(3000);
		WebElement email = driver.findElement(By.xpath("(//table)[7]/tbody/tr/td[5]/div[2]/span/span"));
		String yahooemail=email.getAttribute("email");
		System.out.println(yahooemail);
		
		// do logout from gmail
	
		driver.findElement(By.xpath("//a[contains(@aria-label,'Google Account')]")).click();
		driver.findElement(By.xpath("//a[text()='Sign out']")).click();
		Thread.sleep(5000);
		driver.close();		
		
		// focus to yahoo tab
		
		driver.switchTo().window(l.get(0));
		driver.findElement(By.xpath("//img[@role='presentation']")).click();
		driver.findElement(By.xpath("//span[text()='Sign out']")).click();
		Thread.sleep(3000);
		driver.close();
	
	}

}
