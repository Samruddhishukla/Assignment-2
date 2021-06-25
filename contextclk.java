package com.Launch;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
//import java.util.List;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;

public class contextclk {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\College\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		WebElement we = driver.findElement(By.linkText("Gmail"));
		
		Actions a = new Actions(driver);
		
		a.contextClick(we).perform();
		//a.contextClick(we).perform();
		
		a.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(2000);
		a.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(2000);
		a.sendKeys(Keys.ARROW_UP).perform();
		Thread.sleep(2000);
		a.sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);
		a.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(2000);
		a.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(2000);
		a.sendKeys(Keys.ARROW_UP).perform();
		Thread.sleep(2000);
		a.sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);
		driver.close();

	}

}
