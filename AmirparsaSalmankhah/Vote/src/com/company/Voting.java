package com.company;

import ir.huri.jcal.JalaliCalendar;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/**
 * Represents a voting.
 * @author Amirparsa Salmankhah
 * @version 1.0.0
 */
public class Voting {
    //type of the voting
    private int type;
    //question of the voting
    private String question;
    //list of voters
    private ArrayList<Person> voters;
    //choices of the voting
    private HashMap<String, HashSet<Vote>> choices;

    /**
     * Constructor with 2 parameters.
     * @param type Type of the voting
     * @param question Question of the voting
     */
    public Voting(int type, String question) {
        this.type = type;
        this.question = question;
        voters = new ArrayList<>();
        choices = new HashMap<>();
    }

    /**
     * Gets question of the voting.
     * @return Question of the voting
     */
    public String getQuestion() {
        return question;
    }

    /**
     * Gets list of voters.
     * @return List of voters
     */
    public ArrayList<Person> getVoters() {
        return voters;
    }

    /**
     * Gets choices of the voting.
     * @return Hash map of choises
     */
    public HashMap<String, HashSet<Vote>> getChoices() {
        return choices;
    }

    /**
     * Creates a choice
     * @param choice choice name
     */
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

    /**
     * votes from a person to some choices
     * @param person Person
     * @param choices List of choices
     */
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

    /**
     * Prints votes
     */
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
