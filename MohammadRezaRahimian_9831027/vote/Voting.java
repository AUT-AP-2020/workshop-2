package vote;

import ir.huri.jcal.JalaliCalendar;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Voting {
    int type;
    String questions;
    ArrayList<Person> voters;
    ArrayList<String> choices ;
    HashMap<String, HashSet<Vote>> polls;
    public Voting(int type , String questions){
        this.type = type;
        this.questions = questions;
        choices = new ArrayList<String>();
        voters = new ArrayList<Person>();
        polls = new HashMap<>();

    }
    public String getQuestions(){
        return questions;
    }
    public void createPolls(String poll){
        choices.add(poll);
    }
    public void vote(Person person , ArrayList<String> votes){
        voters.add(person);
        JalaliCalendar j = new JalaliCalendar();
        Vote vote = new Vote(person,j.toString());
        for (int i = 0; i < votes.size() ; i++) {
            if (polls.containsKey(votes.get(i))) {
                polls.get(votes.get(i)).add(vote);
            }
            else {
                System.out.println("Wrong Poll");
            }
        }
    }
    public void getVoters(){

    }
    public void printVotes(){
        System.out.println(questions);
        for (int i = 0; i < choices.size(); i++) {
            System.out.println((i+1) + ") " + choices.get(i));
        }
    }

}
