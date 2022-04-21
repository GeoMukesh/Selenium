package com.seleniumday2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoTest {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rejas\\eclipse-workspace j\\Chrome\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		WebElement usernam = driver.findElement(By.className("form-control ng-pristine ng-untouched ng-invalid ng-invalid-required"));
		usernam.sendKeys("Mukesh");
		WebElement secondName = driver.findElement(By.className("form-control ng-pristine ng-untouched ng-invalid ng-invalid-required"));
	   secondName.sendKeys("George");
	   
		
	}

}
