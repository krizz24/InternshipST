package com.internship.utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnersFormUtility {
	WebDriver driver = null;

	public LearnersFormUtility(WebDriver driver) {
		this.driver = driver;
	}

	public void learnerid(String learnerid) {
		driver.findElement(By.id("learnerid")).clear();
		driver.findElement(By.id("learnerid")).sendKeys(learnerid);
	}

	public void name(String name) {
		driver.findElement(By.id("name")).clear();
		driver.findElement(By.id("name")).sendKeys(name);
	}

	public void selectcourse(String course) {
		Select dropdown = new Select(driver.findElement(By.name("course")));
		dropdown.selectByValue(course);
	}

	public void selectproject(String project) {
		Select dropdown = new Select(driver.findElement(By.name("project")));
		dropdown.selectByValue(project);
	}

	public void selectbatch(String batch) {
		Select dropdown = new Select(driver.findElement(By.name("batch")));
		dropdown.selectByValue(batch);
	}

	public void selectstatus(String status) {
		Select dropdown = new Select(driver.findElement(By.name("cstatus")));
		dropdown.selectByValue(status);
	}
}
