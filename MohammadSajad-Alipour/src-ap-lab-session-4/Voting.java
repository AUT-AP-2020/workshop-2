import ir.huri.jcal.JalaliCalendar;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/**
 * This is a class for voting's purposes and details and functions
 */
public class Voting {
    //if type==0 --> one vote mode
    //if type==1 --> multiple vote mode
    private int type;
    private String question;
    private ArrayList<Person> voters=new ArrayList<>();
    private HashMap<String, HashSet<Vote>> listOfVotesToChoices=new HashMap<>();

    public Voting(int type,String question){
        this.type=type;
        this.question=question;
    }

    public String getQuestion() {
        return question;
    }

    /**
     * This is a method to add a choice
     * @param choice
     */
    public void createChoice(String choice){
        listOfVotesToChoices.put(choice,new HashSet<Vote>());
    }

    /**
     * This is a method for submitting a vote
     * @param person
     * @param choices
     */
    public void vote(Person person,ArrayList<String> choices){
        voters.add(person);
        if(type==0){
            JalaliCalendar calendar=new JalaliCalendar();
            Vote vote=new Vote(person,calendar.toString());
            listOfVotesToChoices.get(choices.get(0)).add(vote);
        }else{
            for(String choice:choices){
                JalaliCalendar calendar=new JalaliCalendar();
                Vote vote=new Vote(person,calendar.toString());
                listOfVotesToChoices.get(choice).add(vote);
            }
        }
    }

    public void getVoters() {
        for(Person voter:voters){
            System.out.println(voter);
        }
    }

    /**
     * This is a method to show the result of voting
     */
    public void printVotes(){
        int maximum=0;
        String choiceMax=null;
        for(String key:listOfVotesToChoices.keySet()){
            if(listOfVotesToChoices.get(key).size()>=maximum){
                choiceMax=key;
                maximum=listOfVotesToChoices.get(key).size();
            }
            System.out.println(key+" : "+listOfVotesToChoices.get(key).size()+" votes ");
        }
        System.out.println("the most voted choice is : ");
        System.out.println(choiceMax);
    }

    public ArrayList<String> getChoices(){
        ArrayList<String> choices=new ArrayList<>();
        for(String key:listOfVotesToChoices.keySet()){
            choices.add(key);
        }
        return choices;
    }
}
