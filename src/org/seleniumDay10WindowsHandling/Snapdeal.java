package org.seleniumDay10WindowsHandling;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Snapdeal {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rejas\\eclipse-workspace j\\SeleniumChrome\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		WebElement searchBox = driver.findElement(By.name("keyword"));
		searchBox.sendKeys("iPhone 7", Keys.ENTER);
		Thread.sleep(10000);
		WebElement selectProduct = driver.findElement(By.xpath("//img[@title='Apple iPhone 7 Plus Flip Mobile Cover by NBOX - Blue']"));
		selectProduct.click();
		String win1 = driver.getWindowHandle();
		Set<String> win2 = driver.getWindowHandles();
		for( String win:win2) {
			if(!win1.equals(win)) {
				driver.switchTo().window(win);
			}
		}
		
	 WebElement cartBtn = driver.findElement(By.xpath("//span[@class='intialtext'][2]"));
	 cartBtn.click();
	 WebElement findText = driver.findElement(By.className("you-pay"));
	 findText.getText();
	 System.out.println(findText);
	 
	 }

}
