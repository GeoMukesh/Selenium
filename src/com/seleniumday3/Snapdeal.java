package com.seleniumday3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Snapdeal {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rejas\\eclipse-workspace j\\Chrome\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.get("https://www.snapdeal.com/");
        WebElement btnLogin = driver.findElement(By.className("accountUserName col-xs-12 reset-padding"));
		btnLogin.click();
		
	}

}
//Click signin and click new register and enter mobile number abd click continue