package com.seleniumday3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationTesting {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rejas\\eclipse-workspace j\\SeleniumChrome\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		WebElement firstname= driver.findElement(By.xpath("//input[@placeholder='First Name']"));
		firstname.sendKeys("Geo");
		WebElement secondname= driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
		secondname.sendKeys("Muke");
		WebElement address= driver.findElement(By.xpath("//textarea[@class='form-control ng-pristine ng-untouched ng-valid']"));
		address.sendKeys("Omr");
		WebElement email = driver.findElement(By.xpath("//input[@class='form-control ng-pristine ng-untouched ng-valid-email ng-invalid ng-invalid-required']"));
		email.sendKeys("abc123@gmail.com");
		WebElement phone = driver.findElement(By.xpath("//input[@class='form-control ng-pristine ng-untouched ng-invalid ng-invalid-required ng-valid-pattern']"));
		phone.sendKeys("1234567890");
		WebElement btnMale = driver.findElement(By.name("radiooptions"));
		btnMale.click();
		
		
		
		
	}

}
