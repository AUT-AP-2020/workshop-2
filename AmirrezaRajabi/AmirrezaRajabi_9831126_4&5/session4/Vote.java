import java.util.Objects;

/**
 * Vote class reresent a vote
 */
public class Vote {
    //person
    private Person voter;
    //date
    private String date;

    /**
     * create a vote
     * @param voter voter
     * @param date date
     */
    public Vote(Person voter , String date)
    {
        this.voter = voter;
        this.date = date;

    }

    /**
     * get the voter
     * @return voter
     */
    public Person getPerson() {
        return voter;
    }

    /**
     * date of vote
     * @return vote
     */
    public String getDate() {
        return date;
    }

    @Override
    public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
        Vote vote = (Vote) o;
    return Objects.equals(voter, vote.voter) && Objects.equals(date, vote.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(voter,date);
    }
}
