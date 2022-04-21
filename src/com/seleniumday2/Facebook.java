package com.seleniumday2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rejas\\eclipse-workspace j\\SeleniumChrome\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement txtuserName = driver.findElement(By.id("email"));
		txtuserName.sendKeys("9715814953");
		WebElement txtPass = driver.findElement(By.id("pass"));
		txtPass.sendKeys("Wakeup123");
		WebElement btnLogin = driver.findElement(By.name("login"));
		btnLogin.click();
		
		
	}

}

