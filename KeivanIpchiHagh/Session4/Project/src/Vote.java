/**
 * Vote Object, Contains information about each vote such as its voter and date
 *
 * @author Keivan Ipchi Hagh
 * @since 2020/4/4
 * @version 1.0.0
 */
public class Vote {

    /**
     * Voter Obj
     */
    private Person person;
    /**
     * Vote date
     */
    private String date;

    /**
     * Vote Constructor
     * @param person Voter Obj
     * @param date Vote date
     */
    public Vote(Person person, String date) {
        this.person = person;
        this.date = date;
    }

    /**
     * Getter: Get person Obj
     * @return Person Obj
     */
    public Person getPerson() {
        return person;
    }

    /**
     * Getter: Get date
     * @return Date
     */
    public String getDate() {
        return date;
    }

    /**
     * This method compares two objects by their date and voter (NOT hashCode!)
     * @override Object.equals
     * @param vote Vote Obj
     * @return Indicator of equality
     */
    public boolean equals(Vote vote) {
        return vote.date.equals(this.date) && vote.person.equals(this.person);
    }
}
