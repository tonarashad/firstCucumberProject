package step_definitions;
	
	import org.junit.Assert;

import io.cucumber.java.en.Given;
	import io.cucumber.java.en.Then;
	import io.cucumber.java.en.When;
	import pages.LogInPage;
	import utilities.DataReader;
	import utilities.Driver;

	public class UserManagementStep {
		
		LogInPage loginpage = new LogInPage();
		
		@Given("As a user, I am on the login page \\(precondition)")
		public void as_a_user_i_am_on_the_login_page_precondition() {
		  Driver.getDriver().get(DataReader.getProperty("appUrl")) ;
		}
		@When("i enter a valid username and valid password \\(Actions)")
		public void i_enter_a_valid_username_and_valid_password_actions() {
			loginpage.emailField.sendKeys(DataReader.getProperty("usernsme"));
			loginpage.passwordField.sendKeys(DataReader.getProperty("password"));
		}
		@When("i click on login button \\(Actions)")
		public void i_click_on_login_button_actions() {
			loginpage.loginBtn.click();
		    
		}	

		@Then("i should be on user profile page \\(validation)")
		public void i_should_be_on_user_profile_page_validation() {
			Assert.assertTrue(loginpage.accountSettingHeader.isDisplayed());
			
}
	}
