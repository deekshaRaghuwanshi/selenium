package practiceprograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SingleSelectDropDown {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","/Users/vikram.b/UI_Automation/chromedriver");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		// launch website
		driver.get("https://semantic-ui.com/modules/dropdown.html");
		Thread.sleep(5000);

		// scrolling down page using neighbour element of gender droddown
		WebElement neighbour=	driver.findElement(By.xpath("//h4[text()='Selection']"));
		driver.executeScript("arguments[0].scrollIntoView();", neighbour);
		Thread.sleep(5000);

		WebElement dd=	driver.findElement(By.xpath("//h4[text()='Selection']/following-sibling::div[2]"));

		// TestCase-1: Check Single selection dropdown or not 
		if (dd.getAttribute("class").contains("multiple")) {
			System.out.println("Dropdown is multiple selection");
		}
		else {
			System.out.println("Dropdwon is single selection");

			//TestCase-2: Collect all dropdwon items and display them

			List<WebElement> items = dd.findElements(By.xpath("child::div[2]/div"));
			System.out.println("No of dropdown values are: "+items.size());

			for(WebElement item:items) 
			{
				//This is for inivisible elements
				//String x=item.getText();
				// null is returning we need to check further 
				String x=(String) driver.executeScript("return(arguments[0].textContext);",item);
				System.out.println(x);
			}
			// TestCase-3: Select each item and test that selection
			for(WebElement item:items) 
			{
				try {
					//1.Open dropdown to make visibility
					dd.click();
					Thread.sleep(3000);
					//2.Check item for visibility
					if(item.isDisplayed()) 
					{
						//3. Remember that item to be selected
						String expected = item.getText();
						//4. Select that item	
						item.click();
						Thread.sleep(3000);
						//5. Get selected item text
						String actual =dd.findElement(By.xpath("child::div[1]")).getText();
						//6. compare both remembered text and visible text of selected item
						if(expected.equals(actual)) 
						{
							System.out.println("Item selection test passed");
						}
						else 
						{
							System.out.println("Item selection test failed");
						}
					}
					else 
					{
						String y = (String)driver.executeScript("arugments[0],textContext()", item);
						System.out.println(y+" item is hidden");
					}
				}

				catch(Exception e)
				{
					break;
				}
			}
		}
		driver.close();
	}

}
