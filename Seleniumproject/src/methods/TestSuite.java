package methods;

import java.io.FileNotFoundException;
import java.io.IOException;

public class TestSuite {

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		OrgHRMLib om=new OrgHRMLib();
		//Login
		String res=om.Org_Launch("http://orangehrm.qedgetech.com");
		System.out.println("Application Launch "+res);
		
		res=om.Org_Login("Admin", "Admin");
		System.out.println("Application Login "+res);
		
		res=om.Org_Logout();
		System.out.println("Application Logout "+res);
		
		om.Org_Close();
		System.out.println("Apllication closed Successfully");

		//EmpReg
		
		res=om.Org_Launch("http://orangehrm.qedgetech.com");
		System.out.println("Application Launch "+res);
		
		res=om.Org_Login("Admin", "Admin");
		System.out.println("Application Login "+res);
		
		res=om.Org_EmpReg("Nihal", "P", "NP12345");
		System.out.println("Employee Registration "+res);
		
		res=om.Org_Logout();
		System.out.println("Application Logout "+res);
		
		om.Org_Close();
		System.out.println("Apllication closed Successfully");
		
		//UserReg
		
		res=om.Org_Launch("http://orangehrm.qedgetech.com");
		System.out.println("Application Launch "+res);
		
		res=om.Org_Login("Admin", "Admin");
		System.out.println("Application Login "+res);
		
		res=om.Org_UserReg("Nihal P", "ApNihal785489", "ApNihal785489", "ApNihal785489");
		System.out.println("User Registration "+res);
		
		res=om.Org_Logout();
		System.out.println("Application Logout "+res);
		
		om.Org_Close();
		System.out.println("Apllication closed Successfully");
		
		//User Login
		res=om.Org_Launch("http://orangehrm.qedgetech.com");
		System.out.println("Application Launch "+res);
		
		res=om.Org_Login("ApNihal785489", "ApNihal785489");
		System.out.println("Application Login "+res);
		
		res=om.Org_Logout();
		System.out.println("Application Logout "+res);
		
		om.Org_Close();
		System.out.println("Apllication closed Successfully");
	}

}
