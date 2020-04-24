import ir.huri.jcal.JalaliCalendar;

import java.util.Objects;

/**
 * The type Vote.
 */
public class Vote {
    private Person person;
    private JalaliCalendar date;

    /**
     * Instantiates a new Vote.
     *
     * @param p the p
     * @param d the d
     */
    Vote(Person p, JalaliCalendar d) {
        person = p;
        date = d;
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
    public JalaliCalendar getDate() {
        return date;
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
}
