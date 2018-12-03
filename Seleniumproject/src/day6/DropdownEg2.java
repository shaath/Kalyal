package day6;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownEg2 {

	public static void main(String[] args) 
	{
		
//		WebDriver driver=new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Users/Dell\\Desktop\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://newtours.demoaut.com/mercuryregister.php?osCsid=bd70e428043444338f4c2709d42ab716");
		driver.manage().window().maximize();
		
		WebElement drop=driver.findElement(By.name("country"));
		
		Select s=new Select(drop);
		
//		s.selectByVisibleText("INDIA");
//		s.selectByValue("92");
		
		List<WebElement> list=s.getOptions();
		
		System.out.println(list.size());
		
		for (int i = 0; i < list.size(); i++) 
		{
			s.selectByIndex(i);
			String name=list.get(i).getText();
			System.out.println(name);
		}

	}

}
