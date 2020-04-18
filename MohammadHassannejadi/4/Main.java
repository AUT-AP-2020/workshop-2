import java.util.ArrayList;

/**
 * this is a test case for Main class
 * and we check it manual if you want to work with the app
 * please run the Run.java
 */
public class Main {
    public static void main(String[] args) {
        VotingSystem system = new VotingSystem();
        ArrayList<String> choices = new ArrayList<String>();
        String question = "Who do you select for the presidency ?";
        String choice1 = "Trump";
        choices.add(choice1);
        String choice2 = "Clinton";
        choices.add(choice2);
        system.createVoting(question, 0, choices);
        Person voter = new Person("Mohammad", "Hassannejadi");
        ArrayList<String> newChoices = new ArrayList<String>();
        newChoices.add("Trump");
        system.vote(0, voter, newChoices );
        newChoices.clear();
        voter = new Person("MR", "R");
        newChoices.add(system.randomVote(0));
        system.vote(0, voter, newChoices);
        newChoices.clear();

        voter = new Person("M", "K");
        newChoices.add(system.randomVote(0));
        system.vote(0, voter, newChoices);
        newChoices.clear();

        voter = new Person("MH", "A");
        newChoices.add("Trump");
        system.vote(0, voter, newChoices);
        newChoices.clear();

        voter = new Person("MA", "KH");
        newChoices.add("Clinton");
        system.vote(0, voter, newChoices);
        newChoices.clear();

        System.out.println("voting 1 list :");
        system.getVoting(0).getVoters();
        System.out.println();
        System.out.println("The result of voting : ");
        system.getResult(0);
        System.out.println();
        System.out.println();

        ArrayList<String> choices1 = new ArrayList<String>();
        String question1 = "Who is best?";
        choices1.add("Brad Pitt");
        choices1.add("Leo DiCaprio");
        choices1.add("Johnny Depp");
        choices1.add("George Clooney");

        system.createVoting(question1, 1, choices1); //multy vote

        system.printVotingQuestions();
        System.out.println("\n\n");

        voter = new Person("M", "HN");
        newChoices.add("George Clooney");
        newChoices.add("Brad Pitt");
        system.vote(1, voter, newChoices);

        newChoices.clear();

        voter = new Person("A", "KHN");
        newChoices.add("Leo DiCaprio");
        system.vote(1, voter, newChoices);

        newChoices.clear();

        voter = new Person("E", "MV");
        newChoices.add("Brad Pitt");
        newChoices.add("Leo DiCaprio");
        newChoices.add("Johnny Depp");
        newChoices.add("George Clooney");
        system.vote(1, voter, newChoices);

        newChoices.clear();

        system.printVoting(1);
        System.out.println();
        System.out.println();
        System.out.println("voting 2 list of voters and result :");
        system.getVoting(1).getVoters();
        System.out.println();
        System.out.println();
        System.out.println("The result of voting 2 : ");
        system.getResult(1);
        System.out.println();
        System.out.println();
        
        system.removeVoting(0);
        system.removeVoting(0);
    }
}
