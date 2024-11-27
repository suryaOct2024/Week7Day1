package week7.day1.HomeAssignment.pages;

import org.openqa.selenium.By;

import week7.day1.HomeAssignment.base.ProjectSpecificMethod;

public class MyHomePage extends ProjectSpecificMethod {
	
	public MyAccountPage clickAccountsTab()
	{
		driver.findElement(By.linkText("Accounts")).click();
		return new MyAccountPage();
	}

}
