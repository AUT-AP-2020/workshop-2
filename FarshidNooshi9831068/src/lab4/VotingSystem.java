// In The Name Of GOD
package lab4;

import java.util.ArrayList;

public class VotingSystem {
    private ArrayList<Voting> votingList;

    /**
     * a simple constructor for this class
     */
    public VotingSystem() {
        votingList = new ArrayList<>();
    }

    /**
     * this class creates a new voting
     *
     * @param question := question of the problem
     * @param type     := type of the question, 0 -> single choice, 1 -> multiple choice
     */
    public void createVoting(String question, int type) {
        votingList.add(new Voting(type, question));
    }

    /**
     * prints all of the voting with their number and questions
     */
    public void printListOfVoting() {
        int idx = 1;
        for (Voting voting : votingList)
            System.out.println("" + idx++ + ") " + voting.getQuestion());
    }

    /**
     * prints the results of a voting
     *
     * @param idx is an index for the voting
     */
    public void printResult(int idx) {
        votingList.get(idx).printVotes();
    }

    /**
     * prints the specific voting with their choices
     *
     * @param idx is the index of the voting
     */
    public void printVoting(int idx) {
        System.out.println("" + (idx + 1) + ") " + votingList.get(idx).getQuestion());
        for (String it : votingList.get(idx).getChoices().keySet())
            System.out.println(it);
        System.out.println();
    }

    /**
     * @return votingList of the system
     */
    public ArrayList<Voting> getVotingList() {
        return votingList;
    }

    /**
     * @param idx is the index of the voting to be returned
     * @return the voting[idx] from the ArrayList
     */
    public Voting getVoting(int idx) {
        return votingList.get(idx);
    }

    /**
     * generates a vote for person
     * @param idx is index of a voting
     * @param person is a voter
     * @param choices is the voters choices
     */
    public void vote(int idx, Person person, ArrayList<String> choices) {
        votingList.get(idx).vote(person, choices);
    }
}
