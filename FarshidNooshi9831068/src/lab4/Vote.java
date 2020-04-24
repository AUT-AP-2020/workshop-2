// In The Name Of GOD
package lab4;

import java.util.Objects;

public class Vote {
    private final Person person;
    private final String date;


    /**
     * @param person is the person who votes
     * @param date   is the date of the vote
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

    /**
     * almost copied this part from here :
     * https://www.sitepoint.com/how-to-implement-javas-hashcode-correctly/
     *
     * @return an integer representing the hash value of this vote
     */
    @Override
    public int hashCode() {
        return Objects.hash(person, date);
    }

    /**
     * checks if two objects are equal
     * @param obj is the object to be checked
     * @return true if the objects are equal
     */
    @Override
    public boolean equals(Object obj) {
        if (obj == this)
            return true;
        if (obj == null || obj.getClass() != getClass())
            return false;
        Vote tmp = (Vote) obj;
        return tmp.date.equals(date) &&
                tmp.person.equals(person);
    }

    @Override
    public String toString() {
        return person.toString() + " " + date;
    }
}
