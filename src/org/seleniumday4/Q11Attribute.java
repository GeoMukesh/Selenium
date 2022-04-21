package org.seleniumday4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q11Attribute {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rejas\\eclipse-workspace j\\SeleniumChrome\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
	    WebElement userName = driver.findElement(By.xpath("(//input[@type='text'])[2]"));	
	    userName.sendKeys("Mukesh");
	    WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
	    password.sendKeys("User1");
	    String attribute = userName.getAttribute("Value");
	    System.out.println(attribute);
	    String attribute2 = password.getAttribute("value");
	    System.out.println(attribute2);
	    
	    
	}

}
