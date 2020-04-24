/**
 * This class designed to manage the voting and add voters.
 *
 * @author: erfan
 * @version: 1.0
 */

import ir.huri.jcal.JalaliCalendar;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Voting {
    //The type of voting
    private int type;
    //The question of the voting
    private String question;
    //The list of voters
    private ArrayList<Person> voters;
    //The map which holds the options and voters to each option
    private HashMap<String, HashSet<Vote>> choices;

    /**
     * The constructor create a new voting
     * @param type determines the type if voting
     * @param question the question of the voting
     */
    public Voting(int type, String question){
        this.type = type;
        this.question = question;
        voters = new ArrayList<>();
        choices = new HashMap<>();
    }

    /**
     * This method get the question of the voting
     * @return the question field.
     */
    public String getQuestion(){ return this.question; }

    /**
     * This method would create a map of options and their voters.
     * @param newChoice the new option for the current voting
     */
    public void createChoice(String newChoice){
        HashSet<Vote> vote = new HashSet<>();
        choices.put(newChoice, vote);
    }

    /**
     * This method would make a person to vote to a voting
     * @param personToVote the person who wants to vote
     * @param chosenChoices the choices which the person choose to vote.
     */
    public void vote(Person personToVote, ArrayList<String> chosenChoices){
        for ( Person person : voters ){
            if (person.equals(personToVote)){
                System.out.println("This person participated in this voting before!");
                return;
            }
        }
        JalaliCalendar D = new JalaliCalendar();
        Vote newVote = new Vote(personToVote, D.toString());
        voters.add(personToVote);
        for (String C : chosenChoices){
            choices.get(C).add(newVote);
        }
    }

    /**
     * This method would print the list of voters to the following voting
     */
    public void getVoters(){
        System.out.println("The list of voters: ");
        for ( Person person : voters){
            System.out.println(" -" + person.toString());
        }
    }

    /**
     * This method would print the voting result so far and the options and voters for each option
     */
    public void printVotes(){
        ArrayList<String> listOfChoices = new ArrayList(choices.keySet()) ;
        HashSet<Vote> counter = new HashSet<>() ;
        for (String S : listOfChoices){
            counter = choices.get(S) ;
            System.out.println(S + ": " + counter.size());
            System.out.println("List of voters: ");
            for (Vote vote : counter){
                System.out.println(vote.toString());
            }
        }
    }

    /**
     * This method would return the list f choices.
     * @return list of choices.
     */
    public ArrayList<String> getChoice(){
        ArrayList<String> listOfChoices = new ArrayList<>(choices.keySet());
        return listOfChoices;
    }
}
