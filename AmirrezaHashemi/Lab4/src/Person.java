import java.util.Objects;

public class Person {
    private String fistName;
    private String lastName;

    public Person(String fistName, String lastName) {
        this.fistName = fistName;
        this.lastName = lastName;
    }

    public String getFistName() {
        return fistName;
    }

    public void setFistName(String fistName) {
        this.fistName = fistName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return fistName + ' ' + lastName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return fistName.equals(person.fistName) &&
                lastName.equals(person.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fistName, lastName);
    }
}
