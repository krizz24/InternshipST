package com.internship.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.internship.constants.AutomationConstants;
import com.internship.pages.LearnerTrackerPage;
import com.internship.pages.LoginPage;
import com.internship.pages.TrainingHeadPage;

public class TrainingHeadTest extends TestBase {
	TrainingHeadPage trainingheadpage = null;
	LoginPage loginpage = null;
	LearnerTrackerPage learnertrackerpage = null;

	@Test
	public void addLearner() {
		trainingheadpage = new TrainingHeadPage(driver);
		loginpage = new LoginPage(driver);
		learnertrackerpage = new LearnerTrackerPage(driver);
		loginpage.login(AutomationConstants.trainingHeadUsername, AutomationConstants.trainingHeadPassword);
		trainingheadpage.addbutton();
		trainingheadpage.learnerForm(AutomationConstants.learnerid, AutomationConstants.name,
				AutomationConstants.course, AutomationConstants.project, AutomationConstants.batch,
				AutomationConstants.status);
		learnertrackerpage.submitbutton();
		trainingheadpage.learnerAddedOk();
		Assert.assertEquals(learnertrackerpage.dashboard(), AutomationConstants.learnersdashboard);
	}

	@Test
	public void addLearnerWithInvalidLearnerid() {
		trainingheadpage = new TrainingHeadPage(driver);
		loginpage = new LoginPage(driver);
		learnertrackerpage = new LearnerTrackerPage(driver);
		loginpage.login(AutomationConstants.trainingHeadUsername, AutomationConstants.trainingHeadPassword);
		trainingheadpage.addbutton();
		trainingheadpage.learnerForm(AutomationConstants.invalidlearnerid, AutomationConstants.name,
				AutomationConstants.course, AutomationConstants.project, AutomationConstants.batch,
				AutomationConstants.status);
		learnertrackerpage.submitbutton();
		Assert.assertEquals(trainingheadpage.invalidLearnerid(), AutomationConstants.invalidlearneridmessage);
	}

	@Test
	public void addLearnerWithInvalidName() {
		trainingheadpage = new TrainingHeadPage(driver);
		loginpage = new LoginPage(driver);
		learnertrackerpage = new LearnerTrackerPage(driver);
		loginpage.login(AutomationConstants.trainingHeadUsername, AutomationConstants.trainingHeadPassword);
		trainingheadpage.addbutton();
		trainingheadpage.learnerForm(AutomationConstants.learnerid, AutomationConstants.invalidname,
				AutomationConstants.course, AutomationConstants.project, AutomationConstants.batch,
				AutomationConstants.status);
		learnertrackerpage.submitbutton();
		Assert.assertEquals(trainingheadpage.invalidName(), AutomationConstants.invalidnamemessage);
	}

	@Test
	public void addLearnerBackButton() {
		trainingheadpage = new TrainingHeadPage(driver);
		loginpage = new LoginPage(driver);
		learnertrackerpage = new LearnerTrackerPage(driver);
		loginpage.login(AutomationConstants.trainingHeadUsername, AutomationConstants.trainingHeadPassword);
		trainingheadpage.addbutton();
		trainingheadpage.learnerForm(AutomationConstants.learnerid, AutomationConstants.name,
				AutomationConstants.course, AutomationConstants.project, AutomationConstants.batch,
				AutomationConstants.status);
		learnertrackerpage.backbutton();
		Assert.assertEquals(learnertrackerpage.dashboard(), AutomationConstants.learnersdashboard);
	}

	@Test
	public void addcsv() {
		trainingheadpage = new TrainingHeadPage(driver);
		loginpage = new LoginPage(driver);
		learnertrackerpage = new LearnerTrackerPage(driver);
		loginpage.login(AutomationConstants.trainingHeadUsername, AutomationConstants.trainingHeadPassword);
		trainingheadpage.bulkaddbutton();
		trainingheadpage.uploadCSV();
		trainingheadpage.CSVsubmitButton();
		trainingheadpage.returnToDashboardClick();
		trainingheadpage.returnToDashboardOK();
		Assert.assertEquals(learnertrackerpage.dashboard(), AutomationConstants.learnersdashboard);
	}

	@Test
	public void cancelcsv() {
		trainingheadpage = new TrainingHeadPage(driver);
		loginpage = new LoginPage(driver);
		learnertrackerpage = new LearnerTrackerPage(driver);
		loginpage.login(AutomationConstants.trainingHeadUsername, AutomationConstants.trainingHeadPassword);
		trainingheadpage.bulkaddbutton();
		trainingheadpage.uploadCSV();
		trainingheadpage.CSVcancelButton();
		Assert.assertEquals(learnertrackerpage.dashboard(), AutomationConstants.learnersdashboard);
	}

	@Test
	public void editLearnerDetails() {
		trainingheadpage = new TrainingHeadPage(driver);
		loginpage = new LoginPage(driver);
		learnertrackerpage = new LearnerTrackerPage(driver);
		loginpage.login(AutomationConstants.trainingHeadUsername, AutomationConstants.trainingHeadPassword);
		// learnertrackerpage.clickPageNumber();
		trainingheadpage.clickEditButton();
		trainingheadpage.learnerForm(AutomationConstants.learnerid, AutomationConstants.name,
				AutomationConstants.course, AutomationConstants.project, AutomationConstants.batch,
				AutomationConstants.status);
		learnertrackerpage.submitbutton();
		Assert.assertEquals(learnertrackerpage.dashboard(), AutomationConstants.learnersdashboard);
	}

	@Test
	public void editLearnerDetailsBackButton() {
		trainingheadpage = new TrainingHeadPage(driver);
		loginpage = new LoginPage(driver);
		learnertrackerpage = new LearnerTrackerPage(driver);
		loginpage.login(AutomationConstants.trainingHeadUsername, AutomationConstants.trainingHeadPassword);
		// learnertrackerpage.clickPageNumber();
		trainingheadpage.clickEditButton();
		trainingheadpage.learnerForm(AutomationConstants.learnerid, AutomationConstants.name,
				AutomationConstants.course, AutomationConstants.project, AutomationConstants.batch,
				AutomationConstants.status);
		learnertrackerpage.backbutton();
		Assert.assertEquals(learnertrackerpage.dashboard(), AutomationConstants.learnersdashboard);
	}

	@Test
	public void deleteLearnerDetails() {
		trainingheadpage = new TrainingHeadPage(driver);
		loginpage = new LoginPage(driver);
		learnertrackerpage = new LearnerTrackerPage(driver);
		loginpage.login(AutomationConstants.trainingHeadUsername, AutomationConstants.trainingHeadPassword);
		trainingheadpage.clickDeleteButton();
		Assert.assertEquals(learnertrackerpage.dashboard(), AutomationConstants.learnersdashboard);
	}
}
