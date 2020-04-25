import java.util.ArrayList;

/**
 * this is a check for voting system
 */
public class Main {

    
    /** 
     * @param args
     */
    public static void main(String[] args) {
        //create a new voting system
        VotingSystem votingSystem = new VotingSystem();

        //set a question
        String question = "Are you happy?";
        
        //set the choices
        ArrayList<String> choices = new ArrayList<String>();
        choices.add("Yes");
        choices.add("No");

        //create a new voting
        votingSystem.createVoting(question, 0, choices);

        //print a voting
        votingSystem.printVoting(0);

        //create a new voter
        Person voter = new Person("Sevda", "Imany");

        //create a new list for voter's choices
        ArrayList<String> voterChoices = new ArrayList<>();

        voterChoices.add("No");

        //add the voter to system
        votingSystem.vote(0, voter, voterChoices);

        //set another voter
        voter = new Person("negin", "kheirmand");
        votingSystem.vote(0, voter, null);
        votingSystem.printvotes(0);

    }

}