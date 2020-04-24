import ir.huri.jcal.JalaliCalendar;

import java.util.*;

public class Voting {

    private int type;
    private ArrayList<String> voters;
    private String question;
    private HashMap<String, HashSet<Vote>> choices = new HashMap<>();

    public Voting(int type, String question) {
        this.type = type;
        this.question = question;
        voters = new ArrayList<>();
    }

    public void vote(Person person, ArrayList<String> chosenOptions) {
        Random random = new Random();
        JalaliCalendar date = new JalaliCalendar(random.nextInt(11)+1388,random.nextInt(12)+1,random.nextInt(30)+1);
        Vote tmpVote = new Vote(person, date.toString());
        voters.add(person.getFirstName());
        if(type == 1) {
            for (String a : chosenOptions) {
                choices.get(a).add(tmpVote);
            }
        } else
            choices.get(chosenOptions.get(0)).add(tmpVote);
    }

    public void getVoters() {
        for (String a: voters) {
            System.out.println(a);
        }
    }


    public String getQuestion() {
        return question;
    }

    public HashMap<String, HashSet<Vote>> getChoices() {
        return choices;
    }

    public void createChoice(String choice) {
        choices.put(choice, new HashSet<>());
    }


    public void showResult() {
        System.out.println(getQuestion());
        for (String a: getChoices().keySet()) {
            System.out.print(a);
            System.out.println("   " + choices.get(a).size());
        }
    }
}
