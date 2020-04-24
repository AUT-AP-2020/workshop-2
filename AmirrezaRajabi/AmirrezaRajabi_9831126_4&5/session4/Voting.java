import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import ir.huri.jcal.JalaliCalendar;

/**
 * Voting class represent a Voting
 */
public class Voting {
    //type of voting 0: single vote   , 1: multi votes
    private int type;
    //question voting
    private String question;
    //voters
    private ArrayList<Person> voters;
    //list of vote to choices
    private HashMap<String, HashSet<Vote>> listOfVotesToChoices;

    /**
     * create a voting
     * @param type type of voting
     * @param question question of voting
     */
    public Voting(int type , String question)
    {
        this.type = type;
        this.question = question;
        this.listOfVotesToChoices = new HashMap<>();
        this.voters = new ArrayList<>();
    }

    /**
     * get a question of voting
     * @return question
     */
    public String getQuestion() {
        return question;
    }

    /**
     * create a choices
     * @param choice
     */
    public void createChoice(String choice){
        listOfVotesToChoices.put(choice,new HashSet<Vote>());
    }

    /**
     * do a vote
     * @param voter voter
     * @param choices choices
     */
    public void vote(Person voter,ArrayList<String> choices){
        voters.add(voter);
        if(type==0){
            JalaliCalendar date = new JalaliCalendar();
            Vote vote = new Vote(voter,date.toString());
            listOfVotesToChoices.get(choices.get(0)).add(vote);
        }
        if (type == 1){
            for(String choice:choices){
                JalaliCalendar date = new JalaliCalendar();
                Vote vote = new Vote(voter,date.toString());
                listOfVotesToChoices.get(choice).add(vote);
            }
        }
    }

    /**
     * get voters of voting
     * @return
     */
    public ArrayList<Person> getVoters() {
        return voters;
    }

    /**
     * get choices of voting
     * @return
     */
    public ArrayList<String> getChoices(){
        ArrayList<String> choices = new ArrayList<>();
        for(String key:listOfVotesToChoices.keySet())
        {
            choices.add(key);
        }
        return choices;
    }

    /**
     * voting result
     */
    public void printVotes()
    {
        for(String key:listOfVotesToChoices.keySet()){

            System.out.println(key + ": " + listOfVotesToChoices.get(key).size() + " votes ");
        }
    }
}
