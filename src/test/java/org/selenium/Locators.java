package org.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\kavi\\DemoPro\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

		driver.get("https://www.facebook.com/");
		WebElement em = driver.findElement(By.name("email"));
		em.sendKeys("kavivk78@gmail.com");
		WebElement ps = driver.findElement(By.xpath("(//input[@type='password'])[1]"));
		ps.sendKeys("kavivino");
		driver.findElement(By.xpath("//input[@value='Log In']")).click();
		driver.close();
		

	}

}
