package MohammadSafari.Lab_S04;

import java.util.*;

/**
 * manages active votings
 * 
 * @author M.Safari
 * @version 1399.02.05
 */
public class VotingSystem {
    private ArrayList<Voting> votingList;

    public VotingSystem() {
        votingList = new ArrayList<Voting>();
    }

    /**
     * 
     * @param question
     * @param type
     * @param polls
     */
    public void createVoting(String question, int type, ArrayList<String> polls) {
        Voting voting = new Voting(type, question);
        // creating polls one by one
        for (String poll : polls)
            voting.createPoll(poll);
        votingList.add(voting);
    }

    /**
     * @return the votingList
     */
    public ArrayList<Voting> getVotingList() {
        return votingList;
    }

    /**
     * geting index-specified voting stimualtion
     * 
     * @param index
     * @return
     */
    public Voting getVoting(int index) {
        return votingList.get(index);

    }

    /**
     * vote in a form of attending in a index-specified voting
     * 
     * @param index
     * @param voter
     * @param choices
     */
    public void vote(int index, Person voter, Set<String> choices) {
        getVoting(index).vote(voter, choices);
    }

    /**
     * printing result of a index-specified voting
     * @param index
     * @return
     */
    public Map<String, Set<Vote>> getResult(int index) {
        Voting voting = getVoting(index);
        voting.printVotes();
        return voting.getPolls();
    }
}