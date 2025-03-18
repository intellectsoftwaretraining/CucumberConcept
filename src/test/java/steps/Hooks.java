package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {


	
	@Before
	public void startBrowser() 
	{
		System.out.println("Chrome browser laucnhed");
	}
	
	@After
	public void closeBrowser() 
	{
		System.out.println("Chrome browser closed");
	}
	
}
