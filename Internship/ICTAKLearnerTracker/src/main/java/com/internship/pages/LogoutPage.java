package com.internship.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogoutPage {

	WebDriver driver = null;

	public LogoutPage(WebDriver driver) {
		this.driver = driver;
	}

	public void clickName() {
		driver.findElement(By.cssSelector("#basic-nav-dropdown")).click();
	}

	public void clickLogout() {
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
	}

	public String loginPageTitle() {
		return driver.findElement(By.xpath("//p[text()='ICTAK - Learner Tracker']")).getText();
	}
}