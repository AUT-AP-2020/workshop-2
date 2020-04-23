
import ir.huri.jcal.JalaliCalendar;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;


/**
 * this class includes type of voting ,question of voting ,voters and list Of Votes To Choices.
 * @author Mahdi Mirfendereski
 * @version 0.0
 */
public class Voting {
    private int type;
    private String question ;
    private ArrayList<Person> voters ;
    private HashMap<String, HashSet<Vote>> listOfVotesToChoices;

    /**
     *
     * @param type type of voting
     * @param question topic og voting
     */
    public Voting(int type, String question) {
        this.type = type;
        this.question = question;
        voters=new ArrayList<>();
        listOfVotesToChoices=new HashMap<>();
    }

    public int getType() {
        return type;
    }

    public String getQuestion() {
        return question;
    }

    /**
     * adding a new choice to options
     * @param choice new option
     */
    public void createChoice(String choice) {
        listOfVotesToChoices.put(choice,new HashSet<>());

    }
    public ArrayList<String> getChoices() {
        return new ArrayList<>(listOfVotesToChoices.keySet());
    }

    /**
     * record a vote for voter.
     * @param voter who wants to vote
     * @param choices choices that were decided by voter.
     */
    public void vote(Person voter,ArrayList<String> choices){
        //check if he is legal
        if(!voters.contains(voter)){
            voters.add(voter);
            for (String s:choices)
                listOfVotesToChoices.get(s).add(new Vote(voter,new JalaliCalendar().toString()));
        }
    }

    /**
     * print list of voters
     */
    public void getVoters(){
        for (Person p:voters)
            System.out.println(p);
    }

    /**
     * print result of voting
     */
    public void printVotes(){
        int max=0;
        System.out.println(question);
        ArrayList<String> choices=getChoices();
        for (String s:choices)
            if(listOfVotesToChoices.get(s).size()>max)
                max=listOfVotesToChoices.get(s).size();
        //if we have more than 1 choices that were decided
        for (String s1:choices)
            if(listOfVotesToChoices.get(s1).size()==max)
                System.out.print(s1+":"+max+" | ");
        System.out.println();
    }
}
