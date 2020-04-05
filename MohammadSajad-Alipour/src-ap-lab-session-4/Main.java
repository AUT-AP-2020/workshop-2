import java.util.ArrayList;
import java.util.Scanner;

/**
 * This is the main class to test and run classes and methods
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        VotingSystem votingSystem = new VotingSystem();
        /**
         * Type 0 voting
         */
        //Creating choices list
        ArrayList<String> choicesVotingNum1=new ArrayList<>();
        //Adding choices
        choicesVotingNum1.add("Cristiano Ronaldo");
        choicesVotingNum1.add("Lionel Messi");
        choicesVotingNum1.add("Neymar");
        //Creating the voting
        votingSystem.createVoting("Who is the best player?",0,choicesVotingNum1);
        //Testing printVoting method
        votingSystem.printVoting(0);
        //Creating voters and choosing their choices
        Person voter1=new Person("a","A");
        ArrayList<String> voter1Choices=new ArrayList<>();
        voter1Choices.add("Cristiano Ronaldo");
        Person voter2=new Person("b","B");
        ArrayList<String> voter2Choices=new ArrayList<>();
        voter2Choices.add("Lionel Messi");
        Person voter3=new Person("c","C");
        ArrayList<String> voter3Choices=new ArrayList<>();
        voter3Choices.add("Neymar");
        Person voter4=new Person("d","D");
        ArrayList<String> voter4Choices=new ArrayList<>();
        voter4Choices.add("Cristiano Ronaldo");
        //Submitting votes
        votingSystem.vote(0,voter1,voter1Choices);
        votingSystem.vote(0,voter2,voter2Choices);
        votingSystem.vote(0,voter3,voter3Choices);
        votingSystem.vote(0,voter4,voter4Choices);
        //Showing the result
        votingSystem.printResults(0);
        /**
         * Type 1 voting
         */
        ArrayList<String> choicesVotingNum2=new ArrayList<>();
        choicesVotingNum2.add("Money heist");
        choicesVotingNum2.add("Dark");
        choicesVotingNum2.add("Mr.Robot");
        choicesVotingNum2.add("Rick And Morty");
        choicesVotingNum2.add("Bojack Horseman");
        votingSystem.createVoting("Which TV show do you like?",1,choicesVotingNum2);
        votingSystem.printVoting(1);
        Person voter11=new Person("a","A");
        ArrayList<String> voter11Choices=new ArrayList<>();
        voter11Choices.add("Dark");
        voter11Choices.add("Bojack Horseman");
        Person voter22=new Person("b","B");
        ArrayList<String> voter22Choices=new ArrayList<>();
        voter22Choices.add("Dark");
        voter22Choices.add("Mr.Robot");
        Person voter33=new Person("c","C");
        ArrayList<String> voter33Choices=new ArrayList<>();
        voter33Choices.add("Money heist");
        voter33Choices.add("Rick And Morty");
        voter33Choices.add("Dark");
        voter33Choices.add("Mr.Robot");
        Person voter44=new Person("d","D");
        ArrayList<String> voter44Choices=new ArrayList<>();
        voter44Choices.add("Dark");
        voter44Choices.add("Money heist");
        votingSystem.vote(1,voter11,voter11Choices);
        votingSystem.vote(1,voter22,voter22Choices);
        votingSystem.vote(1,voter33,voter33Choices);
        votingSystem.vote(1,voter44,voter44Choices);
        votingSystem.printResults(1);
        //Testing printVotingQuestions Method
        votingSystem.printVotingQuestions();
    }
}
