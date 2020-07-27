package org.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.resources.BaseClass1;

public class MoveToElement extends BaseClass1 {
	public static void main(String[] arg) throws Exception {
		BaseClass1.getDriver("chrome");
		BaseClass1.getUrl("https://petstore.octoperf.com/actions/Catalog.action");
		WebElement signin = driver.findElement(By.xpath("//a[text()='Sign In']"));
		BaseClass1.mouseOver(signin);
		BaseClass1.clickkk(signin);
		BaseClass1.getCurrentUrl();
		WebElement Reg = driver.findElement(By.xpath("//a[text()='Register Now!']"));
		BaseClass1.mouseOver(Reg);
		BaseClass1.clickkk(Reg);
		
	}

}
