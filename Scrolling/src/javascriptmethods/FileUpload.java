package javascriptmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:/Automation/JarFiles/chromedriver_win32/chromedriver.exe");
		System.setProperty("webdriver.chrome.silentOutput","true");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/upload/");
		driver.manage().window().maximize();
		WebElement element;
		element=driver.findElement(By.id("uploadfile_0"));
		element.sendKeys("E://samplefile.txt");
		driver.findElement(By.id("terms")).click();
		driver.findElement(By.name("send")).click();



	}

}
