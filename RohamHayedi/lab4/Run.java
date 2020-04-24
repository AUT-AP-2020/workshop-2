import ir.huri.jcal.JalaliCalendar;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Run {
    public static void main(String[] args) {

        VotingSystem votingSystem = new VotingSystem();
        ArrayList<String> options0 = new ArrayList<>();
        ArrayList<String> options1 = new ArrayList<>();
        ArrayList<String> options2 = new ArrayList<>();

        options0.add("Pizza");
        options0.add("Sandwich");
        options0.add("Neither");

        options1.add("Saturday");
        options1.add("Sunday");
        options1.add("Monday");

        votingSystem.createVoting("Pizza or Sandwich?", 0, options0);
        votingSystem.createVoting("When are you available?", 1, options1);

        Person me = new Person("Roham", "Hayedi");
        ArrayList<String> myChoices0 = new ArrayList<>();
        ArrayList<String> myChoices1 = new ArrayList<>();
        myChoices0.add("Pizza");
        myChoices1.add("Saturday");
        myChoices1.add("Saturday");
        myChoices1.add("Sunday");

        votingSystem.vote(0, me, myChoices0);
        votingSystem.vote(1, me, myChoices1);
        System.out.println("Print questions:");
        votingSystem.printVotingQuestions();
        System.out.println("\nPrint voting 0 :");
        votingSystem.printVoting(0);
        System.out.println("\nPrint result 0 :");
        votingSystem.printResult(0);
        System.out.println("\nPrint voting 1 :");
        votingSystem.printVoting(1);
        System.out.println("\nPrint result 1 :");
        votingSystem.printResult(1);

        Person person = new Person("kc", "sd");
        ArrayList<String> kcsdChoices0 = new ArrayList<String>();
        ArrayList<String> kcsdChoices1 = new ArrayList<String>();
        kcsdChoices0.add("Neither");
        kcsdChoices1.add("Saturday");
        votingSystem.vote(1, person, kcsdChoices1);
        votingSystem.vote(0, person, kcsdChoices0);
        votingSystem.vote(0, person, kcsdChoices0);

        System.out.println("\nPrint voting 0 :");
        votingSystem.printVoting(0);
        System.out.println("\nPrint result 0 :");
        votingSystem.printResult(0);
        System.out.println("\nPrint voting 1 :");
        votingSystem.printVoting(1);
        System.out.println("\nPrint result 1 :");
        votingSystem.printResult(1);

    }
}
