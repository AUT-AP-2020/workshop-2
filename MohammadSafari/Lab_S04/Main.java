package MohammadSafari.Lab_S04;

import java.util.*;

/**
 * running an example of system
 * 
 * @author M.Safari
 * @version 1399.02.05
 */
public class Main {
    public static void main(String[] args) {
        Person me = new Person("firstName", "lastName");
        Person you = new Person("Mohammad", "Safari");
        Person he = new Person("Amir", "Hamidi");
        VotingSystem test = new VotingSystem();
        // first poll
        {
            test.createVoting("are you okay?", 1, new ArrayList<String>() {
                {
                    add("YES!");
                    add("NO!");
                };
            });
            test.vote(0, me, new HashSet<String>() {
                {
                    add("YES!");
                };
            });
            test.vote(0, you, new HashSet<String>() {
                {
                    add("NO!");
                };
            });
            test.vote(0, he, new HashSet<String>() {
                {
                    add("YES!");
                };
            });
            System.out.println("\033[1;31m");
            System.out.println(test.getVoting(0).question);
            System.out.println("\033[0m");
            test.getResult(0);
        }
        // second poll
        {
            test.createVoting("which is worse?", 2, new ArrayList<String>() {
                {
                    add("virtual class and elearning:))!");
                    add("no spare time to learn more!");
                    add("sleeping all the day!");
                    add("getting insomnia after a while");
                };
            });
            test.vote(1, me, new HashSet<String>() {
                {
                    add("sleeping all the day!");
                    add("virtual class and elearning:))!");

                };
            });
            test.vote(1, you, new HashSet<String>() {
                {
                    add("sleeping all the day!");
                    add("getting insomnia after a while");
                };
            });
            test.vote(1, he, new HashSet<String>() {
                {
                    add("virtual class and elearning:))!");
                    add("no spare time to learn more!");
                };
            });
            System.out.println("\033[1;31m");
            System.out.println(test.getVoting(1).question);
            System.out.println("\033[0m");
            test.getResult(1);
        }
    }
}