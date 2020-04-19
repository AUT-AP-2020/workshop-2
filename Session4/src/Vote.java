import java.util.Objects;

public class Vote {
    private Person person;
    private String date;

    /**
     * Constructor for Vote
     *
     * @param person The person who voting
     * @param date   The date person voting
     */
    public Vote(Person person, String date) {
        this.person = person;
        this.date = date;
    }

    /**
     * Getter for person
     *
     * @return Person
     */
    public Person getPerson() {
        return person;
    }

    /**
     * Getter for date
     * @return Date
     */
    public String getDate() {
        return date;
    }

    /**
     * Override equals function to compare 2 votes
     * @param o The vote which compares with this vote
     * @return A boolean
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vote vote = (Vote) o;
        return Objects.equals(person, vote.person) &&
                Objects.equals(date, vote.date);
    }

    /**
     * Hashcode for Vote
     * @return a Hash
     */
    @Override
    public int hashCode() {
        return Objects.hash(person, date);
    }
}
