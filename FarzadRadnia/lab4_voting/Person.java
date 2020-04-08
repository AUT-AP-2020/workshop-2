import java.util.Objects;

/**
 * an object that contains som info about a person. this class is commonly used as an element of Vote class.
 */
public class Person {
    private String firstName ;
    private String lastName ;


    /**
     * simple constructor.
     * @param firstName first name of person
     * @param lastName last name of person
     */
    public Person (String firstName, String lastName)
    {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    /**
     * make string by first name and last name of person
     * @return string of person name.
     */
    public String toSting ()
    {
        return  firstName + " " + lastName;
    }

    /**
     * get first name of person
     * @return first name
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * get last name of person
     * @return last name
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * check equality depend on first name and last name.
     * @param o object to be checked
     * @return true if are same else false.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return Objects.equals(getFirstName(), person.getFirstName()) &&
                Objects.equals(getLastName(), person.getLastName());
    }

    /**
     * make hash code depends on first name and last name
     * @return hash code.
     */
    @Override
    public int hashCode() {
        return Objects.hash(getFirstName(), getLastName());
    }
}
