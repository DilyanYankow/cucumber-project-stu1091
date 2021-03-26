package uml;
import java.util.*;

/**
 * 
 */
public class Grade {

    /**
     * Default constructor
     */
    public Grade() {
    }

    private Student student;
    private Subject subject;
    private int grade;

    /**
     * @return
     */
    public Student getStudent() {
        return student;
    }

    /**
     * @param student 
     * @return
     */
    public void setStudent(Student student) {
       this.student=student;
    }

    /**
     * @return
     */
    public Subject getSubject() {
        return subject;
    }

    /**
     * @param subject 
     * @return
     */
    public void setSubject(Subject subject) {
       this.subject=subject;
    }

    /**
     * Grades in this system must be only in the range from 2 to 6
     * @return
     */
    public int getGrade() {
        return grade;
    }

    /**
     * @param grade 
     * @return
     */
    public void setGrade(int grade) {
    	if (grade>=2 & grade<=6) {
      this.grade=grade;
    	}
    }

    /**
     * @param student 
     * @param subject 
     * @param grade 
     * @return
     */
    public void setGrades(Student student, Subject subject, int grade) {
        this.grade=grade;
        this.student=student;
        this.subject=subject;
    }

    /**
     * @param schoolNumber 
     * @return
     */
//    public Set getGrades(String schoolNumber) {
//        //TODO SQL
//    	return grades;
//    }

}