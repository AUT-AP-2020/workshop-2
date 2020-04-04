package com.myPack;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * this is a run test and it is program sample of this project
 * with scanner and switch
 */
public class Run {
    /**
     * this is a menu for showing what to do to user
     */
    public static void showMainMenu(){
        System.out.println("[1] Add voting\n[2] Remove voting\n[3] See voting\n[4] All questions\n[5] Vote\n[6] See Voters\n[7] See Choices\n[8] Exit");
    }

    /**
     * our main execute part of the program
     * @param args --
     */
    public static void main(String[] args){
        //Create an instance of our main class VotingSystem
        VotingSystem votingSystem = new VotingSystem();
        //The first welcome sentence
        System.out.println("Welcome to the voting system.");

        //Create an instance of Scanner library
        Scanner scan = new Scanner(System.in);

        //This is for the enters that the user inputs so we can get the inputs
        String garbage;

        while (true){
            //Showing them the menu
            showMainMenu();

            //Getting the first input to see what to do
            int input = scan.nextInt();

            //Temp names and lists and questions we need for creating
            String question;
            String firstName;
            String lastName;
            int type;
            int numberOfChoices;
            int index;
            //This list is for creating a voting
            ArrayList<String> choices = new ArrayList<String>();
            //This list is for creating votes
            ArrayList<String> myChoices = new ArrayList<String>();

            //First we clear every field cause we might used them in the past
            choices.clear();
            myChoices.clear();
            question = null;
            firstName = null;
            lastName = null;
            type = 0;
            numberOfChoices = 0;
            index = 0;

            //The switch case where we decide what the user wants to do
            switch (input){
                case 8:
                    //To exit the program
                    break;
                case 1:
                    //This is for crating a voting
                    System.out.println("Write the question of voting:");
                    //We need this cause of the enter inputs
                    //If you remove it the program won't work correctly
                    garbage = scan.nextLine();
                    question = scan.nextLine();
                    System.out.println("Enter the type of voting ( 0 for single and 1 for multi ):");
                    type = scan.nextInt();
                    System.out.println("Enter the number of choices you want to add:");
                    numberOfChoices = scan.nextInt();
                    //We need this cause of the enter inputs
                    //If you remove it the program won't work correctly
                    garbage = scan.nextLine();
                    for(int i = 0; i < numberOfChoices; i++){
                        System.out.println("Enter your option:");
                        String temp = scan.nextLine();
                        choices.add(temp);
                    }
                    votingSystem.createVoting(question, type, choices);
                    System.out.println("The voting added successfully.");
                    break;
                case 2:
                    //For removing a voting
                    System.out.println("Enter the index of the voting:");
                    index = scan.nextInt();
                    votingSystem.removeVoting(index);
                    System.out.println("The vote removed successfully.");
                    break;
                case 3:
                    //To see the result of a voting
                    System.out.println("Enter the index of the voting:");
                    index = scan.nextInt();
                    votingSystem.printResult(index);
                    break;
                case 4:
                    //To see all of the questions
                    votingSystem.printVotingQuestions();
                    break;
                case 5:
                    System.out.println("Enter the index of the voting:");
                    index = scan.nextInt();
                    System.out.println("Enter Your first name:");
                    //We need this cause of the enter inputs
                    //If you remove it the program won't work correctly
                    garbage = scan.nextLine();
                    firstName = scan.nextLine();
                    System.out.println("Enter Your last name:");
                    lastName = scan.nextLine();
                    if (votingSystem.getType(index) == 0){
                        int chose;
                        System.out.println("This is a single voting. Press 1 for random vote or 2 for importing vote.");
                        chose = scan.nextInt();
                        if (chose == 1){
                            myChoices.add(votingSystem.randomVote(index));
                        } else {
                            System.out.println("Write the chosen option:");
                            //We need this cause of the enter inputs
                            //If you remove it the program won't work correctly
                            garbage = scan.nextLine();
                            String temp = scan.nextLine();
                            myChoices.add(temp);
                        }
                    } else {
                        System.out.println("This is a multi voting. Enter the number of options you want to chose:");
                        numberOfChoices = scan.nextInt();
                        //We need this cause of the enter inputs
                        //If you remove it the program won't work correctly
                        garbage = scan.nextLine();
                        for(int i = 0; i < numberOfChoices; i++){
                            System.out.println("Enter your option:");
                            String temp = scan.nextLine();
                            myChoices.add(temp);
                        }
                    }
                    votingSystem.vote(index, new Person(firstName, lastName), myChoices);
                    break;
                case 6:
                    index = scan.nextInt();
                    votingSystem.getVotersOfVoting(index);
                    break;
                case 7:
                    index = scan.nextInt();
                    votingSystem.printVoting(index);
                default:
                    System.out.println("Invalid input.");
                    break;
            }
            if(input == 8){
                System.out.println("Thanks for working with us.");
                return;
            }
        }
    }
}
