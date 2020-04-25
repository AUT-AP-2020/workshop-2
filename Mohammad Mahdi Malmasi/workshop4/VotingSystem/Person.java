

/**
 * This class repersent a Person. 
 * It holds the name of the Person
 * 
 * @author Mohammad Mahdi Malmasi
 * @version 0.1.0
 */
public class Person 
{
            /*  Feilds  */

    //the first name of the person
    private String firstName;

    //the last name of the person
    private String lastName;







          /* Constructor */

    /**
     * Create a new Person with given name
     * 
     * @param firstName : the first name of the person
     * @param lastName : the last name of the person
     */
    public Person(String firstName, String lastName)
    {
        this.firstName = firstName;
        this.lastName = lastName;
    }






            /*  Methods  */

    /**
     * @return the last name of the person
     */
    public String getLastName() 
    {
        return lastName;
    }
    /**
     * @return the first name of the perosn
     */
    public String getFirstName() 
    {
        return firstName;
    }


    /**
     * @return a {@code String} of the player feilds
     */
    @Override
    public String toString() 
    {
        return "First Name: " + this.firstName + " , Last Name: " + this.lastName;
    }
}