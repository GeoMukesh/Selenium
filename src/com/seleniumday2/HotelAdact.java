package com.seleniumday2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HotelAdact {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rejas\\eclipse-workspace j\\Chrome\\driver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("http://adactinhotelapp.com/");
		WebElement usrname = driver.findElement(By.name("username"));
		usrname.sendKeys("Mukesh George");
		WebElement passw = driver.findElement(By.name("password"));
		passw.sendKeys("1234567");
	}

}
