package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class LoginTC 
{
	@Test
	public void login() throws InterruptedException
	{
		WebDriver driver=new FirefoxDriver();
		
		LoginPage lp=PageFactory.initElements(driver, LoginPage.class);
		
		driver.get(lp.url);
		driver.manage().window().maximize();
		
		lp.Org_login(lp.u, lp.p);
		Thread.sleep(3000);
		
		AdminHomePage ap=PageFactory.initElements(driver, AdminHomePage.class);
		
		ap.welcomeclick();
		ap.logoutclick();
		
		driver.close();
		
	}

}
