package com.company;

import ir.huri.jcal.JalaliCalendar;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;


public class Voting {
    private int type;
    private String question;
    private ArrayList<Person> voters;
    private HashMap<String, HashSet<Vote>> choices;

    public Voting(int type, String question) {
        this.type = type;
        this.question = question;
        voters = new ArrayList<>();
        choices = new HashMap<>();
    }

    public String getQuestion() {
        return question;
    }

    public ArrayList<Person> getVoters() {
        return voters;
    }

    public HashMap<String, HashSet<Vote>> getChoices() {
        return choices;
    }

    public void createChoice(String choice) {
        boolean checkIfExists = false;
        for (String c : choices.keySet())
            if (c.equals(choice)) {
                checkIfExists = true;
                break;
            }
        if (!checkIfExists)
            choices.put(choice, new HashSet<>());
    }

    public void vote(Person person, ArrayList<String> choices) {
        if (choices.size() > 1 && type == 0) {
            System.out.println("You cannot choose multiple choices in this voting!");
            return;
        }
        boolean isVoted=false;
        for(Person p : voters)
            if(p.equals(person))
                isVoted=true;
        if(!isVoted)
            voters.add(person);
        else{
            System.out.println("You have already submitted your vote!");
            return;
        }
        for (String choice : choices) {
            JalaliCalendar date = new JalaliCalendar();
            HashSet<Vote> votes = this.choices.get(choice);
            votes.add(new Vote(person,date.toString()));
            System.out.println(person.toString() + " voted to " + choice);
        }
    }

    public void printVotes(){
        System.out.println("Vote result: (Choice     Number of votes)");
        int index = 1;
        for(String choice : choices.keySet()){
            HashSet<Vote> votes = choices.get(choice);
            System.out.println(index + ") " + choice + " " + votes.size());
            for(Vote v : votes)
                System.out.println(v.getPerson().toString() + " " + v.getDate().toString());
            index++;
        }
    }
}
