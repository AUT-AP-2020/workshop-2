import javax.lang.model.type.NullType;
import java.util.*;
import ir.huri.jcal.JalaliCalendar;

/**
 * This class create a voting that have question and choices.
 *
 * @author Mohammad Javad Rajabi
 * @version 1.0
 * @since 2020-03-24
 */
public class Voting {

    //fields

    // this field declare type of voting
    private int type;
    // question of voting
    private String question;
    // list of voter
    private ArrayList<Person> voters;
    // list of option that map with number of vote
    private HashMap<String, HashSet<Vote>> listOfVoteToChoices;


    //constructor

    /**
     * Voting  constructor, for create new object of this class.
     * @param type This is parameter that declare type of voting
     * @param question This is question of voting
     */
    public Voting(int type, String question) {
        this.type = type;
        this.question = question;
        voters = new ArrayList<Person>();
        listOfVoteToChoices = new HashMap<String, HashSet<Vote>>();
    }

    //methods

    /**
     * This method is used to be able to access question.
     * @return String This returns question of this voting.
     */
    public String getQuestion() {
        return question;
    }

    /**
     * This method is used to be able to access type of voting.
     * @return int This returns type of this voting.
     */
    public int getType() {
        return type;
    }

    /**
     * This method is used to be able to access list of vote to choices.
     * @return HashMap This returns list of vote to choices of this voting.
     */
    public HashMap<String, HashSet<Vote>> getListOfVoteToChoices() {
        return listOfVoteToChoices;
    }

    /**
     * This method is used to add a person to list of voter if he already voted he cant vote.
     * @param option This parameter add to list of choices in this voting.
     */
    public void createChoice(String option) {
        HashSet<Vote> set = new HashSet<Vote>();
        listOfVoteToChoices.put(option, set);
    }

    /**
     * This method is used to add a person to list of voter if he already voted he cant vote.
     * @param person This is a person who want to vote.
     * @param options This is a list of choice that person choose.
     */
    public void vote(Person person, ArrayList<String> options){
        for (String option:options){
            HashSet<Vote> votes = listOfVoteToChoices.get(option);
            if(votes != null) {
                for (Vote vote : votes) {
                    if (vote.getPerson().equals(person)) {
                        System.out.println(person.getFirstName() +" "+ person.getLastName() + " already voted");
                        return;
                    }
                }
            }
            GregorianCalendar gc = new GregorianCalendar();
            JalaliCalendar jalaliCalendar = new JalaliCalendar(gc);
            Vote vote = new Vote(person, jalaliCalendar.toString());
            HashSet<Vote> x = listOfVoteToChoices.get(option);
            x.add(vote);
            voters.add(person);
            System.out.println("vote submitted!");
        }
    }

    /**
     * This method is used to print list of voter who vote in this voting.
     */
    public void getVoters() {
        System.out.println("-------------------------------------------");
        System.out.println("list of person who voted");
        for (Person person: voters){
            System.out.println((voters.indexOf(person)+1)+")"+person.getFirstName() + person.getLastName());
        }
        System.out.println("-------------------------------------------");

    }

    /**
     * This method is used to print the choice and list of voter who vote to this choice.
     */
    public void printVotes() {
        Set<String> sets = listOfVoteToChoices.keySet();
        ArrayList<String> stringsList = new ArrayList<>(sets);
        for (int i =0 ; i< stringsList.size() ; i++) {
            System.out.println((i+1)+")"+ stringsList.get(i)+ "->" + listOfVoteToChoices.get(stringsList.get(i)).size());
            for (Vote vote :listOfVoteToChoices.get(stringsList.get(i))){
                System.out.println(vote.getPerson().getFirstName() + " " + vote.getPerson().getLastName() + "   " +
                        vote.getDate().toString());
            }
            System.out.println();

        }
    }

    /**
     * This method is used to add get array list of choices.
     * @return ArrayList This returns list of choices
     */
    public ArrayList<String> getChoices() {
        Set<String> sets = listOfVoteToChoices.keySet();
        ArrayList<String> stringsList = new ArrayList<>(sets);
        return stringsList;
    }
}
