package uni.pl.fmi;

import static org.junit.Assert.assertEquals;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import uni.pl.fmi.models.LoginScreenModel;

public class LoginSteps {
	
	LoginScreenModel loginScreenModel = new LoginScreenModel();
	
	@Given("^The user opens the login screen in the system$")
	public void openLoginScreen() throws Throwable {
		loginScreenModel.navigateToMe();
	}

	@When("^Enters username \"([^\"]*)\"$")
	public void addUsername(String username) throws Throwable {
	    loginScreenModel.setUsername(username);
	}

	@When("^Enters password \"([^\"]*)\"$")
	public void addPassword(String password) throws Throwable {
		loginScreenModel.setPassword(password);
	}

	@When("^Clicks on the button to enter the system$")
	public void clickLoginBtn() throws Throwable {
		loginScreenModel.clickLoginButton();
	}

	@Then("^Sees a message \"([^\"]*)\"$")
	public void checkLoginMsg(String expectedMessage) throws Throwable {
		final String resultMsg = loginScreenModel.getLoginMessage();
		assertEquals(expectedMessage, resultMsg);
	}
}
