import java.util.Objects;

/**
 * this class represent a vote that include person and data information .
 * @author Mahdi Mirfendereski
 * @version 0.0
 */
public class Vote {
    private Person person ;
    private  String date ;

    /**
     *
     * @param person who wants voting
     * @param date the date of voting
     */
    public Vote(Person person, String date) {
        this.person = person;
        this.date = date;
    }
    public Person getPerson() {
        return person;
    }

    public String getDate() {
        return date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Vote)) return false;
        Vote vote = (Vote) o;
        return Objects.equals(person, vote.person);
    }

    @Override
    public int hashCode() {
        return Objects.hash(person);
    }
}
