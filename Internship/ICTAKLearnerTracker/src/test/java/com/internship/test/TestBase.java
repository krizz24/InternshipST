package com.internship.test;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

public class TestBase {
	WebDriver driver = null;
	public static Properties properties = null;
	FileInputStream fileinputstream = null;

	@BeforeMethod
	public void setup() throws IOException {
		properties = new Properties();
		fileinputstream = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\test\\resources\\config.properties");
		properties.load(fileinputstream);
		if (properties.getProperty("browser").equalsIgnoreCase("chrome"))
			driver = new ChromeDriver();
		else if (properties.getProperty("browser").equalsIgnoreCase("firefox"))
			driver = new FirefoxDriver();
		else if (properties.getProperty("browser").equalsIgnoreCase("edge"))
			driver = new EdgeDriver();
		driver.get(properties.getProperty("url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@AfterMethod
	public void finish() {
		driver.quit();
	}
}
