package stepdefinations;

import java.util.List;

import org.junit.runner.RunWith;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;	
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
public class Stepdefination {
	
	  @Given("^validate the browser$")
	    public void validate_the_browser() throws Throwable {
	     
	    }

	    @When("^browser is triggered$")
	    public void browser_is_triggered() throws Throwable {
	       
	    }

	    @Then("^Check if browser is started$")
	    public void check_if_browser_is_started() throws Throwable {
	       System.out.println("Background also implemented");
	    }

	
	 @Given("^User is on Netbanking  landing page$")
	    public void user_is_on_netbanking_landing_page() throws Throwable {
	       
		System.out.println("User is on our Netbanking page");
	    }

	    @When("^User login into apllication with username and password$")
	    public void user_login_into_apllication_with_username_and_password() throws Throwable {
	       
	    	System.out.println("normal scenario");
	    }

	    @Then("^Home page is populated$")
	    public void home_page_is_populated() throws Throwable {
	       
	    }

	    @And("^cards are displayed$")
	    public void cards_are_displayed() throws Throwable {
	     
	    }
	    
	    @When("^User login into apllication with \"([^\"]*)\" and password \"([^\"]*)\"$")
	    public void user_login_into_apllication_with_something_and_password_something(String strArg1, String strArg2) throws Throwable {
	      
	        System.out.println(strArg1);
	        System.out.println(strArg2);
	    }

	    @Then("cards displayed are {string}")
	    public void cards_displayed_are(String string) {
	        // Write code here that turns the phrase above into concrete actions
	       
	    	System.out.println(string);
	    }
	    
	    @When("^User sign up with following details$")
	    public void user_sign_up_with_following_details(DataTable data) throws Throwable {
	     List<List<String>> obj = data.asLists();
	    	System.out.println(obj.get(0).get(0));
	    	System.out.println(obj.get(0).get(1));
	    	System.out.println(obj.get(0).get(2));
	    	System.out.println(obj.get(0).get(3));
	    	System.out.println(obj.get(0).get(4));
	    }

	    @When("^User login in to application  with (.+) and (.+)$")
	    public void user_login_in_to_application_with_and(String username, String password) throws Throwable {
	       System.out.println(username);
	       System.out.println(password);
	    }
}
