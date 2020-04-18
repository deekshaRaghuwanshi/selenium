package orangehrm.test;


import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import Constants.AppUtils;
import orangehrm.pages.AdminHomePage;
import orangehrm.pages.LoginPage1;

public class AdminLoginTest extends AppUtils {
	
	public static void CheckAdminLogin() {
		
		LoginPage1 lp=PageFactory.initElements(driver, LoginPage1.class);
		lp.Login("Admin", "Qedge123!@#");
		AdminHomePage ahome=PageFactory.initElements(driver, AdminHomePage.class);
		 boolean res=ahome.isAdminModuleDisplay();
		 Assert.assertTrue(res);
		 ahome.Logout();
		 
	}

}
