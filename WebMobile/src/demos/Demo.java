package demos;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Demo extends Capability {
	
	AndroidDriver<AndroidElement> driver;

	@Test
	public void setUp() throws MalformedURLException
	{
		driver= capabilities();
		driver.manage().window().maximize();
	}
	
	@Test
	public void testCase1()
	{
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("IBM");
		
	}
}
