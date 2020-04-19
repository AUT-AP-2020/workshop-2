import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Voting {
    // for one choice 0 and for multiple choices 1
    private int type ;
    private String questions;
    ArrayList<Person> voters;
    HashMap<String, HashSet<Vote>> listOfVotesToChoices;
    public Voting(int type, String questions) {
        this.type = type;
        this.questions = questions;
    }

    public void createChoice (String choice)
    {
        listOfVotesToChoices.put(choice,new HashSet<Vote>());
    }
    public void vote (Person person,ArrayList<String> choices)
    {
        Vote vote = new Vote(person,"1");
        for (String option:choices)
        {
            listOfVotesToChoices.get(option).add(vote);

        }


    }
    public String getQuestions() {
        return questions;
    }

    public ArrayList<Person> getVoters() {
        return voters;
    }
    public void printVotes()
    {
        System.out.println("Question : "+questions);
        for (String choice: getChoices())
        {
            System.out.println(choice + ": "+listOfVotesToChoices.get(choice).size()+" votes");
            for (Vote vote:listOfVotesToChoices.get(choice))
            {
                System.out.println(vote.getPerson()+" "+vote.getDate());
            }
        }
    }
    public ArrayList<String> getChoices()
    {
        return (ArrayList<String>) listOfVotesToChoices.keySet();
    }
}
