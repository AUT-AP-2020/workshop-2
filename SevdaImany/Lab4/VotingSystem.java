import java.util.ArrayList;
import java.util.Random;

/**
 * this method represent a voting system
 * 
 * @author sevda imany
 * @version 0.0
 */
public class VotingSystem {
    //the list of all votings
    private ArrayList<Voting> votingList;

    /**
     * create a new voting system
     */
    public VotingSystem() {
        votingList = new ArrayList<>();
    }

    
    /** 
     * create  a new voting 
     * @param question
     * @param type
     * @param choices
     */
    public void createVoting(String question, int type, ArrayList<String> choices) {
        Voting voting = new Voting(type, question);
        votingList.add(voting);
        for (String s : choices) {
            voting.createChoice(s);
        }

    }

    /**
     * this method show all votings 
     */
    public void getVotingList() {
        for(Voting voting : votingList)
        {
            voting.printVotes();
        }
    }

    /**
     * this method print voting's questiond
     */
    public void printListOfVotings() {
        for (Voting voting : votingList) {
            System.out.println(voting.getQuestion());
        }
    }

    
    /** 
     * this method print the question and choices of the given voting index
     * @param num
     */
    public void printVoting(int num) {
        if (num < votingList.size() && num >= 0) {
            System.out.println(votingList.get(num).getQuestion());
            for (String choice : votingList.get(num).getChoices()) {
                System.out.println(choice);
            }
        } else
            System.out.println("Invalid input!");
    }

    
    /** 
     * this method add a vote to the voting
     * @param num : index of the voting
     * @param person
     * @param votes
     */
    public void vote(int num, Person person, ArrayList<String> votes) {
        if (num < votingList.size() && num >= 0) {
            if (votingList.get(num).getType() == 1) {
                if (votes.size() == 0) {
                    System.out.println("You can't choose a random choice for this voting !");
                    return;
                }
            }

            if (votingList.get(num).getType() == 0) {
                if (votes ==  null) {
                    Random random = new Random();
                    int choiceIndex = random.nextInt(votingList.get(num).getChoices().size());
                    votes = new ArrayList<>();
                    votes.add(votingList.get(num).getChoices().get(choiceIndex));
                }
            }
            votingList.get(num).vote(person, votes);
        } else
            System.out.println("Invalid input!");

    }

    
    /** 
     * this method show the result of voting
     * @param num : index of the voting
     */
    public void printvotes(int num) {
        if (num < votingList.size() && num >= 0)
            votingList.get(num).printVotes();
        else
            System.out.println("Invalid input!");
    }

}