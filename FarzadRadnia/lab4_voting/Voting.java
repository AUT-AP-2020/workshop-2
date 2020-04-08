import java.util.*;

/**
 * voting is defended by a question , some choice and some people as voters.
 */
public class Voting {

    int type;
    String question;
    ArrayList<Person> voters;
    HashMap<String, HashSet<Vote>> listOfVotesToChoices ;


    /**
     * simple constructor.
     * @param type type of this voting. 0 == single vote   1== multi vote.
     * @param question question of this voting
     */
    public Voting(int type,String question)
    {
        this.question = question;
        this.type = type;
        voters = new ArrayList<>();
        listOfVotesToChoices = new HashMap<>();
    }

    /**
     * get question of this voting.
     * @return question of this voting
     */
    public String getQuestion() {
        return question;
    }

    /**
     * add a choice to answers of this question which other can vote to.
     * @param choice new choice of this voting
     */
    public void creatChoice(String choice) {
        HashSet<Vote> votes = new HashSet<>();
        listOfVotesToChoices.put(choice, votes);
    }


    /**
     * vote to one _ or more than one in multi voting mode_ choice . if the voting is of type single voting and person
     * tend to vote to more than one choice, the method would print a message and ignore the action of adding this vote.
     * @param voter person who votes .
     * @param choiceVotes all choice that this person votes to.
     */
    public void vote (Person voter,ArrayList<String> choiceVotes)
    {
        if( ! voters.contains(voter))
        {
            if ((type == 0 && choiceVotes.size() <= 1) || (type == 1))
            {
                Vote newVote = new Vote(voter);
                for (String tempSting : choiceVotes)
                {
                    if (listOfVotesToChoices.containsKey(tempSting))
                        listOfVotesToChoices.get(tempSting).add(newVote);

                    else
                        System.out.println("no such a choice as \" " + tempSting + " \" ");
                }
                voters.add(voter);
            } else
                System.out.println("multi choice is not valid in this type of pull");
        }
        else
            System.out.println("this person had voted before.");
    }

    /**
     * prints all people that participate at this voting
     */
    public void printVoters()
    {
        for(Person tempPerson : voters)
            System.out.println( tempPerson.toSting() );
    }


    /**
     * prints all choice and all people that vote to them.
     */
    public void printVotes()
    {
        int counter = 1;
      for(String tempKey : listOfVotesToChoices.keySet())
      {
          System.out.print(counter + "- \" " + tempKey + " \" " + listOfVotesToChoices.get(tempKey).size() + "_votes :");
          for (Vote tempVote : listOfVotesToChoices.get(tempKey))
              System.out.print("  " + tempVote.getPerson().toSting() +"," );
          System.out.println();
          counter++;
      }
    }

    /**
     * print all choices for this voting.
     */
    public void printChoices()
    {
        int i=1;
        for(String tempChoice : listOfVotesToChoices.keySet() )
        {
            System.out.println(i + "- " + tempChoice);
            i++;
        }
    }


    /**
     * get all choices of this voting.
     * @return all choices of this voting
     */
    public ArrayList<String> getChoices()
    {
        return  ( new ArrayList<String>( listOfVotesToChoices.keySet() ) );
    }


    /**
     * get all votes to choices.
     * @return all votes to choices
     */
    public HashMap<String, HashSet<Vote>> getListOfVotesToChoices() {
        return listOfVotesToChoices;
    }

    /**
     * get type if this voting . 0==single voting    1==multi voting
     * @return
     */
    public int getType() {
        return type;
    }


    /**
     * get an specific choice.
     * CATION: this work is not  completely safe because the choices are mainly the key sets
     * of a hash map so basically there is no concrete order for them. so before use this method make sure that the index
     * you are entering is the element you want.
     * @param index index of choice.
     * @return choice .
     */
    public String getThisChoice(int index)
    {
        Set<String> temp = listOfVotesToChoices.keySet();
        ArrayList<String> allChoice = new ArrayList<>(temp);
        return allChoice.get(index);
    }
}
