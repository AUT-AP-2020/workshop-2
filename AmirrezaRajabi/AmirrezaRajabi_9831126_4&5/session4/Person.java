/**
 * Person class represent a person
 */
public class Person
{
    //first name
    private String firstName;
    //last name
    private String lastName;

    /**
     * create a new person
     * @param fName first name
     * @param lName last name
     */
    public Person(String fName , String lName)
    {
        this.firstName = fName;
        this.lastName = lName;
    }

    /**
     * get first name of person
     * @return first name
     */
    public String getFirstName()
    {
        return firstName;
    }

    /**
     * get last name of person
     * @return last name
     */
    public String getLastName()
    {
        return lastName;
    }

    /**
     * person to string
     * @return name
     */
    public String toString()
    {
        String name =this.firstName + " " + this.lastName;
        return name;
    }
}
