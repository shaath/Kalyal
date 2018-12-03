package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GamilLoginEg {

	public static void main(String[] args) throws InterruptedException 
	{
//		WebDriver driver=new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Users/Dell\\Desktop\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://gmail.com");
		driver.manage().window().maximize();
		
		WebElement email=driver.findElement(By.id("identifierId"));
		
		email.sendKeys("testingtoolstrainer");
//		Thread.sleep(3000);
//		email.clear();
		
		driver.findElement(By.xpath("//*[@id='identifierNext']/content/span")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("password")).sendKeys("123456789");
		driver.findElement(By.cssSelector(".RveJvd.snByac")).click();
	}

}
