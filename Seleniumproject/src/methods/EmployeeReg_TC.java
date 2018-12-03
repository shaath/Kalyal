package methods;

import java.io.FileNotFoundException;
import java.io.IOException;

public class EmployeeReg_TC {

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		OrgHRMLib om=new OrgHRMLib();
		
		String res=om.Org_Launch("http://orangehrm.qedgetech.com");
		System.out.println("Application Launch "+res);
		
		res=om.Org_Login("Admin", "Admin");
		System.out.println("Application Login "+res);
		
		res=om.Org_EmpReg("Nidish", "Gande", "NG12345");
		System.out.println("Employee Registration "+res);
		
		res=om.Org_Logout();
		System.out.println("Application Logout "+res);
		
		om.Org_Close();
		System.out.println("Apllication closed Successfully");

	}

}
