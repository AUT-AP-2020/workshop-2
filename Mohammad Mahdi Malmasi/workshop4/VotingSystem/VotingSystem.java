import java.util.ArrayList;
import java.util.Random;


 
/**
 * This class repersent a voting system
 * It holds votings and has some methods to work with them
 * 
 * @author Mohammad Mahdi Malmasi
 * @version 0.1.0
 */
public class VotingSystem 
{
            /*  Feilds  */

    //The list of all voting
    private ArrayList<Voting> votingList;







          /* Constructor */

    /**
     * Create a new voting system
     */
    public VotingSystem()
    {
        votingList = new ArrayList<>();
    }









            /*  Methods  */


    /**
     * This method creat a new {@code Voting} and add it to the voting list.
     * 
     * @param question : the question of the new voting
     * @param type : the type of the voting 
     * @param choices : the choices of the voting
     */
    public void createVoting(String question, int type, ArrayList<String> choices)
    {
        Voting newVoteToAdd = new Voting(type, question);

        // add the vote choices
        for(String choice : choices)
        {
            newVoteToAdd.createChoice(choice);
        }


        votingList.add(newVoteToAdd);
    }


    /**
     * Show the votings in the terminal
     */
    public void getVotingList() 
    {
        System.out.println("\n\t\t\t------------- voting list -------------");

        for(Voting voting : votingList)
        {
            voting.printVotes();
        }

        System.out.println("\n\t\t\t------------- ••••••••••• -------------");
    }


    /**
     * print the question and choices of the voting in terminal
     * 
     * @param index : the index of the voting
     */
    public void getVoting(int index)
    {
        System.out.println("Vote " + index + ": ");


        // print the voting question
        System.out.println("\t" + votingList.get(index).getQuestion());

        // print the voting choices
        for(String choice : votingList.get(index).getChoices())
            System.out.println("\t\t" + choice);
    }


    /**
     * This method add the given votes to a voting
     * If {@code choices = null}, the method vote a choice randomly
     * 
     * @param index : the index of the voting
     * @param voter : the voter
     * @param voterVotes : the voter votes
     */
    public void vote(int index, Person voter, ArrayList<String> voterVotes)
    {
        if (voterVotes == null)
        {
            if (votingList.get(index).getType() != 1)
            {
                System.out.println("You can't choose a random choice for this voting !");
                return;
            }


            // choose a choice randomly
            Random rand = new Random();
            int voterChoiceIndex = rand.nextInt(votingList.get(index).getChoices().size());

            voterVotes = new ArrayList<>();
            voterVotes.add(votingList.get(index).getChoices().get(voterChoiceIndex));
        }


        votingList.get(index).vote(voter, voterVotes);
    }


    /**
     * This mehtod show the result of a voting
     * 
     * @param index : the index of the voting
     */
    public void getResult(int index)
    {
        votingList.get(index).printVotes();
    }
}