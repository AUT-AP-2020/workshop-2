import java.util.ArrayList;



/**
 * this is a test case for Main class
 * and we check it manual if you want to work with the app
 * please run the Run.java
 */
public class Main 
{

    public static void main(String[] args) 
    {
        // create a new voting system
        VotingSystem votingSystem = new VotingSystem();

        // set the question
        String question = "Are you good in java?";

        // set the choices
        ArrayList<String> choices = new ArrayList<String>();
        choices.add("Yes");
        choices.add("No");


        // create a new voting
        votingSystem.createVoting(question, 1, choices);


        // show the added voting details
        votingSystem.getVoting(0);




        // create a voter
        Person voter = new Person("Mohammad Mahdi", "Malmasi");

        // create a list for voter votes
        ArrayList<String> voterChoices = new ArrayList<>();

        // add the voter choice
        voterChoices.add("No");

        // add the voter vote to the voting
        votingSystem.vote(0, voter, voterChoices);



        /*  set another voter */

        voter = new Person("Mr", "X");

        // choose randomly
        votingSystem.vote(0, voter, null);

 
        votingSystem.getResult(0);
    }
}
