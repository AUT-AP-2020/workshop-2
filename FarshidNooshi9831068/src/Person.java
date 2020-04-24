// In The Name Of GOD

public class Person {
    private final String firstName, lastName;

    /**
     *
     * @param firstName is the first name of person(voter)
     * @param lastName is the last name of person(voter)
     */
    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }
    @Override
    public String toString() {
        return firstName + " " + lastName;
    }

    /**
     *  checks if two objects of person type are equal
     * @param obj is the object to check
     * @return true if they're equal
     */
    @Override
    public boolean equals(Object obj) {
        if (obj == this)
            return true;
        if (obj == null || obj.getClass() != getClass())
            return false;
        Person tmp = (Person) obj;
        return tmp.getLastName().equals(lastName) &&
                tmp.getFirstName().equals(firstName);
    }
}
