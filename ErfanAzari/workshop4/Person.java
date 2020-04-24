/**
 * This class designed to create new persons who wants to participate in voting.
 *
 */

import java.util.Objects;

public class Person {
    //The person first name
    private String firstName;
    //The person last name
    private String lastName;

    /**
     * The class constructor which create a new person based on his/her first name and last name.
     * @param fName the first name of the person.
     * @param lName the last name of the person
     */
    public Person(String fName, String lName){
        this.firstName = fName;
        this.lastName = lName;
    }

    /**
     * This method would get the person first name.
     * @return  firstName field
     */
    public String getFirstName(){ return this.firstName; }

    /**
     * This method would return the person last name.
     * @return lastName field
     */
    public String getLastName(){ return this.lastName; }

    @Override
    public String toString() {
        return " -FirstName: " + firstName +
                "   , lastName: " + lastName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return this.getFirstName().equals(((Person) o).getFirstName()) && this.getLastName().equals(((Person) o).getLastName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName);
    }
}
