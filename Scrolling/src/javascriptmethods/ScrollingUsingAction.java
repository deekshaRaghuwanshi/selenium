package javascriptmethods;


		import org.openqa.selenium.By;
		import org.openqa.selenium.Keys;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.chrome.ChromeDriver;
		import org.openqa.selenium.interactions.Actions;

		public class ScrollingUsingAction {

			public static void main(String[] args) throws Exception{
				System.setProperty("webdriver.chrome.driver", "E:/Automation/JarFiles/chromedriver_win32/chromedriver.exe");
				System.setProperty("webdriver.chrome.silentOutput","true");;
				ChromeDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://stackoverflow.com/questions/10211203/scrolling-child-div-scrolls-the-window-how-do-i-stop-that");
				Thread.sleep(5000);
				Actions a = new Actions(driver);
				//page level vertical scrolling
				for(int i=0;i<=5;i++)
				{
					a.sendKeys(Keys.ARROW_DOWN).build().perform();
					Thread.sleep(1000);
				}
				Thread.sleep(5000);
				//element level horizontal(right side) scrolling 
				WebElement e=driver.findElement(By.xpath("(//*[@class='lang-js prettyprint prettyprinted'])[1]"));
				for(int i=0;i<=10;i++)
				{
					a.sendKeys(e,Keys.ARROW_RIGHT).build().perform();
					Thread.sleep(1000);
				}
				//element level horizontal(left side) scrolling
				for(int i=0;i<=5;i++)
				{
					a.sendKeys(e,Keys.ARROW_LEFT).build().perform();
					Thread.sleep(1000);
				}
				driver.close();
			}

		


	




	}


