package week7.day1.HomeAssignment.pages;

import org.openqa.selenium.By;

import week7.day1.HomeAssignment.base.ProjectSpecificMethod;

public class CreateAccountPage extends ProjectSpecificMethod {
	
	public CreateAccountPage enterAcctName()
	{
		
		driver.findElement(By.id("accountName")).sendKeys("TestLeafTestAccount");
		return this;
	}
	
	public ViewAccountPage clickCreateAccountButton()
	{
		driver.findElement(By.className("smallSubmit")).click();
		return new ViewAccountPage();
	}

}
