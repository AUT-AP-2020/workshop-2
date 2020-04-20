import java.util.ArrayList;

/**
 * The VotingSystem class implants a voting system.
 *
 * @author Amirreza Hashemi
 * @version 1.0
 * @since 4/19/2020
 */
public class VotingSystem {

    private ArrayList<Voting> votingList;

    /**
     * Instantiates a new Voting system.
     */
    public VotingSystem() {
        votingList = new ArrayList<Voting>();
    }

    /**
     * Creates a voting.
     *
     * @param question the question
     * @param type     the type
     * @param choices  the choices
     */
    public void createVoting(String question, int type, ArrayList<String> choices) {
        Voting voting = new Voting(type, question);
        for (String choice : choices) {
            voting.createChoice(choice);
        }
        votingList.add(voting);
    }

    /**
     * Prints voting questions.
     */
    public void printVotingQuestions() {
        for (Voting voting : votingList) {
            System.out.println(voting.getQuestion());
        }
    }

    /**
     * Prints voting question and choices with given index.
     *
     * @param index the index
     */
    public void printVoting(int index) {
        System.out.println(votingList.get(index).getQuestion());
        int i = 0;
        for (String choice : votingList.get(index).getChoices()) {
            i++;
            System.out.println(i + ") " + choice);
        }
    }

    /**
     * Votes for a voting with given index.
     *
     * @param index   the index
     * @param voter   the voter
     * @param choices the choices
     */
    public void vote(int index, Person voter, ArrayList<String> choices) {
        votingList.get(index).vote(voter, choices);
    }

    /**
     * Prints results.
     *
     * @param index the index
     */
    public void printResults(int index) {
        votingList.get(index).printVotes();
    }


}
