import ir.huri.jcal.JalaliCalendar;

import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.HashSet;
public class Voting {
    private int type;
    private String question;
    private ArrayList<Person> voters=new ArrayList<>();
    private HashMap<String, HashSet<Vote>> polls=new HashMap<>();

    public Voting(int type, String question) {
        this.type = type;
        this.question = question;
    }

    public String getQuestion() {
        return question;
    }

    public ArrayList<Person> getVoters() {
        return voters;
    }

    public HashMap<String, HashSet<Vote>> getPolls() {
        return polls;
    }
    public void createPoll(String poll){
        HashSet<Vote> voter=new HashSet<>();
        polls.put(poll,voter);
    }
    public void vote(Person person,ArrayList<String> votes){
        for(String vote:votes){
            for(String poll:polls.keySet()){
                if(vote.equals(poll)){
                    LocalDate time=LocalDate.now();
                    JalaliCalendar date=new JalaliCalendar(new GregorianCalendar(time.getYear(),time.getMonthValue(),time.getDayOfMonth()));
                    Vote vote1=new Vote(person,date.toString());
                    polls.get(poll).add(vote1);
                }
            }
        }
    }
    public void printVotes(){
        for(String poll:polls.keySet()){
            System.out.println(poll+": "+polls.get(poll));
        }
    }
}
