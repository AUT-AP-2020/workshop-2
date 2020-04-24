import java.util.ArrayList;

public class VotingSystem {
    private ArrayList<Voting> votingList;

    public VotingSystem() {
        votingList = new ArrayList<>();
    }

    public void printListOfVotingQuestions() {
        for (Voting a: votingList) {
            System.out.println(a.getQuestion());
        }
    }

    public ArrayList<Voting> getVotingList() {
        return votingList;
    }

    public void createVoting(String question, int type, ArrayList<String> options) {
        Voting newVoting = new Voting(type, question);
        for (String a: options) {
            newVoting.createChoice(a);
        }
        votingList.add(newVoting);
    }

    public void getVoting(int index) {
        Voting tmp = getVotingList().get(index);
        System.out.println(tmp.getQuestion());
        for (String a: tmp.getChoices().keySet()) {
            System.out.println(a);
        }
    }

    public void vote(int index, Person person, ArrayList<String> chosenOptions) {
        votingList.get(index).vote(person, chosenOptions);
    }

    public void getResult(int index) {
        votingList.get(index).showResult();
    }
}
