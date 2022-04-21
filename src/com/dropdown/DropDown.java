package com.dropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rejas\\eclipse-workspace j\\SeleniumChrome\\driver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement crtBtn = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		crtBtn.click();
		WebElement dropDay = driver.findElement(By.id("day"));
		Select select = new Select(dropDay);
		select.selectByValue("6");
		
		WebElement dropMonth = driver.findElement(By.id("month"));
		Select select1= new Select(dropMonth);
		select1.selectByVisibleText("Nov");
		
		WebElement dropYear = driver.findElement(By.id("year"));
		Select select2 = new Select(dropYear);
		select2.selectByIndex(30);
		
		/*boolean multiple = select.isMultiple();
		System.out.println(multiple);
		*/
		
		List<WebElement> options = select1.getOptions();
		for(int i = 0; i<options.size(); i++) {
			WebElement wE =options.get(i);
			String text = wE.getText();
			System.out.println(text);
			
			
			
		}
		
	}

}
