package day4;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinksEg4 {

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://primusbank.qedgetech.com/sitemap.html");
		driver.manage().window().maximize();
		
//		driver.findElement(By.linkText("Home")).click();
		//Method:1
//		driver.findElement(By.xpath("//*[@id='Table_011']/tbody/tr[2]/td/ul/li[1]/a")).click();
		//Method:2
//		WebElement block=driver.findElement(By.xpath("//*[@id='Table_011']/tbody/tr[2]/td"));
//		List<WebElement> links=block.findElements(By.tagName("a"));
//		
//		System.out.println(links.size());
//		
//		for (int i = 0; i < links.size(); i++)
//		{
//			String name=links.get(i).getText();
//			System.out.println(name);
//			
//			if (name.equalsIgnoreCase("Home"))
//			{
//				links.get(i).click();
//				break;
//			}
//		}
		
		//Method:3
		driver.findElement(By.xpath("//*[@id='Table_011']/tbody/tr[2]/td")).findElement(By.linkText("Home")).click();

	}

}
