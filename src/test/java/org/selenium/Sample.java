package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {
	public static void main(String[] arg) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\kavi\\DemoPro\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(4000);
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement em = driver.findElement(By.id("email"));
		em.sendKeys("kavitha");
		WebElement ps = driver.findElement(By.id("pass"));
		ps.sendKeys("vinoth");
		WebElement btn = driver.findElement(By.xpath("//input[@value='Log In']"));
		btn.click();
		
	}

}
