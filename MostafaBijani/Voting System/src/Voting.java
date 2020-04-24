import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Voting {
    //false for single choice, true fo multi choice
    private boolean type;
    //choices of voting
    HashMap<String,HashSet<String>> choices;
    //question of voting
    private String question;

    /**
     * make a new voting.
     *
     * @param question question of voting.
     * @param type type of voting.
     */
    public Voting(String question, boolean type){
        this.question = question;
        this.type = type;
        choices = new HashMap<String, HashSet<String>>();
    }

    /**
     * add a choice to voting
     */
    public void createChoice() {
        System.out.println("Enter Options :");
        choices.put(VotingSystem.scan.nextLine(), new HashSet<String>());
    }

    /**
     * add votes to system
     *
     * @param name who vote
     * @param votes chosen votes
     */
    public void vote(String name, ArrayList<String> votes) {
        for(String choice:votes) {
            choices.get(choice).add(name);
        }
    }

    /**
     * print result of voting
     */
    public void printResult() {
        for(String choice : choices.keySet()){
            System.out.println(choice + " : " + choices.get(choice).size());
        }
    }

    public boolean isType() {
        return type;
    }

    public HashMap<String, HashSet<String>> getChoices() {
        return choices;
    }

    public String getQuestion() {
        return question;
    }
}
