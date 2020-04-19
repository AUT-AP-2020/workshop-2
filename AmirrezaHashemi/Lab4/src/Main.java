import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        VotingSystem votingSystem = new VotingSystem();
        Person p1 = new Person("Amir", "Hashemi");
        Person p2 = new Person("Ali", "Majidi");
        Person p3 = new Person("Reza", "Ghorbani");
        Person p4 = new Person("Mr", "Random");

        ArrayList<String> options1 = new ArrayList<>();
        options1.add("Godfather");
        options1.add("Inception");
        options1.add("Pulp Fiction");
        options1.add("Se7en");
        votingSystem.createVoting("what's your favourite movie", 1, options1);
        ArrayList<String> ans = new ArrayList<>();
        ans.add("Inception");
        votingSystem.vote(0, p1, ans);
        ans.add("Se7en");
        votingSystem.vote(0, p1, ans);         // Already voted
        votingSystem.vote(0, p2, ans);
        ans.remove("Inception");
        ans.add("Pulp Fiction");
        ans.add("Godfather");
        votingSystem.vote(0, p3, ans);
        votingSystem.printVoting(0);
        votingSystem.printResults(0);
        ans.clear();
        ArrayList<String> options2 = new ArrayList<>();
        options2.add("yes");
        options2.add("no");
        votingSystem.createVoting("Are you happy", 0, options2);
        ans.add("yes");
        votingSystem.vote(1, p1, ans);
        ans.add("no");
        votingSystem.vote(1,p2,ans); //more than one answer
        ans.remove("no");
        votingSystem.vote(1,p2,ans);
        votingSystem.vote(1,p3,ans);
        ans.clear();
        ans.add("rand"); //random choice;
        votingSystem.vote(1,p4,ans);
        votingSystem.printVoting(1);
        votingSystem.printResults(1);





    }
}
