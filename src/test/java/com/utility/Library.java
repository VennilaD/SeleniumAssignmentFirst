package com.utility;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Library {
	public static Properties objProperties ;
	public static WebDriver driver;

	public static void ReadPropertiesFile() {
		System.out.println("location of project:" + System.getProperty("user.dir"));
		
		try {
			
			FileInputStream ObjInputStream= new FileInputStream(System.getProperty("user.dir") + "//src//test//resources//config.properties");
			
			objProperties = new Properties();
		
			objProperties.load(ObjInputStream);
			System.out.println(objProperties.getProperty("browser"));
			System.out.println(objProperties.getProperty("AmazonOnlineURL"));
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	} 
	public static void LaunchBrowser() {
		String browser= objProperties.getProperty("browser");
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get(objProperties.getProperty("AmazonOnlineURL"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

}
}