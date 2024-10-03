package test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day4 {

	@Parameters({"URL"})
	@Test
	public void WebLoginHomeLoan(String uname) 
	{
		//selenium
		System.out.println("webloginhomePersonalLoan");
		System.out.println(uname);
	}
	
	@Test(groups= {"Smoke"})
	public void MobileLoginHomeLoan() 
	{
		//appium
		System.out.println("MobileloginHome");
	}	
	
	@Test
	public void LoginAPIHomeLoan() 
	{
		//Rest API automation
		System.out.println("APIloginHome");
	}	
}
