package MohammadSafari.Lab_S04;

/**
 * shows each vote that is specified for each person
 * 
 * @author M.Safari
 * @version 1399.02.05
 */
public class Vote {
    public final Person voter;
    public final String date;
    private static int code = 15;

    public Vote(Person voter, String date) {
        code++;
        this.voter = voter;
        this.date = date;
    }

    /**
     * @return the voter
     */
    public Person getVoter() {
        return voter;
    }

    /**
     * @return the date
     */
    public String getDate() {
        return date;
    }

    @Override
    public boolean equals(Object obj) {
        return (obj instanceof Vote) ? this.equals((Vote) obj) : false;
    }

    @Override
    public int hashCode() {
        return code;
    }
}