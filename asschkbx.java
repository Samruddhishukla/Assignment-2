package com.Launch;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import java.util.List;

public class asschkbx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\College\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
		driver.manage().window().maximize();
		WebElement opti = driver.findElement(By.xpath("//select[@id='first']"));
		Select proc = new Select(opti);
		
		System.out.println("default option is " + proc.getFirstSelectedOption().getText());
		
		
		
		List<WebElement> pro = proc.getOptions();
		
		System.out.println("Number of Products " +pro.size());
		
		

		proc.selectByVisibleText("Yahoo");
		
		//proc.selectByValue("82");
		
	//	nations.selectByIndex(82);
		
		System.out.println("Choosen value is : " + proc.getFirstSelectedOption().getText());
		
		WebElement opti1 = driver.findElement(By.id("animals"));
		Select animal = new Select(opti1);
		
		System.out.println("default option is " + proc.getFirstSelectedOption().getText());
		
		
		
		List<WebElement> ani = proc.getOptions();
		
		System.out.println("Number of Products " +ani.size());
		
		

		animal.selectByVisibleText("Baby Cat");
		
		//proc.selectByValue("82");
		
	//	nations.selectByIndex(82);
		
		System.out.println("Choosen value is : " + animal.getFirstSelectedOption().getText());
		//mulchbx
		WebElement lb = driver.findElement(By.xpath("//select[@id='second']"));
		
		Select food= new Select(lb);
		
		if(food.isMultiple())
		{
			food.selectByIndex(0);
			food.selectByIndex(2);
			food.selectByVisibleText("Bonda");
		}
		
		List<WebElement> selFood = food.getAllSelectedOptions();
 		
		System.out.println("Selected Food Items ");
		for(WebElement we : selFood)
		{
			System.out.println(we.getText());
		}
			
	}
}
