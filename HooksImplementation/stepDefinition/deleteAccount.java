package HooksImplementation.stepDefinition;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class deleteAccount extends ProjectSpecificMethod {
	
	
	@When("Click on Deactivate Account")
	public void click_on_deactivate_account() {
		
		driver.findElement(By.linkText("Deactivate Account")).click();
	    
	}
	@Then("Accept the confirmation alert")
	public void accept_the_confirmation_alert() {
		
		Alert alert = driver.switchTo().alert();
		alert.accept();
	   
	}
	@Then("Verify the account is deleted")
	public void verify_the_account_is_deleted() throws InterruptedException {
		
		Thread.sleep(2000);
		String msg = driver.findElement(By.xpath("//div[@class='x-paging-info']")).getText();
		Assert.assertTrue(msg.equals("No records to display"),"Verify the Account deletion");
	 
	}

}
