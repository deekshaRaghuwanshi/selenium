package grid;

import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class GridTest {

	String br="firefox";
	@Test
	public void gridTesting() throws MalformedURLException {

		DesiredCapabilities cap=null;
		if(br.equalsIgnoreCase("firefox")){

			cap=DesiredCapabilities.firefox();
			cap.setBrowserName("firefox");
			cap.setPlatform(Platform.WINDOWS);
		}else if(br.equalsIgnoreCase("chrome")) {

			cap=DesiredCapabilities.chrome();
			cap.setBrowserName("chrome");
			cap.setPlatform(Platform.WINDOWS);

		}
		URL remoteurl=new URL("http://192.168.43.242:4444/wd/hub");
		RemoteWebDriver driver=new RemoteWebDriver(remoteurl, cap);
		driver.get("http://orangehrm.qedgetech.com");


	}




}

