package com.webTable;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	private static final By By = null;

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rejas\\eclipse-workspace j\\SeleniumChrome\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();
		
		WebElement tableData = driver.findElement(By.id("customers"));
		List<WebElement> allRow = tableData.findElements(By.tagName("tr"));
		for(int i=0; i<allRow.size(); i++) {
			WebElement row = allRow.get(i);
			String text = row.getText();
			System.out.println(text);
		}
		
		System.out.println("====================");
		
		for(int i=0; i<allRow.size(); i++) {
			WebElement row = allRow.get(i);
			List<WebElement> dataT = row.findElements(By.tagName("td"));
			for(int j=0; j<dataT.size();j++) {
				WebElement ele = dataT.get(j);
				String text = ele.getText();
				System.out.println(text);
				
			}
		
		}
		
		
	}

}
