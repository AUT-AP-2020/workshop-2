package vote;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Ali","Rahimian");
        Person p2 = new Person("Ali","Asadi");
        Person p3 = new Person("Ali","talaei");
        Person p4 = new Person("Mamad","talaei");
        Person p5 = new Person("Sadegh","rezaei");
        Person p6 = new Person("Ali","salimi");
        VotingSystem votingSystem = new VotingSystem();
        ArrayList<String> poll1 = new ArrayList<String>();
        poll1.add("YES");
        poll1.add("NO");
        votingSystem.createVoting("Do you go out ?" , 0 , poll1);
        ArrayList<String> poll2 = new ArrayList<String>();
        poll2.add("Pizza");
        poll2.add("Sandwich");
        poll2.add("Spagheti");
        poll2.add("Pasta");
        votingSystem.createVoting("Which one do you like ?" , 1 , poll2);
        ArrayList<String> choice = new ArrayList<String>();
        choice.add("YES");
        votingSystem.vote(0,p1,choice);
        votingSystem.vote(0,p2,choice);
        votingSystem.vote(0,p3,choice);
        votingSystem.printVoting(0);
        votingSystem.printResult(0);
        ArrayList<String> choice2 = new ArrayList<String>();
        ArrayList<String> choice3 = new ArrayList<String>();
        ArrayList<String> choice4 = new ArrayList<String>();
        choice2.add("Pizza");
        choice2.add("Pasta");
        choice3.add("Pasta");
        choice3.add("Sandwich");
        choice3.add("Spagheti");
        choice4.add("Spagheti");
        choice4.add("Pizza");
        votingSystem.vote(1,p1,choice2);
        votingSystem.vote(1,p2,choice2);
        votingSystem.vote(1,p3,choice3);
        votingSystem.vote(1,p4,choice4);
        votingSystem.vote(1,p5,choice4);
        votingSystem.printVoting(1);
        votingSystem.printResult(1);




    }
}
