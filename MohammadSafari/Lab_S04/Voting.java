package MohammadSafari.Lab_S04;

import java.util.*;

import ir.huri.jcal.JalaliCalendar;

/**
 * stimulate a voting with specified number of votes for each person with a
 * specified question and choices
 * 
 * @author M.Safari
 * @version 1399.02.05
 */
public class Voting {
    public final int type;
    public final String question;
    private boolean isActive;
    private Set<Person> voters;
    private Map<String, Set<Vote>> choices;

    public Voting(int type, String question) {
        this.question = question;
        this.type = type;
        isActive = true;
        voters = new HashSet<Person>();
        choices = new HashMap<String, Set<Vote>>();
    }

    public void createChoice(String choice) {
        // preventing same choices
        if (choices.keySet().contains(choice))
            return;
        Set<Vote> votes = new HashSet<Vote>();
        choices.put(choice, votes);
    }

    /**
     * let a person vote to n authorized choices
     * 
     * @param voter
     * @param choices
     */
    public void vote(Person voter, Set<String> choices) {
        int count = 0;
        // if voting is still active and voter has not voted yet
        if (isActive && !voters.contains(voter))
            // checking whether the given choice is authorized
            for (String choice : choices)
                if (this.choices.keySet().contains(choice)) {
                    this.choices.get(choice).add(new Vote(voter, new JalaliCalendar().toString()));
                    count++;
                    if (count == type)
                        return;
                }
    }

    /**
     * @return the voters
     */
    public Set<Person> getVoters() {
        return voters;
    }

    public void printVotes() {
        for (String choice : choices.keySet())
            System.out.println(String.format("%30.30s : %d", choice, choices.get(choice).size()));

    }

    /**
     * @return the choices
     */
    public Map<String, Set<Vote>> getchoices() {
        return choices;
    }

    public void endVoting() {
        isActive = false;
    }

}