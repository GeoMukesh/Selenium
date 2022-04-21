package org.doubt;//seleniumDay5

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rejas\\eclipse-workspace j\\SeleniumChrome\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.amazon.in");
		driver.manage().window().maximize();
		
		WebElement findPrime = driver.findElement(By.xpath("(//span[@class='nav-icon nav-arrow'])[4]"));
		Actions action = new Actions(driver);
		action.moveToElement(findPrime).perform();
		
		WebElement findFastDelivery = driver.findElement(By.linkText("Free fast delivery on Prime items"));
		Actions action1 = new Actions(driver);
		findFastDelivery.click();
		
	}

}
