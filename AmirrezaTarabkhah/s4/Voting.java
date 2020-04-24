import ir.huri.jcal.JalaliCalendar;
import java.util.*;

public class Voting {

    private int type;
    private JalaliCalendar jalaliCalendar = new JalaliCalendar();
    private String question;
    private ArrayList<Person> voters = new ArrayList<>();
    private HashMap<String, HashSet<Vote>> polls = new HashMap<>();

    public Voting(int type, String question) {
        this.type = type;
        this.question = question;
    }

    public String getQuestion() {return question;}

    public void printVoters() {
        for (Person person : voters)
            System.out.println(voters.toString());
    }

    public void vote(Person person, ArrayList<String> votes) {
        if (votes.size() > 1 && type == 0){
            System.out.println("You cannot vote like this!!!");
            return;
        }
        for (Person person1 : voters) {
            if (person.equals(person1)) {
                System.out.println("You have voted");
                return;
            }
        }
        for (String poll : votes) {
            Vote vote = new Vote(person, jalaliCalendar.toString());
            polls.get(poll).add(vote);
        }
    }

    public void createPoll(String  choice) {
        HashSet<Vote> poll = new HashSet<>();
        polls.put(choice, poll);
    }

    public Set<String> getPolls() {return polls.keySet();}

    public void printResult() {
        Set<String> poll = polls.keySet();
        for (String s : poll)
            System.out.println(s + " : " + polls.get(s).size());
    }
}
