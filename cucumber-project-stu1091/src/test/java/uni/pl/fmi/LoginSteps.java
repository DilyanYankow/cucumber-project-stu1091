package uni.pl.fmi;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps {
	@Given("^The user opens the login screen in the system$")
	public void the_user_opens_the_login_screen_in_the_system() throws Throwable {

	}

	@When("^Enters username \"([^\"]*)\"$")
	public void addUsername(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^Enters password \"([^\"]*)\"$")
	public void addPassword(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^Clicks on the button to enter the system$")
	public void clickLoginBtn() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^Sees a message for successful login\\.$")
	public void checkLoginMsg() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}
}
