package com.qa.testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sample {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		WebElement f = driver.findElement(By.xpath("(//div[@class='eFQ30H'])[4]"));
		Actions a = new Actions(driver);
		a.moveToElement(f).perform();
		
		driver.findElement(By.xpath("(//a[contains(@class,'_6WOcW9 _3YpNQe')])[2]")).click();
	}

}
