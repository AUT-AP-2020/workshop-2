package vote;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        VotingSystem votingSystem=new VotingSystem();
        votingSystem.createVoting("A",1);
        votingSystem.getVoting(0).createChoice("1");
        Scanner sc=new Scanner(System.in);


            Person person=new Person(sc.nextLine(),sc.nextLine());
            ArrayList<String> votes=new ArrayList<>();
            votes.add("1");
            votingSystem.vote(0,person,votes);

            votingSystem.getVoting(0).printResult();

    }
}
