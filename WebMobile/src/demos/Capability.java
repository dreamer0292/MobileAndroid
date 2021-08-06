package demos;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class Capability {

	/*
	 * public static void main(String[] args) throws MalformedURLException {
	 * 
	 * DesiredCapabilities cap=new DesiredCapabilities();
	 * cap.setCapability(MobileCapabilityType.DEVICE_NAME, "rashmi");
	 * cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
	 * cap.setCapability(MobileCapabilityType.BROWSER_NAME, "chrome");
	 * cap.setCapability(AndroidMobileCapabilityType.CHROMEDRIVER_EXECUTABLE,
	 * "C:\\Users\\RashmiSanghi\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe"
	 * ); AndroidDriver<AndroidElement> driver= new
	 * AndroidDriver<AndroidElement>(new URL("http://0.0.0.0:4723/wd/hub"),cap); }
	 */
	
	public static AndroidDriver<AndroidElement> capabilities() throws MalformedURLException {
		
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "rashmi");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		cap.setCapability(MobileCapabilityType.BROWSER_NAME, "chrome");
		cap.setCapability(AndroidMobileCapabilityType.CHROMEDRIVER_EXECUTABLE, "C:\\Users\\RashmiSanghi\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		AndroidDriver<AndroidElement> driver= new AndroidDriver<AndroidElement>(new URL("http://0.0.0.0:4723/wd/hub"),cap);
		return driver;	
	}

}
