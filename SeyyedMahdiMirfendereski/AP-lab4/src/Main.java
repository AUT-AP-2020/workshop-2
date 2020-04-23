import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        VotingSystem testing=new VotingSystem();
        Person firstPerson=new Person("Mahdi","Mirfendereski");
        Person secondPerson=new Person("Ali","Mohammadi");
        ArrayList<String> firstOptions=new ArrayList<>();
        ArrayList<String> secondOptions=new ArrayList<>();
        firstOptions.add("+");
        firstOptions.add("-");
        secondOptions.add("sunday");
        secondOptions.add("friday");
        secondOptions.add("saturday");
        testing.createVoting("Do you come?",0,firstOptions);
        testing.createVoting("Which day?",1,secondOptions);
        testing.printVotingQuestions();
        testing.printVoting(0);
        // print voting testing
        testing.printVoting(1);
        ArrayList<String> votes1 =new ArrayList<>();
        ArrayList<String> votes2 =new ArrayList<>();
        votes1.add("+");
        votes2.add("friday");
        votes2.add("saturday");
        testing.vote(0,firstPerson,votes1);
        testing.vote(1,firstPerson,votes2);
        testing.printResult(0);
        //2 choices win
        testing.printResult(1);
        //voting randomly testing
        testing.randomVote(0,secondPerson);
        votes2.remove(0);
        testing.vote(1,secondPerson,votes2);
        testing.printResult(0);
        testing.printResult(1);
        System.out.println("first voting");
        testing.getVoters(0);
        System.out.println("second voting");
        testing.getVoters(1);
    }
}
