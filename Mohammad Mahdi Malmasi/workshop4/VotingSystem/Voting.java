import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import ir.huri.jcal.JalaliCalendar;



/**
 * This class repersent a Voting in {@code VotingSystem}
 *
 * @author Mohammad Mahdi Malmasi
 * @version 0.1.0
 */
public class Voting 
{
            /*  Feilds  */

    // the number of the voters possible choose
    private int type;

    // the question of the voting
    private String question;

    // the voters of the this voting
    private ArrayList<Person> voters;

    // the possible choices
    private HashMap<String, HashSet<Vote>> polls;








          /* Constructor */

    /**
     * Create a new voting with given type and question
     *
     * @param type : the number of choices the voter can choose
     * @param question : the question of the voting
     */
    public Voting(int type, String question)
    {
        this.type = type;
        this.question = question;

        voters = new ArrayList<>();
        polls = new HashMap<>();
    }








    
            /*  Mehtods  */
    
    /**
     * @return the question of the voting
     */
    public String getQuestion() 
    {
        return question;
    }
    /**
     * @return the type
     */
    public int getType() 
    {
        return type;
    }
    /**
     * This method show the voters name in standard output(Terminal)
     */
    public void getVoters()
    {
        for(Person voter : voters)
            System.out.println(voter.toString());
    }
    /**
     * @return the choices
     */
    public ArrayList<String> getChoices()
    {
        ArrayList<String> choices = new ArrayList<>();

        for(String choice : polls.keySet()) 
        {
            choices.add(choice);
        }

        return choices;
    }







    /**
     * Create a new choice
     * 
     * @param choice : the new choice to add
     */
    public void createChoice(String choice)
    {
        polls.put(choice, new HashSet<Vote>());
    }
    
    
    /**
     * This method add the person vote
     * 
     * @param voter :  the voter person
     * @param voterVotes :  the voter votes
     */
    public void vote(Person voter, ArrayList<String> voterVotes)
    {
        // check if player have voted befor
        for(Person person : voters)
        {
            if(person.equals(voter))
            {
                System.out.println("You have voted before !");
                return;
            }
        }

        // check the number of the voter votes
        if (voterVotes.size() > type)
        {
            System.out.println("Your chooses are more than the type of this voting!");
            return;
        }

        // add voter to the voters list
        this.voters.add(voter);


        // add voter votes
        Vote voterVote;
        for(String vote : voterVotes)
        {
            for(String choice : polls.keySet())
            {
                if(choice.equals(vote))
                {
                    // set the date of the vote
                    JalaliCalendar voteDay = new JalaliCalendar(new GregorianCalendar());
                    String voteDate = String.valueOf(voteDay);

                    // create the voter vote
                    voterVote = new Vote(voter, voteDate);

                    // add voter vote
                    polls.get(choice).add(voterVote);

                    break;
                }
            }
        }
    }


    /**
     * This method show the votes in standard output(Terminal)
     */
    public void printVotes()
    {
        System.out.println("\n\t\t~~~~~~~~~~~~~~~~~~~~~~\n");


        // show the question of the voting
        System.out.println(this.question);

        // show the chioces and its votes
        for(String choice : polls.keySet())
        { 
            // show the choice
            System.out.println("  " + choice + ": ");

            // show the this choice votes
            for(Vote vote : polls.get(choice))
                System.out.println("  \t" + vote.toString());
        }


        System.out.println("\n\t\t~~~~~~~~~~~~~~~~~~~~~~\n");
    }
 }