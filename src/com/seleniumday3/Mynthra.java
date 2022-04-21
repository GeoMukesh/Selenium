package com.seleniumday3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mynthra {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rejas\\eclipse-workspace j\\Chrome\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com/register?referer=https://www.myntra.com/");
		
		WebElement userLog = driver.findElement(By.xpath("(//input[@autocomplete='new-password']"));
		userLog.sendKeys("1234567890");
		
		WebElement btnLogin = driver.findElement(By.xpath("(//div[@class='submitBottomOption']"));
		btnLogin.click();
		
	}
	

}
