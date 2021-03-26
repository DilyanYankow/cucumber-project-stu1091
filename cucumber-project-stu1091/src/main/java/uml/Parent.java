package uml;
import java.util.*;

/**
 * 
 */
public class Parent extends User {

    /**
     * Default constructor
     */
    public Parent() {
    }

    private String studentSchoolNum;
    private Student student;

    /**
     * @return
     */
    public String getStudentSchoolNumber() {
        return studentSchoolNum;
    }

    /**
     * @param studentSchoolNumber 
     * @return
     */
    public void setStudentSchoolNumber(String studentSchoolNumber) {
    	this.studentSchoolNum=studentSchoolNumber;
    }

}