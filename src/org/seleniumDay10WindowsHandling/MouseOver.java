package org.seleniumDay10WindowsHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOver {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rejas\\eclipse-workspace j\\SeleniumChrome\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.greenstechnologys.com/");
		driver.manage().window().maximize();
		WebElement clickCourses = driver.findElement(By.xpath("//a[text()='COURSES']"));
		Actions actions = new Actions(driver);
		actions.moveToElement(clickCourses).perform();
		WebElement clickPython = driver.findElement(By.xpath("//a[text()='Python']"));
		clickPython.click();
		
	}

}
