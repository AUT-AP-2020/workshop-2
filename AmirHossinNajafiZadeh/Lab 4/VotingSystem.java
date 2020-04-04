package com.myPack;

import java.util.ArrayList;
import java.util.Random;

/**
 * the voting system class
 * creates all the voting classes and get the voters
 * and the votes and shows us all the information
 * about a voting
 */
public class VotingSystem {
    //The list of all voting
    private ArrayList<Voting> votingList;

    /**
     * the main constructor of this class
     */
    public VotingSystem(){
        votingList = new ArrayList<Voting>();
    }

    /**
     * this is a method for creating a new voting
     * @param question the subject of the voting
     * @param type the type of voting for single or multi choices
     * @param choices the options of voting
     */
    public void createVoting(String question, int type, ArrayList<String> choices){
        //First we create an instance
        Voting newVote = new Voting(type, question);
        //Then we add it to the list
        votingList.add(newVote);
        //Then we aad it options to it
        for(String i : choices){
            newVote.createChoice(i);
        }
    }

    /**
     * this will get and index and then remove the voting from the list
     * @param index the place of voting in the voting list
     */
    public void removeVoting(int index){
        votingList.remove(index);
    }

    /**
     * this method will print all of the voting's questions
     */
    public void printVotingQuestions(){
        for(Voting i : votingList){
            System.out.println(i.getQuestion());
        }
    }

    /**
     * this is a getter method for the type of a voting
     * @param index the place of a voting in the list
     * @return the type of that voting
     */
    public int getType(int index){
        return votingList.get(index).getType();
    }

    /**
     * this will get an index and will print the question and the choices of that voting
     * @param index the place of voting in list
     */
    public void printVoting(int index){
        //Printing the question
        System.out.println(votingList.get(index).getQuestion());
        //Creating an ArrayList
        ArrayList<String> tempList = votingList.get(index).getChoices();
        //Printing the questions
        for(String i : tempList){
            System.out.println(i);
        }
    }

    /**
     * this method will get a voting and them vote to it
     * @param index the place of vote inside the list
     * @param tempPerson an instance of our Person class
     * @param votes an ArrayList of votes
     */
    public void vote(int index, Person tempPerson, ArrayList<String>votes){
        votingList.get(index).vote(tempPerson, votes);
    }

    /**
     * this method will get an index and then will print the result of that voting
     * @param index the place of voting in our list
     */
    public void printResult(int index){
        votingList.get(index).printVotes();
    }

    /**
     * this extra method will get and index of voting and will show us the
     * voters of that voting
     * @param index the place of voting in the list
     */
    public void getVotersOfVoting(int index){
        votingList.get(index).getVoters();
    }

    /**
     * this method will go inside a voting an will chose a random choice
     * of that voting for us
     * @param index the voting index
     * @return an option inside that voting
     */
    public String randomVote(int index){
        //Importing the library
        Random random = new Random();
        //Getting the choices
        ArrayList<String> tempList = votingList.get(index).getChoices();
        //Check the voting type
        if(votingList.get(index).getType() == 1) {
            System.out.println("This is a multi Voting.");
            return null;
        }
        //Get the maximum number of random
        int max = tempList.size();
        //Return a random
        return tempList.get(random.nextInt(max));
    }
}
