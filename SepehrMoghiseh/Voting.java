import ir.huri.jcal.JalaliCalendar;

import java.util.*;

/**
 * The class Voting manage a voting.
 */
public class Voting {
    private int type ;
    private String question ;
    private ArrayList<Person> voters ;
    private HashMap<String , HashSet<Vote> > listOfVotesToChoices ;

    /**
     * Creates a new Voting.
     *
     * @param type     the type
     * @param question the question
     */
    public Voting(int type , String question){
        this.type = type ;
        this.question = question ;
        voters = new ArrayList<>() ;
        listOfVotesToChoices = new HashMap<>() ;
    }

    /**
     * Gets question.
     *
     * @return the question
     */
    public String getQuestion() {
        return question;
    }

    /**
     * Gets type.
     *
     * @return the type
     */
    public int getType() {
        return type;
    }

    /**
     * Sets question.
     *
     * @param question the question
     */
    public void setQuestion(String question) {
        this.question = question;
    }

    /**
     * Sets type.
     *
     * @param type the type
     */
    public void setType(int type) {
        this.type = type;
    }

    /**
     * Create a new choice.
     *
     * @param choice the choice
     */
    public void createChoice(String choice){
        HashSet<Vote> votes = new HashSet<>() ;
        listOfVotesToChoices.put(choice , votes);
    }

    /**
     * submits a vote.
     *
     * @param voter   the voter
     * @param choices the choices
     */
    public void vote(Person voter , ArrayList<String> choices){
        if (type==1) {
            voters.add(voter);
            JalaliCalendar date = new JalaliCalendar();
            Vote vote = new Vote(voter, date.toString());
            for (String choice : choices) {
                listOfVotesToChoices.get(choice).add(vote);
            }
        }
        else {
            if (voters.contains(voter)){
                System.out.println("the voter has voted before!");
            }
            else {
                voters.add(voter);
                JalaliCalendar date = new JalaliCalendar();
                Vote vote = new Vote(voter, date.toString());
                for (String choice : choices) {
                    listOfVotesToChoices.get(choice).add(vote);
                }
            }
        }
    }

    /**
     * Get voters.
     */
    public void getVoters(){
        for (Person temp : voters){
            System.out.println(temp.toString());
        }
    }

    /**
     * Print votes.
     */
    public void printVotes(){
        int size = listOfVotesToChoices.size() ;
        ArrayList<String> choices = new ArrayList(listOfVotesToChoices.keySet()) ;
        for (String choice : choices){
            HashSet<Vote> temp = new HashSet<>() ;
            temp = listOfVotesToChoices.get(choice) ;
            System.out.println(choice + "->" + temp.size());
            for (Vote vote : temp){
                System.out.println(vote.toString());
            }
        }
    }

    /**
     * Get choices array list.
     *
     * @return the array list
     */
    public ArrayList<String> getChoices(){
        ArrayList<String> choices = new ArrayList<>(listOfVotesToChoices.keySet()) ;
        return choices ;
    }
}
