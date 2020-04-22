/**
 * Voting class
 *
 * @param voteNum to save number of votes
 * @param choices to save and show choices
 * have printResult method to show the voting result , persons , number of votes
 * have createChoice to add choice to vote
 */

import java.util.*;

public class Voting {
    private int type;
    private String question;
    public ArrayList<Person> voters = new ArrayList<>();
    public HashMap<String, HashSet> polls = new HashMap<>();
    public HashSet<String> choices = new HashSet<>();
    public int[] voteNum;

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
    public HashMap<String, HashSet> getPolls() {
        return polls;
    }
    public HashSet<String> getChoices() {
        return choices;
    }
    public int getType() {
        return type;
    }

    public void printResult(Voting vote) {
        System.out.println(vote.getQuestion() + ":\n" + "votes: " + Vote.sumVotes + "  Date: " + Vote.date);
        int cnt = 0;
        Iterator<String> itr = vote.choices.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next() + ": " + vote.voteNum[cnt]);
            cnt++;
        }
        for (int i = 0; i < voters.size(); i++) {
            System.out.println("Voters: \n" + (i + 1) + ") " + voters.get(i).getFirstName() + "  " + voters.get(i).getLastName());
        }
    }

    public void createChoice(String choice, Voting vote) {
        vote.choices.add(choice);
        vote.polls.replace(getQuestion(), choices);
    }
}
