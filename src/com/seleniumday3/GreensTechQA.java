package com.seleniumday3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GreensTechQA {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rejas\\eclipse-workspace j\\Chrome\\driver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");
		WebElement addres = driver.findElement(By.id("heading20"));
		addres.click();
		WebElement ctsqq = driver.findElement(By.xpath("(//a[@title='Interview Questions'])[6]"));
		ctsqq.click();
		
	}

}
