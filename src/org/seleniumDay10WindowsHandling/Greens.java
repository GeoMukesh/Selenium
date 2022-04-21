package org.seleniumDay10WindowsHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Greens {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rejas\\eclipse-workspace j\\SeleniumChrome\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");
		driver.manage().window().maximize();
		WebElement seleniumQ = driver.findElement(By.id("heading303"));
		seleniumQ.click();
		Thread.sleep(3000);
		WebElement day10click = driver.findElement(By.xpath("//a[@href='http://traininginchennai.in/August-2019/Selenium Day10.txt']"));
		day10click.click();
		WebElement prtQ = driver.findElement(By.xpath("//pre[@style='word-wrap: break-word; white-space: pre-wrap;']"));
		String text = prtQ.getText();
		System.out.println(text);
		
	}

}
/**
 QUESTION 4
----------
URL : http://www.greenstechnologys.com/python-training.html

NOTE: Click Selenium Test Papers and click Selenium Day10Task 
      Click Windows Handling and print 1 question 
 */