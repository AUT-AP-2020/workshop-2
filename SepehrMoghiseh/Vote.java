import java.util.Objects;

/**
 * The class Vote manages a vote.
 * @author Sepehr Moghiseh
 */
public class Vote {

    private Person person ;
    private String date ;

    /**
     * Creates a new Vote.
     *
     * @param person the person
     * @param date   the date
     */
    public Vote (Person person , String date){
        this.person = person ;
        this.date = date ;
    }

    /**
     * Sets person.
     *
     * @param person the person
     */
    public void setPerson(Person person) {
        this.person = person;
    }

    /**
     * Sets date.
     *
     * @param date the date
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * Gets person.
     *
     * @return the person
     */
    public Person getPerson() {
        return person;
    }

    /**
     * Gets date.
     *
     * @return the date
     */
    public String getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "person : " + person +
                ", date : " + date + '\'' ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Vote)) return false;
        Vote vote = (Vote) o;
        return Objects.equals(getPerson(), vote.getPerson()) &&
                Objects.equals(getDate(), vote.getDate());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPerson(), getDate());
    }
}
