package practiceprograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CarouselBanner {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver","/Users/vikram.b/selenium/chromedriver");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
		Thread.sleep(2000);
		WebElement cs = driver.findElement(By.className("carousel__list"));
		List<WebElement> sliders = cs.findElements(By.xpath("child::li"));
		System.out.println("No of carousel sliders are "+sliders.size());
		String x=cs.getCssValue("transform");
		System.out.println(x);
		System.out.println(x);
		if(x.startsWith("matrix3d")) 
		{
			System.out.println("Carousel is 3D");
		}
		else 
		{
			System.out.println("Carousel is 2D");
			String y = x.substring(7, x.length()-1);
			String[] z = y.split(",");
			z[4]=z[4].trim();
			z[5]=z[5].trim();
			float xoffset = Float.parseFloat(z[4]);
			float yoffset = Float.parseFloat(z[5]);
			System.out.println(xoffset);
			System.out.println(yoffset);
			if (yoffset==0.0 && xoffset>0.0) 
			{
				System.out.println("slider is left to right rotating");
			}
			else if (yoffset==0.0 && xoffset<0.0) 
			{
				System.out.println("slider is right to left rotating");
			}
		}
		
		String t=cs.getCssValue("transition");
		System.out.println(t);
		String[] p=t.split(" ");
		System.out.println("Duration of each slide is "+p[1]);
		System.out.println("Delay between slides is "+p[7]);
		if (p[2].equals("ease-in"))
		{
			System.out.println("sliders starts slowly");
		}
		else if (p[2].equals("ease-out"))
		{
			System.out.println("sliders starts slowly");
		}
		else 
		{
			System.out.println("sliders starts and ends slowly");
		}
		
		driver.close();

	}

}
