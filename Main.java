import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        VotingSystem votingSystem = new VotingSystem();
        Person p1 = new Person("Ali", "Ansari");
        Person p2 = new Person("Amirp", "Salman");
        Person p3 = new Person("Sajad", "CR7");
        ArrayList<String >polls=new ArrayList<>();
        ArrayList<String>polls1=new ArrayList<>();
        ArrayList<String>polls2=new ArrayList<>();
        ArrayList<String>polls3=new ArrayList<>();
        polls.add("Ali");
        polls.add("Sajad");
        polls.add("Parham");
        polls.add("Amir");
        polls.add("Bagher");
        polls.add("Parsa");

        polls1.add("Ali");
        polls1.add("Sajad");
        polls1.add("Parham");

        polls2.add("Amir");
        polls2.add("Bagher");
        polls2.add("Parsa");

        polls3.add("Ali");
        polls3.add("Sajad");
        polls3.add("Parham");

        votingSystem.createVoting("Who broke the quarantine?",1,polls);
        votingSystem.vote(0,p1,polls1);
        votingSystem.vote(0,p2,polls2);
        votingSystem.vote(0,p3,polls3);
        votingSystem.getVoting(0);
        votingSystem.getResult(0);
    }
}
