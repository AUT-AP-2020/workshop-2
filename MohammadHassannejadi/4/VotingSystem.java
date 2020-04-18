import java.util.*;

/**
 * This class organize all active voting with a list of voting
 * @author Mohamad Hasannejadi
 * @version 1.0
 */
public class VotingSystem{

    private ArrayList<Voting> votings;

    /**
     * constructor to new list of voting
     */
    public VotingSystem(){
        votings = new ArrayList<Voting>();
    }

    /**
     * creating new voting
     * @param question voting title
     * @param type 0 single , 1 multi
     * @param polls choices of every voting
     */
    public void createVoting(String question, int type, ArrayList<String> polls){
        Voting voting = new Voting(type, question);
        votings.add(voting);
        for(String poll : polls){
            voting.createPoll(poll);
        }
    }

    /**
     * remove a voting
     * @param num index of voting in list
     */
    public void removeVoting(int num){
        votings.remove(num);
    }

    /**
     * show a voting questions
     */
    public void printVotingQuestions(){
        for(Voting voting : votings){
            System.out.println(voting.getQuestion());
        }
    }

    /**
     * getter of type of voting
     * @param num number of voting in list of votings
     * @return type of voting
     */
    public int getType(int num){
        return votings.get(num).getType();
    }

    /**
     * show question and choices of voting
     * @param num number of voting 
     */
    public void printVoting(int num){
        System.out.println(votings.get(num).getQuestion());
        ArrayList<String> choices = votings.get(num).getPolls();
        for(String choice : choices){
            System.out.println(choice);
        }
    }

    /**
     * select a random choice of a votings
     * @param num voting number in list
     * @return an option inside that voting
     */
    public String randomVote(int num){
        Random random = new Random();
        ArrayList<String> choices = votings.get(num).getPolls();
        if(votings.get(num).getType() == 1) {
            System.out.println("please choose a single vote");
            return null;
        }
        int max = choices.size();
        return choices.get(random.nextInt(max));
    }

    /**
     * put a vote in voting
     * @param num number of vote inside the list
     * @param voter a person voter
     * @param votes list of votes
     */
    public void vote(int num, Person voter, ArrayList<String> votes){
        votings.get(num).vote(voter, votes);
    }

    /**
     * show result of a voting
     * @param num number voting in list
     */
    public void getResult(int num){
        votings.get(num).printVotes();
    }

    /**
     * return a voting with its number in list
     * @param num voting number in list
     */
    public Voting getVoting(int num){
        return votings.get(num);
    }

    

}