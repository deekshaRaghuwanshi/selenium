       package javascriptmethods;
       import org.openqa.selenium.By;
       import org.openqa.selenium.JavascriptExecutor;
       import org.openqa.selenium.WebDriver;
       import org.openqa.selenium.WebElement;
       import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
       

		public class ExecuteScript {
			
			@Test
			public void ClickOnElement() throws InterruptedException
			{
				System.setProperty("webdriver.chrome.driver", "E:/Automation/JarFiles/chromedriver_win32/chromedriver.exe");
				System.setProperty("webdriver.chrome.silentOutput","true");
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://www.google.com");
				Thread.sleep(2000);
				// using javascript entering values in input field
				WebElement f=driver.findElement(By.name("q"));
				
				//Creating the JavascriptExecutor interface object by Type casting		
		        JavascriptExecutor js = (JavascriptExecutor)driver;
				js.executeScript("arguments[0].value='automation';",f);
				Thread.sleep(3000);
				// using javascript clicking on an element
				WebElement e = driver.findElement(By.xpath("(//input[@aria-label='Google Search'])[2]"));
				js.executeScript("arguments[0].click();",e);
				Thread.sleep(2000);
			
				
			}

		

	}


