package diksha;


	
	

	import java.net.MalformedURLException;
	import java.net.URL;

	import org.openqa.selenium.Platform;
	import org.openqa.selenium.remote.DesiredCapabilities;
	import org.openqa.selenium.remote.RemoteWebDriver;
	

	public class raghu {
		
		
		
		String br="firefox";
		
		
		
		public void gridTest() throws MalformedURLException {
			
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



