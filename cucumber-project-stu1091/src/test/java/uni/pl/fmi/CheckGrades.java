package uni.pl.fmi;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import uni.pl.fmi.models.CheckGradesModel;

public class CheckGrades {

	CheckGradesModel checkGradesModel = new CheckGradesModel();
	
	@Given("^The user is logged in$")
	public void isLoggedIn() throws Throwable {
		checkGradesModel.getLoginStatus();
	}

	@Given("^The user opens the check grades screen in the system$")
	public void openCheckGradesScreen() throws Throwable {
		checkGradesModel.navigateToMe();
	}

	@When("^Enters student school number \"([^\"]*)\"$")
	public void addStudentSchoolNumber(String stuNum) throws Throwable {
		checkGradesModel.setGrades(stuNum);
	}

	@When("^clicks on the search button$")
	public void clickSearchBtn() throws Throwable {
		checkGradesModel.clickLoginButton();
	}

	@Then("^Sees student's grades$")
	public void checkStudentGrades() throws Throwable {
		System.out.println(checkGradesModel.getGrade());
	}

	@Then("^Sees message \"([^\"]*)\"$")
	public void ResultMsg(String message) throws Throwable {
		checkGradesModel.getMessage();
	}
}
