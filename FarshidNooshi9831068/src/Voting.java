// In The Name Of GOD

import ir.huri.jcal.JalaliCalendar;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Voting {
    private final int type;
    private final String question;
    private ArrayList<Person> voters;
    private HashMap<String, HashSet<Vote>> choices;

    /**
     *
     * @param type is the type of the voting
     * @param question is the question of the voting
     */
    public Voting(int type, String question) {
        this.type = type;
        this.question = question;
        voters = new ArrayList<>();
        choices = new HashMap<>();
    }

    public String getQuestion() {
        return question;
    }

    /**
     * @param person is a person to get checked
     * @return true if voters arrayList doesn't contain this voter
     */
    private boolean valid(Person person) {
        for (Person it : voters)
            if (person.equals(it))
                return false;
        return true;
    }

    /**
     * this method votes for someone
     *
     * @param person  is the person who wanna attend the voting
     * @param choices is the persons choices
     */
    public void vote(Person person, ArrayList<String> choices) {
        if (choices.size() > 1 && type == 1) {
            System.out.println("You should choose one choice in this voting");
            return;
        }

        if (!valid(person)) {
            System.out.println("person already voted!");
            return;
        }

        voters.add(person);
        JalaliCalendar date = new JalaliCalendar();
        for (String it : choices)
            this.choices.get(it).add(new Vote(person, date.toString()));
    }

    /**
     * this method is a getter for voters
     *
     * @return the voters ArrayList
     */
    public ArrayList<Person> getVoters() {
        return voters;
    }

    /**
     * this method prints a single voting in the program by telling the voters of each option & number of votes for each choice
     */
    public void printVotes() {
        System.out.println("Printing the votes");
        {
            System.out.println(voters.size() + " is the number of voters");
            for (String it : choices.keySet()) {
                System.out.println("choice " + it + " has : " + choices.get(it).size() + " votes");
                System.out.println("Voters are : ");
                for (Vote vote : choices.get(it)) {
                    System.out.print(vote + " ");
                }
                System.out.println();
            }
        }
    }

    public HashMap<String, HashSet<Vote>> getChoices() {
        return choices;
    }

    /**
     * this method adds a new choice
     *
     * @param option is a new choice to add
     */
    public void createChoice(String option) {
        if (choices.containsKey(option))
            System.out.println("choice already exists!");
        else
            choices.put(option, new HashSet<>());
    }
}
