import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * this program is for simulating a voting system in which people can chose one _ or more than one in multi choice mode_
 * choice for each vote that is defend by a question.
 */
public class RunMenu {

    private static Scanner scanner = new Scanner(System.in);
    private static VotingSystem votingSystem = new VotingSystem();

    public static void main(String[] args) {

        votingSystem.creatVoting("question_1_singleVote",0,new ArrayList<>(Arrays.asList("choice1","choice2","choice3","choice4")));
        votingSystem.creatVoting("question_2_multiVote",1,new ArrayList<>(Arrays.asList("choice1","choice2","choice3","choice4")));

        int oper;
        do{
            System.out.println();
            printMenu();
            oper = scanner.nextInt();
            switch (oper)
            {
                case 1:
                        votingSystem.printVotingQuestions();
                        break;
                case 2:
                    System.out.println("enter number of voting at list.");
                    votingSystem.printResult(scanner.nextInt() - 1);
                    break;
                case 3:
                    makeVoting();
                    break;
                case 4:
                    vote();
            }
        }while (oper != 5);
    }

    /**
     * make a new voting and add it to votingSystem.
     */
    private static void makeVoting()
    {
        System.out.println("enter type of voting: 1-single choice   2-multi choice");
        int type = scanner.nextInt() -1;
        scanner.nextLine();
        System.out.println("enter question of this voting");
        String question = scanner.nextLine();
        System.out.println("enter the number of choice");
        int numberOfChoice = scanner.nextInt();
        ArrayList<String> choices = new ArrayList<>();
        scanner.nextLine();

        for(int i=0 ; i< numberOfChoice ; i++)
        {
            System.out.println("enter choice number " +(i+1) );
            choices.add(scanner.nextLine());
        }
        votingSystem.creatVoting(question,type,choices);
        System.out.println("added");
    }


    /**
     * vote to  chosen  choice.
     */
    private static void vote()
    {
        System.out.println("enter number of voting in list to vote");
        try {
            int votingNumber =  scanner.nextInt()-1;
            scanner.nextLine();

            System.out.println("hwo are you?\nenter your first name.");
            String fName = scanner.nextLine();
            System.out.println("enter your last name");
            String lName = scanner.nextLine();
            Person person = new Person(fName,lName);
            ArrayList<String> choice = new ArrayList<>();

            if(votingSystem.getVotings().get(votingNumber).getType() == 0) {
                System.out.println("1-Normal vote   2-Random vote");
                if(scanner.nextInt() == 1)
                {
                    System.out.println("choose one of choices of this question");
                    votingSystem.getVotings().get(votingNumber).printChoices();
                    String  thisChoice = votingSystem.getVotings().get(votingNumber).getThisChoice(scanner.nextInt()-1);
                    choice.add(thisChoice);
                }
                else {
                    votingSystem.randomVote(votingNumber, person);
                    return;
                }
            }
            else {
                System.out.println("choose some of choices of this question. enter -1 to submit.");
                votingSystem.getVotings().get(votingNumber).printChoices();
                int i=0;
                while (true){
                    i = scanner.nextInt();
                    if(i == -1)
                        break;
                    String  thisChoice = votingSystem.getVotings().get(votingNumber).getThisChoice(i-1);
                    choice.add(thisChoice);
                };
            }
            votingSystem.vote(votingNumber,person,choice);
            System.out.println("done");

        }catch (IndexOutOfBoundsException e)
        {
            System.out.println("not valid number.");
        }
    }

    private static void printMenu()
    {
        System.out.println( "1- see all voting's questions\n"+
                            "2- see result of a voting\n"  +
                            "3- add new voting\n"+
                            "4- vote\n"+
                            "5- exit");
    }
}
