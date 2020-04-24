import java.util.ArrayList;

public class voting_system {
    ArrayList<voting> votingList;
    public voting_system(){
        votingList=new ArrayList<>();
    }

    public void create_voting(String question_name,int one_or_more_answer,ArrayList<String> choices){
        voting a=new voting(one_or_more_answer,question_name);
        votingList.add(a);
        for (String choice:choices){
            a.create_choice(choice);
        }
    }

    public void print_voting_question(){
        System.out.println("print voting's questions:");
        for (voting voting:votingList) {
            System.out.println("\t\t"+voting.getVoting_question());
        }
    }

    public int vote(int voting_number, person person,ArrayList<String> choices){
        voting_number--;
        if(voting_number<0||voting_number>votingList.size())return -1;
        votingList.get(voting_number).vote(person,choices);
        return 0;
    }

    public void print_results(int voting_number){
        voting_number--;
        votingList.get(voting_number).print_votes();
    }
}
