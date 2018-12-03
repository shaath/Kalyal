package day9;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_KeyboardEg {

	public static void main(String[] args) throws InterruptedException 
	{
		FirefoxDriver driver=new FirefoxDriver();		
		driver.get("http://google.com");
		driver.manage().window().maximize();
		
		WebElement gmail=driver.findElement(By.linkText("Gmail"));
		
		Actions act=new Actions(driver);
		
		act.moveToElement(gmail).build().perform();
		Thread.sleep(3000);
		
		act.contextClick().build().perform();
		Thread.sleep(3000);
		
//		act.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).build().perform();
//		Thread.sleep(3000);
		
//		act.sendKeys(Keys.ENTER).build().perform();
		
		act.sendKeys(Keys.chord("P")).build().perform();
		
	}

}
