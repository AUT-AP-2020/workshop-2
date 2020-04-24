import java.util.ArrayList;

/**
 * represent voting System
 */
public class VotingSystem {
    //list of voting
    private ArrayList<Voting> votingList;

    /**
     * create a voting System
     */
    public VotingSystem()
    {
        this.votingList = new ArrayList<>();
    }

    /**
     * create a  voting
     * @param question question
     * @param type type of voting
     * @param choices voters can choice
     */
    public void createVoting(String question,int type,ArrayList<String> choices)
    {
        Voting voting = new Voting(type,question);
        for(String choice:choices){
            voting.createChoice(choice);
        }
        votingList.add(voting);
    }

    /**
     * print voting questions
     */
    public void printVotingQuestions()
    {
        for(Voting voting:votingList){
            System.out.println(voting.getQuestion());
        }
    }

    /**
     * print voting
     * @param votingNumber voting number
     */
    public void printVoting(int votingNumber)
    {
        Voting voting = votingList.get(votingNumber-1);
        System.out.println(voting.getQuestion());
        for(String choice:voting.getChoices()){
            System.out.println(choice);
        }
    }

    /**
     * vote to a voting
     * @param votingNum voting number
     * @param voter voter
     * @param choices choices
     */
    public void vote(int votingNum ,Person voter ,ArrayList<String> choices){
        Voting voting = votingList.get(votingNum);
        voting.vote(voter,choices);
    }

    /**
     * print result of a voting
     * @param votingNumber voting number
     */
    public void printResults(int votingNumber){
        Voting voting = votingList.get(votingNumber);
        voting.printVotes();
    }

    public ArrayList<Voting> getVotingList() {
        return votingList;
    }
}
