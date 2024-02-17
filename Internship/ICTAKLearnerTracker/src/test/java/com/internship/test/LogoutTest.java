package com.internship.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.internship.constants.AutomationConstants;
import com.internship.pages.LoginPage;
import com.internship.pages.LogoutPage;

public class LogoutTest extends TestBase {

	LoginPage loginpage = null;
	LogoutPage logoutpage = null;

	@Test
	public void adminClickLogout() {
		loginpage = new LoginPage(driver);
		logoutpage = new LogoutPage(driver);
		loginpage.login(AutomationConstants.adminUsername, AutomationConstants.adminPassword);
		logoutpage.clickName();
		logoutpage.clickLogout();
		Assert.assertEquals(logoutpage.loginPageTitle(), AutomationConstants.loginpagetitle);
	}

	@Test
	public void trainerClickLogout() {
		loginpage = new LoginPage(driver);
		logoutpage = new LogoutPage(driver);
		loginpage.login(AutomationConstants.trainingHeadUsername, AutomationConstants.trainingHeadPassword);
		logoutpage.clickName();
		logoutpage.clickLogout();
		Assert.assertEquals(logoutpage.loginPageTitle(), AutomationConstants.loginpagetitle);
	}

	@Test
	public void placementOfficerClickLogout() {
		loginpage = new LoginPage(driver);
		logoutpage = new LogoutPage(driver);
		loginpage.login(AutomationConstants.placementOfficerUsername, AutomationConstants.placementOfficerPassword);
		logoutpage.clickName();
		logoutpage.clickLogout();
		Assert.assertEquals(logoutpage.loginPageTitle(), AutomationConstants.loginpagetitle);
	}
}
