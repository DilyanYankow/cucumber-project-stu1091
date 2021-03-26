package uml;
import java.util.*;

/**
 * 
 */
public class Student extends User {

    /**
     * Default constructor
     */
    public Student() {
    }

    private SchoolClass schoolClass;

    /**
     * @return
     */
    public SchoolClass getSchoolClass() {
        return schoolClass;
    }

    /**
     * @param schoolClass 
     * @return
     */
    public void setSchoolClass(SchoolClass schoolClass) {
    	this.schoolClass=schoolClass;
    }

}