import java.util.ArrayList;

public class VotingSystem {

    private ArrayList<Voting> votingList;

    /**
     * constructor which creat an ArrayList
     */
    public VotingSystem(){
        votingList = new ArrayList<>();
    }

    /**
     * this method is creat a new voting
     * @param question is the question of voting
     * @param type is show the voting is one vote or multi vote
     * @param choices is the String ArrayList of option
     */
    public void createVoting(String question, int type, ArrayList<String> choices){

        Voting newVote = new Voting(type, question);

        for(String choice : choices){
            newVote.createChoice(choice);
        }

        votingList.add(newVote);

    }

    /**
     * this method will print all of the voting's questions
     */
    public void printListOfVotingQuestion(){
        for(Voting voting : votingList){
            System.out.println(voting.getQuestion());
        }
    }

    /**
     * this method show the choices of voting
     * @param index is the place of the voting in votingList
     */
    public void printChoicesOfVoting(int index){
        if(check(index)) {
            System.out.println(votingList.get(index).getQuestion());
            votingList.get(index).printChoices();
        } else {
            System.out.println("enter right number.");
        }
    }

    /**
     * this method will get a voting and them vote to it
     * @param index the place of vote inside the list
     * @param tempPerson an instance of our Person class
     * @param votes an ArrayList of votes
     */
    public void vote(int index, Person tempPerson, ArrayList<String>votes){
        if(check(index)) {
            votingList.get(index).vote(tempPerson, votes);
        } else {
            System.out.println("enter right number.");
        }
    }

    /**
     * this method will get an index and then will print the result of that voting
     * @param index the place of voting in our list
     */
    public void printResult(int index){
        if(check(index)) {
            votingList.get(index).printResult();
        } else {
            System.out.println("enter right number.");
        }
    }

    /**
     * this method check to see the index is not upper from last object index or downer from zero
     * @param index the place of voting in our list
     * @return the value to see the index is valid or not
     */
    public boolean check(int index){
        return index >= 0 && index < votingList.size();
    }

    /**
     * this will get and index and then remove the voting from the list
     * @param index the place of voting in the voting list
     */
    public void removeVoting(int index){
        if(check(index)) {
            votingList.remove(index);
            System.out.println("The vote removed successfully.");
        } else {
            System.out.println("enter right number.");
        }
    }

    /**
     * this is a getter method for the type of a voting
     * @param index the place of a voting in the list
     * @return the type of that voting
     */
    public int getType(int index){
        if(check(index)) {
            return votingList.get(index).getType();
        } else {
            System.out.println("enter right number.");
            return -1;
        }
    }

    /**
     * this is show all vote in one voting
     * @param index the place of a voting in the list
     */
    public void seeVotersOfVoting(int index){
        if(check(index)) {
            votingList.get(index).seeVoters();
        } else {
            System.out.println("enter right number.");
        }
    }

    /**
     * this method will go inside a voting an will chose a random choice of that voting for us
     * @param index the voting index
     * @return an option inside that voting
     */
    public String giveRandomVote(int index){
        if(check(index)) {
            return votingList.get(index).randomVote();
        } else {
            System.out.println("enter right number.");
            return "Don't exist";
        }
    }

}
