import java.util.ArrayList;
import java.util.Random;

/**
 * VotingSystem
 */
public class VotingSystem {

    public ArrayList<Voting> votingList = new ArrayList<>();
    public void createVoting(String question, int type, ArrayList<String> listOfChoices)
    {
        Voting votingHolder = new Voting(type, question);
        votingList.add(votingHolder);
        for(String i: listOfChoices)
        {
            votingHolder.createChoice(i);
        }
    }

    public void deleteVoting(int index)
    {
        votingList.remove(index);
    }

    /**
     * @return the votingList
     */
    public ArrayList<Voting> getVotingList() {
        return votingList;
    }

    public Voting getVoting(int index)
    {
        return votingList.get(index);
    }

    public void vote(int index, Person voter, ArrayList<String> choicesOfVoter) {
        votingList.get(index).vote(voter, choicesOfVoter);
    }

    public void printResult(int index) {
        votingList.get(index).printResult();
    }
}