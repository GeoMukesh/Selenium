package org.seleniumDay5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Guru99 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rejas\\eclipse-workspace j\\SeleniumChrome\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		
		WebElement s = driver.findElement(By.id("credit2"));
		WebElement d = driver.findElement(By.id("bank"));
		Actions action = new Actions(driver);
		action.dragAndDrop(s,d).perform();
		
		WebElement s1 = driver.findElement(By.xpath("(//a[@class='button button-orange'])[4]"));
		WebElement d1 = driver.findElement(By.className("placeholder"));
		Actions actions1 = new Actions(driver);
		actions1.dragAndDrop(s1,d1).perform();
		
		WebElement s2 =driver.findElement(By.xpath("(//a[@class='button button-orange'])[6]"));
		WebElement d2 = driver.findElement(By.className("placeholder"));
		Actions actions2 = new Actions(driver);
		actions2.dragAndDrop(s2,d2).perform();
		
		WebElement s3 = driver.findElement(By.xpath("(//a[@class='button button-orange'])[4]"));
		WebElement d3 = driver.findElement(By.className("placeholder"));		
		Actions actions3 = new Actions(driver);
		actions3.dragAndDrop(s3,d3).perform();
		
		WebElement txtPerfect = driver.findElement(By.xpath("(//a[@class='button button-green'])[1]"));
		String text = txtPerfect.getText();
		System.out.println(text);
		
		
		
	}

}
