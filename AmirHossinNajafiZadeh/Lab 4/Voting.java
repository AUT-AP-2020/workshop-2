package com.myPack;

import ir.huri.jcal.JalaliCalendar;

import java.util.*;

/**
 * this class will build a voting with options and
 * the people can vote here based on some conditions
 */
public class Voting {
    //The type of voting ( 1 == multi vote & 0 == single vote )
    private int type;
    //The voting topic
    private String question;
    //The list of the voters who vote
    private ArrayList<Person> voters;
    //The list of the choices and their votes
    private HashMap<String, HashSet<Vote>> listOfVotesToChoices;

    /**
     * the main constructor of the voting class
     * @param type the type of voting
     * @param question the topic of voting
     */
    public Voting(int type, String question){
        this.type = type;
        this.question = question;
        voters = new ArrayList<Person>();
        listOfVotesToChoices = new HashMap<String, HashSet<Vote>>();
    }

    /**
     * a simple getter method for getting the voting subject
     * @return the question of the voting
     */
    public String getQuestion() {
        return question;
    }

    /**
     * simply adds a new choice to our voting
     * @param nameInput the name of the new choice
     */
    public void createChoice(String nameInput){
        listOfVotesToChoices.put(nameInput, new HashSet<Vote>());
    }

    /**
     * a simple method for getting the type of the voting
     * @return the type
     */
    public int getType() {
        return type;
    }

    /**
     * this method will get a person and its votes and
     * then will add them to our choices
     * @param tempPerson an instance of our person class
     * @param inputVotes the list of the votes
     */
    public void vote(Person tempPerson, ArrayList<String> inputVotes){
        //Check for person to see if he or she voted before
        for(Person i : voters){
            if(i.equals(tempPerson)){
                System.out.println("You have been submit before.");
                return;
            }
        }

        Vote tempVote;

        for(String i : inputVotes){
            for(Map.Entry<String, HashSet<Vote>> entry : listOfVotesToChoices.entrySet()){
                if(entry.getKey().equals(i)){
                    //Making the date of voting
                    JalaliCalendar voteDay = new JalaliCalendar(new GregorianCalendar());
                    String tempDate = String.valueOf(voteDay);
                    //Creating a vote
                    tempVote = new Vote(tempPerson, tempDate);
                    //Adding it to the vote list
                    entry.getValue().add(tempVote);
                }
            }
        }
        //Adding the person to the voters list
        voters.add(tempPerson);
    }

    /**
     * a simple method for printing the voters information
     * of this voting
     */
    public void getVoters(){
        for(Person i : voters)
            System.out.println(i.toString());
    }

    /**
     * this method will show us the voting result
     */
    public void printVotes(){
        //A nested loop for printing each choice status and the voting result
        System.out.println(getQuestion());
        for(Map.Entry<String, HashSet<Vote>> entry : listOfVotesToChoices.entrySet()){
            //The result of choice
            System.out.println(entry.getKey() + " -> " + entry.getValue().size());
            for(Vote i : entry.getValue()){
                //The voters of each choice
                System.out.println(i.getPerson().toString() + " " + i.getDate());
            }
        }
    }

    /**
     * this method will return all the choices of this voting
     * @return an arraylist of voting choices
     */
    public ArrayList<String> getChoices(){
        ArrayList<String> tempList = new ArrayList<String>();
        for(Map.Entry<String, HashSet<Vote>> entry : listOfVotesToChoices.entrySet()){
            tempList.add(entry.getKey());
        }
        return tempList;
    }
}
