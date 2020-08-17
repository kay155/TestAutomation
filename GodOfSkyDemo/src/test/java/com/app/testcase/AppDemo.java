package com.app.testcase;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;

public class AppDemo {
	
	public static void main(String[] args) throws MalformedURLException {
		
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability("platformName", "Android");
		dc.setCapability("udid", "RF8M61TV63Z");
		dc.setCapability("platfromversion", "10.0");
		dc.setCapability("automationName", "UiAutomator2");
		dc.setCapability("appPackage", "com.huuuge.casino.slots");
		dc.setCapability("appActivity", "com.huuuge.casino.BootActivity");
		

		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		AppiumDriver driver = new AndroidDriver(url, dc);
		
		
		driver.findElementById("android:id/button1").click(); //Click "OK" on first pop-up for the permission
		driver.findElementById("com.android.permissioncontroller:id/permission_allow_button"); //Click "Allow" on following popup for the permission
				
		TouchAction t = new TouchAction(driver);
              
        t.tap(PointOption.point(955, 842)).perform(); //ACCEPT THE TERMS
        
        t.tap(PointOption.point(1992, 919)).perform(); //SPIN FOR THE FIRST TIME 
        
        t.tap(PointOption.point(1044, 939)).perform(); // INCRESE A BIT
        
        t.tap(PointOption.point(1992, 931)).perform(); // SPIN FOR THE SECOND TIME 
        
        t.tap(PointOption.point(1992, 923)).perform(); // SPIN FOR THE THIRD TIME 
        
        t.tap(PointOption.point(1996, 931)).perform(); // SPIN FOR THE FOURTH TIME 
        
        t.tap(PointOption.point(1000, 826)).perform(); // CLICK CONTINUE
        
        t.tap(PointOption.point(1057, 967)).perform(); // PLAY AS A GUEST
        
        t.tap(PointOption.point(291, 73)).perform(); // OPEN USER PROFILE 
        
        t.tap(PointOption.point(1777, 45)).perform(); //CLOSE USER PROFILE
        
        // KILL AN APP
        driver.terminateApp("com.huuuge.casino.slots");
		driver.terminateApp("com.huuuge.casino.BootActivity");
    }
	

}
