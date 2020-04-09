/**
 * VotingSystem Object, contains a list of all votings and methods to process their data
 *
 * @author Keivan Ipchi Hagh
 * @since 2020/4/4
 * @version 1.0.0
 */
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;

public class VotingSystem {
    /**
     * A list of all votings
     */
    private ArrayList<Voting> votingList;

    /**
     * VotingSystem Constructor, Initializes fields
     */
    public VotingSystem() {
        this.votingList = new ArrayList<>();
    }

    /**
     * Creates a new Voting
     * @param votingType Voting type
     * @param question Voting question
     */
    public void createVoting(int votingType, String question) {
        votingList.add(new Voting(votingType, question));
    }

    /**
     * Prints all all voting questions
     */
    public void printListOfVotings() {
        if (votingList.size() != 0) {
            System.out.println("Voting questions are as followed:");
            for (Voting voting : votingList)
                System.out.println(" - " + voting.getQuestion());
        } else
            System.out.println("Voting List is empty!");
    }

    /**
     * Prints all the choices for an specific voting
     * @param votingIndex
     */
    public void printVoting(int votingIndex) {

        try {
            System.out.println("Voting[" + (votingIndex + 1) + "] choices are as followed:");
            for (Map.Entry<String, HashSet<Vote>> entry : votingList.get(votingIndex).getChoices().entrySet())
                System.out.println(" - " + entry.getKey());
        } catch (Exception ex) {
            System.out.println("Err - No voting found with index '" + votingIndex + "'!");
        }
    }

    /**
     * Creates a choice for a specific voting
     * @param votingIndex Voting index
     * @param choice Choice string
     */
    public void createChoice(int votingIndex, String choice) {
        try {
            votingList.get(votingIndex).createChoice(choice);
        } catch (Exception ex) {
            System.out.println("Err - No voting found with index '" + votingIndex + "'!");
        }
    }

    /**
     * Votes to a specific voting
     * @param votingIndex Voting index
     * @param voter Voter Obj
     * @param choices List of choices
     */
    public void vote(int votingIndex, Person voter, ArrayList<String> choices) {
        try {
            votingList.get(votingIndex).vote(voter, choices);
        } catch (Exception ex) {
            System.out.println("Err - No voting found with index '" + votingIndex + "'!");
        }
    }

    /**
     * Prints results for each choice in a specific voting
     * @param votingIndex Voting index
     */
    public void printResult(int votingIndex) {
        try {
            int maxCount = 0;
            String topChoice = "";
            for (Map.Entry<String, HashSet<Vote>> entry : votingList.get(votingIndex).getChoices().entrySet()) {
                if (entry.getValue().size() >= maxCount && entry.getValue().size() != 0) {
                    maxCount = entry.getValue().size();
                    topChoice += entry.getKey() + ", ";
                }
                System.out.println(" - Voting[" + (votingIndex + 1) + "] choice: " + entry.getKey() + "\tNumber of Votes: " + entry.getValue().size());
            }

            System.out.println(" --- Voting[" + (votingIndex + 1) + "] Top choice: " + topChoice + "\tNumber of votes: " + maxCount);

        } catch (Exception ex) {
            System.out.println("Err - No voting found with index '" + votingIndex + "'!");
        }
    }
}