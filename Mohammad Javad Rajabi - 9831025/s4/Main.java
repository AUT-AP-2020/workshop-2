import java.util.ArrayList;
import java.util.Scanner;

/**
 * The Voting program is implement an application that create voting system
 * that can create new voting with question and choices to person can vote.
 *
 * @author Mohammad Javad Rajabi
 * @version 1.0
 * @since 2020-03-24
 */
public class Main {

    /**
     * This method simulate a voting system
     * @param args
     */
    public static void main(String[] args){

        Scanner myObj = new Scanner(System.in);

        VotingSystem votingSystem = new VotingSystem();
        Person voter_0 = new Person("Javad", "Rajabi");
        Person voter_1 = new Person("Parsa", "Ahani");
        Person voter_2 = new Person("Erfan", "Karimian");
        Person voter_3 = new Person("Erfan", "Naderi");
        Person voter_4 = new Person("Ali", "Pasyar");
        ArrayList travel = new ArrayList();
        ArrayList city = new ArrayList();
        ArrayList days = new ArrayList();
        travel.add("agree");
        travel.add("disagree");
        travel.add("random");
        city.add("Isfahan");
        city.add("Kish");
        city.add("Gheshm");
        city.add("Shomal");
        city.add("Mashad");
        city.add("random");
        days.add("saturday");
        days.add("sunday");
        days.add("Thursday");
        days.add("friday");
        votingSystem.creatingVoting("let's go trip",0,travel);
        votingSystem.creatingVoting("where?",0,city);
        votingSystem.creatingVoting("when?",1,days);
        System.out.println("print voting questions");
        votingSystem.printVotingQuestions();
        System.out.println("print voting");
        votingSystem.printVoting(0);
        ArrayList votes0_0 = new ArrayList();
        ArrayList votes0_1 = new ArrayList();
        ArrayList votes0_2 = new ArrayList();
        votes0_0.add("agree");
        votes0_1.add("random");
        votes0_2.add("sunday");
        votes0_2.add("friday");
        votingSystem.vote(0,voter_0,votes0_0);
        votingSystem.vote(1,voter_0,votes0_1);
        votingSystem.vote(2,voter_0,votes0_2);
        votingSystem.vote(2,voter_0,votes0_2);
        votingSystem.vote(2,voter_1,votes0_2);
//        myObj.next();
        System.out.println("print result");
        votingSystem.printResults(0);
        votingSystem.printResults(1);
        votingSystem.printResults(2);







    }

}
