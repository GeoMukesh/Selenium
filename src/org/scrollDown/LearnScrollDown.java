package org.scrollDown;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnScrollDown {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rejas\\eclipse-workspace j\\SeleniumChrome\\driver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("http://toolsqa.com/");
		driver.manage().window().maximize();
		WebElement down = driver.findElement(By.xpath("//div[text()='Recent Tutorials']"));
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].scrollIntoView(true)",down);
		
		
		
	}

}
