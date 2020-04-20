import java.util.Objects;

/**
 * The Vote class implants a vote and contains the person who voted and the date of the vote.
 *
 * @author Amirreza Hashemi
 * @version 1.0
 * @since 4/19/2020
 */
public class Vote {
    private Person person;
    private String date;

    /**
     * Instantiates a new Vote.
     *
     * @param person the person
     * @param date   the date
     */
    public Vote(Person person, String date) {
        this.person = person;
        this.date = date;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vote vote = (Vote) o;
        return person.equals(vote.person) &&
                date.equals(vote.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(person, date);
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
}
