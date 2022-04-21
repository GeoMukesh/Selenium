package org.seleniumDay10WindowsHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homedepot {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rejas\\eclipse-workspace j\\SeleniumChrome\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.homedepot.com/");
		driver.manage().window().maximize();
		WebElement searchBox = driver.findElement(By.id("headerSearch"));
		searchBox.sendKeys("celling fan",Keys.ENTER);
		Thread.sleep(5000);
		WebElement firstFan = driver.findElement(By.xpath("//img[@src='https://images.thdstatic.com/catalog/productImages/300/30/3026095f-ca13-4dd7-86e4-61b7e570b201_300.jpg']"));
		firstFan.click();
		
		
	}

}
