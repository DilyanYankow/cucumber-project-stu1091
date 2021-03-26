package uml;
import java.util.*;

/**
 * 
 */
public class SchoolClass {

    /**
     * Default constructor
     */
    public SchoolClass() {
    }

    private String number;
    private Teacher headTeacher;
    private Set<Subject> subjects;
    private Set<Student> students;

    /**
     * @return
     */
    public String getNumber() {
        return number;
    }

    /**
     * @param number 
     * @return
     */
    public void setNumber(String number) {
    	this.number=number;
    }

    /**
     * @return
     */
    public Teacher getHeadTeacher() {
        return headTeacher;
    }

    /**
     * @param headTeacher 
     * @return
     */
    public void setHeadTeacher(Teacher headTeacher) {
    	this.headTeacher=headTeacher;
    }

    /**
     * @return
     */
    public Set getStudents() {
        return students;
    }

    /**
     * @param student 
     * @return
     */
    public void setStudent(Set student) {
        this.students=student;
    }

    /**
     * @return
     */
    public Set getSubjects() {
        // TODO implement here
        return subjects;
    }

    /**
     * @param Set 
     * @return
     */
    public void setSubjects(Set<Subject> subjects) {
    	this.subjects=subjects;
    }

}