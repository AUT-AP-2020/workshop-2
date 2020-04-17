import java.util.ArrayList;

/**
 * The Class Voting system manages all the votings.
 * @author Sepehr Moghiseh
 */
public class VotingSystem {
    private ArrayList<Voting> votingList ;

    /**
     * creates a new Voting system.
     */
    public VotingSystem(){
        votingList = new ArrayList<>() ;
    }

    /**
     * Create voting.
     *
     * @param question the question of the voting
     * @param type     the type of the voting
     * @param options  the options of the voting
     */
    public void createVoting(String question , int type , ArrayList<String> options){
        Voting voting = new Voting(type , question) ;
        for (String temp : options){
            voting.createChoice(temp);
        }
        votingList.add(voting) ;
    }

    /**
     * Print votings questions.
     */
    public void printVotingsQuestions(){
        int i=1 ;
        for (Voting temp : votingList){
            System.out.println(i + " : " + temp.getQuestion());
            i++ ;
        }
    }

    /**
     * Print voting.
     *
     * @param indexOfTheVoting the index of the voting
     */
    public void printVoting(int indexOfTheVoting){
        Voting voting = votingList.get(indexOfTheVoting) ;
        System.out.println(voting.getQuestion());
        int i = 1 ;
        for (String temp : voting.getChoices()){
            System.out.println(temp);
            i++ ;
        }
    }

    /**
     * submits a vote to a voting.
     *
     * @param indexOfTheVoting the index of the voting
     * @param voter            the voter
     * @param choices          the choices of the voter
     */
    public void vote(int indexOfTheVoting, Person voter  ,ArrayList<String> choices){
        Voting voting = votingList.get(indexOfTheVoting) ;
        voting.vote(voter , choices) ;
    }

    /**
     * Print results of a voting.
     *
     * @param theIndexOfVoting the the index of voting
     */
    public void printResults(int theIndexOfVoting){
        System.out.println("Printing the results of voting " + (theIndexOfVoting + 1) );
        Voting voting = votingList.get(theIndexOfVoting) ;
        voting.printVotes();
    }

    /**
     * Delete a voting.
     *
     * @param indexOfVoting the index of voting
     */
    public void deleteVoting(int indexOfVoting){
        votingList.remove(indexOfVoting) ;
    }
}
