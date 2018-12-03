package testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class TestNGMaster 
{
	public static WebDriver driver;
	public static String url="http://orangehrm.qedgetech.com";
	public static String u="Admin",p="Admin";
	public static String f="Apple",l="G",Eid="APG654";
	public static String ename=f+" "+l,uname=f+l+"123456789",pswd=f+l+"123456789",cpswd=f+l+"123456789";
	public static String expval,actval;
	@BeforeSuite
	public void Org_Launch()
	{
		expval="LOGIN";
		driver=new FirefoxDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		actval=driver.findElement(By.id("btnLogin")).getAttribute("value");
		
		Assert.assertEquals(actval, expval,"Launch failed");
	}
	@BeforeTest
	public void Org_Login()
	{
		expval="welcome";
		driver.findElement(By.id("txtUsername")).sendKeys(u);
		driver.findElement(By.id("txtPassword")).sendKeys(p);
		driver.findElement(By.id("btnLogin")).click();
		
		actval=driver.findElement(By.partialLinkText("Welcome")).getAttribute("id");
		Assert.assertEquals(actval, expval,"Login failed");
	}
	@AfterTest
	public void Org_Logout() throws InterruptedException
	{
		expval="LOGIN";	
		Thread.sleep(3000);		
		driver.findElement(By.partialLinkText("Welcome")).click();
		driver.findElement(By.linkText("Logout")).click();
		
		actval=driver.findElement(By.id("btnLogin")).getAttribute("value");
		Assert.assertEquals(actval, expval,"Logout failed");
	}
	@AfterSuite
	public void Org_Close()
	{
		driver.close();
	}

}