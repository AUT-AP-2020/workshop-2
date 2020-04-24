public class Person {
    private String firstName;
    private String lastName;

    /**
     * Constructor for Person
     *
     * @param firstName First name
     * @param lastName  Last name
     */
    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    /**
     * Getter for first name
     *
     * @return First name
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Getter for last name
     *
     * @return Last name
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Override toString function and print person's specific
     *
     * @return Person's specific
     */
    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
