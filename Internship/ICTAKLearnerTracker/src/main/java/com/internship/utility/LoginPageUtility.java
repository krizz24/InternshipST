package com.internship.utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPageUtility {
	WebDriver driver = null;

	public LoginPageUtility(WebDriver driver) {
		this.driver = driver;
	}

	public void setUsername(String username) {
		driver.findElement(By.id("username")).clear();
		driver.findElement(By.id("username")).sendKeys(username);
	}

	public void setPassword(String password) {
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys(password);
	}

	public void clickLoginButton() {
		driver.findElement(By.xpath("//button[text()='Login']")).click();
	}
}