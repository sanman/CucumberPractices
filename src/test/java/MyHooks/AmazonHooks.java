package MyHooks;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;

public class AmazonHooks {
	
	@Before (order = 1)
	public void setup_browser(Scenario sc) {
		System.out.println("Launch chrome browser");
		System.out.println("Scenario name: " + sc.getName());
		System.out.println("Scenario URI: " + sc.getUri());
		System.out.println("Scenario ID: " + sc.getId());
		System.out.println("Scenario tag: " + sc.getSourceTagNames());
	}
	
	
	@Before (order = 2)
	public void setup_url() {
		System.out.println("Launch url");	
	}
	
	@After (order = 2)
	public void tearDown_close(Scenario sc) {
		System.out.println("Close the browser");
	}

	@After (order = 1)
	public void tearDown_logout() {
		System.out.println("logout from application");		
	}

	@BeforeStep
	public void takescreenshot() {
		System.out.println("take the screen shot");
	}
	
	
	@AfterStep
	public void refreshPage() {
		System.out.println("refresh the page");
	}
	
}
