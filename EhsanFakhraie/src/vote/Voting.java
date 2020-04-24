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
        TimeZone tz = TimeZone.getTimeZone("GMT+9:00");
        Locale loc = new Locale("ja", "JP", "JP");
        Calendar calendar = Calendar.getInstance(loc);
        GregorianCalendar gc = (GregorianCalendar) calendar;
        JalaliCalendar jc = new JalaliCalendar(gc);
        return jc.toString();
    }

    public void vote(Person p, ArrayList<String> votes) {
        for (String v : votes) {
            if (choices.contains(v)) {
                Vote vote = new Vote(p, getNowData());
                HashSet<Vote> vs = polls.get(v);
                vs.add(vote);
                polls.replace(v, vs);
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
