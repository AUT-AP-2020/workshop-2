/**
 * Vote
 */
public class Vote {

    private Person person;
    private String date;

    public Vote(Person person, String date) {
        this.person = person;
        this.date = date;
    }

    /**
     * @return the person
     */
    public Person getPerson() {
        return person;
    }

    /**
     * @return the date
     */
    public String getDate() {
        return date;
    }

    @Override
    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return person.toString();
    }
}