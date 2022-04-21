package com.seleniumday3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazon {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rejas\\eclipse-workspace j\\Chrome\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		WebElement searc = driver.findElement(By.id("twotabsearchtextbox"));
		searc.sendKeys("iphone");
		WebElement lenz = driver.findElement(By.id("nav-search-submit-button"));
		lenz.click();
		
		
		 

	}

}
