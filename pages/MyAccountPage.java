package week7.day1.HomeAssignment.pages;

import org.openqa.selenium.By;

import week7.day1.HomeAssignment.base.ProjectSpecificMethod;

public class MyAccountPage extends ProjectSpecificMethod {
	
	public CreateAccountPage clickCreateAccountLink()
	{
		driver.findElement(By.linkText("Create Account")).click();
		return new CreateAccountPage();
	}

}
