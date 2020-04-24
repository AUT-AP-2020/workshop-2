// In The Name Of GOD

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        VotingSystem votingSystem = new VotingSystem();
        Person[] p = new Person[]{new Person("s1", "e1"), new Person("s2", "e2"), new Person("s3", "e3"), new Person("s4", "e4")};
        ArrayList<String>[] choices = new ArrayList[4];
        for (int i = 0; i < 4; i++)
            choices[i] = new ArrayList<>();
        votingSystem.createVoting("q1", 0);
        for (int i = 1; i <= 4; i++)
            votingSystem.getVoting(0).createChoice("c" + i);
        for (int i = 0; i < 4; i++)
            choices[i].add("c" + (i + 1));
        for (int i = 0; i < 4; i++)
            votingSystem.vote(0, p[i], choices[i]);
        votingSystem.printResult(0);
        System.out.println();
        votingSystem.createVoting("q2", 1);
        for (int i = 1; i <= 4; i++)
            votingSystem.getVoting(1).createChoice("c" + i);
        for (int i = 0; i < 4; i++)
            votingSystem.vote(1, p[i], choices[i]);
        votingSystem.printResult(1);
        System.out.println();
        votingSystem.printListOfVoting();
        System.out.println();
        votingSystem.printVoting(0);
        votingSystem.printVoting(1);
        System.out.println();
        votingSystem.printResult(0);
        System.out.println();
        votingSystem.printResult(1);
        System.out.println();
    }
}
