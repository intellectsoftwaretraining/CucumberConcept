package steps;

import io.cucumber.java.en.*;

public class BackgroundSteps {

	
	@Given("I Connect to Database")
	public void i_connect_to_database() {
	    
		System.out.println("I connected to SQL DB");
	}

	@Then("I update the passsword for all users throught update query")
	public void i_update_the_passsword_for_all_users_throught_update_query() {
	  
		System.out.println("I have executed update query");
	}
}
