package javascriptmethods;



import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

   public class PageScrolling {
	
	
	@Test
	public void PageScroll() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "E:/Automation/JarFiles/chromedriver_win32/chromedriver.exe");
		System.setProperty("webdriver.chrome.silentOutput","true");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		Thread.sleep(2000);
		//change browser window size
		Dimension d=new Dimension(800, 400);//width and height
		driver.manage().window().setSize(d);
		Thread.sleep(2000);
		//scroll down
		JavascriptExecutor js=(JavascriptExecutor)driver ;
		js.executeScript("window.scrollTo(0,document.body.scrollHeight);");
		js.executeScript("window.scrollBy(0,document.body.scrollHeight);");
		Thread.sleep(3000);
		//Scroll Up
		js.executeScript("window.scrollBy(0,-(document.body.scrollHeight));");
		js.executeScript("window.scrollTo(document.body.scrollHeight,0);");
		Thread.sleep(3000);
		//Scroll Right
		js.executeScript("window.scrollBy(document.body.scrollWidth,0);");
		Thread.sleep(3000);
		//scroll left
		js.executeScript("window.scrollBy(-(document.body.scrollWidth),0);");
		Thread.sleep(3000);
	

























































































































		
		
			
		
		
		
		
	}

}
