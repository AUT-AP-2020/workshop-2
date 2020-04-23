import java.util.*;


public class Main {

    /**
     * this method print menu
     */
    public static void showMainMenu() {
        System.out.println("[1] Add voting\n" +
                "[2] Remove voting\n" +
                "[3] See voting\n" +
                "[4] All questions\n" +
                "[5] Vote\n" +
                "[6] See Voters\n" +
                "[7] See Choices\n" +
                "[8] Exit");
    }

    public static void main(String[] args) {

        VotingSystem votingSystem = new VotingSystem();

        System.out.println("Welcome to the voting system.");

        Scanner scan = new Scanner(System.in);

        ArrayList<String> choices = new ArrayList<>();
        ArrayList<String> myChoices = new ArrayList<>();
        String question;
        String firstName;
        String lastName;
        int type;
        int numberOfChoices;
        int index;

        while (true) {

            showMainMenu();

            int mainMenu = scan.nextInt();

            choices.clear();
            myChoices.clear();

            switch (mainMenu) {
                case 1:

                    System.out.println("Write the question of voting:");
                    scan.nextLine();
                    question = scan.nextLine();

                    do {
                        System.out.println("Enter the type of voting ( 0 for single and 1 for multi ):");
                        type = scan.nextInt();
                    } while (type != 0 && type != 1);

                    System.out.println("Enter the number of choices you want to add:");
                    numberOfChoices = scan.nextInt();
                    scan.nextLine();

                    for (int i = 0; i < numberOfChoices; i++) {
                        System.out.println("Enter your option:");
                        String temp = scan.nextLine();
                        choices.add(temp);
                    }

                    votingSystem.createVoting(question, type, choices);
                    System.out.println("The voting added successfully.");

                    break;
                case 2:

                    System.out.println("Enter the index of the voting:");
                    index = scan.nextInt();
                    votingSystem.removeVoting(index);

                    break;
                case 3:

                    System.out.println("Enter the index of the voting:");
                    index = scan.nextInt();
                    votingSystem.printResult(index);

                    break;
                case 4:
                    votingSystem.printListOfVotingQuestion();
                    break;
                case 5:

                    System.out.println("Enter the index of the voting:");
                    index = scan.nextInt();
                    System.out.println("Enter Your first name:");

                    scan.nextLine();
                    firstName = scan.nextLine();
                    System.out.println("Enter Your last name:");
                    lastName = scan.nextLine();

                    if (votingSystem.getType(index) == 0) {
                        int choose;
                        do {
                            System.out.println("This is a single voting. Press 1 for random vote or 2 for importing vote.");
                            choose = scan.nextInt();
                        } while (choose != 1 && choose !=2);

                        if (choose == 1) {
                            myChoices.add(votingSystem.giveRandomVote(index));
                        } else {
                            System.out.println("Write the chosen option:");
                            scan.nextLine();
                            myChoices.add(scan.nextLine());
                        }

                    } else {

                        System.out.println("This is a multi voting. Enter the number of options you want to chose:");
                        numberOfChoices = scan.nextInt();

                        scan.nextLine();
                        for (int i = 0; i < numberOfChoices; i++) {
                            System.out.println("Enter your option:");
                            String temp = scan.nextLine();
                            myChoices.add(temp);
                        }
                    }
                    votingSystem.vote(index, new Person(firstName, lastName), myChoices);
                    break;
                case 6:
                    index = scan.nextInt();
                    votingSystem.seeVotersOfVoting(index);
                    break;
                case 7:
                    index = scan.nextInt();
                    votingSystem.printChoicesOfVoting(index);
                    break;
                case 8:
                    break;
                default:
                    System.out.println("Invalid input.");
                    break;
            }
            if (mainMenu == 8) {
                System.out.println("Thanks for working with us.");
                return;
            }
        }

    }

}