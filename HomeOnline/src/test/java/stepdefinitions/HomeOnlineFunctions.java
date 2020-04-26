package stepdefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HomeOnlineFunctions {
	
	public static WebDriver driver;

@Given("^I Open Browser with URL \"([^\"]*)\"$")
public void i_Open_Browser_with_URL(String arg1) throws Throwable {
	System.setProperty("webdriver.driver.chrome", "chromedriver.exe");
	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("https://www.homeonline.com/");
   
    
}

@Then("^I Should See Home page$")
public void i_Should_See_Home_page() throws Throwable {
    if(driver.findElement(By.linkText("Find a Home")).isDisplayed()){
    	System.err.println("HomePage display");
    	
    }else
    {
    	System.err.println("Homepage not displayed");
    }
}

@When("^I Hovering the mouse over the Action icon$")
public void i_Hovering_the_mouse_over_the_Action_icon() throws Throwable {
  driver.findElement(By.xpath("//*[@class='lnr lnr-user']")).click();
}

@When("^I Click on Sign Up link$")
public void i_Click_on_Sign_Up_link() throws Throwable {
    driver.findElement(By.xpath("//*[@class='iframeBox signup-p']")).click();
}

@When("^I Enter the Valid Mobile Number$")
public void i_Enter_the_Valid_Mobile_Number() throws Throwable {
    driver.findElement(By.id("Phone")).sendKeys("8518085737");
}

@Then("^Click on Continue Button$")
public void click_on_Continue_Button1() throws Throwable {
    driver.findElement(By.xpath("//*[@type='button']")).click();
}

@When("^Enter the valid OTP No$")
public void enter_the_valid_OTP_No() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@When("^Click on Continue Button$")
public void click_on_Continue_Button() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@When("^I close the Browser$")
public void i_close_the_Browser() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}



}
