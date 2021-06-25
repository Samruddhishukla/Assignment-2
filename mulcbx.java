package com.Launch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import java.util.List;

public class mulcbx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\College\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///D:/Automated%20Testing%20Training/Day4/mulcbx.html");
		
		WebElement lb = driver.findElement(By.name("cars"));
		
		Select cars= new Select(lb);
		
		if(cars.isMultiple())
		{
			cars.selectByIndex(0);
			cars.selectByIndex(2);
			cars.selectByVisibleText("Audi");
		}
		
		List<WebElement> selCars = cars.getAllSelectedOptions();
 		
		System.out.println("Selected cars ");
		for(WebElement we : selCars)
		{
			System.out.println(we.getText());
		}
			
		
	}
			
		
	}

