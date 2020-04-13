package practiceprograms;

import java.util.List;

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
		
		// collect list of mails 
		List<WebElement> allmails = driver.findElements(By.xpath("(//table)[7]/tbody/tr"));
		System.out.println("Total mails account in inbox "+allmails.size()+"\n------------");
		
		// read from email from each and every mail using Attribute
		for (WebElement e:allmails)
		{
			
			String actualemail = e.findElement(By.xpath("td[5]/div[2]/span/span")).getAttribute("email");
			//print from emailid
			
			// check read email and given email are equals
			String expectemail ="googlecommunityteam-noreply@google.com";
			if(actualemail.equals(expectemail))
			{
				System.out.println("Actual email is "+actualemail);
				System.out.println("Expected mail is "+expectemail);
				System.out.println("Both are same. Hence Test Passed");
				break;
			}
			else {
				System.out.println("Actual email is "+actualemail);
				System.out.println("Expected email is "+expectemail);
				System.out.println("Both are different. Hence Test failed \n---------------------");
			}
		}
		
		// do logout from gmail
		
		driver.findElement(By.xpath("//a[contains(@aria-label,'Google Account')]")).click();
		driver.findElement(By.xpath("//a[text()='Sign out']")).click();
		Thread.sleep(5000);
		driver.close();

	}
}


