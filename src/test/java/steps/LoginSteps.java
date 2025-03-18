package steps;

import io.cucumber.java.en.*;

public class LoginSteps {

	
	@Given("I launch Facebook page")
	public void i_launch_facebook_page()
	{
	   
		System.out.println("Facebook page is opened");
	}

	@When("I enter username {string} and password {string}")
	public void i_enter_username_and_password(String username, String password) 
	{
	   System.out.println("Username entered as :: "+ username);
	   System.out.println("Password entere as :: "+ password);
	}

	@When("I click Submit button")
	public void i_click_submit_button() {
	    
		System.out.println("User Clciked login button");
		
	}

	@Then("I validated the home page title {string}")
	public void i_validated_the_home_page_title(String expectedTitle) {
	    
		System.out.println("Actual home page title is -- Facebook");
		if(expectedTitle.equals("Facebook"))
		{
			System.out.println("Passed");
		}else
		{
			System.out.println("Failed");
		}
	}

	@Then("I validated the error message {string}")
	public void i_validated_the_error_message(String ExpectedErrorMsg)
	{
		System.out.println("Actual error msg is -- username or password is not matched");
		if(ExpectedErrorMsg.equals("username or password is not matched"))
		{
			System.out.println("Passed");
		}else
		{
			System.out.println("Failed");
		}
	}
	

@Then("I click forgetPassword link")
public void i_click_forget_password_link() {
   
	System.out.println("User clicked forget pasword link");
}

}
