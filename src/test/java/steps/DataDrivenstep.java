package steps;

import io.cucumber.java.en.*;

public class DataDrivenstep {

	
	@Given("I want to write a step with {string}")
	public void i_want_to_write_a_step_with_bala(String name) {
	   
		System.out.println("My name is " + name);
	}

	@When("I check for the {int} in step")
	public void i_check_for_the_in_step(Integer value) {
	  
		System.out.println("The value is "+ value);
	}

	@Then("I verify the {string} in step")
	public void i_verify_the_success_in_step(String status) 
	{
	   System.out.println("The status is " + status);
	}
}
