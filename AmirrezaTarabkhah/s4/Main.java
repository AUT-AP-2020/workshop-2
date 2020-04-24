import java.util.*;

public class Main {

    public static void main(String[] arg){
        VotingSystem votingSystem = new VotingSystem();
        Person person1 = new Person("Amirreza","Tarabkhah");
        Person person2 = new Person("Ehsan","Helmi");
        Person person3 = new Person("Parham","Ashrafi");
        ArrayList<String> choice1 = new ArrayList<>();
        choice1.add("Reus");
        ArrayList<String> choice2 = new ArrayList<>();
        choice2.add("Pele");
        ArrayList<String> choice3 = new ArrayList<>();
        choice3.add("Messi");
        ArrayList<String> choice4 = new ArrayList<>();
        choice4.add("Ronaldo");
        ArrayList<String> choice5 = new ArrayList<>();
        choice5.add("Reus");
        choice5.add("Gotze");
        ArrayList<String> answer = new ArrayList<>();
        answer.add("Ronaldo");
        answer.add("Messi");
        answer.add("Pele");
        answer.add("Reus");
        votingSystem.createVoting("Who is the best player?",0, answer);
        votingSystem.printVoting(1);
        votingSystem.vote(1,person1,choice5);
        votingSystem.vote(1,person1,choice1);
        votingSystem.vote(1,person3,choice2);
        votingSystem.vote(1,person2,choice4);
        votingSystem.vote(1,person3,choice3);
        votingSystem.printAll(1);
        System.out.println();
        votingSystem.createVoting("Who are creative player",1, answer);
        votingSystem.printVoting(2);
        votingSystem.getVoting(2).createPoll("Kaka");
        votingSystem.getVoting(2).createPoll("Gotze");
        votingSystem.vote(2, person1, choice5);
        choice2.add("Kaka");
        choice2.add("Messi");
        votingSystem.vote(2, person2, choice2);
        votingSystem.printAll(2);
        System.out.println();
        votingSystem.printVotingList();
        System.out.println();
        votingSystem.printAll(1);
        System.out.println();
        votingSystem.printAll(2);
    }
}
