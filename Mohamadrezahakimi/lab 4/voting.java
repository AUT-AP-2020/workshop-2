import ir.huri.jcal.JalaliCalendar;

import java.awt.*;
import java.awt.image.AreaAveragingScaleFilter;
import java.time.LocalDateTime;
import java.util.*;
import java.time.LocalDate;

public class voting {

    private int type;
    private String voting_question;
    ArrayList<person> voters;
    HashMap<String, HashSet<vote>> list_of_votes_to_choices;

    public voting(int one_or_more_voting, String voting_question) {
        this.voting_question = voting_question;
        list_of_votes_to_choices = new HashMap<>();
        voters = new ArrayList<>();
        this.type = one_or_more_voting;
    }

    public void create_choice(String choice_explanation) {
        if (!list_of_votes_to_choices.containsKey(choice_explanation)) {
            list_of_votes_to_choices.put(choice_explanation, new HashSet<>());
        }
    }

    public void vote(person person, ArrayList<String> choices) {
        if ((type == 0 && choices.size() != 1) ) {
            System.out.println("Mr or Ms " + person.to_string() + ": you can't choose more thane one choice then we just " +
                    "consider your first choice as your final decision ");
            if (!voters.contains(person)) {
                voters.add(person);

                GregorianCalendar gregorianCalendar = new GregorianCalendar();
                gregorianCalendar.setTime(new Date());
                JalaliCalendar jalaliCalendar = new JalaliCalendar(gregorianCalendar);

                vote vote = new vote(person, jalaliCalendar.toString());
                String choice = choices.get(0);
                if (list_of_votes_to_choices.containsKey(choice)) {
                    list_of_votes_to_choices.get(choice).add(vote);
                } else System.out.println("we don't have this choice in this voting->" + choice);
            } else {
                System.out.println("Mr or Ms " + person.to_string() + ": you voted before");
            }
        }
        else {
            if (!voters.contains(person)) {
                voters.add(person);

                GregorianCalendar gregorianCalendar = new GregorianCalendar();
                gregorianCalendar.setTime(new Date());
                JalaliCalendar jalaliCalendar = new JalaliCalendar(gregorianCalendar);

                vote vote = new vote(person, jalaliCalendar.toString());
                for (String choice : choices) {
                    if (list_of_votes_to_choices.containsKey(choice)) {
                        list_of_votes_to_choices.get(choice).add(vote);
                    }
                    else System.out.println("we don't have this choice in this voting->"+choice);
                }
            }
            else {
                System.out.println("Mr or Ms "+person.to_string()+": you voted before");
            }
        }
    }


    public String getVoting_question() {
        return voting_question;
    }

    public ArrayList<person> getVoters() {
        return voters;
    }

    public void print_votes() {
        for (String choice : list_of_votes_to_choices.keySet()) {
            System.out.println(choice+":");
            if(list_of_votes_to_choices.get(choice).size()!=0) {
                for (vote vote : list_of_votes_to_choices.get(choice)) {
                    System.out.println("\t\t" + "name: "+vote.get_person().to_string() +"\ttime: "+ vote.getDate());
                }
            }
            else System.out.println("\t\t"+"no nobody vote to this choice ");
        }
    }
}

