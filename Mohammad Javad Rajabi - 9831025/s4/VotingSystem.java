import java.util.*;

/**
 * This class create a voting system that can create voting and print result.
 *
 * @author Mohammad Javad Rajabi
 * @version 1.0
 * @since 2020-03-24
 */
public class VotingSystem {

    //fields

    //list of created voting
    private ArrayList<Voting> votingList;

    //constructor
    /**
     * Voting system constructor, for create new object of this class.
     */
    public VotingSystem() {
        votingList = new ArrayList<Voting>();
    }

    //methods

    /**
     * This method is used to create a new voting.
     * @param question This is question of voting.
     * @param type This is parameter that declare type of voting.
     * @param options This is array list of choices of this new voting.
     */
    public void creatingVoting(String question, int type, ArrayList<String> options) {
        Voting voting = new Voting(type, question);
        for (String option:options){
            voting.createChoice(option);
        }
        votingList.add(voting);
    }

    /**
     * This method is used to print a question of voting.
     */
    public void printVotingQuestions() {
        System.out.println("list of questions");
        for (Voting voting:votingList){

            System.out.println((votingList.indexOf(voting)+1)+")"+voting.getQuestion());
        }
    }

    /**
     * This method is used to print a question of voting and its choices.
     * @param index This a parameter that declare the index of voting in this system.
     */
    public void printVoting(int index) {
        Voting voting = votingList.get(index);
        System.out.println("-------------------------------------------");
        System.out.println(voting.getQuestion());
        for (String option:voting.getChoices()) {
            System.out.println(option);
        }
    }

    /**
     * This method is used to add a person to list of voter if he already voted he cant vote.
     * @param person This is a person who want to vote.
     * @param options This is a list of choice that person choose.
     * @param index This a parameter that declare the index of voting in this system.
     */
    public void vote(int index, Person person, ArrayList<String> options) {
        Voting voting = votingList.get(index);
        String option = options.get(0);
        if (voting.getType() == 0){
            if (option == "random"){
                Random r = new Random();
                Set<String> sets = voting.getListOfVoteToChoices().keySet();
                ArrayList<String> stringsList = new ArrayList<>(sets);
                option = stringsList.get(r.nextInt(voting.getListOfVoteToChoices().size()-1));
            }
            options.remove(0) ;
            options.add(option);
        }
        voting.vote(person,options);
    }

    /**
     * This method is used to print the choice and list of voter who vote to this choice.
     * @param index This a parameter that declare the index of voting in this system.
     */
    public void printResults(int index) {
        System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
        System.out.println("result voting : "+ (index+1));
        votingList.get(index).printVotes();
    }
}
