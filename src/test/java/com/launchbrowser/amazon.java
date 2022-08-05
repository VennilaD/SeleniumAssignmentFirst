package com.launchbrowser;

import org.testng.annotations.Test;

import com.utility.Library;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;

public class amazon extends Library {
  @Test
  public void AmazonOnlineLoadedSuccessfully() {
	  System.out.println("inside AmazonOnlineLoadedSuccessfully");
	 String titleOfAmazonOnline = driver.getTitle();
	 System.out.println("titleOfAmazonOnline:"+titleOfAmazonOnline);
	 Assert.assertEquals(titleOfAmazonOnline, objProperties.getProperty("AmazonOnlineTitle"));
  }
  @BeforeMethod
  public void beforeMethod() {
  }

  @AfterMethod
  public void afterMethod() {
  }

  @BeforeClass
  public void beforeClass() {
  }

  @AfterClass
  public void afterClass() {
  }

  @BeforeTest
  public void beforeTest() {
	  Library.LaunchBrowser();
  }

  @AfterTest
  public void afterTest() {
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("inside beforeSuite");
	  try {
		ReadPropertiesFile();
	} catch (Exception e) {

		e.printStackTrace();
  }
  }
}
