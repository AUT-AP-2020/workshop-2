import java.util.ArrayList;

public class VotingSystem {
    ArrayList<Voting> votingList;

    public VotingSystem() {
        votingList = new ArrayList<Voting>();
    }

    public void createVoting(String question, int type, ArrayList<String> choices) {
        Voting voting = new Voting(type, question);
        for (String choice : choices) {
            voting.createChoice(choice);
        }
        votingList.add(voting);
    }

    public void printVotingQuestions() {
        for (Voting voting : votingList) {
            System.out.println(voting.getQuestion());
        }
    }

    public void printVoting(int index) {
        System.out.println(votingList.get(index).getQuestion());
        int i = 0;
        for (String choice : votingList.get(index).getChoices()) {
            i++;
            System.out.println(i + ") " + choice);
        }
    }

    public void vote(int index, Person voter, ArrayList<String> choices) {
        votingList.get(index).vote(voter, choices);
    }

    public void printResults(int index) {
        votingList.get(index).printVotes();
    }


}
