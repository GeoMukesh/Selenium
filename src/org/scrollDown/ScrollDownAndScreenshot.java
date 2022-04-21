package org.scrollDown;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollDownAndScreenshot {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rejas\\eclipse-workspace j\\SeleniumChrome\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.greenstechnologys.com/");
		driver.manage().window().maximize();
		WebElement findAddress = driver.findElement(By.xpath("//span[text()='Greens technology Perumbakkam']"));
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].scrollIntoView(true)", findAddress);
		String text = findAddress.getText();
		System.out.println(text);
		
		
	}

}
