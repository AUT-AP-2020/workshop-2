package com.myPack;

import java.util.ArrayList;

/**
 * this is a test case for Main class
 * and we check it manual if you want to work with the app
 * please run the Run.java
 */
public class Main {

    public static void main(String[] args) {
        //Creating an instance of VotingSystem class
        VotingSystem votingSystem = new VotingSystem();

        String question = "Do you like to study in holidays ?";
        ArrayList<String> choices = new ArrayList<String>();

        choices.add("Yes");
        choices.add("No");

        //Creating a voting system
        votingSystem.createVoting(question, 0, choices);

        choices.clear();
        question = null;

        //Print the Voting information
        votingSystem.printVoting(0);

        //Creating a person and a vote  --------------------------------------
        Person voter = new Person("Amir", "Najafi");
        ArrayList<String> myChoices = new ArrayList<String>();
        myChoices.add("Yes");
        //Vote with that person
        votingSystem.vote(0, voter, myChoices);

        myChoices.clear();

        voter = new Person("Ali", "Najafi");
        //We also check the random option method
        myChoices.add(votingSystem.randomVote(0));
        votingSystem.vote(0, voter, myChoices);

        myChoices.clear();

        voter = new Person("Amir", "Najafi");
        myChoices.add("Yes");
        votingSystem.vote(0, voter, myChoices);

        myChoices.clear();

        voter = new Person("Arad", "Firoz Kohi");
        myChoices.add("No");
        votingSystem.vote(0, voter, myChoices);

        myChoices.clear();

        voter = new Person("Ali", "Norozi");
        myChoices.add("No");
        votingSystem.vote(0, voter, myChoices);

        myChoices.clear();

        voter = new Person("Parsa", "Dalili");
        myChoices.add("No");
        votingSystem.vote(0, voter, myChoices);

        myChoices.clear();

        voter = new Person("Ahmad", "Golie");
        myChoices.add(votingSystem.randomVote(0));
        votingSystem.vote(0, voter, myChoices);

        myChoices.clear();
        //-----------------------------------------------------------------

        //Printing the first voting list
        System.out.println("The list of the first voting :");
        votingSystem.getVotersOfVoting(0);
        System.out.println("\n\n\n\n");

        //Printing the first voting result
        votingSystem.printResult(0);
        System.out.println("\n\n\n\n");


        question = "Why don't you want to study in holidays ?";
        choices.add("Cause I am a lazy person.");
        choices.add("Cause if I study then it is not holiday.");
        choices.add("I don't care I just don't want to study.");
        choices.add("I am a nerd and I will study even in holiday.");
        choices.add("Let's not get into this.");

        //We do this again this time with multi type voting
        votingSystem.createVoting(question, 1, choices);

        choices.clear();
        question = null;

        votingSystem.printVotingQuestions();
        System.out.println("\n\n");

        voter = new Person("Amir", "Najafi");
        myChoices.add("Let's not get into this.");
        votingSystem.vote(1, voter, myChoices);

        myChoices.clear();

        voter = new Person("Mehdi", "Malmasi");
        myChoices.add("Let's not get into this.");
        myChoices.add("I am a nerd and I will study even in holiday.");
        votingSystem.vote(1, voter, myChoices);

        myChoices.clear();

        voter = new Person("Hadi", "Abbasi");
        myChoices.add("Let's not get into this.");
        myChoices.add("Cause I am a lazy person.");
        myChoices.add("Cause if I study then it is not holiday.");
        votingSystem.vote(1, voter, myChoices);

        myChoices.clear();

        voter = new Person("Armin", "Godarzi");
        myChoices.add("I don't care I just don't want to study.");
        votingSystem.vote(1, voter, myChoices);

        myChoices.clear();

        votingSystem.printVoting(1);
        System.out.println("\n\n\n\n");

        votingSystem.printResult(1);

        //Removing all of the voting
        votingSystem.removeVoting(0);
        votingSystem.removeVoting(0);
    }
}
