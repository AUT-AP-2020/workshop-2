import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import ir.huri.jcal.JalaliCalendar;

/**
 * this class represent a voting in voting system
 * 
 * @author sevda imany
 * @version 0.0
 */
public class Voting {
    //0 if voter possible choose is one otherwise 1
    private int type;
    //the question of voting
    private String question;
    //the list of voters
    private ArrayList<Person> voters;
    //the choices
    private HashMap<String, HashSet<Vote>> polls;
    private JalaliCalendar calendar;

    /**
     * create a new voting with given type and question
     * @param type
     * @param question
     */
    public Voting(int type, String question) {
        this.type = type;
        this.question = question;
        voters = new ArrayList<Person>();
        polls = new HashMap<String, HashSet<Vote>>();
        calendar = new JalaliCalendar();
    }



    
    /** 
     * get question
     * @return 
     */
    public String getQuestion() {
        return question;
    }

    /**
     * this method print all voters name
     */
    public void getVoters() {
        for (Person voter : voters) {
            System.out.println(voter.toString());
        }
    }



    
    /** 
     * @return HashMap<String, HashSet<Vote>>
     */
    public HashMap<String, HashSet<Vote>> getPolls() {
        return polls;
    }


    
    /** 
     * create a new choise
     * @param choice
     */
    public void createChoice(String choice) {
        polls.put(choice, new HashSet<Vote>());
    }


    
    /** 
     * @return choices
     */
    public ArrayList<String> getChoices() {
        ArrayList<String> choices = new ArrayList<>();

        for (String choice : polls.keySet()) {
            choices.add(choice);
        }

        return choices;
    }


    
    /** 
     * this method add a person's vote
     * @param person : the voter
     * @param votes : the voter's votes
     */
    public void vote(Person person,ArrayList<String> votes){
        for(Person p : voters){
            if(p.equals(person)){
                System.out.println("You can vote once");
                return;
            }
        }

        if(type == 0){
            if(votes.size() != 1){
                System.out.println("You have one choice!");
                return;
            }
        }

        String date= calendar.toString();
        Vote vote = new Vote(person,date);
        voters.add(person);

        for(String s : votes){
            for(String choice : polls.keySet()){
                if(s.equals(choice)){
                    polls.get(choice).add(vote);
                }
            }
        }
    }

    /**
     * this method show the votes
     */
    public void printVotes(){
        for (String s : polls.keySet()){
            int size = polls.get(s).size();
            System.out.println(s + " : " + size);
        }
    }

    
    /** 
     * get type
     * @return 
     */
    public int getType() {
        return type;
    }

   
}