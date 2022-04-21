package com.seleniumday3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GreensResumeModel {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rejas\\eclipse-workspace j\\Chrome\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");
		WebElement resume =driver.findElement(By.id("heading201"));
		resume.click();
		WebElement model1 =driver.findElement(By.id("(//a[@title='Model Resume training in chennai'])[1]"));
		model1.click();
		
	}

}
