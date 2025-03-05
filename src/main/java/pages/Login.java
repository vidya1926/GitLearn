package pages;

import org.openqa.selenium.By;

import base.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login extends DriverFactory {
	
	@Given("Enter username")
	public void enter_username() {
	    driver.findElement(By.id("username")).sendKeys("vidyar@testleaf.com");
	}
	@Given("Enter password")
	public void enter_password() {
	  driver.findElement(By.id("password")).sendKeys("Sales@123");
	}
	@When("Click login")
	public void click_login() {
	  driver.findElement(By.id("Login")).click();
	}
	@Then("Homepage is verified")
	public void homepage_is_verified() {
	   System.out.println("Homepage is verified: " + driver.getTitle());
	}



}
