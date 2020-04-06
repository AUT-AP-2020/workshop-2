
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * simple test for this program.
 */
public class Test {

    public static void main(String[] args) {
        VotingSystem votingSystem = new VotingSystem();
        ArrayList<String> choice1 = new ArrayList<>(Arrays.asList("ch1","ch2","ch3"));
        votingSystem.creatVoting("q1",1,choice1);

        ArrayList<String> choice2 = new ArrayList<>(Arrays.asList("ch1","ch2"));
        ArrayList<String> choice3 = new ArrayList<>(Arrays.asList("ch1","ch3"));

        Person p1 = new Person("f1","l1");
        Person p2 = new Person("f2","l2");
        Person p3 = new Person("f3","l3");
        Person p4 = new Person("f4","l4");
        Person p5 = new Person("f5","l5");
        votingSystem.vote(0,p1,choice1);
        votingSystem.vote(0,p2,choice2);
        votingSystem.vote(0,p2,choice2);
        votingSystem.vote(0,p3,choice3);
        votingSystem.vote(0,p4,choice2);


        votingSystem.creatVoting("q21",0,choice1);
        ArrayList<String> ch1 = new ArrayList<>(Collections.singletonList("ch1"));
        ArrayList<String> ch2 = new ArrayList<>(Collections.singletonList("ch2"));
        ArrayList<String> ch3 = new ArrayList<>(Collections.singletonList("ch3"));

        votingSystem.vote(1,p1,ch1);
        votingSystem.vote(1,p2,ch2);
        votingSystem.vote(1,p3,ch3);
        votingSystem.randomVote(1,p4);
        votingSystem.randomVote(1,p5);

        System.out.println();
        votingSystem.printVote(0);
        votingSystem.printResult(0);
        System.out.println();
        votingSystem.printVote(1);
        votingSystem.printResult(1);



    }
}
