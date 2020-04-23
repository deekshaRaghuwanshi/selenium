package functionalitytest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;

public class SignUpTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "Chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://homeonline.com");
		driver.findElement(By.xpath("//div[@class='oteher-navbar']/following-sibling::div/span/a")).click();
		driver.findElement(By.xpath("//*[@data-src='https://www.homeonline.com/iframe/signup']")).click();
		Thread.sleep(2000);
		// click on registration screen
		Actions act= new Actions(driver);
		WebElement element;
		driver.findElement(By.xpath("//*[@type='tel']")).sendKeys("8518085737");
	    driver.findElement(By.xpath("//*[@type='button']")).click();
		
		

	}

}