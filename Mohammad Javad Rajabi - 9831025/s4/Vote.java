import java.util.Objects;

/**
 * This class declare vote that a person can do it.
 *
 * @author Mohammad Javad Rajabi
 * @version 1.0
 * @since 2020-03-24
 */
public class Vote {

    //fields

    // object of person type
    private Person person;
    // date that person vote
    private String date;


    //constructor

    /**
     * vote  constructor, for create new object of this class.
     * @param person This is person who vote
     * @param date This is date that person vote
     */
    public Vote(Person person, String date) {
        this.person = person;
        this.date = date;
    }


    //methods

    /**
     * This method is used to be able to access person.
     * @return String This returns person.
     */
    public Person getPerson() {
        return person;
    }

    /**
     * This method is used to be able to access date of vote.
     * @return String This returns date of vote.
     */
    public String getDate() {
        return date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Vote)) return false;
        Vote vote = (Vote) o;
        return getPerson().equals(vote.getPerson()) &&
                getDate().equals(vote.getDate());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPerson(), getDate());
    }
}
