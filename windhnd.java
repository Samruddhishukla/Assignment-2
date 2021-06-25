package com.Launch;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
//import java.util.List;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.interactions.Actions;
import java.util.Iterator;
//import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
public class windhnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\College\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
	    driver.findElement(By.id("btnLogin")).click();
	    System.out.println("WindowHandle : " +driver.getWindowHandle());
		
		driver.findElement(By.xpath(".//*[@id='branding']/a[1]/img")).click();
		
		Set<String> winhld = driver.getWindowHandles();
		Iterator<String> itr = winhld.iterator();
	
		System.out.println("Window handles of main window : " +itr.next());
		
		System.out.println("Window handles of new main window : " +itr.next());
		
		itr = winhld.iterator();
		
		String mainWindow = itr.next();
		String newWindow = itr.next();
		
		driver.switchTo().window(newWindow);
		
	//	System.out.println("Title is : " + driver.getTitle());
		
		driver.switchTo().window(mainWindow);
		
		driver.manage().timeouts().implicitlyWait(20,  TimeUnit.SECONDS);
		
		//Thread.sleep(3000);
		driver.findElement(By.id("welcome")).click();
		
		driver.findElement(By.linkText("Logout")).click();
	}

}
