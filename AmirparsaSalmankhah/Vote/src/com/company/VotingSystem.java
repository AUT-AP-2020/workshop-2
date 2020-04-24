package com.company;

import java.util.ArrayList;

/**
 * Represents a voting system containing some votings.
 * @author Amirparsa Salmankhah
 * @version 1.0.0
 */
public class VotingSystem {
    //List of votings
    private ArrayList<Voting> votingList;

    /**
     * Constructor with no parameter.
     */
    public VotingSystem(){
        votingList = new ArrayList<>();
    }

    /**
     * Creates a voting and adds it to the list.
     * @param question Question of voting
     * @param type Type of voting
     */
    public void createVoting(String question, int type){
        votingList.add(new Voting(type,question));
    }

    /**
     * Prints votings list
     */
    public void printListOfVotings(){
        System.out.println("Active votings:");
        int index = 1;
        for(Voting v : votingList) {
            System.out.println(index + ") " + v.getQuestion());
            index++;
        }
    }

    /**
     * Prints a voting
     * @param votingNumber Number of the voting
     */
    public void printVoting(int votingNumber){
        Voting voting = votingList.get(votingNumber-1);
        System.out.println(voting.getQuestion());
        int index = 1;
        for(String choice : voting.getChoices().keySet()) {
            System.out.println(index + ") " + choice);
            index++;
        }
    }

    /**
     * Votes from a person to a an specific voting.
     * @param votingNumber Number of the voting
     * @param person Person
     * @param choices Choices of the person
     */
    public void vote(int votingNumber, Person person, ArrayList<String> choices){
        Voting voting = votingList.get(votingNumber-1);
        voting.vote(person,choices);
    }

    /**
     * Prints result of a voting
     * @param votingNumber Number of the voting
     */
    public void printResult(int votingNumber){
        Voting voting = votingList.get(votingNumber-1);
        voting.printVotes();
    }

    /**
     * Gets an specific voting.
     * @param votingNumber Number of the voting
     * @return
     */
    public Voting getVoting(int votingNumber){
        return votingList.get(votingNumber-1);
    }

    /**
     * Gets votings list.
     * @return List of votings.
     */
    public ArrayList<Voting> getVotingList() {
        return votingList;
    }
}