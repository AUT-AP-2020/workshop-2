/**
 * this class keep first name and last name of person.
 * @author Mahdi Mirfendereski
 * @version 0.0
 */
public class Person {
    private String firstName ;
    private String lastName ;
    /**
     *
     * @param firstName firstName of person
     * @param lastName lastName of person
     */
    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
