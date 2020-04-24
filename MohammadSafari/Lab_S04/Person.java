package MohammadSafari.Lab_S04;

/**
 * keeping neccessary information of a person for voting
 * 
 * @author M.Safari
 * @version 1399.02.05
 */
public class Person {
    public final String firstName;
    public final String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return String.format("%s %s", firstName, lastName);
    }

    @Override
    public boolean equals(Object obj) {
        return (obj instanceof Person) ? this.toString().equals(((Person) obj).toString()) : false;
    }
}