import java.util.ArrayList;
import java.util.Random;

public class VotingSystem {
    private ArrayList<Voting> votingList;
    Random random = new Random();
    public VotingSystem() {
        votingList = new ArrayList<Voting>();
    }

    public void createVoting(String question, int type, ArrayList<String> choices) {
        Voting voting = new Voting(type,question);
        for (String choice : choices)
            voting.createChoice(choice);
        votingList.add(voting);
    }
    public void deleteVoting(int number) {
        for (int i = 0; i < votingList.size(); i++){
            if (i == number)
                votingList.remove(i);
        }
    }

    public ArrayList<Voting> getVotingList() {
        return votingList;
    }

    public void printVotingQuestions() {
        for (Voting v : votingList)
            System.out.println((votingList.indexOf(v)+1)+ ". " + v.getQuestion());
    }

    public void printVoting(int votingNumber) {
        System.out.println("question : " + votingList.get(votingNumber).getQuestion() + "\nchoices : ");
        for (int c = 0; c < votingList.get(votingNumber).getChoices().size(); c++)
            System.out.println(votingList.get(votingNumber).getChoices().get(c));
        System.out.println();
    }
    public void vote(int votingNumber, Person person, ArrayList<String> choices) {
        votingList.get(votingNumber).vote(person,choices);
    }
    public String randomVote(int number){
        ArrayList<String> arrayList = votingList.get(number).getChoices();
        if(votingList.get(number).getType() == 1) {
            return null;
        }
        int max = arrayList.size();
        return arrayList.get(random.nextInt(max));
    }

    public void printResult(int votingNumber) {
        System.out.println("((((result of voting))))");
                    votingList.get(votingNumber).printVotes();
                    System.out.println();
    }
}

