package uml;
import java.util.*;

/**
 * 
 */
public class Teacher extends User {

    /**
     * Default constructor
     */
    public Teacher() {
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

    /**
     * @param SchoolNumber 
     * @return
     */
//    public Set getGrades(String SchoolNumber) {
//        return SchoolNumber;
//    }

    /**
     * @param schoolClass 
     * @return
     */
    public void addSchoolClass(SchoolClass schoolClass) {
        this.schoolClass=schoolClass;
    }

    /**
     * @param student 
     * @param subject 
     * @param grade 
     * @return
     */
    public void addGrade(Student student, Subject subject, int grade) {
        // TODO implement here
    }

}