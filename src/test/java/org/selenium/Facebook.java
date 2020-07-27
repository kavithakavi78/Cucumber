package org.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\kavi\\DemoPro\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement fn = driver.findElement(By.xpath("(//input[@class='inputtext _58mg _5dba _2ph-'])[1]"));
		fn.sendKeys("kavitha");
		driver.findElement(By.name("lastname")).sendKeys("vinoth");
		WebElement mail = driver.findElement(By.xpath("(//input[@class='inputtext _58mg _5dba _2ph-'])[3]"));
		mail.sendKeys("kavivkv78@gmail.com");
		driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("kavivino");
		WebElement day = driver.findElement(By.id("day"));
		Select s = new Select(day);
		s.selectByIndex(6);
		WebElement mon = driver.findElement(By.id("month"));
		Select s1 = new Select(mon);
		s1.selectByValue("6");
		WebElement year = driver.findElement(By.id("year"));
		Select s2 = new Select(year);
		s2.selectByVisibleText("1994");
		driver.findElement(By.xpath("(//input[@type='radio'])[1]")).click();
		driver.findElement(By.xpath("(//button[@type='submit'])[1]")).click();
		System.out.println("Done for Registration");
		driver.quit();
		
		

	}

}
