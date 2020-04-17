/**
 * VotingSystem class
 *
 * @param votingList to save all votes
 * have printListOfVoting method to print votes
 */

import java.util.ArrayList;

public class VotingSystem {
    public ArrayList<Voting> votingList = new ArrayList<>();

    public void printListOfVotings() {
        for (int i = 0; i < votingList.size(); i++) {
            System.out.println(i + ")" + votingList.get(i).getQuestion());
        }
    }
}
