/**
 * This class designed to do the voting action.
 *
 */

import java.util.Objects;

public class Vote {
    //The person who wants to vote
    private Person person;
    //The date of voting
    private String date;

    /**
     * The constructor of the class which create a new vote for a person
     * @param person    the person who wants to vote
     * @param date  the date of voting
     */
    public Vote(Person person, String date) {
        this.person = person;
        this.date = date;
    }

    /**
     * This method would return the person of the following vote
     * @return  person field.
     */
    public Person getPerson() {
        return this.person;
    }

    /**
     * This method would return the date of the voting
     * @return  date field
     */
    public String getDate() {
        return this.date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vote vote = (Vote) o;
        return Objects.equals(person, vote.person) &&
                Objects.equals(date, vote.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(person, date);
    }

    @Override
    public String toString() {
        return person +
                "   , Date of participation : " + date ;
    }
}
