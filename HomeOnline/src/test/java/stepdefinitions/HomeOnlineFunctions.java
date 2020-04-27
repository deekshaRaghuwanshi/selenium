package stepdefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HomeOnlineFunctions {

	public static WebDriver driver;
	public static WebDriverWait wait;
	public static Timeouts timeouts;

	@Given("^I Open Browser with URL \"([^\"]*)\"$")
	public void i_Open_Browser_with_URL(String arg1) throws Throwable {
		//Set path for driver exe 
		System.setProperty("webdriver.chrome.driver", "Chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		//Invoke the URL
		driver.get("https://homeonline.com");

	}

	@Then("^I Should See Home page$")
	public void i_Should_See_Home_page() throws Throwable {
		if(driver.findElement(By.linkText("Find a Home")).isDisplayed()){
			System.out.println("HomePage display");

		}else
		{
			System.out.println("Homepage not displayed");
		}
	}

	@When("^I Hovering the mouse over the Action icon$")
	public void i_Hovering_the_mouse_over_the_Action_icon() throws Throwable {
		driver.findElement(By.xpath("//div[@class='oteher-navbar']/following-sibling::div/span/a")).click();

	}

	@When("^I Click on Sign Up link$")
	public void i_Click_on_Sign_Up_link() throws Throwable {
		driver.findElement(By.xpath("//a[text()=' Sign Up ']")).click();  
	}

	@When("^I switch the frame$")
	public void i_switch_the_frame() throws Throwable {
		driver.switchTo().frame(driver.findElement(By.id("cal-signup")));

	}
	@Then("^I set explicit wait on phon no element until it becomes click$")
	public void i_set_explicit_wait_on_phon_no_element_until_it_becomes_click(){
		//Explicitly wait
		wait=new WebDriverWait(driver, 40);
		//Enter Mobile number
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("Phone")))); 
	}
	@When("^I Enter the Valid Mobile Number$")
	public void i_Enter_the_Valid_Mobile_Number() throws Throwable {
		//Enter Mobile number
		driver.findElement(By.id("Phone")).sendKeys("9827457470");
	}

	@Then("^Click on Continue Button$")
	public void click_on_Continue_Button() throws Throwable {
		driver.findElement(By.xpath("//button[text()='Continue']")).click();
	}

	@When("^Enter the valid OTP No$")
	public void enter_the_valid_OTP_No() throws Throwable {
		driver.findElement(By.id("otpNum")).sendKeys("2727");
	}
	@When("^I set implicit timeout$")
	 public void i_set_implicit_timeout() throws Throwable {
	 timeouts=driver.manage().timeouts();
	 timeouts.implicitlyWait(5, TimeUnit.SECONDS);
	}
	
	 
	
	@And("^Click on Continue1 Button$")
	public void click_on_Continue1_Button() throws Throwable {
		driver.findElement(By.xpath("(//button[text()='Continue'])[2]")).click();
		Thread.sleep(5000);
		}
	
	@And("^Back to the default frame$")
	public void Back_to_the_default_frame() throws Throwable {
		driver.switchTo().defaultContent();
	}
	@Then("^I set explicit wait on cross icon element until it becomes clickable$")
	public void i_set_explicit_wait_on_cross_icon_element_until_it_becomes_clickable(){
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//button[@id='close-popup-btn']"))));
	}
   
	@Then("^Click on Cancel icon$")
	public void click_on_cancel_icon() throws Throwable{
      driver.findElement(By.xpath("//button[@id='close-popup-btn']")).click();
    }
	
	@When("^I close the Browser$")
	public void i_close_the_Browser() throws Throwable {
		driver.close();

	}

}

