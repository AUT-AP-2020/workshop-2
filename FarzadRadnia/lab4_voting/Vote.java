import ir.huri.jcal.JalaliCalendar;
import java.util.Objects;

/**
 * define a vote that is made by a person and date . it's made to have person and date together.
 */
public class Vote {
    Person person;
    String date;

    /**
     * make a vote by this person and  date is made by current day in jalaliCalender.
     * @param person person that votes.
     */
    public Vote (Person person)
    {
        this.person = person;
        date = new JalaliCalendar().toString();
    }

    /**
     * make a vote by this person and this time.
     * @param person person that votes.
     * @param date date of voting .
     */
    public Vote(Person person, String date)
    {
        this.date = date;
        this.person = person;
    }

    /**
     * get the person how votes .
     * @return voter of this vote.
     */
    public Person getPerson() {
        return person;
    }

    /**
     * get date of this vote.
     * @return date of vote.
     */
    public String getDate() {
        return date;
    }


    /**
     * check equality depends on date and person.
     * @param o object to be checked.
     * @return true if are same else false.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Vote)) return false;
        Vote vote = (Vote) o;
        return getPerson().equals(vote.getPerson()) &&
                getDate().equals(vote.getDate());
    }

    /**
     * make hash code depends on person and date.
     * @return
     */
    @Override
    public int hashCode() {
        return Objects.hash(getPerson(), getDate());
    }
}
