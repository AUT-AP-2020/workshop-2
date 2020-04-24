/**
 * This class designed to manage all voting and voters.
 *
 */

import java.util.ArrayList;

public class VotingSystem {
    //The list of voting
    private ArrayList<Voting> votingList;

    public VotingSystem(){
        votingList = new ArrayList<>();
    }

    /**
     * This method would create a new voting based on the voting question and choices and it's type.
     * @param question the question of the voting
     * @param type the type of the voting
     * @param choicesList the choices of the voting
     */
    public void createVoting(String question, int type, ArrayList<String> choicesList){
        Voting newVoting = new Voting(type, question);
        votingList.add(newVoting);
        for(String choice : choicesList){
            newVoting.createChoice(choice);
        }
    }

    /**
     * This method would get the list of all voting.
     */
    public void getVotingList(){
        System.out.println("The list of voting: ");
        for (Voting V : votingList){
            System.out.println(" -" + V.getQuestion());
        }
    }

    /**
     * This method would print a specific voting and it's choices.
     * @param number
     */
    public void printVoting(int number){
        System.out.println("Voting number " + (number + 1) + ": ");
        System.out.println("The question of the voting: " + votingList.get(number).getQuestion());
        for ( String choice : votingList.get(number).getChoice()){
            System.out.println(" -" + choice);
        }
    }

    /**
     * This method would vote to a voting
     * @param votingNumber the number of voting in the list of voting
     * @param person1 the person who wants to vote
     * @param listOfChoices the list of choices which person1 want to vote to them
     */
    public void vote(int votingNumber, Person person1, ArrayList<String> listOfChoices){
        votingList.get(votingNumber).vote(person1, listOfChoices);
    }

    /**
     * This method would return the result of a voting
     * @param votingNumber the number of voting in the voting list
     */
    public void getResult(int votingNumber){
        Voting v = votingList.get(votingNumber) ;
        System.out.println("Printing the results of voting " + (votingNumber + 1) );
        System.out.println("The question of the voting: " + v.getQuestion());
        v.printVotes();
    }
}
