package HooksImplementation.stepDefinition;

import org.openqa.selenium.By;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class createAccount extends ProjectSpecificMethod {
	
	@Given("Click CRMSFA link")
	public void click_crmsfa_link() {
		
		driver.findElement(By.linkText("CRM/SFA")).click();
	    
	}
	@Given("Click Accounts tab")
	public void click_accounts_tab() {
	   
		driver.findElement(By.linkText("Accounts")).click();
		
	}
	@Given("Click Create Account link")
	public void click_create_account_link() {
		
		driver.findElement(By.linkText("Create Account")).click();
	   
	}
	@Given("Enter Account Name as {string}")
	public void enter_account_name_as(String acctName) {
		
		driver.findElement(By.id("accountName")).sendKeys(acctName);
	   
	}
	@When("Click Create Account button")
	public void click_create_account_button() {
		
		driver.findElement(By.className("smallSubmit")).click();
	  
	}
	@Then("Verify Account Name as {string}")
	public void verify_account_name_as(String acctName) {
		
		String account = driver.findElement(By.xpath("//div[@class='frameSectionBody']/following::table[15]/tbody/tr[1]/td[2]/span[1]")).getText();
		Assert.assertTrue(account.replaceAll("[^a-zA-Z]", "").equals(acctName),"Verify the Account name");
				
				
	}

}
