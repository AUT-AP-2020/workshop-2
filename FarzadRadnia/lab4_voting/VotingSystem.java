import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Random;

/**
 * manage the voting action .
 */
public class VotingSystem {
    private ArrayList<Voting> votings;

    /**
     * simple constructor.
     */
    public VotingSystem ()
    {
        votings = new ArrayList<>();
    }

    /**
     * creat a new voting to this system.
     * @param question question of this voting
     * @param type type of this voting . 0== single vote   2== multi vote
     * @param choices all possible choices for this voting.
     */
    public void creatVoting(String question,int type, ArrayList<String> choices)
    {
        Voting newVote = new Voting(type,question);
        for(String newChoice : choices)
            newVote.creatChoice(newChoice);
        votings.add(newVote);
    }

    /**
     * print all voting by their questions.
     */
    public void printVotingQuestions()
    {
        int i=1 ;
        for(Voting tempVoting : votings) {
            System.out.println(i + "- " + tempVoting.getQuestion());
            i++;
        }
    }

    /**
     * print a specific voting by question and possible choices.
     * @param index index of voting in list.
     */
   public void printVote (int index)
   {
       if(index >= 0 && index < votings.size())
       {
           System.out.println("question: " + votings.get(index).getQuestion());
           System.out.println("available choices:");
           votings.get(index).printChoices();
       }
       else
           System.out.println("not valid index");
   }

    /**
     * vote to some choices _depend on type of voting _ of a specific voting.
     * @param indexVote index of voting .
     * @param person the voter.
     * @param choices all choices that this person votes to.
     */
   public void vote(int indexVote, Person person, ArrayList<String> choices )
   {
       if(indexVote >= 0 && indexVote < votings.size())
       {
           votings.get(indexVote).vote(person,choices);

       }
       else
           System.out.println("not valid index");
   }

    /**
     * randomly vote to one of the choices form voting that is found by the index. this ability is only for single
     * vote type. if a multi vote tend to do this work, the action would be ignored and print a message.
     * @param indexVote
     * @param person
     */
   public void randomVote(int indexVote , Person person)
   {
       try {

           if(votings.get(indexVote).getType() != 0)
           {
               System.out.println("this ability is not for multi voting mode.");
               return;
           }
           Random random = new Random();
           ArrayList<String> keySets = new ArrayList<>(votings.get(indexVote).getListOfVotesToChoices().keySet());
           ArrayList<String> choices = new ArrayList<>();
           choices.add(keySets.get(random.nextInt(keySets.size())));

           votings.get(indexVote).vote(person, choices);
       }catch (IndexOutOfBoundsException e) {
           System.out.println("not valid index");
       }
   }


    /**
     * prints result of a voting by showing the all choices and the votes they gain.
     * @param indexVoting index of voting to be show.
     */
   public void printResult (int indexVoting)
   {
       if(indexVoting >= 0 && indexVoting < votings.size())
       {
           Voting currentVoting = votings.get(indexVoting);

           System.out.println("result of voting number " + (indexVoting + 1 ) + " by question of \" " +
                               currentVoting.getQuestion() + " \" :");
               currentVoting.printVotes();

       }
       else
           System.out.println("not valid index");

   }

    /**
     * get all voting of this system.
     * @return all voting of this system.
     */
    public ArrayList<Voting> getVotings() {
        return votings;
    }
}
