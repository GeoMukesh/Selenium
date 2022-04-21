package com.seleniumday3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rejas\\eclipse-workspace j\\Chrome\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		WebElement btnLogin = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		btnLogin.click();
		WebElement userLog = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		userLog.sendKeys("1234567890");
		WebElement userPass = driver.findElement(By.xpath("(//input[@type='password'])"));
		userPass.sendKeys("GeoMukesh");
		btnLogin.click();
		
		
	}

}
