/**
 * The type Person.
 */
public class Person {
    private String firstName;
    private String lastName;

    /**
     * Instantiates a new Person.
     *
     * @param fn the fn
     * @param ln the ln
     */
    public Person(String fn, String ln) {
        firstName = fn;
        lastName = ln;
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
        return "firstName= " + firstName + " " +
                ", lastName= " + lastName;
    }
}
