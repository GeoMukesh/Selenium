package org.framesAndAlerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rejas\\eclipse-workspace j\\SeleniumChrome\\driver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		WebElement findElement = driver.findElement(By.className("analystic"));
		findElement.click();
		//driver.switchTo().frame(0);
		//WebElement btnClick = driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
		//btnClick.click();
		//Alert ale = driver.switchTo().alert();
		//ale.accept();
		//ale.dismiss();
		//driver.findElement(By.xpath)
		
		
	}

}
