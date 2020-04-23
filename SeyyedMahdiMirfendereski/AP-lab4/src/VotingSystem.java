import java.util.ArrayList;
import java.util.Random;
/**
 *  this class includes a list of voting and some methods to add som information to voting.
 * @author Mahdi Mirfendereski
 * @version 0.0
 */
public class VotingSystem {
    private ArrayList<Voting> votingList;
    /**
     * create instance of Array list.
     */
    public VotingSystem() {
        votingList=new ArrayList<>();
    }

    /**
     * adding a new voting to list of voting
     * @param question the question of voting
     * @param type type of voting
     * @param choices options of voting
     */
    public void createVoting(String question,int type,ArrayList<String> choices){
        Voting newVoting=new Voting(type,question);
        votingList.add(newVoting);
        for (String s:choices)
            newVoting.createChoice(s);
    }

    /**
     * just printing a questions of voting
     */
    public void printVotingQuestions(){
        int i=0;
        System.out.println("Question");
        for (Voting v:votingList) {
            System.out.println(i+":"+v.getQuestion());
            i++ ;
        }
    }

    /**
     * printing question and options of voting
     * @param index which voting from list
     */
    public void printVoting(int index){
        System.out.print("Question : "+votingList.get(index).getQuestion()+" Choices: ");
        int i=0;
        for (String s:votingList.get(index).getChoices()) {
            System.out.print(i + ": " + s + " ");
            i++;
        }
        System.out.println();
    }

    /**
     * adding a vote of voters and his choices to specific voting
     * @param index which voting from list
     * @param voter who wants to vote
     * @param choices a list of string that include voter's choices
     */
    public void vote(int index,Person voter,ArrayList<String> choices){
        votingList.get(index).vote(voter,choices);

    }

    /**
     * printing the result of specific voting
     * @param index which voting from list
     */
    public void printResult(int index){
        votingList.get(index).printVotes();
    }

    /**
     * voters votes randomely
     * @param index which voting from list
     * @param voter who is voters
     */
    public void randomVote(int index,Person voter){
        // to check the type of voting.
        if(votingList.get(index).getType()==0){
            Random random=new Random();
            ArrayList<String> choices=votingList.get(index).getChoices();
            ArrayList<String> choice=new ArrayList<>();
            choice.add(choices.get(random.nextInt(choices.size())));
            votingList.get(index).vote(voter,choice);
        }
    }
    public void getVoters(int index){
     votingList.get(index).getVoters();
    }
}
