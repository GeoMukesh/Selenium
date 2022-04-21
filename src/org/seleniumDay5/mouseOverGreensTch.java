package org.seleniumDay5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseOverGreensTch {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rejas\\eclipse-workspace j\\SeleniumChrome\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.shopclues.com/wholesale.html");
		driver.manage().window().maximize();
		
		
		WebElement linkSports = driver.findElement(By.id("nav_45"));
		Actions action = new Actions(driver);
		action.moveToElement(linkSports).perform();;
		
		
	
	}

}
