package orangehrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdminLogin {
	
	//Define Elements
	@FindBy(linkText="Admin") WebElement adminlink;
	@FindBy(linkText="Welcome") WebElement welcomelink;
	@FindBy(linkText="Logout") WebElement logoutlink;
	
	
   //Define Functions
public boolean isAdminModuleDisplay() {
	
	if(adminlink.isDisplayed()) {
		
		return true;
		
	}else {
		return false;
	}
	
	
}

public void Logout() {
  welcomelink.click();
  logoutlink.click();
  
  
  
}
}




