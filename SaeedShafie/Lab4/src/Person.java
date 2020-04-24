public class Person {
    private String firstName;
    private String lastName;
    public Person(String firstName,String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getFirstName() {
        return firstName;
    }
    public String toString() {
        return String.format("Voters_Information = %s %s", firstName, lastName);
    }
}


