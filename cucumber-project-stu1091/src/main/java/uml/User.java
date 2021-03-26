package uml;
import java.util.*;

/**
 * 
 */
public class User {

    /**
     * Default constructor
     */
    public User() {
    }

    private String username;
    private String password;
    private String email;
    private String firstName;
    private String lastName;
    private String schoolNumber;

    /**
     * @return
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username 
     * @return
     */
    public void setUsername(String username) {
        this.username=username;
    }

    /**
     * @return
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password 
     * @return
     */
    public void setPassword(String password) {
    	this.password=password;
    }

    /**
     * @return
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email 
     * @return
     */
    public void setEmail(String email) {
        this.email=email;
    }

    /**
     * @return
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstname 
     * @return
     */
    public void setFirstName(String firstName) {
        this.firstName=firstName;
    }

    /**
     * @return
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName 
     * @return
     */
    public void SetLastName(String lastName) {
    	this.lastName=lastName;
    }

    /**
     * @param String username 
     * @return
     */
    public String getSchoolNumber(String username) {
        return schoolNumber;
    }

    /**
     * @param String 
     * @return
     */
    public void setSchoolNumber(String schoolnumber) {
    	this.schoolNumber=schoolNumber;
    }

}