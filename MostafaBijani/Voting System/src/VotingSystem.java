import java.util.ArrayList;
import java.util.Scanner;
import ir.*;

public class VotingSystem {
    public static Scanner scan = new Scanner(System.in);
    //List of Voting
    private ArrayList<Voting> votingList;

    /**
     * create a voting
     */
    public void createVoting(){
        System.out.println("Enter Question :");
        String question = scan.nextLine();
        System.out.println("Enter Type of Voting :");
        int typeOfVote = scan.nextInt();
        boolean type = typeOfVote == 1;
        votingList.add(new Voting(question, type));
    }

    /**
     * Print list of voting questions
     */
    public void printListOfVoting() {
        for (Voting vote:votingList) {
            System.out.println(vote.getQuestion());
        }
    }

    /**
     * print a voting with options
     */
    public void printVoting(int numberOfVoting) {
        Voting voting = votingList.get(numberOfVoting - 1);
        System.out.println(voting.getQuestion() + " :");
        for (String choice:voting.getChoices().keySet()) {
            System.out.println(choice);
        }
    }

    /**
     * add votes to system
     *
     * @param name who vote
     * @param votes chosen votes
     */
    public void vote(int numberOfVoting, String name, ArrayList<String> votes) {
        Voting voting = votingList.get(numberOfVoting - 1);
        if(voting.isType())
            voting.vote(name, votes);
        else{
            ArrayList<String> oneChoice = new ArrayList<String>();
            oneChoice.add(votes.get(0));
            voting.vote(name, oneChoice);
        }
    }

    /**
     * print result of a voting
     */
    public void printResult(int numberOfVoting) {
        votingList.get(numberOfVoting - 1).printResult();
    }
}
