package org.seleniumday4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GreensTech {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rejas\\eclipse-workspace j\\SeleniumChrome\\driver\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("http://greenstech.in/selenium-course-content.html");
		 driver.manage().window().maximize();
		 WebElement findElementPara = driver.findElement(By.xpath("//div[contains(@class,'col-lg-7')]"));
		 String text = findElementPara.getText();
		 System.out.println(text);
		 
		 

	}

}
