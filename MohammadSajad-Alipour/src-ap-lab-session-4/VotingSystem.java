import java.util.ArrayList;

/**
 * This is a class for handling all the votings there is.
 */
public class VotingSystem {
    private ArrayList<Voting> votingList=new ArrayList<>();

    public VotingSystem(){

    }

    /**
     * This is a method to create a voting
     * @param question
     * @param type
     * @param choices
     */
    public void createVoting(String question,int type,ArrayList<String> choices){
        Voting voting=new Voting(type,question);
        for(String choice:choices){
            voting.createChoice(choice);
        }
        votingList.add(voting);

    }

    /**
     * This is a method to print all the questions of votings
     */
    public void printVotingQuestions(){
        for(Voting voting:votingList){
            System.out.println(voting.getQuestion());
        }
    }

    /**
     * This is a method to print voting's details
     * @param votingNumber
     */
    public void printVoting(int votingNumber){
        Voting voting = votingList.get(votingNumber);
        System.out.println(voting.getQuestion());
        for(String choice:voting.getChoices()){
            System.out.println(choice);
        }

    }

    /**
     * This is a method to vote to a specific voting
     * @param votingNum
     * @param person
     * @param choices
     */
    public void vote(int votingNum,Person person,ArrayList<String> choices){
        Voting voting=votingList.get(votingNum);
        voting.vote(person,choices);
    }

    /**
     * This is a method to show the result of a specific voting
     * @param votingNum
     */
    public void printResults(int votingNum){
        Voting voting=votingList.get(votingNum);
        voting.printVotes();
    }
}
