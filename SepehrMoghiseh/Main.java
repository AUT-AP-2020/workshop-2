import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
	    VotingSystem votingSystem = new VotingSystem() ;
	    Person voter1 = new Person ("Sepehr" , "Moghiseh") ;
	    Person voter2 = new Person ("Sepehr" , "Moghiseh2") ;
	    ArrayList<String> options = new ArrayList() ;
	    ArrayList<String> days = new ArrayList<>() ;
	    options.add("No" );
	    options.add("Yes");
	    days.add("Thursday");
	    days.add("Friday");
	    days.add("Saturday");
	    votingSystem.createVoting("Do you come?" , 0 , options) ;
	    votingSystem.createVoting("Which day?" , 1 , days);
        System.out.println("Print Voting Questions :");
        votingSystem.printVotingsQuestions();
        System.out.println("Print Voting 1 :");
        votingSystem.printVoting(0) ;
        System.out.println("Print Voting 2 :");
        votingSystem.printVoting(1) ;
        ArrayList<String> votes11 = new ArrayList<>() ;
        votes11.add("Yes") ;
        ArrayList<String> votes12 = new ArrayList<>() ;
        votes12.add("Yes") ;
        ArrayList<String> votes21 = new ArrayList<>() ;
        votes21.add("Thursday") ;
        votes21.add("Friday") ;
        ArrayList<String> votes22 = new ArrayList<>() ;
        votes22.add("Thursday") ;
        votes22.add("Saturday") ;
        votingSystem.vote(0 , voter1 , votes11);
        votingSystem.vote(0 , voter2 , votes12);
        votingSystem.vote(1 , voter1 , votes21);
        votingSystem.vote(1 , voter2 , votes22);
        System.out.println("Print Results :");
        votingSystem.printResults(0);
        votingSystem.printResults(1);
    }
}
