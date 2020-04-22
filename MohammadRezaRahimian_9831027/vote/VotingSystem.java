package vote;

import java.util.ArrayList;
import java.util.HashSet;

public class VotingSystem {
    static ArrayList<Voting> votingList = new ArrayList<Voting>();
    public void createVoting(String question , int type , ArrayList<String> polls){
        Voting voting = new Voting(type,question);
        votingList.add(voting);
        voting.choices = polls;
        for (String i : polls){
            voting.polls.put(i , new HashSet<Vote>());
        }
    }

    public void printListOfVoting(){

    }
    public void printVoting(int vote){
        votingList.get(vote).printVotes();
    }

    public void vote(int voteNum , Person person , ArrayList<String> choices){
        if (votingList.get(voteNum).type == 0 ) {
            if (choices.size() == 1) {
                votingList.get(voteNum).vote(person, choices);
            }
            else {
                System.out.println("Just You Can Choose One");
            }
        }
        else {
            votingList.get(voteNum).vote(person, choices);
        }
    }

    public void printResult(int voteNum){
        String date = new String();
        for(String i : votingList.get(voteNum).polls.keySet()){
            System.out.println(i + " : " + votingList.get(voteNum).polls.get(i).size() + " votes from : ");
            for(Vote j : votingList.get(voteNum).polls.get(i) ){
                System.out.print(j.person.firstName + " " + j.person.lastName + "  ");
                date = j.date ;
            }
            System.out.println();
            System.out.println("in date : " + date);
        }
    }
}
