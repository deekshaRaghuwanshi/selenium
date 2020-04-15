package practiceprograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchResults {

	public static void main(String[] args) throws Exception{
		
		// We can use this logics for pagination
		System.setProperty("webdriver.chrome.driver","/Users/vikram.b/UI_Automation/chromedriver");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		Thread.sleep(2000);
		driver.findElement(By.name("q")).sendKeys("Magnitia",Keys.ENTER);
		//driver.findElement(By.className("hsuHs")).click();
		Thread.sleep(2000);
		int resperpage =0;
		int totalresults =0;
		int pagenumber=0;
		while(2>1) 
		{
			List<WebElement> l = driver.findElements(By.xpath("//*[@class='rc']"));
			pagenumber++;
			resperpage=l.size();
			System.out.println(pagenumber+" is having "+resperpage);
			totalresults=totalresults+resperpage;
			Thread.sleep(5000);
			try {
				WebElement e =driver.findElement(By.xpath("//span[text()='Next']"));
					if(e.isDisplayed())
					{
						e.click();
					}
				}
			catch(Exception ex) 
			{
				break;
			}

		}
			System.out.println("Total results for Magnitia "+totalresults);
			driver.close();

	}

}
