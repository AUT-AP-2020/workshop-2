/**
 * @author kasra
 * @version 1.0
 * @since 2020-4-8
 * Main class
 * have main method to run program.
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        VotingSystem votingSystem = new VotingSystem();
        Voting vote = new Voting(0, "");
        Person person;
        Vote voteCard;

        System.out.print("number of votings:");
        int votings = scanner.nextInt();
        for (int i = 0; i < votings; i++) {
            System.out.print("type of voting:");
            int type = scanner.nextInt();
            scanner.nextLine();
            System.out.print("question:");
            String question = scanner.nextLine();
            vote = new Voting(type, question);
            votingSystem.votingList.add(vote);
            System.out.print("number of choices:");
            int choices = scanner.nextInt();
            scanner.nextLine();
            for (int j = 0; j < choices; j++) {
                vote.voteNum = new int[choices];
                System.out.print("choice:");
                String choice = scanner.nextLine();
                vote.choices.add(choice);
            }
            vote.polls.put(question, vote.getChoices());
        }

        System.out.println("do you want to create choice?   1)Yes   2)No");
        System.out.print("enter:");
        int tmp = scanner.nextInt();
        scanner.nextLine();
        if (tmp == 1) {
            System.out.print("number of voting:");
            int voting = scanner.nextInt();
            scanner.nextLine();
            System.out.print("enter choose:");
            String choose = scanner.nextLine();
            vote.createChoice(choose, votingSystem.votingList.get(voting));
            votingSystem.votingList.get(voting).voteNum = new int[votingSystem.votingList.get(voting).voteNum.length + 1];
        }

        for (int i = 0; i < votingSystem.votingList.size(); i++) {
            System.out.println(i + ")" + votingSystem.votingList.get(i).getPolls());
        }
        while (true) {
            System.out.print("choose your voting:");
            int voteChoose = scanner.nextInt();
            scanner.nextLine();
            System.out.println(votingSystem.votingList.get(voteChoose).getChoices());
            System.out.print("first name:");
            String firstName = scanner.nextLine();
            System.out.print("last name:");
            String lastName = scanner.nextLine();
            person = new Person(firstName, lastName);
            vote.voters.add(person);
            if (votingSystem.votingList.get(voteChoose).getType() == 1) {
                System.out.print("number of your choose:");
                int chooseNum = scanner.nextInt();
                scanner.nextLine();
                for (int i = 0; i < chooseNum; i++) {
                    System.out.print("enter:");
                    int choose = scanner.nextInt();
                    scanner.nextLine();
                    votingSystem.votingList.get(voteChoose).voteNum[choose]++;
                    voteCard = new Vote();
                }
            } else {
                System.out.print("number of your choose:");
                int choose = scanner.nextInt();
                votingSystem.votingList.get(voteChoose).voteNum[choose]++;
                voteCard = new Vote();
            }
            vote.printResult(votingSystem.votingList.get(voteChoose));
        }
    }
}
