package com.internship.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.internship.constants.AutomationConstants;
import com.internship.utility.LearnersFormUtility;

public class TrainingHeadPage {
	WebDriver driver = null;
	LearnersFormUtility learnersformutility = null;

	public TrainingHeadPage(WebDriver driver) {
		this.driver = driver;
	}

	public void addbutton() {
		driver.findElement(By.xpath("//a[@href ='/tadd']")).click();
	}

	public String learnersformtitle() {
		return driver.findElement(By.tagName("h3")).getText();
	}

	public void bulkaddbutton() {
		driver.findElement(By.xpath("//a[@href ='/upload']")).click();
	}

	public String learnerscsv() {
		return driver.findElement(By.tagName("label")).getText();
	}

	public void learnerForm(String learnerid, String name, String course, String project, String batch, String status) {
		learnersformutility = new LearnersFormUtility(driver);
		learnersformutility.learnerid(learnerid);
		learnersformutility.name(name);
		learnersformutility.selectcourse(course);
		learnersformutility.selectproject(project);
		learnersformutility.selectbatch(batch);
		learnersformutility.selectstatus(status);
	}

	public void learnerAddedOk() {
		driver.findElement(By.xpath("//button[text()='OK']")).click();
	}

	public String invalidLearnerid() {
		return driver.findElement(By.xpath("//input[@id='learnerid']//following-sibling::p")).getText();
	}

	public String invalidName() {
		return driver.findElement(By.xpath("//input[@id='name']//following-sibling::p")).getText();
	}

	public void uploadCSV() {
		driver.findElement(By.name("file")).sendKeys(AutomationConstants.csvlocation);
	}

	public void CSVsubmitButton() {
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

	public void returnToDashboardClick() {
		driver.findElement(By.xpath("//button[text()='Return to Dashboard']")).click();
	}

	public void returnToDashboardOK() {
		driver.findElement(By.xpath("//button[text()='OK']")).click();
	}

	public void CSVcancelButton() {
		driver.findElement(By.xpath("//button[text()='Cancel']")).click();
	}

	public void clickEditButton() {
		driver.findElement(By.xpath("//table//tr[3]//td[8]//button")).click();
	}

	public void clickDeleteButton() {
		driver.findElement(By.xpath("//table//tr[3]//td[9]//button")).click();
	}
}
