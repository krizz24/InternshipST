package com.internship.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.internship.constants.AutomationConstants;
import com.internship.pages.AdminPage;
import com.internship.pages.LearnerTrackerPage;
import com.internship.pages.LoginPage;
import com.internship.pages.PlacementOfficerPage;
import com.internship.pages.TrainingHeadPage;

public class AdminTest extends TestBase {
	LoginPage loginpage = null;
	LearnerTrackerPage learnertrackerpage = null;
	AdminPage adminpage = null;
	TrainingHeadPage trainingheadpage = null;
	PlacementOfficerPage placementofficerpage = null;

	@Test
	public void addUser() {
		loginpage = new LoginPage(driver);
		learnertrackerpage = new LearnerTrackerPage(driver);
		adminpage = new AdminPage(driver);
		loginpage.login(AutomationConstants.adminUsername, AutomationConstants.adminPassword);
		adminpage.addUserButton();
		adminpage.userForm(AutomationConstants.newname, AutomationConstants.newemail, AutomationConstants.newusername,
				AutomationConstants.newpassword, AutomationConstants.newrole);
		learnertrackerpage.submitbutton();
		adminpage.userAddedOk();
		Assert.assertEquals(learnertrackerpage.dashboard(), AutomationConstants.admindashboard);
	}

	@Test
	public void editUser() {
		loginpage = new LoginPage(driver);
		learnertrackerpage = new LearnerTrackerPage(driver);
		adminpage = new AdminPage(driver);
		loginpage.login(AutomationConstants.adminUsername, AutomationConstants.adminPassword);
		adminpage.editUserButton();
		adminpage.userForm(AutomationConstants.editednewname, AutomationConstants.editednewemail,
				AutomationConstants.editednewusername, AutomationConstants.editednewpassword,
				AutomationConstants.editednewrole);
		learnertrackerpage.submitbutton();
		Assert.assertEquals(learnertrackerpage.dashboard(), AutomationConstants.admindashboard);
	}

	@Test
	public void deleteUser() {
		loginpage = new LoginPage(driver);
		learnertrackerpage = new LearnerTrackerPage(driver);
		adminpage = new AdminPage(driver);
		loginpage.login(AutomationConstants.adminUsername, AutomationConstants.adminPassword);
		adminpage.deleteUserButton();
		Assert.assertEquals(learnertrackerpage.dashboard(), AutomationConstants.admindashboard);
	}

	@Test
	public void adminAddLearner() {
		loginpage = new LoginPage(driver);
		learnertrackerpage = new LearnerTrackerPage(driver);
		trainingheadpage = new TrainingHeadPage(driver);
		adminpage = new AdminPage(driver);
		loginpage.login(AutomationConstants.adminUsername, AutomationConstants.adminPassword);
		adminpage.clickLearnersTab();
		trainingheadpage.addbutton();
		trainingheadpage.learnerForm(AutomationConstants.learnerid, AutomationConstants.name,
				AutomationConstants.course, AutomationConstants.project, AutomationConstants.batch,
				AutomationConstants.status);
		learnertrackerpage.submitbutton();
		trainingheadpage.learnerAddedOk();
		Assert.assertEquals(learnertrackerpage.dashboard(), AutomationConstants.learnersdashboard);
	}

	@Test
	public void adminAddLearnerCancel() {
		loginpage = new LoginPage(driver);
		learnertrackerpage = new LearnerTrackerPage(driver);
		trainingheadpage = new TrainingHeadPage(driver);
		adminpage = new AdminPage(driver);
		loginpage.login(AutomationConstants.adminUsername, AutomationConstants.adminPassword);
		adminpage.clickLearnersTab();
		trainingheadpage.addbutton();
		trainingheadpage.learnerForm(AutomationConstants.learnerid, AutomationConstants.name,
				AutomationConstants.course, AutomationConstants.project, AutomationConstants.batch,
				AutomationConstants.status);
		learnertrackerpage.backbutton();
		Assert.assertEquals(learnertrackerpage.dashboard(), AutomationConstants.learnersdashboard);
	}

	@Test
	public void adminAddCSV() {
		loginpage = new LoginPage(driver);
		learnertrackerpage = new LearnerTrackerPage(driver);
		trainingheadpage = new TrainingHeadPage(driver);
		adminpage = new AdminPage(driver);
		loginpage.login(AutomationConstants.adminUsername, AutomationConstants.adminPassword);
		adminpage.clickLearnersTab();
		trainingheadpage.bulkaddbutton();
		trainingheadpage.uploadCSV();
		trainingheadpage.CSVsubmitButton();
		trainingheadpage.returnToDashboardClick();
		trainingheadpage.returnToDashboardOK();
		Assert.assertEquals(learnertrackerpage.dashboard(), AutomationConstants.learnersdashboard);
	}

	@Test
	public void admiCSVCancel() {
		loginpage = new LoginPage(driver);
		learnertrackerpage = new LearnerTrackerPage(driver);
		trainingheadpage = new TrainingHeadPage(driver);
		adminpage = new AdminPage(driver);
		loginpage.login(AutomationConstants.adminUsername, AutomationConstants.adminPassword);
		adminpage.clickLearnersTab();
		trainingheadpage.bulkaddbutton();
		trainingheadpage.uploadCSV();
		trainingheadpage.CSVcancelButton();
		Assert.assertEquals(learnertrackerpage.dashboard(), AutomationConstants.learnersdashboard);
	}

	@Test
	public void adminEditLearner() {
		loginpage = new LoginPage(driver);
		learnertrackerpage = new LearnerTrackerPage(driver);
		trainingheadpage = new TrainingHeadPage(driver);
		adminpage = new AdminPage(driver);
		loginpage.login(AutomationConstants.adminUsername, AutomationConstants.adminPassword);
		adminpage.clickLearnersTab();
		learnertrackerpage.clickPageNumber();
		trainingheadpage.clickEditButton();
		trainingheadpage.learnerForm(AutomationConstants.learnerid, AutomationConstants.name,
				AutomationConstants.course, AutomationConstants.project, AutomationConstants.batch,
				AutomationConstants.status);
		learnertrackerpage.submitbutton();
		Assert.assertEquals(learnertrackerpage.dashboard(), AutomationConstants.learnersdashboard);
	}

	@Test
	public void adminDeleteLearner() {
		loginpage = new LoginPage(driver);
		learnertrackerpage = new LearnerTrackerPage(driver);
		trainingheadpage = new TrainingHeadPage(driver);
		adminpage = new AdminPage(driver);
		loginpage.login(AutomationConstants.adminUsername, AutomationConstants.adminPassword);
		adminpage.clickLearnersTab();
		learnertrackerpage.clickPageNumber();
		trainingheadpage.clickDeleteButton();
		Assert.assertEquals(learnertrackerpage.dashboard(), AutomationConstants.learnersdashboard);
	}

	@Test
	public void adminUpdatePlacementStatus() {
		placementofficerpage = new PlacementOfficerPage(driver);
		learnertrackerpage = new LearnerTrackerPage(driver);
		loginpage = new LoginPage(driver);
		adminpage = new AdminPage(driver);
		loginpage.login(AutomationConstants.adminUsername, AutomationConstants.adminPassword);
		adminpage.clickPlacementTab();
		learnertrackerpage.clickPageNumber();
		placementofficerpage.clickUpdateButton();
		placementofficerpage.placementStatus();
		learnertrackerpage.submitbutton();
		Assert.assertEquals(learnertrackerpage.dashboard(), AutomationConstants.learnersdashboard);
	}

}
