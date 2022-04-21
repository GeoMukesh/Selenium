package com.seleniumday3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rejas\\eclipse-workspace j\\Chrome\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement txtUsername = driver.findElement(By.xpath("//input[@type='text']"));	
		txtUsername.sendKeys("987654321");
		WebElement txtPassword = driver.findElement(By.xpath("//input[@type='password']"));	
		txtPassword.sendKeys("123456789");
	    WebElement btnLogin = driver.findElement(By.xpath("//button[@value='1']"));	
		btnLogin.click();
	
	}
}
