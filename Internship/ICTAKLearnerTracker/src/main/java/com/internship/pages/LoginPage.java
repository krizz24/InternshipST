package com.internship.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.internship.utility.LoginPageUtility;

public class LoginPage {
	WebDriver driver = null;
	LoginPageUtility loginpageutility = null;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	public void login(String username, String password) {
		loginpageutility = new LoginPageUtility(driver);
		loginpageutility.setUsername(username);
		loginpageutility.setPassword(password);
		loginpageutility.clickLoginButton();
	}

	public String invalidUsernamePassword() {
		return driver.findElement(By.cssSelector("div.fade.alert")).getText();
	}
}
