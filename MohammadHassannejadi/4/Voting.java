
import java.util.*;
import ir.huri.jcal.JalaliCalendar;

/**
 * This class organize all votes in two model
 * with hashmap and hashset
 * @author Mohamad Hasannejadi
 * @version 1.0
 */

public class Voting{
    
    private int type; // 0 means single vote and 1 means multi vote
    private String question;
    private ArrayList<Person> voters ;
    private HashMap<String,HashSet<Vote>> polls ; // or choices
    /**
     * 
     * @param type type of voting 0 means single vote and 1 means multi vote
     * @param question
     */
    public Voting(int type, String question){ 
        this.type = type;
        this.question = question;
        voters = new ArrayList<Person>();
        polls = new HashMap<String, HashSet<Vote>>();
    }

    public int getType(){
        return type;
    }

    public String getQuestion(){
        return question;
    }

    public void createPoll(String pollName){
        polls.put(pollName, new HashSet<Vote>());
    }

    
    
    /**
     * returns list of polls
     * @return list of polls
     */
    public ArrayList<String> getPolls(){
        ArrayList<String> pollList = new ArrayList<String>();
        
        for(Map.Entry<String, HashSet<Vote>> poll : polls.entrySet()){
            pollList.add(poll.getKey());
        }
        return pollList;
    }

    /**
     * method to show voters
     */
    public void getVoters(){
        for(Person voter : voters){
            System.out.println(voter.toString());
        }
            
    }

    /**
     * making a vote with a voter and list of his votes and 
     * adds it to list of votes
     * @param voter voter
     * @param votes list of votes
     */
    public void vote(Person voter, ArrayList<String> votes){
        
        Vote vote;

        for(Person voter1 : voters){
            if(voter1.equals(voter)){
                System.out.println("This vote is repeated");
                return;
            }
        }

        for(String vote1 : votes){
            for(Map.Entry<String, HashSet<Vote>> poll : polls.entrySet()){
                if(poll.getKey().equals(vote1)){
                    JalaliCalendar day = new JalaliCalendar(new GregorianCalendar());
                    String date = String.valueOf(day);
                    vote = new Vote(voter, date);
                    poll.getValue().add(vote);
                }
            }
        }
        voters.add(voter);
    }

    /**
     * a method to print result of voting with name of each poll and its voters
     */
    public void printVotes(){
        System.out.println(getQuestion());
        for(Map.Entry<String, HashSet<Vote>> poll : polls.entrySet()){
            System.out.println(poll.getValue().size() + " votes for " + poll.getKey());
            System.out.println("voters of this choice are: ");
            for(Vote vote : poll.getValue()){
                System.out.println(vote.getDate()+ ": " +vote.getPerson().toString());
            }
        }
    }

    
}

