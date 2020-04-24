import java.util.Objects;

/**
 * This class declare a person who can vote
 *
 * @author Mohammad Javad Rajabi
 * @version 1.0
 * @since 2020-03-24
 */
public class Person {

    //fields

    // first name of person who vote
    private String firstName;
    // last name of person who vote
    private String lastName;


    //constructor

    /**
     * person  constructor, for create new object of this class.
     * @param firstName This is first name of person who vote
     * @param lastName This is last name of person who vote
     */
    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }


    //methods

    /**
     * This method is used to be able to access first name.
     * @return String This returns first name of this person.
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * This method is used to be able to access last name.
     * @return String This returns last name of this person.
     */
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return getFirstName().equals(person.getFirstName()) &&
                getLastName().equals(person.getLastName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFirstName(), getLastName());
    }
}
