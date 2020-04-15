package practiceprograms;

import java.util.ArrayList;
import java.util.Set;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.chrome.ChromeDriver;

public class CookiesMethods{

	public static void main(String[] args) throws Exception{

		System.setProperty("webdriver.chrome.driver","/Users/vikram.b/UI_Automation/chromedriver");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
		Thread.sleep(5000);

		// adding cookie 

		Cookie ac = new Cookie("My cookie","Magnitia"); //(name,value)
		driver.manage().addCookie(ac);

		// collect all cookies related to site
		Set<Cookie>cl1=driver.manage().getCookies();
		ArrayList<Cookie> l1 = new ArrayList<Cookie>(cl1);
		System.out.println("Count of cookies "+l1.size());
		for(Cookie c:l1)
		{
			System.out.println(c.getName()+"---->"+c.getValue());
		}
		// After deleting 
		System.out.println("After deleting cookie list");
		// deleting cookie using cookie object name and cookie name
		driver.manage().deleteCookie(ac);		
		driver.manage().deleteCookieNamed("DG_HID");
		Set<Cookie> cl2 = driver.manage().getCookies();
		ArrayList<Cookie> l2 = new ArrayList<Cookie>(cl2);
		System.out.println("Count of cookie is "+l2.size());
		for(Cookie c:l2)
		{
			System.out.println(c.getName()+"---->"+c.getValue());
		}
		driver.close();
	}

}
