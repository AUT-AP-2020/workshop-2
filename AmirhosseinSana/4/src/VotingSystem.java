import java.util.ArrayList;

/**
 * The type Voting system.
 */
public class VotingSystem {
    private ArrayList<Voting> votingList;

    /**
     * Instantiates a new Voting system.
     */
    public VotingSystem() {
        votingList = new ArrayList<>();
    }

    /**
     * Create voting.
     *
     * @param question the question
     * @param type     the type
     * @param polls    the polls
     */
    public void createVoting(String question, int type, ArrayList<String> polls) {
        Voting tmp = new Voting(type, question);
        for(String poll : polls) {
            tmp.createPoll(poll);
        }
        votingList.add(tmp);
    }

    /**
     * Gets voting list.
     */
    public void getVotingList() {
        for(int i = 0; i < votingList.size(); i ++) {
            System.out.println(votingList.get(i));
        }
    }

    /**
     * Gets voting.
     *
     * @param index the index
     */
    public void getVoting(int index) {
        System.out.println(votingList.get(index));
    }

    /**
     * Vote.
     *
     * @param index  the index
     * @param person the person
     * @param polls  the polls
     */
    public void vote(int index, Person person, ArrayList<String> polls) {
        votingList.get(index).vote(person, polls);
    }

    /**
     * Gets result.
     *
     * @param index the index
     */
    public void getResult(int index) {
        votingList.get(index).printVotes();
    }
}
