package com.internship.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.internship.constants.AutomationConstants;
import com.internship.pages.LearnerTrackerPage;
import com.internship.pages.LoginPage;
import com.internship.pages.PlacementOfficerPage;

public class PlacementOfficerTest extends TestBase {
	PlacementOfficerPage placementofficerpage = null;
	LoginPage loginpage = null;
	LearnerTrackerPage learnertrackerpage= null;

	@Test
	public void updatePlacementStatus() {
		placementofficerpage = new PlacementOfficerPage(driver);
		learnertrackerpage= new LearnerTrackerPage(driver);
		loginpage = new LoginPage(driver);
		loginpage.login(AutomationConstants.placementOfficerUsername, AutomationConstants.placementOfficerPassword);
		//learnertrackerpage.clickPageNumber();
		placementofficerpage.clickUpdateButton();
		placementofficerpage.placementStatus();
		learnertrackerpage.submitbutton();
		Assert.assertEquals(learnertrackerpage.dashboard(), AutomationConstants.learnersdashboard);
	}

	@Test
	public void updatePlacementStatusBackButton() {
		placementofficerpage = new PlacementOfficerPage(driver);
		loginpage = new LoginPage(driver);
		learnertrackerpage= new LearnerTrackerPage(driver);
		loginpage.login(AutomationConstants.placementOfficerUsername, AutomationConstants.placementOfficerPassword);
		// learnertrackerpage.clickPageNumber();
		placementofficerpage.clickUpdateButton();
		placementofficerpage.placementStatus();
		learnertrackerpage.backbutton();
		Assert.assertEquals(learnertrackerpage.dashboard(), AutomationConstants.learnersdashboard);
	}
}
