import java.util.ArrayList;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        Person n0 = new Person("amir", "belbasi");
        Person n1 = new Person("rashed", "ansari");
        Person n2 = new Person("reza", "qanari");
        Person n3 = new Person("amin", "yadol");
        Person n4 = new Person("mehdi", "taj");
        Person n5 = new Person("tony", "montana");
        Person n6 = new Person("simin", "belbasi");
        Person n7 = new Person("alber", "kamo");
        Person n8 = new Person("ali", "dae");
        Person n9 = new Person("black", "beard");
        VotingSystem mySystem = new VotingSystem();
        ArrayList<String> choices = new ArrayList<>();
        choices.add("music");
        choices.add("movies");
        choices.add("video games");
        mySystem.createVoting("which one?", 0, choices);
        mySystem.getVoting(0).createChoice("series");
        ArrayList<String> choicesOfVoter = new ArrayList<>();
        choicesOfVoter.add("music");
        choicesOfVoter.add("movies");
        mySystem.vote(0, n0, choicesOfVoter); // cant register two votes in a one vote type election
        choicesOfVoter.remove("movies");
        mySystem.printResult(0);
        mySystem.vote(0, n0, choicesOfVoter);
        mySystem.printResult(0);
        choicesOfVoter.remove("music");
        choicesOfVoter.add("video games");
        mySystem.vote(0, n0, choicesOfVoter); // cant vote twice in a same election
        mySystem.vote(0, n3, choicesOfVoter);
        mySystem.vote(0, n1, choicesOfVoter);
        mySystem.vote(0, n2, choicesOfVoter);
        mySystem.printResult(0);
        choices = new ArrayList<>();
        choices.add("german");
        choices.add("husky");
        choices.add("poodle");
        choices.add("bull dog");
        choices.add("snoop dog");
        mySystem.createVoting("which dog?", 1, choices);
        mySystem.printResult(1);
        mySystem.vote(1, n4, choices);
        mySystem.printResult(1);
        choices.remove("poodle");
        mySystem.vote(1, n4, choices); // cant vote twice in a same election
        mySystem.vote(1, n5, choices);
        mySystem.vote(1, n6, choices);
        choices.remove("bull dog");
        mySystem.vote(1, n7, choices);
        mySystem.vote(1, n8, choices);
        choices.remove("german");
        mySystem.vote(1, n9, choices);

        mySystem.printResult(0);
        mySystem.printResult(1);
    }
}