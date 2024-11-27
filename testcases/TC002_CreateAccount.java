package week7.day1.HomeAssignment.testcases;

import org.testng.annotations.Test;

import week7.day1.HomeAssignment.base.ProjectSpecificMethod;
import week7.day1.HomeAssignment.pages.LoginPage;

public class TC002_CreateAccount extends ProjectSpecificMethod {
	
	@Test
	public void runCreateAccount()
	{
		LoginPage loginObj = new LoginPage();
		loginObj.enterUsername()
		.enterPassword()
		.clickLogin()
		.clickCRMSFA()
		.clickAccountsTab()
		.clickCreateAccountLink()
		.enterAcctName()
		.clickCreateAccountButton()
		.verifyAccount();
	}

}
