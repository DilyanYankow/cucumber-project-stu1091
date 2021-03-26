package uni.pl.fmi.services;

import java.util.ArrayList;
import java.util.List;

import javax.security.auth.Subject;

import uml.Grade;
import uml.Student;
import uml.User;

public class CheckGradesService {
	
	public static List<Grade> getGrades(String stuNumber) {
		
		final Grade grade1 = new Grade();
		final Student student1 = new Student();
		student1.setSchoolNumber("1");
		final uml.Subject subject1 = new uml.Subject();
		grade1.setGrade(4);
		grade1.setStudent(student1);
		grade1.setSubject(subject1);
		final List<Grade> result = new ArrayList<>();
		if (stuNumber==student1.getSchoolNumber(stuNumber))
		result.add(grade1);
		
		return result;
	}
}
