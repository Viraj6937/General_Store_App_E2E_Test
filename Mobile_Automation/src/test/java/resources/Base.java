package resources;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.testng.annotations.*;

import PageObject.Common_Page_Object;
import PageObject.Details_Page_Object;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class Base {

	public AndroidDriver driver;

	AppiumDriverLocalService service;
		
	@BeforeTest
	public void configApp() throws MalformedURLException {
	
		//service = new AppiumServiceBuilder().withAppiumJS(new File("C:\\Users\\Viraj\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js")).withIPAddress("0.0.0.0").usingPort(4723).build();
		
		//service.start();
		
		UiAutomator2Options cap = new UiAutomator2Options();
		cap.setDeviceName("Viraj_Emulator");
		cap.setApp("C:\\Users\\Viraj\\Desktop\\Appium\\Mobile_Automation\\src\\test\\java\\resources\\General-Store.apk");
		
		driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"),cap);			
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		
	}
	
	@AfterTest
	public void terminate() {
		//service.stop();
		driver.quit();
	}
}
