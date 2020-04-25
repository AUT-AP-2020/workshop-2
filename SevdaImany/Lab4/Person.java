/**
 * This class represent a person
 * it holds the full name of a person
 * 
 * @author sevda imany
 * @version 0.0
 */
public class Person {
    //the name of a persom
   private String  firstName;
   //the last name of a person
   private String  lastName;

   /**
    * creat a new person with given name
    */
    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    
    /** 
     * get person's first name
     * @return 
     */
    public String getFirstName() {
        return firstName;
    }

   
    
    /** 
     * get person's last name
     * @return 
     */
    public String getLastName() {
        return lastName;
    }

    
    /** 
     * @return a String of a person feilds
     */
    @Override
    public String toString() {
        return "Person [firstName=" + firstName + ", lastName=" + lastName + "]";
    }

   
}