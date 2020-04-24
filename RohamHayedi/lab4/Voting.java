import ir.huri.jcal.JalaliCalendar;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class Voting {

    private final int type;
    private final String question;
    private ArrayList<Person> voters;
    private HashMap<String, HashSet<Vote>> polls;

    public Voting(String question, int type,  ArrayList<String> choices){
        this.type = type;
        this.question = question;
        polls = new HashMap<>();
        voters = new ArrayList<>();
        for (String choice : choices){
            polls.put(choice, new HashSet<>());
        }
    }

    public void creatChoice(String choice){
        polls.put(choice, new HashSet<>());
    }

    public void vote(Person person, ArrayList<String> choices){
        if (type == 0 && choices.size() > 1) {
            System.out.println(person + "-> This voting (" + question + ") accepts only single choices");
        }
        else {
            if (!voters.contains(person)) {
                voters.add(person);
                Vote vote = new Vote(person, new JalaliCalendar().toString());
                for (String choice : choices)
                    if (polls.containsKey(choice))
                        polls.get(choice).add(vote);
                    else {
                        System.out.println(person + "->The input (" + choice + ") is not among the choices");
                    }
            }else{
                System.out.println("The same person cannot vote twice");
            }
        }
    }

    public String getQuestion() {
        return question;
    }

    public void printVoters() {
        int i = 0;
        for (Person person : voters) {
            System.out.println(i + "-" + person);
        }
    }

    public HashMap<String, HashSet<Vote>> getPolls() {
        return polls;
    }

    public void printChoices(){
        AtomicInteger i = new AtomicInteger(1);
        polls.forEach((k,v) -> System.out.println(i.getAndIncrement() + "- " + k));
    }

    public void printResult(){
        System.out.println(question);
        for (Map.Entry<String, HashSet<Vote>> entry : polls.entrySet()) {
            String choice = entry.getKey();
            HashSet<Vote> votes = entry.getValue();
            System.out.println(choice + " -> " + votes.size());
            votes.forEach(vote -> System.out.println(vote.getPerson() + " " + vote.getDate()));
        }
    }
}
