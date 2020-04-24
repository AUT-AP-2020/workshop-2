import java.util.ArrayList;

public class Mian {
    public static void main(String[] args) {
        Person p1 = new Person("Bob","Bobby");
        Person p2 = new Person("Sam","Sami");
        Person p3 = new Person("Jack","Jackie");
        Person p4 = new Person("Fred","Fredie");
        VotingSystem votingSystem = new VotingSystem();
        ArrayList<String> poll1 = new ArrayList<String>();
        votingSystem.createVoting("Are you Crazy?" , 0 , poll1);
        poll1.add("Yes");
        poll1.add("No");
        ArrayList<String> poll2 = new ArrayList<String>();
        votingSystem.createVoting("If not crazy what are you?" , 1 , poll2);
        poll2.add("Sadistic");
        poll2.add("humorous");
        poll2.add("Dumb");
        poll2.add("Normal");
        ArrayList<String> option= new ArrayList<String>();
        votingSystem.vote(0,p1,option);
        votingSystem.vote(0,p2,option);
        votingSystem.vote(0,p3,option);
        votingSystem.printVoting(0);
        votingSystem.printResults(0);
        ArrayList<String> option2 = new ArrayList<String>();
        ArrayList<String> option3 = new ArrayList<String>();
        ArrayList<String> option4 = new ArrayList<String>();
        option2.add("Normal");
        option3.add("Dumb");
        option3.add("Sadistic");
        option4.add("Normal");
        votingSystem.vote(1,p1,option2);
        votingSystem.vote(1,p2,option2);
        votingSystem.vote(1,p3,option3);
        votingSystem.vote(1,p4,option4);
        votingSystem.printVoting(1);
        votingSystem.printResults(1);




    }
}