import java.util.Objects;

/**
 * The class Person represents a voter.
 * @author Sepehr Moghiseh
 */
public class Person {

    //the first name of the person
    private String firstName ;
    //the last name of the person
    private String lastName ;

    /**
     * Creates a new Person.
     *
     * @param firstName the first name
     * @param lastName  the last name
     */
    public Person(String firstName , String lastName) {
        this.firstName = firstName ;
        this.lastName = lastName ;
    }

    /**
     * Sets first name.
     *
     * @param firstName the first name
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Sets last name.
     *
     * @param lastName the last name
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Gets first name.
     *
     * @return the first name
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Gets last name.
     *
     * @return the last name
     */
    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' ;
    }


}
