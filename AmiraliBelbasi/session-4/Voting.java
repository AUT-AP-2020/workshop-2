import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

import ir.huri.jcal.JalaliCalendar;

/**
 * Voting
 */
public class Voting {

    public int type;
    public String question;
    public ArrayList<Person> voters = new ArrayList<>();
    public HashMap<String, HashSet<Vote>> choices = new HashMap<>();

    public Voting(int type, String question) {
        this.type = type;
        this.question = question;
    }

    /**
     * @return the question
     */
    public String getQuestion() {
        return question;
    }

    public void createChoice(String choiceName) {
        choices.put(choiceName, new HashSet<>());
    }

    public void vote(Person voter, ArrayList<String> choicesOfVoter) {
        Random rnd = new Random();
        if (type == 0 && choicesOfVoter.size() != 1) {
            System.out.println("invalid vote");
            return;
        }
        if (voters.contains(voter))
        {
            System.out.println("already voted");
            return;
        }
        voters.add(voter);
        for (String i : choicesOfVoter) {
            Vote tmpVote = new Vote(voter,
                    new JalaliCalendar(1399, rnd.nextInt(12) + 1, rnd.nextInt(29) + 1).toString());
            if(choices.get(i) == null)
            {
                System.out.println("invalid input");
                return;
            }
            choices.get(i).add(tmpVote);
        }
    }

    /**
     * @return the voters
     */
    public ArrayList<Person> getVoters() {
        return voters;
    }

    public void printResult() {
        System.out.println("---------------");
        Set<String> keys = choices.keySet();
        int cnt = 0;
        for (String i : keys) {
            System.out.println(i + ": ");
            System.out.println(choices.get(i));
            cnt += choices.get(i).size();
        }
        System.out.println("number of all counted votes: " + cnt);
    }

    /**
     * @return the choices
     */
    public ArrayList<String> getChoices() {
        return new ArrayList<>(choices.keySet());
    }
}