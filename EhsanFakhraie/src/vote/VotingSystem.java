package vote;

import java.util.ArrayList;

public class VotingSystem {

    private ArrayList<Voting> votingList;

    public VotingSystem(){
        votingList=new ArrayList<>();
    }

    public void createVoting(String question,int type){
        votingList.add(new Voting(question,type));
    }

    public ArrayList<Voting> getVotingList() {
        return votingList;
    }

    public Voting getVoting(int index){
        return votingList.get(index);
    }

    public void printListOfVotings(){
        for (Voting e: votingList){
            System.out.println(e);
        }
    }

    public void printVoting(int i){
        System.out.println(getVoting(i));
    }

    public void vote(int i,Person p,ArrayList<String> votes){
        votingList.get(i).vote(p,votes);
    }


}
