package practiceprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailLogin {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","/Users/vikram.b/UI_Automation/chromedriver");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
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
		driver.close();
	}

}
