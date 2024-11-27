package week7.day1.HomeAssignment.pages;

import org.openqa.selenium.By;

import week7.day1.HomeAssignment.base.ProjectSpecificMethod;

public class WelcomePage extends ProjectSpecificMethod {
	
	public MyHomePage clickCRMSFA()
	{
		driver.findElement(By.linkText("CRM/SFA")).click();
		return new MyHomePage();
	}

}
