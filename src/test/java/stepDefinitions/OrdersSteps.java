package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OrdersSteps {
	
	@Given("a registered user exists")
	public void a_registered_user_exists() {
		System.out.println("Registered user exists - from Background");

	}

	@Given("user is on Amazon login page")
	public void user_is_on_amazon_login_page() {
		System.out.println("User is on login page - from Background");
		
	}


	@When("user enters username")
	public void user_enters_username() {
		System.out.println("User enters username - from Background");

	}

	@When("user enters password")
	public void user_enters_password() {
		System.out.println("User enters password - from Background");

	}

	@When("user clicks on login button")
	public void user_clicks_on_login_button() {
		System.out.println("User clicks on login button - from Background");

	}

	@Then("user navigates to order page")
	public void user_navigates_to_order_page() {
		System.out.println("User navigates to order page - from Background");

	}

	@When("user clicks on Order link")
	public void user_clicks_on_order_link() {
		System.out.println("From Scenario 1");

	}

	@Then("user checks the previous order details")
	public void user_checks_the_previous_order_details() {
		System.out.println("From Scenario 1");

	}

	@When("user clicks on Open Order link")
	public void user_clicks_on_open_order_link() {
		System.out.println("From Scenario 2");

	}

	@Then("user checks the open order details")
	public void user_checks_the_open_order_details() {
		System.out.println("From Scenario 2");

	}

	@When("user clicks on Cancelled Order link")
	public void user_clicks_on_cancelled_order_link() {
		System.out.println("From Scenario 3");

	}

	@Then("user checks the cancelled order details")
	public void user_checks_the_cancelled_order_details() {
		System.out.println("From Scenario 3");

	}

	@When("user clicks on Cart Order link")
	public void user_clicks_on_cart_order_link() {
		System.out.println("From Scenario 4");

	}

	@Then("user checks the in cart order details")
	public void user_checks_the_in_cart_order_details() {
		System.out.println("From Scenario 4");

	}


}
