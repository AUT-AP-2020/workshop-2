/**
 * @author Sina
 */

import java.util.*;

public class Voting {
    //0 means the voter can have multiple votes and 1 would mean each voter got one vote
    private int type;
    private String question;
    // ray dahandegan
     ArrayList<Vote> voters = new ArrayList<>();
     /*
      do ta hash brye inke yekish code vooroodi
     yani dar haghight shoma byd code shakhs ro bznin ta ghabol kne na esmesh ! na shomare neshangaresh !
      */
    private HashMap<String, HashSet<Vote>> poll =new HashMap();
    private HashMap<String,String> candidates = new HashMap<>();
    // in this one it would get the name of chosen candidate !
    public void voting(Vote vote)
    {
        if (poll.containsKey(vote.getChosen()))
                poll.get(vote.getChosen()).add(vote);
        else
            System.out.println("unfortunately there is no such candidates with the code that you have entered :(");

    }

    /**
     *
     * @return its the poll they are going for !
     */
    public HashMap<String, HashSet<Vote>> getPoll() {
        return poll;
    }

    /**
     *
     * @return how many vote per person !
     */
    public int getType() {
        return type;
    }

    /**
     *
     * @return the question !
     */
    public String getQuestion() {
        return question;
    }

    /**
     *
     * @param poll it will be the voting
     */
    public void setPoll(HashMap<String, HashSet<Vote>> poll) {
        this.poll = poll;
    }

    /**
     *
     * @param question its going to be on table for voters to vote !
     */
    public void setQuestion(String question) {
        this.question = question;
    }

    /**
     *
     * @param type its how many vote can person have
     */
    public void setType(int type) {
        this.type = type;
    }

    /**
     *
     * @return its the people who voted so far the link to the names
     * that the list has been saved as vote
     * but the good thing is you can access what you need through that as well
     */
    public ArrayList<Vote> getVoters() {
        return voters;
    }

    /**
     *
     * @param voter its a vote to add indivuially to the specific vote list !
     */
    public void setVoters(Vote voter) {
        this.voters.add(voter);
    }

    /**
     *
     * @param chosen its what they think should be elected
     * @param code its the code for the candidate
     *
     */
    public void CreateChoice(String chosen,String code)
    {

            poll.put(code,new HashSet<Vote>());
            candidates.put(code,chosen);

    }
    /**
     * it will print all the candidates with their code in good order
     * not specified order but it will show them one by one
     */
    public void ShowChoice()
    {
        Set<String> temp = poll.keySet();
        int i = 1;
        for (String key :temp)
        {

            System.out.println("["+i+"] : "+candidates.get(key) + " ("+key+") ");
            i++;
        }
    }

    /**
     *
     * @param voters its going to add and match the arraylist
     */
    public void setVoers(ArrayList<Vote> voters) {
        this.voters = voters;
    }

    /**
     * its going to show how much the candidates have gained in heart of people !
     */
    public void ShowPercentage()
    {
        Set<String> temp = poll.keySet();
        int i = 1;
        for (String key :temp)
        {
            System.out.println("["+i+"] : "+candidates.get(key) + " has about "+ poll.get(key).size()+" votes.");
            i++;

        }
    }

    /**
     * it will show who has voted so far in what date
     * however it will keep hidden who has they voted for ! :)
     * keeping inforamtion is important
     */
    public void ShowVoters()
    {
        for (Vote temp:voters)
        {
            System.out.println(temp.getVoter().getName()+" "+temp.getVoter().getLastName()+ " "+temp.getDate());
        }
    }

}
