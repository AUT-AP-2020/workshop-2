package com.company;

import java.util.ArrayList;

public class VotingSystem {
    private ArrayList<Voting> votingList;

    public VotingSystem(){
        votingList = new ArrayList<>();
    }

    public void createVoting(String question, int type){
        votingList.add(new Voting(type,question));
    }

    public void printListOfVotings(){
        System.out.println("Active votings:");
        int index = 1;
        for(Voting v : votingList) {
            System.out.println(index + ") " + v.getQuestion());
            index++;
        }
    }

    public void printVoting(int votingNumber){
        Voting voting = votingList.get(votingNumber-1);
        System.out.println(voting.getQuestion());
        int index = 1;
        for(String choice : voting.getChoices().keySet()) {
            System.out.println(index + ") " + choice);
            index++;
        }
    }

    public void vote(int votingNumber, Person person, ArrayList<String> choices){
        Voting voting = votingList.get(votingNumber-1);
        voting.vote(person,choices);
    }

    public void printResult(int votingNumber){
        Voting voting = votingList.get(votingNumber-1);
        voting.printVotes();
    }

    public Voting getVoting(int votingNumber){
        return votingList.get(votingNumber-1);
    }

    public ArrayList<Voting> getVotingList() {
        return votingList;
    }
}