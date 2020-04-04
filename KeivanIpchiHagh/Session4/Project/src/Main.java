import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // Testing Data - Inspired by Minions (:
        VotingSystem votingSystem = new VotingSystem();

        // Create some votings
        votingSystem.createVoting(0, "Bananna? Bananna?");
        votingSystem.createVoting(1, "Banaaaanna?");
        votingSystem.createVoting(0, "Bananaaa?");
        votingSystem.createVoting(1, "Banana?");

        // Add some choices
        votingSystem.createChoice(0, "a");
        votingSystem.createChoice(1, "b");
        votingSystem.createChoice(0, "w");
        votingSystem.createChoice(1, "i");
        votingSystem.createChoice(0, "d");
        votingSystem.createChoice(0, "k");
        votingSystem.createChoice(1, "y");
        votingSystem.createChoice(0, "m");
        votingSystem.createChoice(1, "z");
        votingSystem.createChoice(0, "q");
        votingSystem.createChoice(2, "a");
        votingSystem.createChoice(3, "r");
        votingSystem.createChoice(2, "v");
        votingSystem.createChoice(3, "k");
        votingSystem.createChoice(2, "e");
        votingSystem.createChoice(3, "x");
        votingSystem.createChoice(2, "c");
        votingSystem.createChoice(3, "y");
        votingSystem.createChoice(2, "u");
        votingSystem.createChoice(3, "b");
        votingSystem.createChoice(2, "m");

        // Create some population
        Person person1 = new Person("Bob", "The minion");
        Person person2 = new Person("Kevin", "The minion");
        Person person3 = new Person("Felonious", "Gru");
        Person person4 = new Person("Stuart", "The minion");
        Person person5 = new Person("Scarlett", "Overkill");
        Person person6 = new Person("Herb", "Overkill");

        // Create some choices
        ArrayList<String> choices1 = new ArrayList<>();
        choices1.add("a");
        choices1.add("b");
        choices1.add("c");
        choices1.add("d");
        ArrayList<String> choices2 = new ArrayList<>();
        choices2.add("f");
        choices2.add("s");
        choices2.add("i");
        choices2.add("d");
        choices2.add("g");
        ArrayList<String> choices3 = new ArrayList<>();
        choices3.add("p");
        choices3.add("b");
        choices3.add("y");
        ArrayList<String> choices4 = new ArrayList<>();
        choices4.add("o");
        choices4.add("m");
        choices4.add("l");
        choices4.add("h");
        choices4.add("g");
        choices4.add("k");
        choices4.add("q");
        choices4.add("z");
        ArrayList<String> choices5 = new ArrayList<>();
        choices5.add("a");
        choices5.add("o");
        choices5.add("m");
        choices5.add("l");
        choices5.add("y");
        ArrayList<String> choices6 = new ArrayList<>();
        choices6.add("b");
        choices6.add("f");
        choices6.add("x");
        choices6.add("z");

        // All done, let's vote!
        votingSystem.vote(0, person1, choices1);
        System.out.println();
        votingSystem.vote(1, person2, choices2);
        System.out.println();
        votingSystem.vote(2, person3, choices3);
        System.out.println();
        votingSystem.vote(3, person4, choices4);
        System.out.println();
        votingSystem.vote(0, person5, choices5);
        System.out.println();
        votingSystem.vote(1, person6, choices6);
        System.out.println();

        // Print voting results
        votingSystem.printResult(0);
        System.out.println();
        votingSystem.printResult(1);
        System.out.println();
        votingSystem.printResult(2);
        System.out.println();
        votingSystem.printResult(3);
        System.out.println();

        // Print questions
        votingSystem.printVoting(0);
        votingSystem.printVoting(1);
        votingSystem.printVoting(2);
        votingSystem.printVoting(3);

        votingSystem.printListOfVotings();
    }
}
