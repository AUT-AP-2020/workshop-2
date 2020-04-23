import JalaliCalendar.JalaliCalendar;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Voting {
    private int type;//voting type(single vote = 0 and multiple vote = 1)
    private String question;//question of voting
    private ArrayList<Person> voters;
    private HashSet<Vote> voteHashSet = new HashSet<>();
    private HashMap<String, HashSet<Vote>> listOfVotesToChoices;
    public Voting(int type, String question){
        voters = new ArrayList<Person>();
        listOfVotesToChoices = new HashMap<String, HashSet<Vote>>();
        this.type = type;
        this.question = question;
    }
    public void delete(Person person,String choice) {
            if (getListOfVotesToChoices().containsKey(choice))
                getListOfVotesToChoices().remove(choice);
            voters.remove(person);
    }
    public String getQuestion() {
        return question;
    }

    /**
     * add one choice to list
     * @param choice
     */
    public void createChoice(String choice){
        HashSet<Vote> votes = new HashSet<>();
        listOfVotesToChoices.put(choice, votes);
    }

    /**
     * put a vote in voting
     * @param person voter
     * @param choices options
     */
    public void vote(Person person,ArrayList<String> choices){
        if(voters.contains(person))
            System.out.println(person.getLastName() + " you can not vote twice ;)");
        else {
            if ((type == 0 && choices.size() == 1) || (type == 1 && choices.size() >= 1)) {
                Vote newVote = new Vote(person,new JalaliCalendar().getDayOfWeekDayMonthString());
                for (String s : choices) {
                    if (listOfVotesToChoices.containsKey(s))
                        listOfVotesToChoices.get(s).add(newVote);

                    else
                        System.out.println("invalid choice");
                }
                voters.add(person);
            }
        }
    }

    public int getType() {
        return type;
    }

    /**
     * @return list of choices of a vote
     */
    public ArrayList<String> getChoices(){
        return new ArrayList<>(listOfVotesToChoices.keySet());
    }

    public ArrayList<Person> getVoters() {
        return voters;
    }

    public HashMap<String, HashSet<Vote>> getListOfVotesToChoices() {
        return listOfVotesToChoices;
    }

    /**
     * print number of each vote and voter and the date of that vote
     */
    public void printVotes() {
        for (String s : listOfVotesToChoices.keySet()) {
            System.out.println(s + " = " + listOfVotesToChoices.get(s).size());
            for (Vote vote : listOfVotesToChoices.get(s))
                System.out.print(vote.getPerson());
        }
    }
}
