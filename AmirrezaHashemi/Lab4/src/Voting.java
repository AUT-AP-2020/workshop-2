import ir.huri.jcal.JalaliCalendar;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Random;

/**
 * The Voting class implants a voting and contains question,choices,type of voting abd voters.
 */
public class Voting {
    // for one choice 0 and for multiple choices 1
    private int type;
    private String question;
    private ArrayList<Person> voters;
    private HashMap<String, HashSet<Vote>> listOfVotesToChoices;

    /**
     * Instantiates a new Voting.
     *
     * @param type      the type of voting
     * @param question the question of voting
     */
    public Voting(int type, String question) {
        this.type = type;
        this.question = question;
        voters = new ArrayList<>();
        listOfVotesToChoices = new HashMap<>();
    }

    /**
     * Creates a choice.
     *
     * @param choice the choice
     */
    public void createChoice(String choice) {
        listOfVotesToChoices.put(choice, new HashSet<Vote>());
    }

    /**
     * Votes for choices by a person.
     *
     * @param person  the person
     * @param choices the choices
     */
    public void vote(Person person, ArrayList<String> choices) {
        if (type == 0 && choices.size() > 1) {
            System.out.println("invalid");
            return;
        }
        for (Person voter : voters
        ) {
            if (voter.equals(person)) {
                System.out.println("already voted");
                return;
            }
        }
        voters.add(person);
        Vote vote = new Vote(person, new JalaliCalendar().toString());
        if (type == 0 && choices.get(0).equals("rand")) {
            Random rand = new Random();
            int index = rand.nextInt(getChoices().size());
            listOfVotesToChoices.get(getChoices().get(index)).add(vote);
            return;
        }
        for (String option : choices) {
            listOfVotesToChoices.get(option).add(vote);
        }
        System.out.println("Voted");


    }

    /**
     * Gets question.
     *
     * @return the question
     */
    public String getQuestion() {
        return question;
    }

    /**
     * Gets voters.
     *
     * @return the voters
     */
    public ArrayList<Person> getVoters() {
        return voters;
    }

    /**
     * Prints votes.
     */
    public void printVotes() {
        for (String choice : getChoices()) {
            System.out.println(choice + ": " + listOfVotesToChoices.get(choice).size() + " votes");
            for (Vote vote : listOfVotesToChoices.get(choice)) {
                System.out.println(vote.getPerson().toString() + " " + vote.getDate());
            }
        }
    }

    /**
     * Gets choices.
     *
     * @return the choices
     */
    public ArrayList<String> getChoices() {
        return new ArrayList<String>(listOfVotesToChoices.keySet());
    }
}
