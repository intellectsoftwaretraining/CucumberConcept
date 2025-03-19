package steps;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;

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

	@AfterAll
	public static void afterAll() 
	{
		System.out.println("This is Afterall method");
	}
	
	@BeforeAll
	public static void beforeAll() 
	{
		System.out.println("This is before all method");
	}
}
