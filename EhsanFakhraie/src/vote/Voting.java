package vote;

import ir.huri.jcal.JalaliCalendar;

import java.util.*;

public class Voting {
    /**
     * determines type of poll
     * 0: single vote
     * 1: multi vote
     */
    private int type;
    private String question;

    private HashMap<String, HashSet<Vote>> polls;

    private ArrayList<String> choices;

    public Voting(String question, int type) {
        this.type = type;
        this.question = question;

        polls = new HashMap<>();
        choices = new ArrayList<>();
    }

    public void createChoice(String choice) {
        choices.add(choice);
        polls.put(choice, new HashSet<>());
    }

    public String getNowData() {
        JalaliCalendar jalaliDate = new JalaliCalendar(new GregorianCalendar(2016, 4, 16));
        return jalaliDate.toString();
    }

    public void vote(Person p, ArrayList<String> votes) {
        if(type==0){
            for (String v : votes) {
                if (choices.contains(v)) {
                    Vote vote = new Vote(p, getNowData());
                    HashSet<Vote> vs = polls.get(v);
                    vs.add(vote);
                    polls.replace(v, vs);
                }else {
                    System.out.println("wrong vote");
                }
            }
        }else{
            String v=votes.get(0);
            if (choices.contains(v)) {
                Vote vote = new Vote(p, getNowData());
                HashSet<Vote> vs = polls.get(v);
                vs.add(vote);
                polls.replace(v, vs);
            }else {
                System.out.println("wrong vote");
            }
        }

    }

    public int getType() {
        return type;
    }

    public String getQuestion() {
        return question;
    }

    public HashMap<String, HashSet<Vote>> getPolls() {
        return polls;
    }

    public ArrayList<String> getChoices() {
        return choices;
    }

    public void printResult() {
        for (Map.Entry<String, HashSet<Vote>> stringHashSetEntry : polls.entrySet()) {
            String key = (String) stringHashSetEntry.getKey();
            HashSet<Vote> votes = stringHashSetEntry.getValue();
            System.out.println("Choice " + key + " Count:" + votes.size());
        }
    }

}
