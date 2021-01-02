package com.HomeDepot.FirstProject;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class homePageTest extends homePage {

@Test	
public void browserTest() {
	SoftAssert sa = new SoftAssert();
	initiateBrowser();
	boolean result=true;

	sa.assertTrue(result);
	sa.assertAll();
	 
}
	
	
	
	
	
}
