import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        VotingSystem votingsystems = new VotingSystem();
        Person voter1 = new Person("amirreza","rajabi");
        Person voter2 = new Person("amirhosein","rajabi");
        Person voter3 = new Person("mostafa","rajabi");
        ArrayList<String> choices1 = new ArrayList<>();
        ArrayList<String> choices2 = new ArrayList<>();
        choices1.add("supergirl");
        choices1.add("superman");
        choices1.add("flash");
        choices2.add("batman");
        choices2.add("batwoman");
        choices2.add("arrow");
        votingsystems.createVoting("who is the best hero?",0,choices1);
        votingsystems.createVoting("who is the best hero?",0,choices2);
        ArrayList<String> choice1 = new ArrayList<>();
        choice1.add("supergirl");
        ArrayList<String> choice2 = new ArrayList<>();
        choice2.add("batman");
        ArrayList<String> choice3 = new ArrayList<>();
        choice3.add("arrow");
        votingsystems.getVotingList().get(0).createChoice("blackcanary");
        votingsystems.vote(0,voter1,choice1);
        votingsystems.vote(0,voter2,choice1);
        votingsystems.vote(0,voter3,choice1);
        votingsystems.vote(1,voter1,choice2);
        votingsystems.vote(1,voter2,choice3);
        System.out.println(votingsystems.getVotingList().get(0).getQuestion());
        System.out.println("");
        votingsystems.printResults(0);
        System.out.println("\n\n\n\n\n");
        System.out.println(votingsystems.getVotingList().get(1).getQuestion());
        System.out.println("");
        votingsystems.printResults(1);
    }
}
