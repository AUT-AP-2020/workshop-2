import java.util.Objects;

/**
 * @author Sina
 *
 */
public class Person {
   private String name ;
   private String lastName;
    public Person(String name ,String lastName)
    {
        this.name=name;
        this.lastName=lastName;
    }

    /**
     *
     * @param name will be the name of the person .
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return its the name of our person .
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @return its the lastname of the person .
     */
    public String getLastName() {
        return lastName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return getName().equals(person.getName()) &&
                getLastName().equals(person.getLastName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getLastName());
    }

    /**
     *
     * @param lastName it will be the last name .
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
