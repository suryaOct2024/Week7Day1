package week7.day1.HomeAssignment.pages;

import org.openqa.selenium.By;

import week7.day1.HomeAssignment.base.ProjectSpecificMethod;

public class LoginPage extends ProjectSpecificMethod {
	
	
	public LoginPage enterUsername()
	{
		driver.findElement(By.id("username")).sendKeys("DemoCSR");
		return this;
	}
	
	public LoginPage enterPassword()
	{
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		return this;
	}
	
	public WelcomePage clickLogin()
	{
		driver.findElement(By.className("decorativeSubmit")).click();
		return new WelcomePage();
	}

}
