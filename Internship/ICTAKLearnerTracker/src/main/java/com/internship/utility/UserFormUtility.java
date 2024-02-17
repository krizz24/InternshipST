package com.internship.utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class UserFormUtility {
	WebDriver driver = null;

	public UserFormUtility(WebDriver driver) {
		this.driver = driver;
	}

	public void name(String name) {
		driver.findElement(By.id("name")).clear();
		driver.findElement(By.id("name")).sendKeys(name);
	}

	public void email(String email) {
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys(email);
	}

	public void username(String username) {
		driver.findElement(By.id("username")).clear();
		driver.findElement(By.id("username")).sendKeys(username);
	}

	public void password(String password) {
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys(password);
	}

	public void role(String role) {
		Select dropdown = new Select(driver.findElement(By.name("roleInputs")));
		dropdown.selectByValue(role);
	}
}
