import java.util.ArrayList;
import ir.huri.jcal.JalaliCalendar;

/**
 * @author Sina
 */
public class VotingSystem {
    private ArrayList<Voting> OnGoingVote = new ArrayList<>();

    /**
     *
     * @param question it is going to be question field
     * @param type it is going to determine how many votes every person can do
     * @param candidates which thing could get elected
     * @param code it is going to be code of each candidate !
     */
    public void CreateVoting (String question,int type , ArrayList<String> candidates,ArrayList<String> code)
    {
        Voting temp = new Voting();
        temp.setType(type);
        temp.setQuestion(question);

        for(int j =0 ;j<candidates.size();j++)
        {
           //OnGoingVote.get(i).CreateChoice(candidates.get(j),code.get(j));
            temp.CreateChoice(candidates.get(j),code.get(j));
        }

        OnGoingVote.add(temp);
    }

    /**
     *
     * @param onGoingVote its the online polls that is happening right now
     *                    it means it can get data as arraylist as well
     *
     */
    public void setOnGoingVote(ArrayList<Voting> onGoingVote) {
        OnGoingVote = onGoingVote;
    }

    /**
     *
     * @return its going to return the online polls to us
     */
    public ArrayList<Voting> getOnGoingVote() {
        return OnGoingVote;
    }

    /**
     * its how they print the candidates with the list with the question
     * brye inke age ye poll ro entkhb bekhaim bokonim bedonim darbareye chie !
     */
    public void GetVotingList()
    {
        int k = 1 ;
        for (Voting temp:OnGoingVote)
        {
            System.out.println("["+k+"] "+temp.getQuestion());
            k++;
        }
    }

    /**
     *
     * @param which is going to be which of online polls
     */
    public void GetResult(int which)
    {
        System.out.println( OnGoingVote.get(which).getQuestion());
        OnGoingVote.get(which).ShowPercentage();
    }
    
    public void vote(int type ,Person voter,ArrayList<String> Maded)
    {
        Maded.add(voter.getName()+"has voted for "+type);
    }
}
