package com.seleniumday3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Redbus {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rejas\\eclipse-workspace j\\Chrome\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.redbus.in/");
		WebElement arro = driver.findElement(By.id("signin-block"));
		arro.click();
		WebElement signing = driver.findElement(By.id("signInLink"));
		signing.click();
		WebElement enterph = driver.findElement(By.id("mobileNoInp"));
		enterph.sendKeys("8531070080");
		WebElement otp = driver.findElement(By.id("otp-container"));
		otp.click();
		
	}

}
