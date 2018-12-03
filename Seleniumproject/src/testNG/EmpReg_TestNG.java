package testNG;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class EmpReg_TestNG extends TestNGMaster
{
	
	@Test(dataProvider="data")
	public void ORg_Empreg(String f,String l,String Eid)
	{
		expval=f+" "+l;
		driver.findElement(By.linkText("PIM")).click();
		driver.findElement(By.linkText("Add Employee")).click();
		
		driver.findElement(By.id("firstName")).sendKeys(f);
		driver.findElement(By.id("lastName")).sendKeys(l);
		driver.findElement(By.id("employeeId")).clear();
		driver.findElement(By.id("employeeId")).sendKeys(Eid);
		driver.findElement(By.id("btnSave")).click();
		
		actval=driver.findElement(By.xpath("//*[@id='profile-pic']/h1")).getText();
		
		Assert.assertEquals(actval, expval,"EmpReg failed");
	}
	
	@DataProvider
	public Object[][] data()
	{
		Object[][] d=new Object[3][3];
		
		d[0][0]="Apple";
		d[0][1]="Z";
		d[0][2]="AZ098";
		
		d[1][0]="Apple";
		d[1][1]="Y";
		d[1][2]="AY098";
		
		d[2][0]="Apple";
		d[2][1]="E";
		d[2][2]="AE098";
		
		return d;
	}

}
