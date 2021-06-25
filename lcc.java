package com.Launch;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import java.util.List;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebElement;
public class lcc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\College\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	 	
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
	    driver.findElement(By.id("btnLogin")).click();
	    driver.findElement(By.linkText("PIM")).click();
		driver.findElement(By.xpath(".//*[@id='menu_pim_viewEmployeeList']")).click();
		driver.findElement(By.linkText("Odis")).click();
		
		driver.findElement(By.id("btnSave")).click();
		
		
		
		
		WebElement opti = driver.findElement(By.id("personal_cmbNation"));
		Select nations = new Select(opti);
		
		System.out.println("default option is " + nations.getFirstSelectedOption().getText());
		
		
		
		List<WebElement> countries = nations.getOptions();
		
		System.out.println("Number of countires " +countries.size());
		
		

//		nations.selectByVisibleText("Indian");
		
		nations.selectByValue("82");
		
	//	nations.selectByIndex(82);
		
		System.out.println("Choosen value is : " + nations.getFirstSelectedOption().getText());
		
	


	}

}
