import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        voting_system vs=new voting_system();
        ArrayList<String> choices1=new ArrayList<>();

        choices1.add("Ali");
        choices1.add("reza");
        choices1.add("gholi");
        choices1.add("saba");
        choices1.add("fateme");
        choices1.add("parsa");

        person person1=new person("a","A");
        person person2=new person("b","B");
        person person3=new person("c","C");
        person person4=new person("d","D");

        ArrayList<String> person1_choices=new ArrayList<>();
        ArrayList<String> person2_choices=new ArrayList<>();
        ArrayList<String> person3_choices=new ArrayList<>();
        ArrayList<String> person4_choices=new ArrayList<>();

        person1_choices.add("Ali");
        person1_choices.add("reza");
        person1_choices.add("unknown");

        person2_choices.add("fateme");
        person2_choices.add("Ali");
        person2_choices.add("fateme");

        person3_choices.add("reza");
        person3_choices.add("saba");

        vs.create_voting("who is the best teacher",1,choices1);

        vs.vote(1,person1,person1_choices);
        vs.vote(1,person2,person2_choices);
        vs.vote(1,person3,person3_choices);
        //showing user cant vote twice or more
        vs.vote(1,person1,person2_choices);

        vs.print_results(1);

        person1_choices.removeAll(person1_choices);
        person2_choices.removeAll(person2_choices);
        person3_choices.removeAll(person3_choices);
        
        ArrayList<String> choices2=new ArrayList<>();

        choices2.add("iran");
        choices2.add("america");
        choices2.add("russia");
        choices2.add("germany");
        choices2.add("spain");

        vs.create_voting("where is the most enjoyable place for you to live?:",0,choices2);

        person1_choices.add("iran");
        //showing he can't choose more than one for voting
        person1_choices.add("spain");
        person2_choices.add("russia");
        person3_choices.add("russia");
        person4_choices.add("iran");

        vs.vote(2,person1,person1_choices);
        vs.vote(2,person2,person2_choices);
        vs.vote(2,person3,person3_choices);
        vs.vote(2,person4,person4_choices);

        vs.print_results(2);





    }
}
