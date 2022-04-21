package com.seleniumday3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearTrips {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rejas\\eclipse-workspace j\\Chrome\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cleartrip.com/trains");
		WebElement fromplace = driver.findElement(By.name("from_station"));
		fromplace.sendKeys("Chennai");
		WebElement toplace = driver.findElement(By.name("to_station"));
		toplace.sendKeys("Nagercoil");
		WebElement search = driver.findElement(By.id("trainFormButton"));
		search.click();
		
		
	}

}
