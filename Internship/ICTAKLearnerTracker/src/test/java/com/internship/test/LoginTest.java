package com.internship.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.internship.constants.AutomationConstants;
import com.internship.pages.LearnerTrackerPage;
import com.internship.pages.LoginPage;

public class LoginTest extends TestBase {

	LoginPage loginpage = null;
	LearnerTrackerPage learnertrackerpage = null;

	@Test(priority = 1)
	public void validAdminLogin() {
		loginpage = new LoginPage(driver);
		learnertrackerpage = new LearnerTrackerPage(driver);
		loginpage.login(AutomationConstants.adminUsername, AutomationConstants.adminPassword);
		Assert.assertEquals(learnertrackerpage.dashboard(), AutomationConstants.admindashboard);
	}

	@Test(priority = 2)
	public void adminLoginInvalidUsername() {
		loginpage = new LoginPage(driver);
		loginpage.login(AutomationConstants.invalidUsername, AutomationConstants.adminPassword);
		Assert.assertEquals(loginpage.invalidUsernamePassword(), AutomationConstants.invalidUsernameMessage);
	}

	@Test(priority = 3)
	public void adminLoginInvalidPassword() {
		loginpage = new LoginPage(driver);
		loginpage.login(AutomationConstants.adminUsername, AutomationConstants.invalidPassword);
		Assert.assertEquals(loginpage.invalidUsernamePassword(), AutomationConstants.invalidPasswordMessage);
	}

	@Test(priority = 1)
	public void validTrainingHeadLogin() {
		loginpage = new LoginPage(driver);
		learnertrackerpage = new LearnerTrackerPage(driver);
		loginpage.login(AutomationConstants.trainingHeadUsername, AutomationConstants.trainingHeadPassword);
		Assert.assertEquals(learnertrackerpage.dashboard(), AutomationConstants.learnersdashboard);
	}

	@Test(priority = 2)
	public void trainingHeadLoginInvalidUsername() {
		loginpage = new LoginPage(driver);
		loginpage.login(AutomationConstants.invalidUsername, AutomationConstants.trainingHeadPassword);
		Assert.assertEquals(loginpage.invalidUsernamePassword(), AutomationConstants.invalidUsernameMessage);
	}

	@Test(priority = 3)
	public void trainingHeadLoginInvalidPassword() {
		loginpage = new LoginPage(driver);
		loginpage.login(AutomationConstants.trainingHeadUsername, AutomationConstants.invalidPassword);
		Assert.assertEquals(loginpage.invalidUsernamePassword(), AutomationConstants.invalidPasswordMessage);
	}

	@Test(priority = 1)
	public void validPlacementOfficerLogin() {
		loginpage = new LoginPage(driver);
		learnertrackerpage = new LearnerTrackerPage(driver);
		loginpage.login(AutomationConstants.placementOfficerUsername, AutomationConstants.placementOfficerPassword);
		Assert.assertEquals(learnertrackerpage.dashboard(), AutomationConstants.learnersdashboard);
	}

	@Test(priority = 2)
	public void placementOfficerLoginInvalidUsername() {
		loginpage = new LoginPage(driver);
		loginpage.login(AutomationConstants.invalidUsername, AutomationConstants.placementOfficerPassword);
		Assert.assertEquals(loginpage.invalidUsernamePassword(), AutomationConstants.invalidUsernameMessage);
	}

	@Test(priority = 3)
	public void placementOfficerLoginInvalidPassword() {
		loginpage = new LoginPage(driver);
		loginpage.login(AutomationConstants.placementOfficerUsername, AutomationConstants.invalidPassword);
		Assert.assertEquals(loginpage.invalidUsernamePassword(), AutomationConstants.invalidPasswordMessage);
	}

	@Test(priority = 4)
	public void loginInvalidUsernameInvalidPassword() {
		loginpage = new LoginPage(driver);
		loginpage.login(AutomationConstants.invalidUsername, AutomationConstants.invalidPassword);
		Assert.assertEquals(loginpage.invalidUsernamePassword(), AutomationConstants.invalidUsernameMessage);
	}

	@Test(priority = 5)
	public void loginBlankUsernameBlankPassword() {
		loginpage = new LoginPage(driver);
		loginpage.login("", "");
		Assert.assertEquals(loginpage.invalidUsernamePassword(), AutomationConstants.invalidUsernameMessage);
	}
}
