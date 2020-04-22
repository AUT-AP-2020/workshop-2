package vote;

import java.util.HashSet;

public class Person {
    String firstName ;
    String lastName ;
    HashSet<Vote> vote;
    public Person(String firstName , String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        vote = new HashSet<>();
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
