




/**
 * This class repersent a vote in {@code Voting} class
 * 
 * @author Mohammad Mahdi Malmasi
 * @version 0.1.0
 */
public class Vote 
{
            /*  Feilds  */

    // the Voter of this vote
    private Person voter;

    //The date of the Vote
    private String date;







          /* Constructor */

    /**
     * Create a new Vote
     * 
     * @param voter : the voter
     * @param date : the date of the vote
     */
    public Vote(Person voter, String date)
    {
        this.date = date;
        this.voter = voter;
    }






            /*  Methods  */

    /**
     * @return the voter of this vote
     */
    public Person getVoter() 
    {
        return voter;
    }
    /**
     * @return the date of this vote
     */
    public String getDate() 
    {
        return date;
    }



    /**
     * @return a {@code String} of the name of the voter of this vote and the date of the this vote
     */
    @Override
    public String toString()
    {
        return "Person: " + this.voter.getFirstName() + " " + this.voter.getLastName() + ", " +
                "voted this vote on: " + date;
    }
}