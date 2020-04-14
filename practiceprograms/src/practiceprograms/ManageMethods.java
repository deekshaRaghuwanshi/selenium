package practiceprograms;



import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class ManageMethods {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver","/Users/vikram.b/UI_Automation/chromedriver");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		//get width and height
		int h=driver.manage().window().getSize().getHeight();
		int w=driver.manage().window().getSize().getWidth();
		System.out.println(w+" "+h);
		Thread.sleep(3000);
		//get position of browser
		int x=driver.manage().window().getPosition().getX();
		int y=driver.manage().window().getPosition().getY();
		System.out.println(x+" "+y);
		// set the dimesions 
		Dimension d = new Dimension(200,300);
		driver.manage().window().setSize(d);
		Thread.sleep(4000);
		// set the position of browser
		Point p = new Point(100,100);
		driver.manage().window().setPosition(p);
		Thread.sleep(3000);
		// make full screen of browser
		driver.manage().window().fullscreen();
		

	}

}
