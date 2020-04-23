import java.util.*;
import java.util.Random;

public class Voting {

    private int type;
    private String question;
    private ArrayList<Person> voterList;
    private HashMap<String, HashSet<Vote>> listOfVoteChoices;

    /**
     * the main constructor of the voting class
     * @param type the type of voting
     * @param question the topic of voting
     */
    public Voting(int type,String question){

        this.type = type;
        this.question = question;
        voterList = new ArrayList<>();
        listOfVoteChoices = new HashMap<>();

    }

    /**
     * simply adds a new choice to our voting
     * @param nameForChoice the name of the new choice
     */
    public void createChoice(String nameForChoice){
        listOfVoteChoices.put(nameForChoice,new HashSet<>());
    }

    /**
     * this method will get a person and its votes and
     * then will add them to our choices
     * @param voterPerson an instance of our person class
     * @param listOfVotes the list of the votes
     */
    public void vote(Person voterPerson,ArrayList<String> listOfVotes){

        for(Person person : voterList){
            if(person.equals(voterPerson)){
                System.out.println("You have been submit before.");
                return;
            }
        }

        voterList.add(voterPerson);

        for (String nameOfCandidate : listOfVotes) {

            for (Map.Entry<String, HashSet<Vote>> entry: listOfVoteChoices.entrySet()) {

                if(nameOfCandidate.equals(entry.getKey())){

                    entry.getValue().add(new Vote(voterPerson));

                }

            }

        }


    }

    /**
     * this method will show us the voting result
     */
    public void printResult(){

        System.out.println(question);
        for(Map.Entry<String, HashSet<Vote>> entry : listOfVoteChoices.entrySet()){

            System.out.println(entry.getKey() + " -> " + entry.getValue().size());

            for(Vote vote : entry.getValue()){

                System.out.println(vote.toString());

            }

        }

    }

    /**
     * this method show all choices in this voting
     */
    public void printChoices(){

        for(Map.Entry<String, HashSet<Vote>> entry : listOfVoteChoices.entrySet()){

            System.out.println(entry.getKey());

        }

    }

    /**
     * a simple method for printing the voters information
     * of this voting
     */
    public void seeVoters(){
        for(Person person : voterList)
            System.out.println(person.toString());
    }

    /**
     * a simple getter method for getting the voting subject
     * @return the question of the voting
     */
    public String getQuestion() {
        return question;
    }

    /**
     * a simple method for getting the type of the voting
     * @return the type
     */
    public int getType() {
        return type;
    }

    /**
     * this method will go inside a voting an will chose a random choice of that voting for us
     * @return an option inside that voting
     */
    public String randomVote(){

        ArrayList<String> temp = new ArrayList<>();
        Random random = new Random();

        for(Map.Entry<String,HashSet<Vote>> entry : listOfVoteChoices.entrySet()){
            temp.add(entry.getKey());
        }

        return temp.get(random.nextInt(temp.size()));

    }

}
