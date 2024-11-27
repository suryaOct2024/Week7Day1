package HooksImplementation.stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;

public class editAccount extends ProjectSpecificMethod {
	
	@Given("Click Find Accounts link")
	public void click_find_accounts_link() {
	   
		driver.findElement(By.linkText("Find Accounts")).click();
		
	}
	@Given("Enter created account Name as {string}")
	public void enter_account_name_as(String acctName) {
		
		driver.findElement(By.xpath("(//input[@name='accountName'])[2]")).sendKeys(acctName);
					   
	}
	@Given("Click Find Accounts button")
	public void click_find_accounts_button() {
		
		driver.findElement(By.xpath("//button[text()='Find Accounts']")).click();
	    
	}
	@Given("Click on the first Account Id displayed")
	public void click_on_the_first_account_id_displayed() throws InterruptedException {
		
		Thread.sleep(2000);
		WebElement clickAcctWE = driver.findElement(By.xpath("(//span[text()='Account List']/following::table)[2]/tbody/tr/td[1]/div/a"));
		driver.executeScript("arguments[0].click()", clickAcctWE);
		   
	}
	@Given("Click Edit button")
	public void click_edit_button() {
		
		driver.findElement(By.linkText("Edit")).click();
	   
	}
	@Given("Enter Description as {string}")
	public void enter_description_as(String desc) {
		
		driver.findElement(By.name("description")).clear();
		driver.findElement(By.name("description")).sendKeys(desc);
	   
	}
	@Given("Click Save button")
	public void click_save_button() {
	   
		driver.findElement(By.className("smallSubmit")).click();
		
	}

}
