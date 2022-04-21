package org.seleniumDay10WindowsHandling;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rejas\\eclipse-workspace j\\SeleniumChrome\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
		searchBox.sendKeys("iphones X",Keys.ENTER);
		WebElement iphonesearch = driver.findElement(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
		iphonesearch.click();
		String prtWinId = driver.getWindowHandle();
		//System.out.println(prtWinId); 
		Set<String> AllwinId = driver.getWindowHandles();
		//System.out.println(AllwinId);
		for(String win :AllwinId) {
			//System.out.println(win);
		//	System.out.println(!(prtWinId.equals(win)));
			if (!(prtWinId.equals(win))) {
				driver.switchTo().window(win);
			}
			
		}
		//WebElement findElement1 = driver.findElement(By.id("add-to-cart-button"));
		//findElement1.click();
		WebElement printText = driver.findElement(By.xpath("//span[@contains(text(),'49,900')]"));
		String text = printText.getText();
		System.out.println(text);
		
		
	}

}
