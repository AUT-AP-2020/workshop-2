import ir.huri.jcal.JalaliCalendar;

import java.util.*;

/**
 * The type Voting.
 */
public class Voting {
    private int type;
    private String question;
    private ArrayList<Person> voters;
    private HashMap<String, HashSet<Vote>> polls;

    /**
     * Instantiates a new Voting.
     *
     * @param t the t
     * @param q the q
     */
    public Voting(int t, String q) {
        type = t;
        question = q;
        voters = new ArrayList<>();
        polls = new HashMap<>();
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
     * Create poll.
     *
     * @param poll the poll
     */
    public void createPoll(String poll) {
        if(polls.keySet().contains(poll)) {
            System.out.println("invalid");
            return;
        }
        polls.put(poll, new HashSet<Vote>());
    }

    /**
     * Vote.
     *
     * @param person  the person
     * @param choices the choices
     */
    public void vote(Person person, ArrayList<String> choices) {
        if(voters.contains(person) || (type == 0 && choices.size() > 1)){
            System.out.println("invalid");
            return;
        }
        for(String str : choices) {
            polls.get(str).add(new Vote(person, new JalaliCalendar()));
        }
    }

    /**
     * Gets voters.
     */
    public void getVoters() {
        System.out.println("voters:");
        for(int i = 0; i < voters.size(); i ++)
            System.out.println(voters.get(i));
    }

    /**
     * Print votes.
     */
    public void printVotes() {
        Iterator it1 = polls.entrySet().iterator();
        while(it1.hasNext()) {
            Map.Entry help = (Map.Entry) it1.next();
            System.out.println(help.getKey() + " :");
            HashSet<Vote> now = (HashSet<Vote>) help.getValue();
            Iterator it2 = now.iterator();
            while(it2.hasNext()) {
                Vote tof = (Vote) it2.next();
                System.out.println(tof.getPerson() + " " + tof.getDate());
            }
        }
    }

    /**
     * Gets polls.
     *
     * @return the polls
     */
    public ArrayList<String> getPolls() {
        ArrayList<String> ret = new ArrayList<>();
        for(String str : polls.keySet())
            ret.add(str);
        return ret;
    }

    @Override
    public String toString() {
        return "question: " + question + ", " + "type: " + type;
    }
}
