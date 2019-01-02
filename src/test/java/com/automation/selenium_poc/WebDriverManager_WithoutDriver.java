package com.automation.selenium_poc;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverManager_WithoutDriver {
	private static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		if (driver != null) {
			driver.close();
            driver.quit();
        }
	}

}
