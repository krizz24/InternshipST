package com.internship.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import com.internship.constants.AutomationConstants;

public class PlacementOfficerPage {
	WebDriver driver = null;

	public PlacementOfficerPage(WebDriver driver) {
		this.driver = driver;
	}

	public void clickUpdateButton() {
		driver.findElement(By.xpath("//table//tr[3]//td[8]//button")).click();
	}

	public void placementStatus() {
		Select dropdown = new Select(driver.findElement(By.name("pstatus")));
		dropdown.selectByValue(AutomationConstants.placementstatusjobseeking);
	}
}
