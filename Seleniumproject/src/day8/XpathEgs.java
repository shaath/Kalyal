package day8;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class XpathEgs {

	public static void main(String[] args) 
	{
		FirefoxDriver driver=new FirefoxDriver();		
		driver.get("http://google.com");
		driver.manage().window().maximize();
		
//		driver.findElement(By.xpath("//*[@id='gbw']/div/div/div[1]/div[1]/a")).click();
		
//		driver.findElement(By.xpath("(//a[@href='https://mail.google.com/mail/?tab=wm'])[1]")).click();
		
//		driver.findElement(By.xpath("//a[text()='Gmail']")).click();
		
		driver.findElement(By.xpath("//div[@id='gb']/div/div/div[1]/div[1]/div[1]/a")).click();

	}

}
