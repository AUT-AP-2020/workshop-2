import java.util.Objects;

/**
 * The Person class holds first name and last name of a person.
 *
 * @author Amirreza Hashemi
 * @version 1.0
 * @since 4/19/2020
 */
public class Person {
    private String fistName;
    private String lastName;

    /**
     * Instantiates a new Person.
     *
     * @param fistName the fist name
     * @param lastName the last name
     */
    public Person(String fistName, String lastName) {
        this.fistName = fistName;
        this.lastName = lastName;
    }

    /**
     * Gets fist name.
     *
     * @return the fist name
     */
    public String getFistName() {
        return fistName;
    }

    /**
     * Sets fist name.
     *
     * @param fistName the fist name
     */
    public void setFistName(String fistName) {
        this.fistName = fistName;
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
        return fistName + ' ' + lastName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return fistName.equals(person.fistName) &&
                lastName.equals(person.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fistName, lastName);
    }
}
