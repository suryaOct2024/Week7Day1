package week7.day1.HomeAssignment.testcases;

import org.testng.annotations.Test;

import week7.day1.HomeAssignment.base.ProjectSpecificMethod;
import week7.day1.HomeAssignment.pages.LoginPage;

public class TC001_Login extends ProjectSpecificMethod {
	
	@Test
	public void runLogin() 
	{
		LoginPage loginObj = new LoginPage();
		loginObj.enterUsername()
		.enterPassword()
		.clickLogin();
	}

}
