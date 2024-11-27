package HooksImplementation.hooks;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import HooksImplementation.stepDefinition.*;

public class HooksImplementationClass extends ProjectSpecificMethod {
	
	@Before
	public void preCondition()
	{	
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		
	}
	
	@After
	public void postCondition()
	{
		driver.findElement(By.linkText("Logout")).click();
		driver.close();
	}


}
