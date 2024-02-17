package com.internship.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LearnerTrackerPage {
	WebDriver driver = null;

	public LearnerTrackerPage(WebDriver driver) {
		this.driver = driver;
	}

	public void clickPageNumber() {
		driver.findElement(By.xpath("//a[text()='10']")).click();
	}

	public void submitbutton() {
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
	}

	public void backbutton() {
		driver.findElement(By.xpath("//button[text()='Back to Dashboard']")).click();
	}

	public String dashboard() {
		return driver.findElement(By.xpath("//table//tr[1]//th[1]")).getText();
	}
}
