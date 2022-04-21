package org.seleniumday4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GreensTechnology {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rejas\\eclipse-workspace j\\SeleniumChrome\\driver\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("http://www.greenstechnologys.com");
		 driver.manage().window().maximize();
		 WebElement findElementText = driver.findElement(By.xpath("//u[text()=\"Greens Technologys Software Training Centers in Chennai\"]"));
		 String text = findElementText.getText();
		 System.out.println(text);
		 
		 

	}

}
