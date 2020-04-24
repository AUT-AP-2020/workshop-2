/**
 * This class designed to test voting system.
 *
 */

import java.util.ArrayList;

public class testClass {

    public static void main(String[] args){
        VotingSystem VS = new VotingSystem() ;
        ArrayList<String> subjectList = new ArrayList<>();
        subjectList.add("math");
        subjectList.add("physic");
        subjectList.add("AP");
        VS.createVoting("Which one is your favorite subject?" , 1 , subjectList);
        Person voter1 = new Person ("Erfan" , "Azari") ;
        ArrayList<String> person1Votes = new ArrayList<>() ;
        Person person2 = new Person ("Ali" , "Mohammadi") ;
        ArrayList<String> person2Votes = new ArrayList<>() ;
        person1Votes.add("AP") ;
        person1Votes.add("math") ;
        person2Votes.add("physic");
        person2Votes.add("AP");
        VS.vote(0 , voter1 , person1Votes);
        VS.vote(0 , person2 , person2Votes);
        VS.getVotingList();
        VS.printVoting(0) ;
        VS.getResult(0);
    }
}
