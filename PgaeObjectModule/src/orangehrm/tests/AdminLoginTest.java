package orangehrm.tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import constants.AppUtils;
import orangehrm.pages.AdminHomePage;
import orangehrm.pages.LoginPage;

public class AdminLoginTest extends AppUtils 
{

	@Test
	public void checkAdminLogin()
	{
		
		
		
		LoginPage lp=PageFactory.initElements(driver, LoginPage.class);
		lp.login("Admin", "Qedge123!@#");
		AdminHomePage ahome=PageFactory.initElements(driver, AdminHomePage.class); 
		boolean res= ahome.isAdminModuleDisplay();
		Assert.assertTrue(res);
		ahome.Logout();	
	}
	
	
	
}
