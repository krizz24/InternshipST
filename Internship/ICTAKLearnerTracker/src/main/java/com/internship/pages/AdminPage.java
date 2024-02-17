package com.internship.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.internship.utility.UserFormUtility;

public class AdminPage {
	UserFormUtility userformutility = null;
	WebDriver driver = null;

	public AdminPage(WebDriver driver) {
		this.driver = driver;
	}

	public void addUserButton() {
		driver.findElement(By.xpath("//a[@href ='/aadd']")).click();
	}

	public void editUserButton() {
		driver.findElement(By.xpath("//table//tr[4]//td[6]//button")).click();
	}

	public void deleteUserButton() {
		driver.findElement(By.xpath("//table//tr[2]//td[7]//button")).click();
	}

	public void userForm(String name, String email, String username, String password, String role) {
		userformutility = new UserFormUtility(driver);
		userformutility.name(name);
		userformutility.email(email);
		userformutility.username(username);
		userformutility.password(password);
		userformutility.role(role);
	}

	public void userAddedOk() {
		driver.findElement(By.xpath("//button[text()='OK']")).click();
	}

	public void clickLearnersTab() {
		driver.findElement(By.xpath("//span[text()='Learners']")).click();
	}

	public void clickPlacementTab() {
		driver.findElement(By.xpath("//span[text()='Placement']")).click();
	}

}
