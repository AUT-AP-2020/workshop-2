import java.util.*;

/**
 * This class save fields relative to every voter
 * @author Mohamad Hasannejadi
 * @version 1.0
 */

public class Person{

    private String firstName , lastName;
    
    /**
     * assign firstname and lastname for first time
     * @param fName
     * @param lName
     */
    public Person(String fName, String lName){
        firstName = fName;
        lastName = lName;
    }

    /**
    * getter of firstname 
    * @return the firstName
    */
    public String getFirstName() {
        return firstName;
    }

    /**
     * gettre of lastname
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }
    
    /**
     * overrides equals to check equality of two person
     * @param obj one person
     * @return if equals true
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj){
            return true;
        } 
        if (obj == null || getClass() != obj.getClass()){
            return false;
        } 
        Person p = (Person) obj;
        return Objects.equals(firstName, p.firstName) && Objects.equals(lastName, p.lastName);
    }
    /**
     * override of tostring method
     * information
     * @return a single string as voter information
     */
    @Override
    public String toString() {
        return ("name of person " + getFirstName() + getLastName());
    }
    
    /**
     * hashCode method
     * @return hashtable number for object
     */
    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName);
    }
}