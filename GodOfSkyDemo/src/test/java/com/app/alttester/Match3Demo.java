package com.app.alttester;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import ro.altom.altunitytester.AltUnityDriver;
import ro.altom.altunitytester.AltUnityDriver.By;

public class Match3Demo {
	
	private static AltUnityDriver altd;
	public static void main(String[] args) throws MalformedURLException {
		
		altd = new AltUnityDriver();
		altd.loadScene("Menu"); //Launch the app
		altd.findObject(AltUnityDriver.By.NAME, "Start").tap();// Click Start button
		altd.findObject(AltUnityDriver.By.NAME, "ContinueStart").tap(); // Click "Yes" on secondary popup post start 
		altd.findObject(AltUnityDriver.By.NAME, "Menu").tap(); // Click "Menu" button 
		altd.findObject(AltUnityDriver.By.NAME, "Music").tap(); // Click "Music On" button to turn off the music
		altd.findObject(By.NAME, "Back").tap(); // Click Back button to land of Main Screen 
		int a = altd.findObjects(By.NAME, "Gem04(Clone)").length; // Get the number of "Bread" gems on the screen
		System.out.println(a); // Print the number of "Bread" gems on the screen 
		altd.findObject(By.NAME, "Exit").tap(); // Click Exit to exit the game 
		altd.findObject(By.NAME,"Exit").tap(); // Click Yes on additonal popup to be surely getting out of the game
		altd.stop(); // Kill the app
		
		
	}

}
