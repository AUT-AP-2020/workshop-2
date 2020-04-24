import java.util.ArrayList;

public class VotingSystem {

    private ArrayList<Voting> votingList;

    public VotingSystem(){
        votingList = new ArrayList<>();
    }

    public void createVoting(String question, int type, ArrayList<String> answers){
        Voting voting = new Voting(type, question);
        for (String answer : answers)
            voting.createPoll(answer);
        votingList.add(voting);
    }

    public Voting getVoting(int index) {return votingList.get(index - 1);}

    public void printVotingList() {
        for (Voting voting : votingList)
            System.out.println(voting.getQuestion());
    }

    public void printVoting(int index) {
        int i = 0;
        System.out.println(votingList.get(index - 1).getQuestion());
        for (String answer : votingList.get(index - 1).getPolls()){
            i++;
            System.out.println(i + ") " + answer);
        }
    }

    public void vote(int index, Person person, ArrayList<String> votes){
        votingList.get(index - 1).vote(person, votes);
    }

    public void printAll(int index) {votingList.get(index - 1).printResult();}
}
