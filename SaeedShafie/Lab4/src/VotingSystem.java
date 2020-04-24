import java.util.*;


public class VotingSystem {
    private ArrayList<Voting> votingList = new ArrayList<>();
    public VotingSystem(){
    }
    public void createVoting(String question,int type,ArrayList<String> options){
        Voting voting=new Voting(type,question);
        for(String option:options){
            voting.createPolls(option);
        }
        votingList.add(voting);

    }
    public void printVotingQuestions(){
        for(Voting voting:votingList){
            System.out.println(voting.getQuestions());
        }
    }

    public void printVoting(int votingNumber){
        Voting voting = votingList.get(votingNumber);
        System.out.println(voting.getQuestions());
        for(String option:voting.getPolls()){
            System.out.println(option);
        }

    }

    public void vote(int votingNum,Person person,ArrayList<String> options){
        Voting voting=votingList.get(votingNum);
        voting.vote(person,options);
    }

    public void printResults(int votingNum){
        Voting voting=votingList.get(votingNum);
        voting.printVotes();
    }
}



