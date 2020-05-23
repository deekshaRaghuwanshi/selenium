        package javascriptmethods;



		import org.openqa.selenium.By;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.chrome.ChromeDriver;

		public class CreateAlerts {

			public static void main(String[] args) throws InterruptedException {
			{
				
				System.setProperty("webdriver.chrome.driver", "E:/Automation/JarFiles/chromedriver_win32/chromedriver.exe");
				System.setProperty("webdriver.chrome.silentOutput","true");
				ChromeDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.executeScript("window.alert('Launching Site')");
				Thread.sleep(2000);
				driver.switchTo().alert().dismiss();
				driver.get("https://www.google.com/");
				Thread.sleep(3000);
				WebElement search_key = driver.findElement(By.name("q"));
				
				driver.executeScript("window.alert('changing background color')");
				Thread.sleep(3000);
				driver.switchTo().alert().dismiss();
				driver.executeScript("arguments[0].style.background='green';",search_key);
				
				driver.executeScript("window.alert('Disable element')");
				Thread.sleep(3000);
				driver.switchTo().alert().dismiss();
				driver.executeScript("arguments[0].disabled='true';",search_key);
			
				driver.executeScript("window.alert('Enable element')");
				Thread.sleep(3000);
				driver.switchTo().alert().dismiss();
				driver.executeScript("arguments[0].disabled='false';",search_key);
				
				driver.executeScript("window.alert('Highlight border')");
				Thread.sleep(3000);
				driver.switchTo().alert().dismiss();
				driver.executeScript("arguments[0].style.border='3px red dotted';",search_key);
			
				driver.executeScript("window.alert('Enter text red color')");
				Thread.sleep(3000);
				driver.switchTo().alert().dismiss();
				driver.executeScript("arguments[0].style.colour='red';",search_key);
				driver.executeScript("arguments[0].value='Vikram';",search_key);
				Thread.sleep(5000);
				driver.navigate().refresh();
				Thread.sleep(5000);
				driver.close();
			}
			}
			}
		

		




	


