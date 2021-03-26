package uni.pl.fmi.models;

import java.util.List;

import uml.Grade;
import uni.pl.fmi.services.CheckGradesService;

public class CheckGradesModel {
	private boolean loggedIn;
	private List<Grade> grades=null;
	private String stuNum;
	private String message;

	public void getLoginStatus() {
		if (loggedIn=true) System.out.println("The user is logged in.");
		else System.out.println("The user is not logged in.");;
	}

	public void navigateToMe() {
		System.out.println("The CheckGrades screen opens.");
		
	}

	public void setGrades(String stuNum) {
		this.stuNum=stuNum;
		
	}

	public void clickLoginButton() {
		grades = CheckGradesService.getGrades(stuNum);
		if (grades==null) message="User not found";
	}

	
	public List<Grade> getGrade() {
	    return grades;
	}

	public String getMessage() {
		return message;		
	}

}
