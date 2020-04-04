/**
 * Voting Object, Contain information about each voting and its description such as type, question, ...
 *
 * @author Keivan Ipchi Hagh
 * @since 2020/4/4
 * @version 1.0.0
 */
import ir.huri.jcal.JalaliCalendar;

import java.util.*;

public class Voting {

    /**
     * Voting type, '0' for SingleVoting and '1' for MultipleVoting
     */
    private int type;
    /**
     * Voting question
     */
    private String question;
    /**
     * A list of voters for the current voting
     */
    private ArrayList<Person> voters;
    /**
     * HashMap to store voting choices to their voters as a Dictionary
     */
    private HashMap<String, HashSet<Vote>> choices;

    /**
     * Voting Constructor
     * @param type Voting type
     * @param question Voting question
     */
    public Voting(int type, String question) {
        this.type = type;
        this.question = question;
        this.choices = new HashMap<>();
    }

    /**
     * Adds a new choice to the list
     * @param choiceName Choice name
     */
    public void createChoice(String choiceName) {
        choices.put(choiceName, new HashSet<>());
    }

    /**
     * Adds voter's choices to the HashMap with Brute Force
     * @param voter Voter
     * @param choice List of choices
     */
    public void vote(Person voter, ArrayList<String> choice) {

        if (type == 0 && choice.size() > 1)
            System.out.println("Voting mode is singleVote, '" + voter + "'s first vote will be submitted only!!");

        // Current Jalali Date
        JalaliCalendar jalaliDate = new JalaliCalendar(new GregorianCalendar(Calendar.getInstance().get(Calendar.YEAR), Calendar.getInstance().get(Calendar.MONTH), Calendar.getInstance().get(Calendar.DAY_OF_MONTH)));

        if (type == 0)
            submit(voter, jalaliDate, choice.get(0));
        else
            for (String ch : choice)   // Loop through the entire voter choices
                submit(voter, jalaliDate, ch);
    }

    /**
     * Submits the vote
     * @param voter Voter Obj
     * @param jalaliDate Jalali Date
     * @param choice Choice string
     */
    private void submit(Person voter, JalaliCalendar jalaliDate, String choice) {
        boolean isFound = false;

        for (Map.Entry<String, HashSet<Vote>> entry : choices.entrySet())   // Search the entire HashMap for the choice
            if (entry.getKey().equals(choice)) {    // If results were found
                entry.getValue().add(new Vote(voter, jalaliDate.toString()));  // Add the choice to the HashSet, if not duplicate
                isFound = true;
                break;
            }

        if (isFound)
            System.out.println("'" + choice + "' has been successfully submitted.");
        else
            System.out.println("'" + choice + "' does not exist among the voting choices and cannot be submitted for '" + voter + "'.");
    }

    /**
     * Prints all the votes with their corresponding information
     */
    public void printVotes() {
        for (Map.Entry<String, HashSet<Vote>> entry: choices.entrySet()) {
            System.out.println("Vote Choice: '" + entry.getKey() + "', Votes:");
            for (Vote vote: entry.getValue())
                System.out.println("Vote) Voter: " + vote.getPerson() + "\tDate: " + vote.getDate());
        }
    }

    /**
     * Getter: Get voters list
     * @return Voters list
     */
    public ArrayList<Person> getVoters() {
        return voters;
    }

    /**
     * Getter: Get choices HashMap
     * @return Choices HashMap
     */
    public HashMap<String, HashSet<Vote>> getChoices() {
        return choices;
    }

    /**
     * Getter: Get question string
     * @return Question string
     */
    public String getQuestion() {
        return question;
    }
}
