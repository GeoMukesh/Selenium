package com.multipledropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropAndDragByMultiple {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rejas\\eclipse-workspace j\\SeleniumChrome\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://output.jsbin.com/osebed/2");
		driver.manage().window().maximize();
		
		WebElement dropFruits = driver.findElement(By.id("fruits"));
		Select se = new Select(dropFruits);
		boolean multiple = se.isMultiple();
		System.out.println(multiple);
		
		List<WebElement> options = se.getOptions();
		for (int i = 0; i < options.size(); i++) {
			WebElement element = options.get(i);
			String text = element.getText();
			se.selectByVisibleText(text);
		}
		WebElement firstSelectedOption = se.getFirstSelectedOption();
		String text = firstSelectedOption.getText();
		System.out.println(text);
	}

}
