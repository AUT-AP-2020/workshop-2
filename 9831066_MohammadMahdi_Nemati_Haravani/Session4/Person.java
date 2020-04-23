public class Person {

    private String firstName;
    private String lastName;

    /**
     * the class of person contains the information of a voter
     * it keeps the voter name and last name and some method to
     * access them
     */
    public Person (String firstName,String lastName){

        this.firstName = firstName;
        this.lastName = lastName;

    }

    /**
     * the getter method for last name of voter
     * @return the last name
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * the getter method for first name of voter
     * @return the first name
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * an override of toString method for voter
     * information
     * @return a single string as voter information
     */
    @Override
    public String toString() {
        return "Person : " + "First Name = " + getFirstName() + " , Last Name = " + getLastName();
    }

}
