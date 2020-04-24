import ir.huri.jcal.JalaliCalendar;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Voting {
    int type;
    String questions;
    ArrayList<Person> voters;
    ArrayList<String> options ;
    HashMap<String, HashSet<Vote>> polls;
    public Voting(int type , String questions){
        this.type = type;
        this.questions = questions;
        options = new ArrayList<String>();
        voters = new ArrayList<Person>();
        polls = new HashMap<>();

    }
    public String getQuestions(){
        return questions;
    }
    public void createPolls(String poll){
        options.add(poll);
    }
    public void vote(Person person , ArrayList<String> votes){
        voters.add(person);
        if(type==0){
            JalaliCalendar calendar=new JalaliCalendar();
            Vote vote=new Vote(person,calendar.toString());
            polls.get(options.get(0)).add(vote);
        }else{
            for(String choice:options){
                JalaliCalendar calendar=new JalaliCalendar();
                Vote vote=new Vote(person,calendar.toString());
                polls.get(choice).add(vote);
            }
        }
    }
    public void getVoters() {
        for(Person voter:voters){
            System.out.println(voter);
        }
    }
    public void printVotes(){
        System.out.println(questions);
        for (int i = 0; i < options.size(); i++) {
            System.out.println((i+1) + ") " + options.get(i));
        }
    }
    public ArrayList<String> getPolls(){
        ArrayList<String> options=new ArrayList<>();
        for(String key:polls.keySet()){
            options.add(key);
        }
        return options;
    }
}