import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        VotingSystem votingSystem = new VotingSystem();

        String question = "Do you come?";
        ArrayList<String> choices = new ArrayList<String>();

        choices.add("Yes");
        choices.add("No");

        votingSystem.createVoting(question, 0, choices);

        choices.clear();
        question = null;

        System.out.println("print voting: ");
        votingSystem.printVoting(0);

        Person voter1 = new Person("setayesh1", "sanavi1");
        Person voter2 = new Person("setayesh2", "sanavi2");
        Person voter3 = new Person("setayesh3", "sanavi3");
        Person voter4 = new Person("setayesh4", "sanavi4");
        ArrayList<String> myChoices = new ArrayList<>();
        myChoices.add("Yes");
        votingSystem.vote(0, voter1, myChoices);

        myChoices.clear();

        myChoices.add(votingSystem.randomVote(0));
        votingSystem.vote(0, voter2, myChoices);

        myChoices.clear();

        myChoices.add("Yes");
        votingSystem.vote(0, voter1, myChoices);

        myChoices.clear();

        myChoices.add("No");
        votingSystem.vote(0, voter3, myChoices);

        myChoices.clear();

        myChoices.add("No");
        votingSystem.vote(0, voter4, myChoices);

        myChoices.clear();

        myChoices.add("No");
        votingSystem.vote(0, voter1, myChoices);

        myChoices.clear();

        myChoices.clear();
        System.out.println("print result: ");
        votingSystem.printResult(0);
        System.out.println("\n\n\n\n");


        question = "which day ?";
        choices.add("sunday.");
        choices.add("monday");
        choices.add("friday");
        choices.add("none");
        votingSystem.createVoting(question, 1, choices);

        choices.clear();
        System.out.println("print voting questions:");
        votingSystem.printVotingQuestions();
        System.out.println("\n\n");

        myChoices.add("none");
        votingSystem.vote(1, voter1, myChoices);

        myChoices.clear();
        myChoices.add("monday");
        myChoices.add("friday");
        votingSystem.vote(1, voter2, myChoices);

        myChoices.clear();
        myChoices.add("sunday");
        myChoices.add("monday");
        myChoices.add("friday");
        votingSystem.vote(1, voter3, myChoices);

        myChoices.clear();

        myChoices.add("friday");
        votingSystem.vote(1, voter4, myChoices);

        myChoices.clear();

        votingSystem.printVoting(1);
        System.out.println("\n\n\n\n");

        votingSystem.printResult(1);
        votingSystem.deleteVoting(0);
        votingSystem.deleteVoting(1);
    }
}
