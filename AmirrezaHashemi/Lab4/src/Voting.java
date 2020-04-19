import ir.huri.jcal.JalaliCalendar;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Random;

public class Voting {
    // for one choice 0 and for multiple choices 1
    private int type;
    private String question;
    ArrayList<Person> voters;
    HashMap<String, HashSet<Vote>> listOfVotesToChoices;

    public Voting(int type, String questions) {
        this.type = type;
        this.question = questions;
        voters = new ArrayList<>();
        listOfVotesToChoices = new HashMap<>();
    }

    public void createChoice(String choice) {
        listOfVotesToChoices.put(choice, new HashSet<Vote>());
    }

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

    public String getQuestion() {
        return question;
    }

    public ArrayList<Person> getVoters() {
        return voters;
    }

    public void printVotes() {
        for (String choice : getChoices()) {
            System.out.println(choice + ": " + listOfVotesToChoices.get(choice).size() + " votes");
            for (Vote vote : listOfVotesToChoices.get(choice)) {
                System.out.println(vote.getPerson().toString() + " " + vote.getDate());
            }
        }
    }

    public ArrayList<String> getChoices() {
        return new ArrayList<String>(listOfVotesToChoices.keySet());
    }
}
