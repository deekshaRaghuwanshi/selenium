package orangehrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class LoginPage1 {
	
	
	//Define Elements
	@FindBy(id="txtUsername") WebElement uid;
	@FindBy(name="txtPassword") WebElement pwd;
	@FindBy(id="btnLogin") WebElement login;
	
	
	//Define Functions
	 public void Login(String uname,String pword) {
		 uid.sendKeys(uname);
		 pwd.sendKeys(pword);
		 login.click();
		 
		 
		
		
		
	}
	
	
}
