import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class VotingSystem {

    private ArrayList<Voting> votingList;

    public VotingSystem(){
        votingList = new ArrayList<>();
    }

    public void createVoting(String question, int type, ArrayList<String> choices ){
        votingList.add(new Voting(question, type, choices));
    }

    public void deleteVoting(int index){
        votingList.remove(index);
    }

    public void vote(int index, Person person, ArrayList<String> votes){
        votingList.get(index).vote(person, votes);
    }

    public void printVotingQuestions() {
        for (Voting voting : votingList){
            System.out.println(voting.getQuestion());
        }
    }

    public void printVoting(int index){
        if (index < votingList.size()) {
            System.out.println(votingList.get(index).getQuestion());
            votingList.get(index).printChoices();
        }else
            System.out.println("Wrong index");
    }

    public void printResult(int index) {
        if (index < votingList.size()) {
            votingList.get(index).printResult();
        }else
            System.out.println("Wrong index");
    }
}
