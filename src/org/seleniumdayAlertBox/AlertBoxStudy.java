package org.seleniumdayAlertBox;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertBoxStudy {

	public static void main(String[] args){
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rejas\\eclipse-workspace j\\SeleniumChrome\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
	
		WebElement btnSelect = driver.findElement(By.className("analytic"));
	btnSelect.click();

		WebElement btnSelect1 = driver.findElement(By.className("btn btn-danger"));
		btnSelect1.click();
		Alert al= driver.switchTo().alert();
		al.accept();
		
		//String text = ale.getText();
		//System.out.println(text);
		//ale.accept()
		
		

	

	//private static By By.Xpathclass(Object click) {
		// TODO Auto-generated method stub
		//return null;
	}

	//private static By xpath(Object click) {
		// TODO Auto-generated method stub
		//return null;
	}


