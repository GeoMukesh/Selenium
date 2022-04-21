package com.seleniumday3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Swiggy {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rejas\\eclipse-workspace j\\Chrome\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.swiggy.com/");
		WebElement btnLogin = driver.findElement(By.className("r2iyh"));
		btnLogin.click();
		
		WebElement userPho = driver.findElement(By.name("mobile"));
		userPho.sendKeys("1234567890");
		WebElement userName = driver.findElement(By.name("name"));
		userName.sendKeys("Mukesh");
		WebElement userEmail = driver.findElement(By.name("email"));
		userEmail.sendKeys("abc123@gmail.com");
		WebElement userPass = driver.findElement(By.name("password"));
		userPass.sendKeys("GeoMukesh");
		WebElement btnContinue = driver.findElement(By.xpath("(//a[@class='a-ayg']"));
		btnContinue.click();
		
		
		
		
	}

}