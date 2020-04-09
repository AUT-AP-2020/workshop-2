/**
 * Person Object, contains information about each individual
 *
 * @author Keivan Ipchi Hagh
 * @since 2020/4/4
 * @version 1.0.0
 */
public class Person {
    /**
     * Person's first name
     */
    private String firstName;
    /**
     * Person's last name
     */
    private String lastName;

    /**
     * Person Constructor
     * @param firstName Person's first name
     * @param lastName Person's last name
     */
    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    /**
     * Getter: Get first name
     * @return first name
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Getter: Get last name
     * @return last name
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Returns Person's full name
     * @override Object.toString()
     * @return Full name
     */
    public String toString() {
        return firstName + " " + lastName;
    }
}
