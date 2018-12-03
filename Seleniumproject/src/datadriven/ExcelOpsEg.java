package datadriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import methods.OrgHRMLib;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelOpsEg {

	public static void main(String[] args) throws IOException, InterruptedException 
	{
		OrgHRMLib om=new OrgHRMLib();
		
		String xlpath="F:\\KayalRecordings\\Workspace\\Seleniumproject\\src\\testdata\\TestData.xlsx";
		String xlout="F:\\KayalRecordings\\Workspace\\Seleniumproject\\src\\results\\EmpRes.xlsx";
		FileInputStream fi=new FileInputStream(xlpath);
		
		XSSFWorkbook wb=new XSSFWorkbook(fi);
		XSSFSheet ws=wb.getSheet("EmpReg");
		
//		XSSFRow r=ws.getRow(6);
//		XSSFCell c=r.getCell(2);
		
//		System.out.println(c.getStringCellValue());
		
		int Rc=ws.getLastRowNum();
		System.out.println(Rc);
		
//		int Cc=r.getLastCellNum();
//		System.out.println(Cc);
		
		om.Org_Launch("http://orangehrm.qedgetech.com");
		om.Org_Login("Admin", "Admin");
		
		for (int i = 1; i < Rc+1; i++)
		{
			XSSFRow r=ws.getRow(i);
			
			XSSFCell c=r.getCell(0);
			XSSFCell c1=r.getCell(1);
			XSSFCell c2=r.getCell(2);
			XSSFCell c3=r.createCell(3);
			
			
			String f=c.getStringCellValue();
			String l=c1.getStringCellValue();
			String Eid=c2.getStringCellValue();
			
			System.out.println(f+"----"+l+"----"+Eid);
			
			String res=om.Org_EmpReg(f, l, Eid);
			
			c3.setCellValue(res);
		}
		
		FileOutputStream fo=new FileOutputStream(xlout);
		wb.write(fo);
		
		om.Org_Logout();
		om.Org_Close();
	
	}

}
