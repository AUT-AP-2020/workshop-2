import java.util.ArrayList;

/**
 * this class has some examples for running the code.
 *
 * @version 0.0
 * @author Arvand
 */
public class Main {

    public static void main(String[] args) {
        VotingSystem poll = new VotingSystem();

        ArrayList<String> options1 = new ArrayList<>();
        options1.add("Leo Dicaprio"); options1.add("Brad Pitt"); options1.add("Steve Carrel");
        poll.createVoting("Who would you rather ?", 0, options1);

        ArrayList<String> options2 = new ArrayList<>();
        options2.add("Drake"); options2.add("Travis Scott"); options2.add("The Weeknd");
        poll.createVoting("Who would you prefer ?", 1, options2);

        System.out.println("what poll(s) do we have : ");
        poll.printListOfVotingQuestions();

        System.out.println();

        System.out.println("poll 1 :");
        poll.getVoting(0);

        System.out.println();

        System.out.println("poll 2 :");
        poll.getVoting(1);

        Person Ali = new Person("Ali", "Karimi");
        ArrayList<String> aliOption1 = new ArrayList<>();
        aliOption1.add("Leo Dicaprio");
        ArrayList<String> aliOption2 = new ArrayList<>();
        aliOption2.add("The Weeknd"); aliOption2.add("Drake");

        Person Arvand = new Person("Arvand", "Darvish");
        ArrayList<String> arvandOption1 = new ArrayList<>();
        arvandOption1.add("Steve Carrel");
        ArrayList<String> arvandOption2 = new ArrayList<>();
        arvandOption2.add("Drake"); arvandOption2.add("Travis Scott");

        Person Shaqayeq = new Person("Shaqayeq", "Sabouri");
        ArrayList<String> shaqayeqOption1 = new ArrayList<>();
        shaqayeqOption1.add("Steve Carrel");
        ArrayList<String> shaqayeqOption2 = new ArrayList<>();
        shaqayeqOption2.add("Drake");

        poll.vote(0, Ali, aliOption1);
        poll.vote(0, Arvand, arvandOption1); poll.vote(0, Shaqayeq, shaqayeqOption1);

        poll.vote(1, Ali, aliOption2); poll.vote(1, Arvand, arvandOption2); poll.vote(1, Shaqayeq, shaqayeqOption2);

        System.out.println("\nresults for poll 1 :");
        poll.getResult(0);

        System.out.println("\nresults for poll 2 :");
        poll.getResult(1);

        System.out.println("\nvoters are :");
        poll.getVotingList().get(0).getVoters();

        //in this part we showed the specifications of each option, here we showed the specifications of Drake's votes.
        System.out.println("\nvotes for Drake in poll 2 :");
        for (Vote a: poll.getVotingList().get(1).getChoices().get("Drake")) {
            System.out.println(a.getPerson().getFirstName() + " " + a.getPerson().getLastName() + " : " + a.getDate());
        }
    }
}
