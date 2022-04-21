package org.doubt;//seleniumDay5;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkart {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rejas\\eclipse-workspace j\\SeleniumChrome\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.flipkart.com");
		driver.manage().window().maximize();
		
		//WebElement lnkHome = driver.findElement(By.linkText("//img[@alt='Home']"));
		Actions action = new Actions(driver);
		//action.moveToElement(lnkHome).perform();

	}

}
